package com.yangmao.dal.dao;

import com.yangmao.dal.dataobj.YangmaoMailInstanceItem;
import com.yangmao.dal.dataobj.YangmaoMailInstanceItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YangmaoMailInstanceItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_mail_instance_item
     *
     * @mbggenerated Wed Aug 24 18:54:43 CST 2016
     */
    int countByExample(YangmaoMailInstanceItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_mail_instance_item
     *
     * @mbggenerated Wed Aug 24 18:54:43 CST 2016
     */
    int deleteByExample(YangmaoMailInstanceItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_mail_instance_item
     *
     * @mbggenerated Wed Aug 24 18:54:43 CST 2016
     */
    int deleteByPrimaryKey(Long instanceItemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_mail_instance_item
     *
     * @mbggenerated Wed Aug 24 18:54:43 CST 2016
     */
    int insert(YangmaoMailInstanceItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_mail_instance_item
     *
     * @mbggenerated Wed Aug 24 18:54:43 CST 2016
     */
    int insertSelective(YangmaoMailInstanceItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_mail_instance_item
     *
     * @mbggenerated Wed Aug 24 18:54:43 CST 2016
     */
    List<YangmaoMailInstanceItem> selectByExample(YangmaoMailInstanceItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_mail_instance_item
     *
     * @mbggenerated Wed Aug 24 18:54:43 CST 2016
     */
    YangmaoMailInstanceItem selectByPrimaryKey(Long instanceItemId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_mail_instance_item
     *
     * @mbggenerated Wed Aug 24 18:54:43 CST 2016
     */
    int updateByExampleSelective(@Param("record") YangmaoMailInstanceItem record, @Param("example") YangmaoMailInstanceItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_mail_instance_item
     *
     * @mbggenerated Wed Aug 24 18:54:43 CST 2016
     */
    int updateByExample(@Param("record") YangmaoMailInstanceItem record, @Param("example") YangmaoMailInstanceItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_mail_instance_item
     *
     * @mbggenerated Wed Aug 24 18:54:43 CST 2016
     */
    int updateByPrimaryKeySelective(YangmaoMailInstanceItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_mail_instance_item
     *
     * @mbggenerated Wed Aug 24 18:54:43 CST 2016
     */
    int updateByPrimaryKey(YangmaoMailInstanceItem record);
}