package com.cms.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table phone_package
 */
public class PhonePackage implements Serializable {
    /**
     * Database Column Remarks:
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_package.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_package.r_id
     *
     * @mbg.generated
     */
    private Integer rId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_package.package_limit
     *
     * @mbg.generated
     */
    private Integer packageLimit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_package.package_version
     *
     * @mbg.generated
     */
    private Integer packageVersion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_package.package_info
     *
     * @mbg.generated
     */
    private String packageInfo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_package.message_num
     *
     * @mbg.generated
     */
    private Integer messageNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_package.call_date
     *
     * @mbg.generated
     */
    private Integer callDate;

    /**
     * Database Column Remarks:
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_package.web_data
     *
     * @mbg.generated
     */
    private BigDecimal webData;

    /**
     * Database Column Remarks:
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column phone_package.special_web_data
     *
     * @mbg.generated
     */
    private BigDecimal specialWebData;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table phone_package
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_package.id
     *
     * @return the value of phone_package.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phone_package.id
     *
     * @param id the value for phone_package.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_package.r_id
     *
     * @return the value of phone_package.r_id
     *
     * @mbg.generated
     */
    public Integer getrId() {
        return rId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phone_package.r_id
     *
     * @param rId the value for phone_package.r_id
     *
     * @mbg.generated
     */
    public void setrId(Integer rId) {
        this.rId = rId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_package.package_limit
     *
     * @return the value of phone_package.package_limit
     *
     * @mbg.generated
     */
    public Integer getPackageLimit() {
        return packageLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phone_package.package_limit
     *
     * @param packageLimit the value for phone_package.package_limit
     *
     * @mbg.generated
     */
    public void setPackageLimit(Integer packageLimit) {
        this.packageLimit = packageLimit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_package.package_version
     *
     * @return the value of phone_package.package_version
     *
     * @mbg.generated
     */
    public Integer getPackageVersion() {
        return packageVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phone_package.package_version
     *
     * @param packageVersion the value for phone_package.package_version
     *
     * @mbg.generated
     */
    public void setPackageVersion(Integer packageVersion) {
        this.packageVersion = packageVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_package.package_info
     *
     * @return the value of phone_package.package_info
     *
     * @mbg.generated
     */
    public String getPackageInfo() {
        return packageInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phone_package.package_info
     *
     * @param packageInfo the value for phone_package.package_info
     *
     * @mbg.generated
     */
    public void setPackageInfo(String packageInfo) {
        this.packageInfo = packageInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_package.message_num
     *
     * @return the value of phone_package.message_num
     *
     * @mbg.generated
     */
    public Integer getMessageNum() {
        return messageNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phone_package.message_num
     *
     * @param messageNum the value for phone_package.message_num
     *
     * @mbg.generated
     */
    public void setMessageNum(Integer messageNum) {
        this.messageNum = messageNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_package.call_date
     *
     * @return the value of phone_package.call_date
     *
     * @mbg.generated
     */
    public Integer getCallDate() {
        return callDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phone_package.call_date
     *
     * @param callDate the value for phone_package.call_date
     *
     * @mbg.generated
     */
    public void setCallDate(Integer callDate) {
        this.callDate = callDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_package.web_data
     *
     * @return the value of phone_package.web_data
     *
     * @mbg.generated
     */
    public BigDecimal getWebData() {
        return webData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phone_package.web_data
     *
     * @param webData the value for phone_package.web_data
     *
     * @mbg.generated
     */
    public void setWebData(BigDecimal webData) {
        this.webData = webData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column phone_package.special_web_data
     *
     * @return the value of phone_package.special_web_data
     *
     * @mbg.generated
     */
    public BigDecimal getSpecialWebData() {
        return specialWebData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column phone_package.special_web_data
     *
     * @param specialWebData the value for phone_package.special_web_data
     *
     * @mbg.generated
     */
    public void setSpecialWebData(BigDecimal specialWebData) {
        this.specialWebData = specialWebData;
    }
}