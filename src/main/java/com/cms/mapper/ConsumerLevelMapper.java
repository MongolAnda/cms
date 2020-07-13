package com.cms.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.cms.pojo.ConsumerLevel;
@Mapper
public interface ConsumerLevelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table consumer_level
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table consumer_level
     *
     * @mbg.generated
     */
    int insert(ConsumerLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table consumer_level
     *
     * @mbg.generated
     */
    int insertSelective(ConsumerLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table consumer_level
     *
     * @mbg.generated
     */
    ConsumerLevel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table consumer_level
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ConsumerLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table consumer_level
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ConsumerLevel record);
}