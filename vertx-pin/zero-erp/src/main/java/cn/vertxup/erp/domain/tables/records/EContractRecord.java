/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.erp.domain.tables.records;


import cn.vertxup.erp.domain.tables.EContract;
import cn.vertxup.erp.domain.tables.interfaces.IEContract;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


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
public class EContractRecord extends UpdatableRecordImpl<EContractRecord> implements IEContract {

    private static final long serialVersionUID = 642112447;

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.KEY</code>. 「key」- 合同主键
     */
    @Override
    public EContractRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.KEY</code>. 「key」- 合同主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.NAME</code>. 「name」- 合同名称
     */
    @Override
    public EContractRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.NAME</code>. 「name」- 合同名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.CODE</code>. 「code」- 合同编号
     */
    @Override
    public EContractRecord setCode(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.CODE</code>. 「code」- 合同编号
     */
    @Override
    public String getCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.TITLE</code>. 「title」- 合同标题
     */
    @Override
    public EContractRecord setTitle(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.TITLE</code>. 「title」- 合同标题
     */
    @Override
    public String getTitle() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.FILE_KEY</code>. 「fileKey」- 合同附件Key
     */
    @Override
    public EContractRecord setFileKey(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.FILE_KEY</code>. 「fileKey」- 合同附件Key
     */
    @Override
    public String getFileKey() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.AMOUNT</code>. 「amount」- 合同金额
     */
    @Override
    public EContractRecord setAmount(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.AMOUNT</code>. 「amount」- 合同金额
     */
    @Override
    public BigDecimal getAmount() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.COMPANY_ID</code>. 「companyId」- 合同甲方
     */
    @Override
    public EContractRecord setCompanyId(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.COMPANY_ID</code>. 「companyId」- 合同甲方
     */
    @Override
    public String getCompanyId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.CUSTOMER_ID</code>. 「customerId」- 合同乙方
     */
    @Override
    public EContractRecord setCustomerId(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.CUSTOMER_ID</code>. 「customerId」- 合同乙方
     */
    @Override
    public String getCustomerId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.EXPIRED_AT</code>. 「expiredAt」- 过期时间
     */
    @Override
    public EContractRecord setExpiredAt(LocalDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.EXPIRED_AT</code>. 「expiredAt」- 过期时间
     */
    @Override
    public LocalDateTime getExpiredAt() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.SIGNED_AT</code>. 「signedAt」- 签订时间
     */
    @Override
    public EContractRecord setSignedAt(LocalDateTime value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.SIGNED_AT</code>. 「signedAt」- 签订时间
     */
    @Override
    public LocalDateTime getSignedAt() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.RUN_AT</code>. 「runAt」- 生效时间
     */
    @Override
    public EContractRecord setRunAt(LocalDateTime value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.RUN_AT</code>. 「runAt」- 生效时间
     */
    @Override
    public LocalDateTime getRunAt() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.RUN_UP_AT</code>. 「runUpAt」- 挂账到期时间
     */
    @Override
    public EContractRecord setRunUpAt(LocalDateTime value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.RUN_UP_AT</code>. 「runUpAt」- 挂账到期时间
     */
    @Override
    public LocalDateTime getRunUpAt() {
        return (LocalDateTime) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.A_NAME</code>. 「aName」- 甲方签订人
     */
    @Override
    public EContractRecord setAName(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.A_NAME</code>. 「aName」- 甲方签订人
     */
    @Override
    public String getAName() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.A_PHONE</code>. 「aPhone」- 甲方签订人姓名
     */
    @Override
    public EContractRecord setAPhone(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.A_PHONE</code>. 「aPhone」- 甲方签订人姓名
     */
    @Override
    public String getAPhone() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.A_ADDRESS</code>. 「aAddress」- 甲方联系地址
     */
    @Override
    public EContractRecord setAAddress(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.A_ADDRESS</code>. 「aAddress」- 甲方联系地址
     */
    @Override
    public String getAAddress() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.B_NAME</code>. 「bName」- 乙方签订人
     */
    @Override
    public EContractRecord setBName(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.B_NAME</code>. 「bName」- 乙方签订人
     */
    @Override
    public String getBName() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.B_PHONE</code>. 「bPhone」- 乙方签订人姓名
     */
    @Override
    public EContractRecord setBPhone(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.B_PHONE</code>. 「bPhone」- 乙方签订人姓名
     */
    @Override
    public String getBPhone() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.B_ADDRESS</code>. 「bAddress」- 乙方联系地址
     */
    @Override
    public EContractRecord setBAddress(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.B_ADDRESS</code>. 「bAddress」- 乙方联系地址
     */
    @Override
    public String getBAddress() {
        return (String) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.TYPE</code>. 「type」- 合同分类
     */
    @Override
    public EContractRecord setType(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.TYPE</code>. 「type」- 合同分类
     */
    @Override
    public String getType() {
        return (String) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public EContractRecord setMetadata(String value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public EContractRecord setActive(Boolean value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(20);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.SIGMA</code>. 「sigma」- 统一标识（公司所属应用）
     */
    @Override
    public EContractRecord setSigma(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.SIGMA</code>. 「sigma」- 统一标识（公司所属应用）
     */
    @Override
    public String getSigma() {
        return (String) get(21);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public EContractRecord setLanguage(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(22);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public EContractRecord setCreatedAt(LocalDateTime value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(23);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public EContractRecord setCreatedBy(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(24);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public EContractRecord setUpdatedAt(LocalDateTime value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(25);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_CONTRACT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public EContractRecord setUpdatedBy(String value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_CONTRACT.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(26);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IEContract from) {
        setKey(from.getKey());
        setName(from.getName());
        setCode(from.getCode());
        setTitle(from.getTitle());
        setFileKey(from.getFileKey());
        setAmount(from.getAmount());
        setCompanyId(from.getCompanyId());
        setCustomerId(from.getCustomerId());
        setExpiredAt(from.getExpiredAt());
        setSignedAt(from.getSignedAt());
        setRunAt(from.getRunAt());
        setRunUpAt(from.getRunUpAt());
        setAName(from.getAName());
        setAPhone(from.getAPhone());
        setAAddress(from.getAAddress());
        setBName(from.getBName());
        setBPhone(from.getBPhone());
        setBAddress(from.getBAddress());
        setType(from.getType());
        setMetadata(from.getMetadata());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IEContract> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EContractRecord
     */
    public EContractRecord() {
        super(EContract.E_CONTRACT);
    }

    /**
     * Create a detached, initialised EContractRecord
     */
    public EContractRecord(String key, String name, String code, String title, String fileKey, BigDecimal amount, String companyId, String customerId, LocalDateTime expiredAt, LocalDateTime signedAt, LocalDateTime runAt, LocalDateTime runUpAt, String aName, String aPhone, String aAddress, String bName, String bPhone, String bAddress, String type, String metadata, Boolean active, String sigma, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(EContract.E_CONTRACT);

        set(0, key);
        set(1, name);
        set(2, code);
        set(3, title);
        set(4, fileKey);
        set(5, amount);
        set(6, companyId);
        set(7, customerId);
        set(8, expiredAt);
        set(9, signedAt);
        set(10, runAt);
        set(11, runUpAt);
        set(12, aName);
        set(13, aPhone);
        set(14, aAddress);
        set(15, bName);
        set(16, bPhone);
        set(17, bAddress);
        set(18, type);
        set(19, metadata);
        set(20, active);
        set(21, sigma);
        set(22, language);
        set(23, createdAt);
        set(24, createdBy);
        set(25, updatedAt);
        set(26, updatedBy);
    }
}