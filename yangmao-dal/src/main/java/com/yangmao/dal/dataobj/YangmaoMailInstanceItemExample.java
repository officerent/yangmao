package com.yangmao.dal.dataobj;

import java.util.ArrayList;
import java.util.List;

public class YangmaoMailInstanceItemExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yangmao_mail_instance_item
     *
     * @mbggenerated Thu Aug 25 15:46:14 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yangmao_mail_instance_item
     *
     * @mbggenerated Thu Aug 25 15:46:14 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yangmao_mail_instance_item
     *
     * @mbggenerated Thu Aug 25 15:46:14 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_mail_instance_item
     *
     * @mbggenerated Thu Aug 25 15:46:14 CST 2016
     */
    public YangmaoMailInstanceItemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_mail_instance_item
     *
     * @mbggenerated Thu Aug 25 15:46:14 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_mail_instance_item
     *
     * @mbggenerated Thu Aug 25 15:46:14 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_mail_instance_item
     *
     * @mbggenerated Thu Aug 25 15:46:14 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_mail_instance_item
     *
     * @mbggenerated Thu Aug 25 15:46:14 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_mail_instance_item
     *
     * @mbggenerated Thu Aug 25 15:46:14 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_mail_instance_item
     *
     * @mbggenerated Thu Aug 25 15:46:14 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_mail_instance_item
     *
     * @mbggenerated Thu Aug 25 15:46:14 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_mail_instance_item
     *
     * @mbggenerated Thu Aug 25 15:46:14 CST 2016
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
     * This method corresponds to the database table yangmao_mail_instance_item
     *
     * @mbggenerated Thu Aug 25 15:46:14 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_mail_instance_item
     *
     * @mbggenerated Thu Aug 25 15:46:14 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yangmao_mail_instance_item
     *
     * @mbggenerated Thu Aug 25 15:46:14 CST 2016
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

        public Criteria andInstanceItemIdIsNull() {
            addCriterion("instance_item_id is null");
            return (Criteria) this;
        }

        public Criteria andInstanceItemIdIsNotNull() {
            addCriterion("instance_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andInstanceItemIdEqualTo(Long value) {
            addCriterion("instance_item_id =", value, "instanceItemId");
            return (Criteria) this;
        }

        public Criteria andInstanceItemIdNotEqualTo(Long value) {
            addCriterion("instance_item_id <>", value, "instanceItemId");
            return (Criteria) this;
        }

        public Criteria andInstanceItemIdGreaterThan(Long value) {
            addCriterion("instance_item_id >", value, "instanceItemId");
            return (Criteria) this;
        }

        public Criteria andInstanceItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("instance_item_id >=", value, "instanceItemId");
            return (Criteria) this;
        }

        public Criteria andInstanceItemIdLessThan(Long value) {
            addCriterion("instance_item_id <", value, "instanceItemId");
            return (Criteria) this;
        }

        public Criteria andInstanceItemIdLessThanOrEqualTo(Long value) {
            addCriterion("instance_item_id <=", value, "instanceItemId");
            return (Criteria) this;
        }

        public Criteria andInstanceItemIdIn(List<Long> values) {
            addCriterion("instance_item_id in", values, "instanceItemId");
            return (Criteria) this;
        }

        public Criteria andInstanceItemIdNotIn(List<Long> values) {
            addCriterion("instance_item_id not in", values, "instanceItemId");
            return (Criteria) this;
        }

        public Criteria andInstanceItemIdBetween(Long value1, Long value2) {
            addCriterion("instance_item_id between", value1, value2, "instanceItemId");
            return (Criteria) this;
        }

        public Criteria andInstanceItemIdNotBetween(Long value1, Long value2) {
            addCriterion("instance_item_id not between", value1, value2, "instanceItemId");
            return (Criteria) this;
        }

        public Criteria andMailInstanceIdIsNull() {
            addCriterion("mail_instance_id is null");
            return (Criteria) this;
        }

        public Criteria andMailInstanceIdIsNotNull() {
            addCriterion("mail_instance_id is not null");
            return (Criteria) this;
        }

        public Criteria andMailInstanceIdEqualTo(Long value) {
            addCriterion("mail_instance_id =", value, "mailInstanceId");
            return (Criteria) this;
        }

        public Criteria andMailInstanceIdNotEqualTo(Long value) {
            addCriterion("mail_instance_id <>", value, "mailInstanceId");
            return (Criteria) this;
        }

        public Criteria andMailInstanceIdGreaterThan(Long value) {
            addCriterion("mail_instance_id >", value, "mailInstanceId");
            return (Criteria) this;
        }

        public Criteria andMailInstanceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mail_instance_id >=", value, "mailInstanceId");
            return (Criteria) this;
        }

        public Criteria andMailInstanceIdLessThan(Long value) {
            addCriterion("mail_instance_id <", value, "mailInstanceId");
            return (Criteria) this;
        }

        public Criteria andMailInstanceIdLessThanOrEqualTo(Long value) {
            addCriterion("mail_instance_id <=", value, "mailInstanceId");
            return (Criteria) this;
        }

        public Criteria andMailInstanceIdIn(List<Long> values) {
            addCriterion("mail_instance_id in", values, "mailInstanceId");
            return (Criteria) this;
        }

        public Criteria andMailInstanceIdNotIn(List<Long> values) {
            addCriterion("mail_instance_id not in", values, "mailInstanceId");
            return (Criteria) this;
        }

        public Criteria andMailInstanceIdBetween(Long value1, Long value2) {
            addCriterion("mail_instance_id between", value1, value2, "mailInstanceId");
            return (Criteria) this;
        }

        public Criteria andMailInstanceIdNotBetween(Long value1, Long value2) {
            addCriterion("mail_instance_id not between", value1, value2, "mailInstanceId");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Long value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Long value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Long value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Long value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Long value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Long> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Long> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Long value1, Long value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Long value1, Long value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andSectionIsNull() {
            addCriterion("section is null");
            return (Criteria) this;
        }

        public Criteria andSectionIsNotNull() {
            addCriterion("section is not null");
            return (Criteria) this;
        }

        public Criteria andSectionEqualTo(String value) {
            addCriterion("section =", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotEqualTo(String value) {
            addCriterion("section <>", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionGreaterThan(String value) {
            addCriterion("section >", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionGreaterThanOrEqualTo(String value) {
            addCriterion("section >=", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionLessThan(String value) {
            addCriterion("section <", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionLessThanOrEqualTo(String value) {
            addCriterion("section <=", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionLike(String value) {
            addCriterion("section like", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotLike(String value) {
            addCriterion("section not like", value, "section");
            return (Criteria) this;
        }

        public Criteria andSectionIn(List<String> values) {
            addCriterion("section in", values, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotIn(List<String> values) {
            addCriterion("section not in", values, "section");
            return (Criteria) this;
        }

        public Criteria andSectionBetween(String value1, String value2) {
            addCriterion("section between", value1, value2, "section");
            return (Criteria) this;
        }

        public Criteria andSectionNotBetween(String value1, String value2) {
            addCriterion("section not between", value1, value2, "section");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yangmao_mail_instance_item
     *
     * @mbggenerated do_not_delete_during_merge Thu Aug 25 15:46:14 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yangmao_mail_instance_item
     *
     * @mbggenerated Thu Aug 25 15:46:14 CST 2016
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