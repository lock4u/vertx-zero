/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.rbac.domain.tables.pojos;


import cn.vertxup.rbac.domain.tables.interfaces.IRUserRole;

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
public class RUserRole implements IRUserRole {

    private static final long serialVersionUID = -1916410020;

    private String  userId;
    private String  roleId;
    private Integer priority;

    public RUserRole() {}

    public RUserRole(RUserRole value) {
        this.userId = value.userId;
        this.roleId = value.roleId;
        this.priority = value.priority;
    }

    public RUserRole(
        String  userId,
        String  roleId,
        Integer priority
    ) {
        this.userId = userId;
        this.roleId = roleId;
        this.priority = priority;
    }

    @Override
    public String getUserId() {
        return this.userId;
    }

    @Override
    public RUserRole setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public String getRoleId() {
        return this.roleId;
    }

    @Override
    public RUserRole setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    @Override
    public Integer getPriority() {
        return this.priority;
    }

    @Override
    public RUserRole setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RUserRole (");

        sb.append(userId);
        sb.append(", ").append(roleId);
        sb.append(", ").append(priority);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IRUserRole from) {
        setUserId(from.getUserId());
        setRoleId(from.getRoleId());
        setPriority(from.getPriority());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IRUserRole> E into(E into) {
        into.from(this);
        return into;
    }

    public RUserRole(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }
}
