package cn.vertxup.ui.service;

import cn.vertxup.ui.domain.tables.daos.*;
import cn.vertxup.ui.domain.tables.pojos.*;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.ke.cv.KeField;
import io.vertx.tp.ke.refine.Ke;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.List;
import java.util.stream.Collectors;

public class OptionService implements OptionStub {
    @Override
    public Future<JsonObject> fetchQuery(final String id) {
        return Ux.Jooq.on(VQueryDao.class)
                .<VQuery>findByIdAsync(id)
                .compose(Ux::fnJObject)
                .compose(Ke.mount(FIELD_QUERY_CRITERIA))
                .compose(Ke.mountArray(FIELD_QUERY_PROJECTION));
    }

    @Override
    public Future<JsonObject> fetchSearch(final String id) {
        return Ux.Jooq.on(VSearchDao.class)
                .<VSearch>findByIdAsync(id)
                .compose(Ux::fnJObject)
                .compose(Ke.mount(FIELD_SEARCH_NOTICE))
                .compose(Ke.mountArray(FIELD_SEARCH_COND));
    }

    @Override
    public Future<JsonObject> fetchFragment(final String id) {
        return Ux.Jooq.on(VFragmentDao.class)
                .<VFragment>findByIdAsync(id)
                .compose(Ux::fnJObject)
                .compose(Ke.mount(FIELD_FRAGMENT_MODEL))
                .compose(Ke.mount(FIELD_FRAGMENT_NOTICE))
                .compose(Ke.mount(FIELD_FRAGMENT_CONFIG))
                .compose(Ke.mountArray(FIELD_FRAGMENT_BUTTON_GROUP));
    }

    @Override
    public Future<JsonObject> fetchTable(final String id) {
        return Ux.Jooq.on(VTableDao.class)
                .<VTable>findByIdAsync(id)
                .compose(Ux::fnJObject)
                .compose(Ke.mountArray(FIELD_TABLE_OP_CONFIG));
    }

    @Override
    public Future<JsonArray> updateA(final String controlId, final JsonArray data) {
        // 1. mountIn fields, convert those into object from string
        final List<UiOp> ops = Ut.itJArray(data)
                .map(this::mountIn)
                .map(field -> Ux.fromJson(field, UiOp.class))
                .collect(Collectors.toList());
        // 2. delete old ones and insert new ones
        return this.deleteByControlId(controlId)
                .compose(result -> Ux.Jooq.on(UiOpDao.class)
                        .insertAsync(ops)
                        .compose(Ux::fnJArray)
                        // 3. mountOut
                        .compose(updatedOps -> {
                            List<JsonObject> list = Ut.itJArray(updatedOps)
                                    .map(this::mountOut)
                                    .collect(Collectors.toList());
                            return Ux.future(new JsonArray(list));
                        }));
    }

    @Override
    public Future<Boolean> deleteByControlId(String controlId) {
        return Ux.Jooq.on(UiOpDao.class)
                .deleteAsync(new JsonObject().put(KeField.Ui.CONTROL_ID, controlId));
    }

    private JsonObject mountIn(final JsonObject data) {
        Ke.mountString(data, OptionStub.FIELD_OP_CONFIG);
        Ke.mountString(data, OptionStub.FIELD_OP_PLUGIN);
        Ke.mountString(data, KeField.METADATA);
        return data;
    }
    private JsonObject mountOut(final JsonObject data) {
        Ke.mount(data, OptionStub.FIELD_OP_CONFIG);
        Ke.mount(data, OptionStub.FIELD_OP_PLUGIN);
        Ke.mount(data, KeField.METADATA);
        return data;
    }
}
