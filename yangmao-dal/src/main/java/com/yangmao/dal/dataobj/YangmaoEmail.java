package com.yangmao.dal.dataobj;

import java.util.Date;

public class YangmaoEmail {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yangmao_email.email_id
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    private Long emailId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yangmao_email.email
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yangmao_email.last_email_time
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    private Date lastEmailTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yangmao_email.last_reject_time
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    private Date lastRejectTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yangmao_email.email_instance_id
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    private Long emailInstanceId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yangmao_email.email_id
     *
     * @return the value of yangmao_email.email_id
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    public Long getEmailId() {
        return emailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yangmao_email.email_id
     *
     * @param emailId the value for yangmao_email.email_id
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    public void setEmailId(Long emailId) {
        this.emailId = emailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yangmao_email.email
     *
     * @return the value of yangmao_email.email
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yangmao_email.email
     *
     * @param email the value for yangmao_email.email
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yangmao_email.last_email_time
     *
     * @return the value of yangmao_email.last_email_time
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    public Date getLastEmailTime() {
        return lastEmailTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yangmao_email.last_email_time
     *
     * @param lastEmailTime the value for yangmao_email.last_email_time
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    public void setLastEmailTime(Date lastEmailTime) {
        this.lastEmailTime = lastEmailTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yangmao_email.last_reject_time
     *
     * @return the value of yangmao_email.last_reject_time
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    public Date getLastRejectTime() {
        return lastRejectTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yangmao_email.last_reject_time
     *
     * @param lastRejectTime the value for yangmao_email.last_reject_time
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    public void setLastRejectTime(Date lastRejectTime) {
        this.lastRejectTime = lastRejectTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yangmao_email.email_instance_id
     *
     * @return the value of yangmao_email.email_instance_id
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    public Long getEmailInstanceId() {
        return emailInstanceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yangmao_email.email_instance_id
     *
     * @param emailInstanceId the value for yangmao_email.email_instance_id
     *
     * @mbggenerated Fri Aug 26 17:19:12 CST 2016
     */
    public void setEmailInstanceId(Long emailInstanceId) {
        this.emailInstanceId = emailInstanceId;
    }
}