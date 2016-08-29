package com.yangmao.dal.dataobj;

import java.util.Date;

public class YangmaoEmailGettingHistory {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yangmao_email_getting_history.history_id
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    private Long historyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yangmao_email_getting_history.ip_address
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    private String ipAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yangmao_email_getting_history.sender_id
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    private Long senderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yangmao_email_getting_history.amount
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    private Integer amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yangmao_email_getting_history.mail_instance_id
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    private Long mailInstanceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column yangmao_email_getting_history.create_time
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yangmao_email_getting_history.history_id
     *
     * @return the value of yangmao_email_getting_history.history_id
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    public Long getHistoryId() {
        return historyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yangmao_email_getting_history.history_id
     *
     * @param historyId the value for yangmao_email_getting_history.history_id
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    public void setHistoryId(Long historyId) {
        this.historyId = historyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yangmao_email_getting_history.ip_address
     *
     * @return the value of yangmao_email_getting_history.ip_address
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yangmao_email_getting_history.ip_address
     *
     * @param ipAddress the value for yangmao_email_getting_history.ip_address
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yangmao_email_getting_history.sender_id
     *
     * @return the value of yangmao_email_getting_history.sender_id
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    public Long getSenderId() {
        return senderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yangmao_email_getting_history.sender_id
     *
     * @param senderId the value for yangmao_email_getting_history.sender_id
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yangmao_email_getting_history.amount
     *
     * @return the value of yangmao_email_getting_history.amount
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yangmao_email_getting_history.amount
     *
     * @param amount the value for yangmao_email_getting_history.amount
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yangmao_email_getting_history.mail_instance_id
     *
     * @return the value of yangmao_email_getting_history.mail_instance_id
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    public Long getMailInstanceId() {
        return mailInstanceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yangmao_email_getting_history.mail_instance_id
     *
     * @param mailInstanceId the value for yangmao_email_getting_history.mail_instance_id
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    public void setMailInstanceId(Long mailInstanceId) {
        this.mailInstanceId = mailInstanceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column yangmao_email_getting_history.create_time
     *
     * @return the value of yangmao_email_getting_history.create_time
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column yangmao_email_getting_history.create_time
     *
     * @param createTime the value for yangmao_email_getting_history.create_time
     *
     * @mbggenerated Mon Aug 29 14:35:12 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}