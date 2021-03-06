package com.cms.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table consumer_history
 */
public class ConsumerHistory implements Serializable {
	
    @Override
	public String toString() {
		return "ConsumerHistory [id=" + id + ", rId=" + rId + ", balance=" + balance + ", overdraftLimit="
				+ overdraftLimit + ", consumerLevel=" + consumerLevel + ", packageId=" + packageId + ", usageAmount="
				+ usageAmount + ", usageDate=" + usageDate + "]";
	}

	/**
     * Database Column Remarks:
     *   ��������
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column consumer_history.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   ����id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column consumer_history.r_id
     *
     * @mbg.generated
     */
    private Integer rId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column consumer_history.balance
     *
     * @mbg.generated
     */
    private BigDecimal balance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column consumer_history.overdraft_limit
     *
     * @mbg.generated
     */
    private BigDecimal overdraftLimit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column consumer_history.consumer_level
     *
     * @mbg.generated
     */
    private Integer consumerLevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column consumer_history.package_id
     *
     * @mbg.generated
     */
    private Integer packageId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column consumer_history.usage_amount
     *
     * @mbg.generated
     */
    private BigDecimal usageAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column consumer_history.usage_date
     *
     * @mbg.generated
     */
    private Date usageDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table consumer_history
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column consumer_history.id
     *
     * @return the value of consumer_history.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column consumer_history.id
     *
     * @param id the value for consumer_history.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column consumer_history.r_id
     *
     * @return the value of consumer_history.r_id
     *
     * @mbg.generated
     */
    public Integer getrId() {
        return rId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column consumer_history.r_id
     *
     * @param rId the value for consumer_history.r_id
     *
     * @mbg.generated
     */
    public void setrId(Integer rId) {
        this.rId = rId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column consumer_history.balance
     *
     * @return the value of consumer_history.balance
     *
     * @mbg.generated
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column consumer_history.balance
     *
     * @param balance the value for consumer_history.balance
     *
     * @mbg.generated
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column consumer_history.overdraft_limit
     *
     * @return the value of consumer_history.overdraft_limit
     *
     * @mbg.generated
     */
    public BigDecimal getOverdraftLimit() {
        return overdraftLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column consumer_history.overdraft_limit
     *
     * @param overdraftLimit the value for consumer_history.overdraft_limit
     *
     * @mbg.generated
     */
    public void setOverdraftLimit(BigDecimal overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column consumer_history.consumer_level
     *
     * @return the value of consumer_history.consumer_level
     *
     * @mbg.generated
     */
    public Integer getConsumerLevel() {
        return consumerLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column consumer_history.consumer_level
     *
     * @param consumerLevel the value for consumer_history.consumer_level
     *
     * @mbg.generated
     */
    public void setConsumerLevel(Integer consumerLevel) {
        this.consumerLevel = consumerLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column consumer_history.package_id
     *
     * @return the value of consumer_history.package_id
     *
     * @mbg.generated
     */
    public Integer getPackageId() {
        return packageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column consumer_history.package_id
     *
     * @param packageId the value for consumer_history.package_id
     *
     * @mbg.generated
     */
    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column consumer_history.usage_amount
     *
     * @return the value of consumer_history.usage_amount
     *
     * @mbg.generated
     */
    public BigDecimal getUsageAmount() {
        return usageAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column consumer_history.usage_amount
     *
     * @param usageAmount the value for consumer_history.usage_amount
     *
     * @mbg.generated
     */
    public void setUsageAmount(BigDecimal usageAmount) {
        this.usageAmount = usageAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column consumer_history.usage_date
     *
     * @return the value of consumer_history.usage_date
     *
     * @mbg.generated
     */
    public Date getUsageDate() {
        return usageDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column consumer_history.usage_date
     *
     * @param usageDate the value for consumer_history.usage_date
     *
     * @mbg.generated
     */
    public void setUsageDate(Date usageDate) {
        this.usageDate = usageDate;
    }
}