/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.ui.domain;


import cn.vertxup.ui.domain.tables.UiColumn;
import cn.vertxup.ui.domain.tables.UiControl;
import cn.vertxup.ui.domain.tables.UiField;
import cn.vertxup.ui.domain.tables.UiForm;
import cn.vertxup.ui.domain.tables.UiLayout;
import cn.vertxup.ui.domain.tables.UiList;
import cn.vertxup.ui.domain.tables.UiOp;
import cn.vertxup.ui.domain.tables.UiPage;
import cn.vertxup.ui.domain.tables.VFragment;
import cn.vertxup.ui.domain.tables.VQuery;
import cn.vertxup.ui.domain.tables.VSearch;
import cn.vertxup.ui.domain.tables.VTable;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>DB_ETERNAL</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index UI_COLUMN_PRIMARY = Indexes0.UI_COLUMN_PRIMARY;
    public static final Index UI_COLUMN_SIGMA = Indexes0.UI_COLUMN_SIGMA;
    public static final Index UI_CONTROL_PRIMARY = Indexes0.UI_CONTROL_PRIMARY;
    public static final Index UI_CONTROL_SIGN = Indexes0.UI_CONTROL_SIGN;
    public static final Index UI_FIELD_CONTROL_ID = Indexes0.UI_FIELD_CONTROL_ID;
    public static final Index UI_FIELD_PRIMARY = Indexes0.UI_FIELD_PRIMARY;
    public static final Index UI_FORM_CODE = Indexes0.UI_FORM_CODE;
    public static final Index UI_FORM_PRIMARY = Indexes0.UI_FORM_PRIMARY;
    public static final Index UI_LAYOUT_NAME = Indexes0.UI_LAYOUT_NAME;
    public static final Index UI_LAYOUT_PRIMARY = Indexes0.UI_LAYOUT_PRIMARY;
    public static final Index UI_LIST_CODE = Indexes0.UI_LIST_CODE;
    public static final Index UI_LIST_PRIMARY = Indexes0.UI_LIST_PRIMARY;
    public static final Index UI_OP_CONTROL_ID = Indexes0.UI_OP_CONTROL_ID;
    public static final Index UI_OP_CONTROL_ID_2 = Indexes0.UI_OP_CONTROL_ID_2;
    public static final Index UI_OP_PRIMARY = Indexes0.UI_OP_PRIMARY;
    public static final Index UI_PAGE_APP = Indexes0.UI_PAGE_APP;
    public static final Index UI_PAGE_PRIMARY = Indexes0.UI_PAGE_PRIMARY;
    public static final Index V_FRAGMENT_PRIMARY = Indexes0.V_FRAGMENT_PRIMARY;
    public static final Index V_QUERY_PRIMARY = Indexes0.V_QUERY_PRIMARY;
    public static final Index V_SEARCH_PRIMARY = Indexes0.V_SEARCH_PRIMARY;
    public static final Index V_TABLE_PRIMARY = Indexes0.V_TABLE_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index UI_COLUMN_PRIMARY = Internal.createIndex("PRIMARY", UiColumn.UI_COLUMN, new OrderField[] { UiColumn.UI_COLUMN.KEY }, true);
        public static Index UI_COLUMN_SIGMA = Internal.createIndex("SIGMA", UiColumn.UI_COLUMN, new OrderField[] { UiColumn.UI_COLUMN.SIGMA, UiColumn.UI_COLUMN.CONTROL_ID, UiColumn.UI_COLUMN.DATA_INDEX }, true);
        public static Index UI_CONTROL_PRIMARY = Internal.createIndex("PRIMARY", UiControl.UI_CONTROL, new OrderField[] { UiControl.UI_CONTROL.KEY }, true);
        public static Index UI_CONTROL_SIGN = Internal.createIndex("SIGN", UiControl.UI_CONTROL, new OrderField[] { UiControl.UI_CONTROL.SIGN }, true);
        public static Index UI_FIELD_CONTROL_ID = Internal.createIndex("CONTROL_ID", UiField.UI_FIELD, new OrderField[] { UiField.UI_FIELD.CONTROL_ID, UiField.UI_FIELD.NAME }, true);
        public static Index UI_FIELD_PRIMARY = Internal.createIndex("PRIMARY", UiField.UI_FIELD, new OrderField[] { UiField.UI_FIELD.KEY }, true);
        public static Index UI_FORM_CODE = Internal.createIndex("CODE", UiForm.UI_FORM, new OrderField[] { UiForm.UI_FORM.CODE, UiForm.UI_FORM.SIGMA }, true);
        public static Index UI_FORM_PRIMARY = Internal.createIndex("PRIMARY", UiForm.UI_FORM, new OrderField[] { UiForm.UI_FORM.KEY }, true);
        public static Index UI_LAYOUT_NAME = Internal.createIndex("NAME", UiLayout.UI_LAYOUT, new OrderField[] { UiLayout.UI_LAYOUT.NAME, UiLayout.UI_LAYOUT.SIGMA }, true);
        public static Index UI_LAYOUT_PRIMARY = Internal.createIndex("PRIMARY", UiLayout.UI_LAYOUT, new OrderField[] { UiLayout.UI_LAYOUT.KEY }, true);
        public static Index UI_LIST_CODE = Internal.createIndex("CODE", UiList.UI_LIST, new OrderField[] { UiList.UI_LIST.CODE, UiList.UI_LIST.SIGMA }, true);
        public static Index UI_LIST_PRIMARY = Internal.createIndex("PRIMARY", UiList.UI_LIST, new OrderField[] { UiList.UI_LIST.KEY }, true);
        public static Index UI_OP_CONTROL_ID = Internal.createIndex("CONTROL_ID", UiOp.UI_OP, new OrderField[] { UiOp.UI_OP.CONTROL_ID, UiOp.UI_OP.SIGMA, UiOp.UI_OP.CLIENT_KEY }, true);
        public static Index UI_OP_CONTROL_ID_2 = Internal.createIndex("CONTROL_ID_2", UiOp.UI_OP, new OrderField[] { UiOp.UI_OP.CONTROL_ID, UiOp.UI_OP.SIGMA, UiOp.UI_OP.ACTION }, true);
        public static Index UI_OP_PRIMARY = Internal.createIndex("PRIMARY", UiOp.UI_OP, new OrderField[] { UiOp.UI_OP.KEY }, true);
        public static Index UI_PAGE_APP = Internal.createIndex("APP", UiPage.UI_PAGE, new OrderField[] { UiPage.UI_PAGE.APP, UiPage.UI_PAGE.MODULE, UiPage.UI_PAGE.PAGE, UiPage.UI_PAGE.SIGMA }, true);
        public static Index UI_PAGE_PRIMARY = Internal.createIndex("PRIMARY", UiPage.UI_PAGE, new OrderField[] { UiPage.UI_PAGE.KEY }, true);
        public static Index V_FRAGMENT_PRIMARY = Internal.createIndex("PRIMARY", VFragment.V_FRAGMENT, new OrderField[] { VFragment.V_FRAGMENT.KEY }, true);
        public static Index V_QUERY_PRIMARY = Internal.createIndex("PRIMARY", VQuery.V_QUERY, new OrderField[] { VQuery.V_QUERY.KEY }, true);
        public static Index V_SEARCH_PRIMARY = Internal.createIndex("PRIMARY", VSearch.V_SEARCH, new OrderField[] { VSearch.V_SEARCH.KEY }, true);
        public static Index V_TABLE_PRIMARY = Internal.createIndex("PRIMARY", VTable.V_TABLE, new OrderField[] { VTable.V_TABLE.KEY }, true);
    }
}