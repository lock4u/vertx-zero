/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables;


import cn.vertxup.erp.domain.Db;
import cn.vertxup.erp.domain.Indexes;
import cn.vertxup.erp.domain.Keys;
import cn.vertxup.erp.domain.tables.records.EContractRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


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
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class EContract extends TableImpl<EContractRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.E_CONTRACT</code>
     */
    public static final EContract E_CONTRACT = new EContract();
    private static final long serialVersionUID = 820483464;
    /**
     * The column <code>DB_ETERNAL.E_CONTRACT.KEY</code>. 「key」- 合同主键
     */
    public final TableField<EContractRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 合同主键");
    /**
     * The column <code>DB_ETERNAL.E_CONTRACT.NAME</code>. 「name」- 合同名称
     */
    public final TableField<EContractRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「name」- 合同名称");
    /**
     * The column <code>DB_ETERNAL.E_CONTRACT.CODE</code>. 「code」- 合同编号
     */
    public final TableField<EContractRecord, String> CODE = createField("CODE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「code」- 合同编号");
    /**
     * The column <code>DB_ETERNAL.E_CONTRACT.TITLE</code>. 「title」- 合同标题
     */
    public final TableField<EContractRecord, String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「title」- 合同标题");
    /**
     * The column <code>DB_ETERNAL.E_CONTRACT.FILE_KEY</code>. 「fileKey」- 合同附件Key
     */
    public final TableField<EContractRecord, String> FILE_KEY = createField("FILE_KEY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「fileKey」- 合同附件Key");
    /**
     * The column <code>DB_ETERNAL.E_CONTRACT.AMOUNT</code>. 「amount」- 合同金额
     */
    public final TableField<EContractRecord, BigDecimal> AMOUNT = createField("AMOUNT", org.jooq.impl.SQLDataType.DECIMAL(18, 2), this, "「amount」- 合同金额");
    /**
     * The column <code>DB_ETERNAL.E_CONTRACT.COMPANY_ID</code>. 「companyId」- 合同甲方
     */
    public final TableField<EContractRecord, String> COMPANY_ID = createField("COMPANY_ID", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「companyId」- 合同甲方");
    /**
     * The column <code>DB_ETERNAL.E_CONTRACT.CUSTOMER_ID</code>. 「customerId」- 合同乙方
     */
    public final TableField<EContractRecord, String> CUSTOMER_ID = createField("CUSTOMER_ID", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「customerId」- 合同乙方");
    /**
     * The column <code>DB_ETERNAL.E_CONTRACT.EXPIRED_AT</code>. 「expiredAt」- 过期时间
     */
    public final TableField<EContractRecord, LocalDateTime> EXPIRED_AT = createField("EXPIRED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「expiredAt」- 过期时间");
    /**
     * The column <code>DB_ETERNAL.E_CONTRACT.SIGNED_AT</code>. 「signedAt」- 签订时间
     */
    public final TableField<EContractRecord, LocalDateTime> SIGNED_AT = createField("SIGNED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「signedAt」- 签订时间");
    /**
     * The column <code>DB_ETERNAL.E_CONTRACT.RUN_AT</code>. 「runAt」- 生效时间
     */
    public final TableField<EContractRecord, LocalDateTime> RUN_AT = createField("RUN_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「runAt」- 生效时间");
    /**
     * The column <code>DB_ETERNAL.E_CONTRACT.RUN_UP_AT</code>. 「runUpAt」- 挂账到期时间
     */
    public final TableField<EContractRecord, LocalDateTime> RUN_UP_AT = createField("RUN_UP_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「runUpAt」- 挂账到期时间");
    /**
     * The column <code>DB_ETERNAL.E_CONTRACT.A_NAME</code>. 「aName」- 甲方签订人
     */
    public final TableField<EContractRecord, String> A_NAME = createField("A_NAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「aName」- 甲方签订人");
    /**
     * The column <code>DB_ETERNAL.E_CONTRACT.A_PHONE</code>. 「aPhone」- 甲方签订人姓名
     */
    public final TableField<EContractRecord, String> A_PHONE = createField("A_PHONE", org.jooq.impl.SQLDataType.VARCHAR(20), this, "「aPhone」- 甲方签订人姓名");
    /**
     * The column <code>DB_ETERNAL.E_CONTRACT.A_ADDRESS</code>. 「aAddress」- 甲方联系地址
     */
    public final TableField<EContractRecord, String> A_ADDRESS = createField("A_ADDRESS", org.jooq.impl.SQLDataType.CLOB, this, "「aAddress」- 甲方联系地址");
    /**
     * The column <code>DB_ETERNAL.E_CONTRACT.B_NAME</code>. 「bName」- 乙方签订人
     */
    public final TableField<EContractRecord, String> B_NAME = createField("B_NAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「bName」- 乙方签订人");
    /**
     * The column <code>DB_ETERNAL.E_CONTRACT.B_PHONE</code>. 「bPhone」- 乙方签订人姓名
     */
    public final TableField<EContractRecord, String> B_PHONE = createField("B_PHONE", org.jooq.impl.SQLDataType.VARCHAR(20), this, "「bPhone」- 乙方签订人姓名");
    /**
     * The column <code>DB_ETERNAL.E_CONTRACT.B_ADDRESS</code>. 「bAddress」- 乙方联系地址
     */
    public final TableField<EContractRecord, String> B_ADDRESS = createField("B_ADDRESS", org.jooq.impl.SQLDataType.CLOB, this, "「bAddress」- 乙方联系地址");
    /**
     * The column <code>DB_ETERNAL.E_CONTRACT.TYPE</code>. 「type」- 合同分类
     */
    public final TableField<EContractRecord, String> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「type」- 合同分类");
    /**
     * The column <code>DB_ETERNAL.E_CONTRACT.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<EContractRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置");
    /**
     * The column <code>DB_ETERNAL.E_CONTRACT.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<EContractRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.E_CONTRACT.SIGMA</code>. 「sigma」- 统一标识（公司所属应用）
     */
    public final TableField<EContractRecord, String> SIGMA = createField("SIGMA", org.jooq.impl.SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识（公司所属应用）");
    /**
     * The column <code>DB_ETERNAL.E_CONTRACT.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<EContractRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.E_CONTRACT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<EContractRecord, LocalDateTime> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.E_CONTRACT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<EContractRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.E_CONTRACT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<EContractRecord, LocalDateTime> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.E_CONTRACT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<EContractRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    /**
     * Create a <code>DB_ETERNAL.E_CONTRACT</code> table reference
     */
    public EContract() {
        this(DSL.name("E_CONTRACT"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.E_CONTRACT</code> table reference
     */
    public EContract(String alias) {
        this(DSL.name(alias), E_CONTRACT);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.E_CONTRACT</code> table reference
     */
    public EContract(Name alias) {
        this(alias, E_CONTRACT);
    }

    private EContract(Name alias, Table<EContractRecord> aliased) {
        this(alias, aliased, null);
    }

    private EContract(Name alias, Table<EContractRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EContractRecord> getRecordType() {
        return EContractRecord.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Db.DB_ETERNAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.E_CONTRACT_CODE, Indexes.E_CONTRACT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EContractRecord> getPrimaryKey() {
        return Keys.KEY_E_CONTRACT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EContractRecord>> getKeys() {
        return Arrays.<UniqueKey<EContractRecord>>asList(Keys.KEY_E_CONTRACT_PRIMARY, Keys.KEY_E_CONTRACT_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EContract as(String alias) {
        return new EContract(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EContract as(Name alias) {
        return new EContract(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EContract rename(String name) {
        return new EContract(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EContract rename(Name name) {
        return new EContract(name, null);
    }
}