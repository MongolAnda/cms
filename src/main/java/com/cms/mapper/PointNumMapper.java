package com.cms.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.cms.pojo.PointNum;
@Mapper
public interface PointNumMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_num
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_num
     *
     * @mbg.generated
     */
    int insert(PointNum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_num
     *
     * @mbg.generated
     */
    int insertSelective(PointNum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_num
     *
     * @mbg.generated
     */
    PointNum selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_num
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(PointNum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table point_num
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PointNum record);
}