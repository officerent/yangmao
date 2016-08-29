package com.yangmao.dal.dao;

import com.yangmao.dal.dataobj.YangmaoFavorites;
import com.yangmao.dal.dataobj.YangmaoFavoritesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YangmaoFavoritesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_favorites
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    int countByExample(YangmaoFavoritesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_favorites
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    int deleteByExample(YangmaoFavoritesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_favorites
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    int deleteByPrimaryKey(Long yangmaoFavoritesId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_favorites
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    int insert(YangmaoFavorites record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_favorites
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    int insertSelective(YangmaoFavorites record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_favorites
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    List<YangmaoFavorites> selectByExample(YangmaoFavoritesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_favorites
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    YangmaoFavorites selectByPrimaryKey(Long yangmaoFavoritesId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_favorites
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    int updateByExampleSelective(@Param("record") YangmaoFavorites record, @Param("example") YangmaoFavoritesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_favorites
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    int updateByExample(@Param("record") YangmaoFavorites record, @Param("example") YangmaoFavoritesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_favorites
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    int updateByPrimaryKeySelective(YangmaoFavorites record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_favorites
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    int updateByPrimaryKey(YangmaoFavorites record);
}