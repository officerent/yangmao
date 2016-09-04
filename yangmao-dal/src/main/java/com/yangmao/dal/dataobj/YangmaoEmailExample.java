package com.yangmao.dal.dataobj;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YangmaoEmailExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yangmao_email
     *
     * @mbggenerated Sun Sep 04 23:10:26 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yangmao_email
     *
     * @mbggenerated Sun Sep 04 23:10:26 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yangmao_email
     *
     * @mbggenerated Sun Sep 04 23:10:26 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_email
     *
     * @mbggenerated Sun Sep 04 23:10:26 CST 2016
     */
    public YangmaoEmailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_email
     *
     * @mbggenerated Sun Sep 04 23:10:26 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_email
     *
     * @mbggenerated Sun Sep 04 23:10:26 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_email
     *
     * @mbggenerated Sun Sep 04 23:10:26 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_email
     *
     * @mbggenerated Sun Sep 04 23:10:26 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_email
     *
     * @mbggenerated Sun Sep 04 23:10:26 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_email
     *
     * @mbggenerated Sun Sep 04 23:10:26 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_email
     *
     * @mbggenerated Sun Sep 04 23:10:26 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_email
     *
     * @mbggenerated Sun Sep 04 23:10:26 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_email
     *
     * @mbggenerated Sun Sep 04 23:10:26 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_email
     *
     * @mbggenerated Sun Sep 04 23:10:26 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yangmao_email
     *
     * @mbggenerated Sun Sep 04 23:10:26 CST 2016
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andEmailIdIsNull() {
            addCriterion("email_id is null");
            return (Criteria) this;
        }

        public Criteria andEmailIdIsNotNull() {
            addCriterion("email_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmailIdEqualTo(Long value) {
            addCriterion("email_id =", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdNotEqualTo(Long value) {
            addCriterion("email_id <>", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdGreaterThan(Long value) {
            addCriterion("email_id >", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("email_id >=", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdLessThan(Long value) {
            addCriterion("email_id <", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdLessThanOrEqualTo(Long value) {
            addCriterion("email_id <=", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdIn(List<Long> values) {
            addCriterion("email_id in", values, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdNotIn(List<Long> values) {
            addCriterion("email_id not in", values, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdBetween(Long value1, Long value2) {
            addCriterion("email_id between", value1, value2, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdNotBetween(Long value1, Long value2) {
            addCriterion("email_id not between", value1, value2, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andLastEmailTimeIsNull() {
            addCriterion("last_email_time is null");
            return (Criteria) this;
        }

        public Criteria andLastEmailTimeIsNotNull() {
            addCriterion("last_email_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastEmailTimeEqualTo(Date value) {
            addCriterion("last_email_time =", value, "lastEmailTime");
            return (Criteria) this;
        }

        public Criteria andLastEmailTimeNotEqualTo(Date value) {
            addCriterion("last_email_time <>", value, "lastEmailTime");
            return (Criteria) this;
        }

        public Criteria andLastEmailTimeGreaterThan(Date value) {
            addCriterion("last_email_time >", value, "lastEmailTime");
            return (Criteria) this;
        }

        public Criteria andLastEmailTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_email_time >=", value, "lastEmailTime");
            return (Criteria) this;
        }

        public Criteria andLastEmailTimeLessThan(Date value) {
            addCriterion("last_email_time <", value, "lastEmailTime");
            return (Criteria) this;
        }

        public Criteria andLastEmailTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_email_time <=", value, "lastEmailTime");
            return (Criteria) this;
        }

        public Criteria andLastEmailTimeIn(List<Date> values) {
            addCriterion("last_email_time in", values, "lastEmailTime");
            return (Criteria) this;
        }

        public Criteria andLastEmailTimeNotIn(List<Date> values) {
            addCriterion("last_email_time not in", values, "lastEmailTime");
            return (Criteria) this;
        }

        public Criteria andLastEmailTimeBetween(Date value1, Date value2) {
            addCriterion("last_email_time between", value1, value2, "lastEmailTime");
            return (Criteria) this;
        }

        public Criteria andLastEmailTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_email_time not between", value1, value2, "lastEmailTime");
            return (Criteria) this;
        }

        public Criteria andLastRejectTimeIsNull() {
            addCriterion("last_reject_time is null");
            return (Criteria) this;
        }

        public Criteria andLastRejectTimeIsNotNull() {
            addCriterion("last_reject_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastRejectTimeEqualTo(Date value) {
            addCriterion("last_reject_time =", value, "lastRejectTime");
            return (Criteria) this;
        }

        public Criteria andLastRejectTimeNotEqualTo(Date value) {
            addCriterion("last_reject_time <>", value, "lastRejectTime");
            return (Criteria) this;
        }

        public Criteria andLastRejectTimeGreaterThan(Date value) {
            addCriterion("last_reject_time >", value, "lastRejectTime");
            return (Criteria) this;
        }

        public Criteria andLastRejectTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_reject_time >=", value, "lastRejectTime");
            return (Criteria) this;
        }

        public Criteria andLastRejectTimeLessThan(Date value) {
            addCriterion("last_reject_time <", value, "lastRejectTime");
            return (Criteria) this;
        }

        public Criteria andLastRejectTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_reject_time <=", value, "lastRejectTime");
            return (Criteria) this;
        }

        public Criteria andLastRejectTimeIn(List<Date> values) {
            addCriterion("last_reject_time in", values, "lastRejectTime");
            return (Criteria) this;
        }

        public Criteria andLastRejectTimeNotIn(List<Date> values) {
            addCriterion("last_reject_time not in", values, "lastRejectTime");
            return (Criteria) this;
        }

        public Criteria andLastRejectTimeBetween(Date value1, Date value2) {
            addCriterion("last_reject_time between", value1, value2, "lastRejectTime");
            return (Criteria) this;
        }

        public Criteria andLastRejectTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_reject_time not between", value1, value2, "lastRejectTime");
            return (Criteria) this;
        }

        public Criteria andEmailInstanceIdIsNull() {
            addCriterion("email_instance_id is null");
            return (Criteria) this;
        }

        public Criteria andEmailInstanceIdIsNotNull() {
            addCriterion("email_instance_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmailInstanceIdEqualTo(Long value) {
            addCriterion("email_instance_id =", value, "emailInstanceId");
            return (Criteria) this;
        }

        public Criteria andEmailInstanceIdNotEqualTo(Long value) {
            addCriterion("email_instance_id <>", value, "emailInstanceId");
            return (Criteria) this;
        }

        public Criteria andEmailInstanceIdGreaterThan(Long value) {
            addCriterion("email_instance_id >", value, "emailInstanceId");
            return (Criteria) this;
        }

        public Criteria andEmailInstanceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("email_instance_id >=", value, "emailInstanceId");
            return (Criteria) this;
        }

        public Criteria andEmailInstanceIdLessThan(Long value) {
            addCriterion("email_instance_id <", value, "emailInstanceId");
            return (Criteria) this;
        }

        public Criteria andEmailInstanceIdLessThanOrEqualTo(Long value) {
            addCriterion("email_instance_id <=", value, "emailInstanceId");
            return (Criteria) this;
        }

        public Criteria andEmailInstanceIdIn(List<Long> values) {
            addCriterion("email_instance_id in", values, "emailInstanceId");
            return (Criteria) this;
        }

        public Criteria andEmailInstanceIdNotIn(List<Long> values) {
            addCriterion("email_instance_id not in", values, "emailInstanceId");
            return (Criteria) this;
        }

        public Criteria andEmailInstanceIdBetween(Long value1, Long value2) {
            addCriterion("email_instance_id between", value1, value2, "emailInstanceId");
            return (Criteria) this;
        }

        public Criteria andEmailInstanceIdNotBetween(Long value1, Long value2) {
            addCriterion("email_instance_id not between", value1, value2, "emailInstanceId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yangmao_email
     *
     * @mbggenerated do_not_delete_during_merge Sun Sep 04 23:10:26 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yangmao_email
     *
     * @mbggenerated Sun Sep 04 23:10:26 CST 2016
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}