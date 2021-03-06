/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.rbac.domain.tables.interfaces;


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
public interface ISPath extends Serializable {

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.KEY</code>. 「key」- 规则主键
     */
    public ISPath setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.KEY</code>. 「key」- 规则主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.NAME</code>. 「name」- 规则名称
     */
    public ISPath setName(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.NAME</code>. 「name」- 规则名称
     */
    public String getName();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.CODE</code>. 「code」- 系统界面标识
     */
    public ISPath setCode(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.CODE</code>. 「code」- 系统界面标识
     */
    public String getCode();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.GROUP_MAPPING</code>. 「mapping」- 从 group -&gt; ui 转换
     */
    public ISPath setGroupMapping(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.GROUP_MAPPING</code>. 「mapping」- 从 group -&gt; ui 转换
     */
    public String getGroupMapping();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.GROUP_TYPE</code>. 「groupType」- 分组类型
     */
    public ISPath setGroupType(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.GROUP_TYPE</code>. 「groupType」- 分组类型
     */
    public String getGroupType();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.GROUP_COMPONENT</code>. 「groupComponent」- 必须绑定组专用Dao组件
     */
    public ISPath setGroupComponent(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.GROUP_COMPONENT</code>. 「groupComponent」- 必须绑定组专用Dao组件
     */
    public String getGroupComponent();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.GROUP_CONDITION</code>. 「groupCondition」- 分组条件
     */
    public ISPath setGroupCondition(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.GROUP_CONDITION</code>. 「groupCondition」- 分组条件
     */
    public String getGroupCondition();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.GROUP_CONFIG</code>. 「groupConfig」- 组配置信息，配置呈现部分
     */
    public ISPath setGroupConfig(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.GROUP_CONFIG</code>. 「groupConfig」- 组配置信息，配置呈现部分
     */
    public String getGroupConfig();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.UI_TYPE</code>. 「uiType」- 目标数据源类型
     */
    public ISPath setUiType(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.UI_TYPE</code>. 「uiType」- 目标数据源类型
     */
    public String getUiType();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.UI_CONFIG</code>. 「uiConfig」- 界面配置
     */
    public ISPath setUiConfig(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.UI_CONFIG</code>. 「uiConfig」- 界面配置
     */
    public String getUiConfig();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.UI_CONDITION</code>. 「uiCondition」- 查询模板
     */
    public ISPath setUiCondition(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.UI_CONDITION</code>. 「uiCondition」- 查询模板
     */
    public String getUiCondition();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.UI_COMPONENT</code>. 「uiComponent」- 在 DAO/OX/DEF 时的特殊组件
     */
    public ISPath setUiComponent(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.UI_COMPONENT</code>. 「uiComponent」- 在 DAO/OX/DEF 时的特殊组件
     */
    public String getUiComponent();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.SIGMA</code>. 「sigma」- 统一标识
     */
    public ISPath setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.LANGUAGE</code>. 「language」- 使用的语言
     */
    public ISPath setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.ACTIVE</code>. 「active」- 是否启用
     */
    public ISPath setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.METADATA</code>. 「metadata」- 附加配置数据
     */
    public ISPath setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public ISPath setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public ISPath setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public ISPath setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.S_PATH.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public ISPath setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PATH.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ISPath
     */
    public void from(cn.vertxup.rbac.domain.tables.interfaces.ISPath from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ISPath
     */
    public <E extends cn.vertxup.rbac.domain.tables.interfaces.ISPath> E into(E into);

    default ISPath fromJson(io.vertx.core.json.JsonObject json) {
        setKey(json.getString("KEY"));
        setName(json.getString("NAME"));
        setCode(json.getString("CODE"));
        setGroupMapping(json.getString("GROUP_MAPPING"));
        setGroupType(json.getString("GROUP_TYPE"));
        setGroupComponent(json.getString("GROUP_COMPONENT"));
        setGroupCondition(json.getString("GROUP_CONDITION"));
        setGroupConfig(json.getString("GROUP_CONFIG"));
        setUiType(json.getString("UI_TYPE"));
        setUiConfig(json.getString("UI_CONFIG"));
        setUiCondition(json.getString("UI_CONDITION"));
        setUiComponent(json.getString("UI_COMPONENT"));
        setSigma(json.getString("SIGMA"));
        setLanguage(json.getString("LANGUAGE"));
        setActive(json.getBoolean("ACTIVE"));
        setMetadata(json.getString("METADATA"));
        // Omitting unrecognized type java.time.LocalDateTime for column CREATED_AT!
        setCreatedBy(json.getString("CREATED_BY"));
        // Omitting unrecognized type java.time.LocalDateTime for column UPDATED_AT!
        setUpdatedBy(json.getString("UPDATED_BY"));
        return this;
    }


    default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("KEY",getKey());
        json.put("NAME",getName());
        json.put("CODE",getCode());
        json.put("GROUP_MAPPING",getGroupMapping());
        json.put("GROUP_TYPE",getGroupType());
        json.put("GROUP_COMPONENT",getGroupComponent());
        json.put("GROUP_CONDITION",getGroupCondition());
        json.put("GROUP_CONFIG",getGroupConfig());
        json.put("UI_TYPE",getUiType());
        json.put("UI_CONFIG",getUiConfig());
        json.put("UI_CONDITION",getUiCondition());
        json.put("UI_COMPONENT",getUiComponent());
        json.put("SIGMA",getSigma());
        json.put("LANGUAGE",getLanguage());
        json.put("ACTIVE",getActive());
        json.put("METADATA",getMetadata());
        // Omitting unrecognized type java.time.LocalDateTime for column CREATED_AT!
        json.put("CREATED_BY",getCreatedBy());
        // Omitting unrecognized type java.time.LocalDateTime for column UPDATED_AT!
        json.put("UPDATED_BY",getUpdatedBy());
        return json;
    }

}
