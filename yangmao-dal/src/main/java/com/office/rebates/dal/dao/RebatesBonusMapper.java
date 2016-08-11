package com.office.rebates.dal.dao;

import com.office.rebates.dal.dataobj.RebatesBonus;
import com.office.rebates.dal.dataobj.RebatesBonusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RebatesBonusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebates_bonus
     *
     * @mbggenerated Mon Jul 25 14:41:39 CST 2016
     */
    int countByExample(RebatesBonusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebates_bonus
     *
     * @mbggenerated Mon Jul 25 14:41:39 CST 2016
     */
    int deleteByExample(RebatesBonusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebates_bonus
     *
     * @mbggenerated Mon Jul 25 14:41:39 CST 2016
     */
    int deleteByPrimaryKey(Long bonusId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebates_bonus
     *
     * @mbggenerated Mon Jul 25 14:41:39 CST 2016
     */
    int insert(RebatesBonus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebates_bonus
     *
     * @mbggenerated Mon Jul 25 14:41:39 CST 2016
     */
    int insertSelective(RebatesBonus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebates_bonus
     *
     * @mbggenerated Mon Jul 25 14:41:39 CST 2016
     */
    List<RebatesBonus> selectByExample(RebatesBonusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebates_bonus
     *
     * @mbggenerated Mon Jul 25 14:41:39 CST 2016
     */
    RebatesBonus selectByPrimaryKey(Long bonusId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebates_bonus
     *
     * @mbggenerated Mon Jul 25 14:41:39 CST 2016
     */
    int updateByExampleSelective(@Param("record") RebatesBonus record, @Param("example") RebatesBonusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebates_bonus
     *
     * @mbggenerated Mon Jul 25 14:41:39 CST 2016
     */
    int updateByExample(@Param("record") RebatesBonus record, @Param("example") RebatesBonusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebates_bonus
     *
     * @mbggenerated Mon Jul 25 14:41:39 CST 2016
     */
    int updateByPrimaryKeySelective(RebatesBonus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rebates_bonus
     *
     * @mbggenerated Mon Jul 25 14:41:39 CST 2016
     */
    int updateByPrimaryKey(RebatesBonus record);
}