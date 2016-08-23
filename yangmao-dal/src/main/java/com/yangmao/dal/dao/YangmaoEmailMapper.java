package com.yangmao.dal.dao;

import com.yangmao.dal.dataobj.YangmaoEmail;
import com.yangmao.dal.dataobj.YangmaoEmailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YangmaoEmailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_email
     *
     * @mbggenerated Tue Aug 23 16:46:01 CST 2016
     */
    int countByExample(YangmaoEmailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_email
     *
     * @mbggenerated Tue Aug 23 16:46:01 CST 2016
     */
    int deleteByExample(YangmaoEmailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_email
     *
     * @mbggenerated Tue Aug 23 16:46:01 CST 2016
     */
    int deleteByPrimaryKey(Long emailId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_email
     *
     * @mbggenerated Tue Aug 23 16:46:01 CST 2016
     */
    int insert(YangmaoEmail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_email
     *
     * @mbggenerated Tue Aug 23 16:46:01 CST 2016
     */
    int insertSelective(YangmaoEmail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_email
     *
     * @mbggenerated Tue Aug 23 16:46:01 CST 2016
     */
    List<YangmaoEmail> selectByExample(YangmaoEmailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_email
     *
     * @mbggenerated Tue Aug 23 16:46:01 CST 2016
     */
    YangmaoEmail selectByPrimaryKey(Long emailId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_email
     *
     * @mbggenerated Tue Aug 23 16:46:01 CST 2016
     */
    int updateByExampleSelective(@Param("record") YangmaoEmail record, @Param("example") YangmaoEmailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_email
     *
     * @mbggenerated Tue Aug 23 16:46:01 CST 2016
     */
    int updateByExample(@Param("record") YangmaoEmail record, @Param("example") YangmaoEmailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_email
     *
     * @mbggenerated Tue Aug 23 16:46:01 CST 2016
     */
    int updateByPrimaryKeySelective(YangmaoEmail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_email
     *
     * @mbggenerated Tue Aug 23 16:46:01 CST 2016
     */
    int updateByPrimaryKey(YangmaoEmail record);
}