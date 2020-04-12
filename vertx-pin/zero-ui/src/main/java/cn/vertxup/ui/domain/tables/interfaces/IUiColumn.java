/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.ui.domain.tables.interfaces;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;


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
public interface IUiColumn extends Serializable {

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.KEY</code>. 「key」- 列主键
     */
    public IUiColumn setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.KEY</code>. 「key」- 列主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.TITLE</code>. 「title」- 列标题
     */
    public IUiColumn setTitle(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.TITLE</code>. 「title」- 列标题
     */
    public String getTitle();

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.DATA_INDEX</code>. 「dataIndex」- 列名
     */
    public IUiColumn setDataIndex(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.DATA_INDEX</code>. 「dataIndex」- 列名
     */
    public String getDataIndex();

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.POSITION</code>. 「position」- 当前列的位置
     */
    public IUiColumn setPosition(Integer value);

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.POSITION</code>. 「position」- 当前列的位置
     */
    public Integer getPosition();

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.RENDER</code>. 「render」- 使用的Render函数
     */
    public IUiColumn setRender(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.RENDER</code>. 「render」- 使用的Render函数
     */
    public String getRender();

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.WIDTH</code>. 「width」- 当前列的宽度
     */
    public IUiColumn setWidth(Integer value);

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.WIDTH</code>. 「width」- 当前列的宽度
     */
    public Integer getWidth();

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.FIXED</code>. 「fixed」- 当前列是否固定
     */
    public IUiColumn setFixed(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.FIXED</code>. 「fixed」- 当前列是否固定
     */
    public Boolean getFixed();

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.CLASS_NAME</code>. 「className」- 当前列的特殊CSS类
     */
    public IUiColumn setClassName(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.CLASS_NAME</code>. 「className」- 当前列的特殊CSS类
     */
    public String getClassName();

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.SORTER</code>. 「sorter」- 当前列是否支持排序
     */
    public IUiColumn setSorter(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.SORTER</code>. 「sorter」- 当前列是否支持排序
     */
    public Boolean getSorter();

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.FILTER_TYPE</code>. 「filterType」- $filter.type 支持列搜索时的搜索类型
     */
    public IUiColumn setFilterType(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.FILTER_TYPE</code>. 「filterType」- $filter.type 支持列搜索时的搜索类型
     */
    public String getFilterType();

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.FILTER_CONFIG</code>. 「filterConfig」- $filter.config 列搜索支持时的搜索配置
     */
    public IUiColumn setFilterConfig(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.FILTER_CONFIG</code>. 「filterConfig」- $filter.config 列搜索支持时的搜索配置
     */
    public String getFilterConfig();

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.EMPTY</code>. 「empty」- $empty 专用
     */
    public IUiColumn setEmpty(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.EMPTY</code>. 「empty」- $empty 专用
     */
    public String getEmpty();

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.MAPPING</code>. 「mapping」- $mapping专用
     */
    public IUiColumn setMapping(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.MAPPING</code>. 「mapping」- $mapping专用
     */
    public String getMapping();

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.CONFIG</code>. 「config」- $config专用
     */
    public IUiColumn setConfig(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.CONFIG</code>. 「config」- $config专用
     */
    public String getConfig();

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.OPTION</code>. 「option」- $option专用，executor时
     */
    public IUiColumn setOption(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.OPTION</code>. 「option」- $option专用，executor时
     */
    public String getOption();

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.FORMAT</code>. 「format」- $format时间格式专用
     */
    public IUiColumn setFormat(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.FORMAT</code>. 「format」- $format时间格式专用
     */
    public String getFormat();

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.DATUM</code>. 「datum」- $datum专用
     */
    public IUiColumn setDatum(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.DATUM</code>. 「datum」- $datum专用
     */
    public String getDatum();

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.CONTROL_ID</code>. 「controlId」- 关联的控件ID
     */
    public IUiColumn setControlId(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.CONTROL_ID</code>. 「controlId」- 关联的控件ID
     */
    public String getControlId();

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.ACTIVE</code>. 「active」- 是否启用
     */
    public IUiColumn setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.SIGMA</code>. 「sigma」- 统一标识
     */
    public IUiColumn setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.METADATA</code>. 「metadata」- 附加配置
     */
    public IUiColumn setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IUiColumn setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public IUiColumn setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IUiColumn setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public IUiColumn setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.UI_COLUMN.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IUiColumn setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.UI_COLUMN.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IUiColumn
     */
    public void from(cn.vertxup.ui.domain.tables.interfaces.IUiColumn from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IUiColumn
     */
    public <E extends cn.vertxup.ui.domain.tables.interfaces.IUiColumn> E into(E into);

    default IUiColumn fromJson(io.vertx.core.json.JsonObject json) {
        setKey(json.getString("KEY"));
        setTitle(json.getString("TITLE"));
        setDataIndex(json.getString("DATA_INDEX"));
        setPosition(json.getInteger("POSITION"));
        setRender(json.getString("RENDER"));
        setWidth(json.getInteger("WIDTH"));
        setFixed(json.getBoolean("FIXED"));
        setClassName(json.getString("CLASS_NAME"));
        setSorter(json.getBoolean("SORTER"));
        setFilterType(json.getString("FILTER_TYPE"));
        setFilterConfig(json.getString("FILTER_CONFIG"));
        setEmpty(json.getString("EMPTY"));
        setMapping(json.getString("MAPPING"));
        setConfig(json.getString("CONFIG"));
        setOption(json.getString("OPTION"));
        setFormat(json.getString("FORMAT"));
        setDatum(json.getString("DATUM"));
        setControlId(json.getString("CONTROL_ID"));
        setActive(json.getBoolean("ACTIVE"));
        setSigma(json.getString("SIGMA"));
        setMetadata(json.getString("METADATA"));
        setLanguage(json.getString("LANGUAGE"));
        // Omitting unrecognized type java.time.LocalDateTime for column CREATED_AT!
        setCreatedBy(json.getString("CREATED_BY"));
        // Omitting unrecognized type java.time.LocalDateTime for column UPDATED_AT!
        setUpdatedBy(json.getString("UPDATED_BY"));
        return this;
    }


    default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("KEY",getKey());
        json.put("TITLE",getTitle());
        json.put("DATA_INDEX",getDataIndex());
        json.put("POSITION",getPosition());
        json.put("RENDER",getRender());
        json.put("WIDTH",getWidth());
        json.put("FIXED",getFixed());
        json.put("CLASS_NAME",getClassName());
        json.put("SORTER",getSorter());
        json.put("FILTER_TYPE",getFilterType());
        json.put("FILTER_CONFIG",getFilterConfig());
        json.put("EMPTY",getEmpty());
        json.put("MAPPING",getMapping());
        json.put("CONFIG",getConfig());
        json.put("OPTION",getOption());
        json.put("FORMAT",getFormat());
        json.put("DATUM",getDatum());
        json.put("CONTROL_ID",getControlId());
        json.put("ACTIVE",getActive());
        json.put("SIGMA",getSigma());
        json.put("METADATA",getMetadata());
        json.put("LANGUAGE",getLanguage());
        // Omitting unrecognized type java.time.LocalDateTime for column CREATED_AT!
        json.put("CREATED_BY",getCreatedBy());
        // Omitting unrecognized type java.time.LocalDateTime for column UPDATED_AT!
        json.put("UPDATED_BY",getUpdatedBy());
        return json;
    }

}