package io.vertx.tp.plugin.cache.util;

import io.vertx.core.Future;
import io.vertx.up.fn.RunSupplier;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author <a href="http://www.origin-x.cn">lang</a>
 * Cache-Aside
 */
public class CacheFn {
    /*
     * T -> T
     */
    public static <T> T in(final RunSupplier<T> cacheSupplier,
                           final RunSupplier<T> actual) {
        return in(cacheSupplier, actual, null);
    }

    public static <T> T in(final RunSupplier<T> cacheSupplier,
                           final RunSupplier<T> actualSupplier,
                           final Consumer<T> callback) {
        final Supplier<T> supplier = () -> execute(cacheSupplier);
        final Supplier<T> actual = () -> execute(actualSupplier);
        /*
         * 1. Get T reference from cache
         */
        T reference = supplier.get();
        if (Objects.isNull(reference)) {
            /*
             * 2. When T reference is null
             */
            reference = actual.get();
            if (Objects.nonNull(callback) && Objects.nonNull(reference)) {
                /*
                 * 3. When callback is not null
                 */
                callback.accept(reference);
            }
        }
        return reference;
    }

    public static <T> Future<T> in(final Supplier<Future<T>> cacheSupplier,
                                   final RunSupplier<Future<T>> actualSupplier) {
        return in(cacheSupplier, actualSupplier, null);
    }

    public static <T> Future<T> in(final Supplier<Future<T>> cacheSupplier,
                                   final RunSupplier<Future<T>> actualSupplier,
                                   final Consumer<T> callback) {
        /*
         * 1. Get T reference from cache
         */
        final Supplier<Future<T>> actual = () -> execute(actualSupplier);
        return cacheSupplier.get().compose(reference -> {
            if (Objects.isNull(reference)) {
                /*
                 * 2. When T reference is null
                 */
                return actual.get().compose(actualRef -> {
                    if (Objects.nonNull(callback) && Objects.nonNull(actualRef)) {
                        /*
                         * 3. When callback is not null
                         */
                        callback.accept(actualRef);
                    }
                    return Future.succeededFuture(actualRef);
                });
            } else return Future.succeededFuture(reference);
        });
    }

    private static <T> T execute(final RunSupplier<T> supplier) {
        T reference;
        try {
            reference = supplier.get();
        } catch (final Throwable ex) {
            ex.printStackTrace();
            reference = null;
        }
        return reference;
    }
}