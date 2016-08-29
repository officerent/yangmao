package com.yangmao.dal.dataobj;

import java.util.Date;

public class YangmaoUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yangmao_user.user_id
     *
     * @mbggenerated Mon Aug 29 18:23:32 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yangmao_user.name
     *
     * @mbggenerated Mon Aug 29 18:23:32 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yangmao_user.email
     *
     * @mbggenerated Mon Aug 29 18:23:32 CST 2016
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yangmao_user.password
     *
     * @mbggenerated Mon Aug 29 18:23:32 CST 2016
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yangmao_user.status
     *
     * @mbggenerated Mon Aug 29 18:23:32 CST 2016
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yangmao_user.is_admin
     *
     * @mbggenerated Mon Aug 29 18:23:32 CST 2016
     */
    private Byte isAdmin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yangmao_user.last_frozen_time
     *
     * @mbggenerated Mon Aug 29 18:23:32 CST 2016
     */
    private Date lastFrozenTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yangmao_user.create_time
     *
     * @mbggenerated Mon Aug 29 18:23:32 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yangmao_user.last_update_time
     *
     * @mbggenerated Mon Aug 29 18:23:32 CST 2016
     */
    private Date lastUpdateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yangmao_user.user_id
     *
     * @return the value of yangmao_user.user_id
     *
     * @mbggenerated Mon Aug 29 18:23:32 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yangmao_user.user_id
     *
     * @param userId the value for yangmao_user.user_id
     *
     * @mbggenerated Mon Aug 29 18:23:32 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yangmao_user.name
     *
     * @return the value of yangmao_user.name
     *
     * @mbggenerated Mon Aug 29 18:23:32 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yangmao_user.name
     *
     * @param name the value for yangmao_user.name
     *
     * @mbggenerated Mon Aug 29 18:23:32 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yangmao_user.email
     *
     * @return the value of yangmao_user.email
     *
     * @mbggenerated Mon Aug 29 18:23:32 CST 2016
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yangmao_user.email
     *
     * @param email the value for yangmao_user.email
     *
     * @mbggenerated Mon Aug 29 18:23:32 CST 2016
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yangmao_user.password
     *
     * @return the value of yangmao_user.password
     *
     * @mbggenerated Mon Aug 29 18:23:32 CST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yangmao_user.password
     *
     * @param password the value for yangmao_user.password
     *
     * @mbggenerated Mon Aug 29 18:23:32 CST 2016
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yangmao_user.status
     *
     * @return the value of yangmao_user.status
     *
     * @mbggenerated Mon Aug 29 18:23:32 CST 2016
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yangmao_user.status
     *
     * @param status the value for yangmao_user.status
     *
     * @mbggenerated Mon Aug 29 18:23:32 CST 2016
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yangmao_user.is_admin
     *
     * @return the value of yangmao_user.is_admin
     *
     * @mbggenerated Mon Aug 29 18:23:32 CST 2016
     */
    public Byte getIsAdmin() {
        return isAdmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yangmao_user.is_admin
     *
     * @param isAdmin the value for yangmao_user.is_admin
     *
     * @mbggenerated Mon Aug 29 18:23:32 CST 2016
     */
    public void setIsAdmin(Byte isAdmin) {
        this.isAdmin = isAdmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yangmao_user.last_frozen_time
     *
     * @return the value of yangmao_user.last_frozen_time
     *
     * @mbggenerated Mon Aug 29 18:23:32 CST 2016
     */
    public Date getLastFrozenTime() {
        return lastFrozenTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yangmao_user.last_frozen_time
     *
     * @param lastFrozenTime the value for yangmao_user.last_frozen_time
     *
     * @mbggenerated Mon Aug 29 18:23:32 CST 2016
     */
    public void setLastFrozenTime(Date lastFrozenTime) {
        this.lastFrozenTime = lastFrozenTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yangmao_user.create_time
     *
     * @return the value of yangmao_user.create_time
     *
     * @mbggenerated Mon Aug 29 18:23:32 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yangmao_user.create_time
     *
     * @param createTime the value for yangmao_user.create_time
     *
     * @mbggenerated Mon Aug 29 18:23:32 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yangmao_user.last_update_time
     *
     * @return the value of yangmao_user.last_update_time
     *
     * @mbggenerated Mon Aug 29 18:23:32 CST 2016
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yangmao_user.last_update_time
     *
     * @param lastUpdateTime the value for yangmao_user.last_update_time
     *
     * @mbggenerated Mon Aug 29 18:23:32 CST 2016
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}