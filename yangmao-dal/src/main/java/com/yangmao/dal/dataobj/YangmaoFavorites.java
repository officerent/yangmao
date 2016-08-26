package com.yangmao.dal.dataobj;

import java.util.Date;

public class YangmaoFavorites {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yangmao_favorites.yangmao_favorites_id
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    private Long yangmaoFavoritesId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yangmao_favorites.favorites_id
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    private Long favoritesId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yangmao_favorites.title
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yangmao_favorites.type
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yangmao_favorites.create_time
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yangmao_favorites.last_update_time
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    private Date lastUpdateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yangmao_favorites.yangmao_favorites_id
     *
     * @return the value of yangmao_favorites.yangmao_favorites_id
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    public Long getYangmaoFavoritesId() {
        return yangmaoFavoritesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yangmao_favorites.yangmao_favorites_id
     *
     * @param yangmaoFavoritesId the value for yangmao_favorites.yangmao_favorites_id
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    public void setYangmaoFavoritesId(Long yangmaoFavoritesId) {
        this.yangmaoFavoritesId = yangmaoFavoritesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yangmao_favorites.favorites_id
     *
     * @return the value of yangmao_favorites.favorites_id
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    public Long getFavoritesId() {
        return favoritesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yangmao_favorites.favorites_id
     *
     * @param favoritesId the value for yangmao_favorites.favorites_id
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    public void setFavoritesId(Long favoritesId) {
        this.favoritesId = favoritesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yangmao_favorites.title
     *
     * @return the value of yangmao_favorites.title
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yangmao_favorites.title
     *
     * @param title the value for yangmao_favorites.title
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yangmao_favorites.type
     *
     * @return the value of yangmao_favorites.type
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yangmao_favorites.type
     *
     * @param type the value for yangmao_favorites.type
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yangmao_favorites.create_time
     *
     * @return the value of yangmao_favorites.create_time
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yangmao_favorites.create_time
     *
     * @param createTime the value for yangmao_favorites.create_time
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yangmao_favorites.last_update_time
     *
     * @return the value of yangmao_favorites.last_update_time
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yangmao_favorites.last_update_time
     *
     * @param lastUpdateTime the value for yangmao_favorites.last_update_time
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}