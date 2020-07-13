package com.cms.pojo;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table consumer_basic_info
 */
public class ConsumerBasicInfo implements Serializable {
    /**
     * Database Column Remarks:
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column consumer_basic_info.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column consumer_basic_info.phone_num
     *
     * @mbg.generated
     */
    private String phoneNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column consumer_basic_info.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     * Database Column Remarks:
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column consumer_basic_info.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * Database Column Remarks:
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column consumer_basic_info.password
     *
     * @mbg.generated
     */
    private Integer password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table consumer_basic_info
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column consumer_basic_info.id
     *
     * @return the value of consumer_basic_info.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column consumer_basic_info.id
     *
     * @param id the value for consumer_basic_info.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column consumer_basic_info.phone_num
     *
     * @return the value of consumer_basic_info.phone_num
     *
     * @mbg.generated
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column consumer_basic_info.phone_num
     *
     * @param phoneNum the value for consumer_basic_info.phone_num
     *
     * @mbg.generated
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column consumer_basic_info.email
     *
     * @return the value of consumer_basic_info.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column consumer_basic_info.email
     *
     * @param email the value for consumer_basic_info.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column consumer_basic_info.status
     *
     * @return the value of consumer_basic_info.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column consumer_basic_info.status
     *
     * @param status the value for consumer_basic_info.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column consumer_basic_info.password
     *
     * @return the value of consumer_basic_info.password
     *
     * @mbg.generated
     */
    public Integer getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column consumer_basic_info.password
     *
     * @param password the value for consumer_basic_info.password
     *
     * @mbg.generated
     */
    public void setPassword(Integer password) {
        this.password = password;
    }
}