package com.cms.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.cms.pojo.RechargeCard;
@Mapper
public interface RechargeCardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_card
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_card
     *
     * @mbg.generated
     */
    int insert(RechargeCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_card
     *
     * @mbg.generated
     */
    int insertSelective(RechargeCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_card
     *
     * @mbg.generated
     */
    RechargeCard selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_card
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(RechargeCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_card
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(RechargeCard record);
}