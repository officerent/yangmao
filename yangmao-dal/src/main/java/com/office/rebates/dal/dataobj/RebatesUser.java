package com.office.rebates.dal.dataobj;

import java.util.Date;

public class RebatesUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rebates_user.user_id
     *
     * @mbggenerated Mon Jul 25 14:41:38 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rebates_user.name
     *
     * @mbggenerated Mon Jul 25 14:41:38 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rebates_user.password
     *
     * @mbggenerated Mon Jul 25 14:41:38 CST 2016
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rebates_user.status
     *
     * @mbggenerated Mon Jul 25 14:41:38 CST 2016
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rebates_user.is_admin
     *
     * @mbggenerated Mon Jul 25 14:41:38 CST 2016
     */
    private Byte isAdmin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rebates_user.last_frozen_time
     *
     * @mbggenerated Mon Jul 25 14:41:38 CST 2016
     */
    private Date lastFrozenTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rebates_user.create_time
     *
     * @mbggenerated Mon Jul 25 14:41:38 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rebates_user.last_update_time
     *
     * @mbggenerated Mon Jul 25 14:41:38 CST 2016
     */
    private Date lastUpdateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rebates_user.user_id
     *
     * @return the value of rebates_user.user_id
     *
     * @mbggenerated Mon Jul 25 14:41:38 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rebates_user.user_id
     *
     * @param userId the value for rebates_user.user_id
     *
     * @mbggenerated Mon Jul 25 14:41:38 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rebates_user.name
     *
     * @return the value of rebates_user.name
     *
     * @mbggenerated Mon Jul 25 14:41:38 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rebates_user.name
     *
     * @param name the value for rebates_user.name
     *
     * @mbggenerated Mon Jul 25 14:41:38 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rebates_user.password
     *
     * @return the value of rebates_user.password
     *
     * @mbggenerated Mon Jul 25 14:41:38 CST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rebates_user.password
     *
     * @param password the value for rebates_user.password
     *
     * @mbggenerated Mon Jul 25 14:41:38 CST 2016
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rebates_user.status
     *
     * @return the value of rebates_user.status
     *
     * @mbggenerated Mon Jul 25 14:41:38 CST 2016
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rebates_user.status
     *
     * @param status the value for rebates_user.status
     *
     * @mbggenerated Mon Jul 25 14:41:38 CST 2016
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rebates_user.is_admin
     *
     * @return the value of rebates_user.is_admin
     *
     * @mbggenerated Mon Jul 25 14:41:38 CST 2016
     */
    public Byte getIsAdmin() {
        return isAdmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rebates_user.is_admin
     *
     * @param isAdmin the value for rebates_user.is_admin
     *
     * @mbggenerated Mon Jul 25 14:41:38 CST 2016
     */
    public void setIsAdmin(Byte isAdmin) {
        this.isAdmin = isAdmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rebates_user.last_frozen_time
     *
     * @return the value of rebates_user.last_frozen_time
     *
     * @mbggenerated Mon Jul 25 14:41:38 CST 2016
     */
    public Date getLastFrozenTime() {
        return lastFrozenTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rebates_user.last_frozen_time
     *
     * @param lastFrozenTime the value for rebates_user.last_frozen_time
     *
     * @mbggenerated Mon Jul 25 14:41:38 CST 2016
     */
    public void setLastFrozenTime(Date lastFrozenTime) {
        this.lastFrozenTime = lastFrozenTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rebates_user.create_time
     *
     * @return the value of rebates_user.create_time
     *
     * @mbggenerated Mon Jul 25 14:41:38 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rebates_user.create_time
     *
     * @param createTime the value for rebates_user.create_time
     *
     * @mbggenerated Mon Jul 25 14:41:38 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rebates_user.last_update_time
     *
     * @return the value of rebates_user.last_update_time
     *
     * @mbggenerated Mon Jul 25 14:41:38 CST 2016
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rebates_user.last_update_time
     *
     * @param lastUpdateTime the value for rebates_user.last_update_time
     *
     * @mbggenerated Mon Jul 25 14:41:38 CST 2016
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}