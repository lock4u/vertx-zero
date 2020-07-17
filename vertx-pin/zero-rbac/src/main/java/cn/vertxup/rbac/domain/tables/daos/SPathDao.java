/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.rbac.domain.tables.daos;


import cn.vertxup.rbac.domain.tables.SPath;
import cn.vertxup.rbac.domain.tables.records.SPathRecord;

import io.github.jklingsporn.vertx.jooq.future.VertxDAO;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


import java.util.concurrent.CompletableFuture;
import io.github.jklingsporn.vertx.jooq.future.util.FutureTool;
/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SPathDao extends DAOImpl<SPathRecord, cn.vertxup.rbac.domain.tables.pojos.SPath, String> implements VertxDAO<cn.vertxup.rbac.domain.tables.records.SPathRecord,cn.vertxup.rbac.domain.tables.pojos.SPath,java.lang.String> {

    /**
     * Create a new SPathDao without any configuration
     */
    public SPathDao() {
        super(SPath.S_PATH, cn.vertxup.rbac.domain.tables.pojos.SPath.class);
    }

    /**
     * Create a new SPathDao with an attached configuration
     */
    public SPathDao(Configuration configuration) {
        super(SPath.S_PATH, cn.vertxup.rbac.domain.tables.pojos.SPath.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.vertxup.rbac.domain.tables.pojos.SPath object) {
        return object.getKey();
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPath> fetchByKey(String... values) {
        return fetch(SPath.S_PATH.KEY, values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code>
     */
    public cn.vertxup.rbac.domain.tables.pojos.SPath fetchOneByKey(String value) {
        return fetchOne(SPath.S_PATH.KEY, value);
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPath> fetchByName(String... values) {
        return fetch(SPath.S_PATH.NAME, values);
    }

    /**
     * Fetch records that have <code>CODE IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPath> fetchByCode(String... values) {
        return fetch(SPath.S_PATH.CODE, values);
    }

    /**
     * Fetch records that have <code>GROUP_MAPPING IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPath> fetchByGroupMapping(String... values) {
        return fetch(SPath.S_PATH.GROUP_MAPPING, values);
    }

    /**
     * Fetch records that have <code>GROUP_TYPE IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPath> fetchByGroupType(String... values) {
        return fetch(SPath.S_PATH.GROUP_TYPE, values);
    }

    /**
     * Fetch records that have <code>GROUP_CONDITION IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPath> fetchByGroupCondition(String... values) {
        return fetch(SPath.S_PATH.GROUP_CONDITION, values);
    }

    /**
     * Fetch records that have <code>GROUP_CONFIG IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPath> fetchByGroupConfig(String... values) {
        return fetch(SPath.S_PATH.GROUP_CONFIG, values);
    }

    /**
     * Fetch records that have <code>UI_TYPE IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPath> fetchByUiType(String... values) {
        return fetch(SPath.S_PATH.UI_TYPE, values);
    }

    /**
     * Fetch records that have <code>UI_CONFIG IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPath> fetchByUiConfig(String... values) {
        return fetch(SPath.S_PATH.UI_CONFIG, values);
    }

    /**
     * Fetch records that have <code>UI_CONDITION IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPath> fetchByUiCondition(String... values) {
        return fetch(SPath.S_PATH.UI_CONDITION, values);
    }

    /**
     * Fetch records that have <code>UI_COMPONENT IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPath> fetchByUiComponent(String... values) {
        return fetch(SPath.S_PATH.UI_COMPONENT, values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPath> fetchBySigma(String... values) {
        return fetch(SPath.S_PATH.SIGMA, values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPath> fetchByLanguage(String... values) {
        return fetch(SPath.S_PATH.LANGUAGE, values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPath> fetchByActive(Boolean... values) {
        return fetch(SPath.S_PATH.ACTIVE, values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPath> fetchByMetadata(String... values) {
        return fetch(SPath.S_PATH.METADATA, values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPath> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(SPath.S_PATH.CREATED_AT, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPath> fetchByCreatedBy(String... values) {
        return fetch(SPath.S_PATH.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPath> fetchByUpdatedAt(LocalDateTime... values) {
        return fetch(SPath.S_PATH.UPDATED_AT, values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code>
     */
    public List<cn.vertxup.rbac.domain.tables.pojos.SPath> fetchByUpdatedBy(String... values) {
        return fetch(SPath.S_PATH.UPDATED_BY, values);
    }

    /**
     * Fetch records that have <code>KEY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> fetchByKeyAsync(List<String> values) {
        return fetchAsync(SPath.S_PATH.KEY,values);
    }

    /**
     * Fetch a unique record that has <code>KEY = value</code> asynchronously
     */
    public CompletableFuture<cn.vertxup.rbac.domain.tables.pojos.SPath> fetchOneByKeyAsync(String value) {
        return FutureTool.executeBlocking(h->h.complete(fetchOneByKey(value)),vertx());
    }

    /**
     * Fetch records that have <code>NAME IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> fetchByNameAsync(List<String> values) {
        return fetchAsync(SPath.S_PATH.NAME,values);
    }

    /**
     * Fetch records that have <code>CODE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> fetchByCodeAsync(List<String> values) {
        return fetchAsync(SPath.S_PATH.CODE,values);
    }

    /**
     * Fetch records that have <code>GROUP_MAPPING IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> fetchByGroupMappingAsync(List<String> values) {
        return fetchAsync(SPath.S_PATH.GROUP_MAPPING,values);
    }

    /**
     * Fetch records that have <code>GROUP_TYPE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> fetchByGroupTypeAsync(List<String> values) {
        return fetchAsync(SPath.S_PATH.GROUP_TYPE,values);
    }

    /**
     * Fetch records that have <code>GROUP_CONDITION IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> fetchByGroupConditionAsync(List<String> values) {
        return fetchAsync(SPath.S_PATH.GROUP_CONDITION,values);
    }

    /**
     * Fetch records that have <code>GROUP_CONFIG IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> fetchByGroupConfigAsync(List<String> values) {
        return fetchAsync(SPath.S_PATH.GROUP_CONFIG,values);
    }

    /**
     * Fetch records that have <code>UI_TYPE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> fetchByUiTypeAsync(List<String> values) {
        return fetchAsync(SPath.S_PATH.UI_TYPE,values);
    }

    /**
     * Fetch records that have <code>UI_CONFIG IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> fetchByUiConfigAsync(List<String> values) {
        return fetchAsync(SPath.S_PATH.UI_CONFIG,values);
    }

    /**
     * Fetch records that have <code>UI_CONDITION IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> fetchByUiConditionAsync(List<String> values) {
        return fetchAsync(SPath.S_PATH.UI_CONDITION,values);
    }

    /**
     * Fetch records that have <code>UI_COMPONENT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> fetchByUiComponentAsync(List<String> values) {
        return fetchAsync(SPath.S_PATH.UI_COMPONENT,values);
    }

    /**
     * Fetch records that have <code>SIGMA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> fetchBySigmaAsync(List<String> values) {
        return fetchAsync(SPath.S_PATH.SIGMA,values);
    }

    /**
     * Fetch records that have <code>LANGUAGE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> fetchByLanguageAsync(List<String> values) {
        return fetchAsync(SPath.S_PATH.LANGUAGE,values);
    }

    /**
     * Fetch records that have <code>ACTIVE IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> fetchByActiveAsync(List<Boolean> values) {
        return fetchAsync(SPath.S_PATH.ACTIVE,values);
    }

    /**
     * Fetch records that have <code>METADATA IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> fetchByMetadataAsync(List<String> values) {
        return fetchAsync(SPath.S_PATH.METADATA,values);
    }

    /**
     * Fetch records that have <code>CREATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> fetchByCreatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(SPath.S_PATH.CREATED_AT,values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> fetchByCreatedByAsync(List<String> values) {
        return fetchAsync(SPath.S_PATH.CREATED_BY,values);
    }

    /**
     * Fetch records that have <code>UPDATED_AT IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> fetchByUpdatedAtAsync(List<LocalDateTime> values) {
        return fetchAsync(SPath.S_PATH.UPDATED_AT,values);
    }

    /**
     * Fetch records that have <code>UPDATED_BY IN (values)</code> asynchronously
     */
    public CompletableFuture<List<cn.vertxup.rbac.domain.tables.pojos.SPath>> fetchByUpdatedByAsync(List<String> values) {
        return fetchAsync(SPath.S_PATH.UPDATED_BY,values);
    }

    private io.vertx.core.Vertx vertx;

    @Override
    public void setVertx(io.vertx.core.Vertx vertx) {
        this.vertx = vertx;
    }

    @Override
    public io.vertx.core.Vertx vertx() {
        return this.vertx;
    }

}