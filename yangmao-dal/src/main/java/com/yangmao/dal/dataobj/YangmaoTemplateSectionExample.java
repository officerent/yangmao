package com.yangmao.dal.dataobj;

import java.util.ArrayList;
import java.util.List;

public class YangmaoTemplateSectionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yangmao_template_section
     *
     * @mbggenerated Sun Sep 04 23:10:26 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yangmao_template_section
     *
     * @mbggenerated Sun Sep 04 23:10:26 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yangmao_template_section
     *
     * @mbggenerated Sun Sep 04 23:10:26 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_template_section
     *
     * @mbggenerated Sun Sep 04 23:10:26 CST 2016
     */
    public YangmaoTemplateSectionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_template_section
     *
     * @mbggenerated Sun Sep 04 23:10:26 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_template_section
     *
     * @mbggenerated Sun Sep 04 23:10:26 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_template_section
     *
     * @mbggenerated Sun Sep 04 23:10:26 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_template_section
     *
     * @mbggenerated Sun Sep 04 23:10:26 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_template_section
     *
     * @mbggenerated Sun Sep 04 23:10:26 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_template_section
     *
     * @mbggenerated Sun Sep 04 23:10:26 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_template_section
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
     * This method corresponds to the database table yangmao_template_section
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
     * This method corresponds to the database table yangmao_template_section
     *
     * @mbggenerated Sun Sep 04 23:10:26 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yangmao_template_section
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
     * This class corresponds to the database table yangmao_template_section
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

        public Criteria andSectionIdIsNull() {
            addCriterion("section_id is null");
            return (Criteria) this;
        }

        public Criteria andSectionIdIsNotNull() {
            addCriterion("section_id is not null");
            return (Criteria) this;
        }

        public Criteria andSectionIdEqualTo(Long value) {
            addCriterion("section_id =", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotEqualTo(Long value) {
            addCriterion("section_id <>", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdGreaterThan(Long value) {
            addCriterion("section_id >", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("section_id >=", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdLessThan(Long value) {
            addCriterion("section_id <", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdLessThanOrEqualTo(Long value) {
            addCriterion("section_id <=", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdIn(List<Long> values) {
            addCriterion("section_id in", values, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotIn(List<Long> values) {
            addCriterion("section_id not in", values, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdBetween(Long value1, Long value2) {
            addCriterion("section_id between", value1, value2, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotBetween(Long value1, Long value2) {
            addCriterion("section_id not between", value1, value2, "sectionId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNull() {
            addCriterion("template_id is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNotNull() {
            addCriterion("template_id is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdEqualTo(Long value) {
            addCriterion("template_id =", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotEqualTo(Long value) {
            addCriterion("template_id <>", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThan(Long value) {
            addCriterion("template_id >", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("template_id >=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThan(Long value) {
            addCriterion("template_id <", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThanOrEqualTo(Long value) {
            addCriterion("template_id <=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIn(List<Long> values) {
            addCriterion("template_id in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotIn(List<Long> values) {
            addCriterion("template_id not in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdBetween(Long value1, Long value2) {
            addCriterion("template_id between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotBetween(Long value1, Long value2) {
            addCriterion("template_id not between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andFavoritesIdIsNull() {
            addCriterion("favorites_id is null");
            return (Criteria) this;
        }

        public Criteria andFavoritesIdIsNotNull() {
            addCriterion("favorites_id is not null");
            return (Criteria) this;
        }

        public Criteria andFavoritesIdEqualTo(Long value) {
            addCriterion("favorites_id =", value, "favoritesId");
            return (Criteria) this;
        }

        public Criteria andFavoritesIdNotEqualTo(Long value) {
            addCriterion("favorites_id <>", value, "favoritesId");
            return (Criteria) this;
        }

        public Criteria andFavoritesIdGreaterThan(Long value) {
            addCriterion("favorites_id >", value, "favoritesId");
            return (Criteria) this;
        }

        public Criteria andFavoritesIdGreaterThanOrEqualTo(Long value) {
            addCriterion("favorites_id >=", value, "favoritesId");
            return (Criteria) this;
        }

        public Criteria andFavoritesIdLessThan(Long value) {
            addCriterion("favorites_id <", value, "favoritesId");
            return (Criteria) this;
        }

        public Criteria andFavoritesIdLessThanOrEqualTo(Long value) {
            addCriterion("favorites_id <=", value, "favoritesId");
            return (Criteria) this;
        }

        public Criteria andFavoritesIdIn(List<Long> values) {
            addCriterion("favorites_id in", values, "favoritesId");
            return (Criteria) this;
        }

        public Criteria andFavoritesIdNotIn(List<Long> values) {
            addCriterion("favorites_id not in", values, "favoritesId");
            return (Criteria) this;
        }

        public Criteria andFavoritesIdBetween(Long value1, Long value2) {
            addCriterion("favorites_id between", value1, value2, "favoritesId");
            return (Criteria) this;
        }

        public Criteria andFavoritesIdNotBetween(Long value1, Long value2) {
            addCriterion("favorites_id not between", value1, value2, "favoritesId");
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

        public Criteria andSectionAmountIsNull() {
            addCriterion("section_amount is null");
            return (Criteria) this;
        }

        public Criteria andSectionAmountIsNotNull() {
            addCriterion("section_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSectionAmountEqualTo(Integer value) {
            addCriterion("section_amount =", value, "sectionAmount");
            return (Criteria) this;
        }

        public Criteria andSectionAmountNotEqualTo(Integer value) {
            addCriterion("section_amount <>", value, "sectionAmount");
            return (Criteria) this;
        }

        public Criteria andSectionAmountGreaterThan(Integer value) {
            addCriterion("section_amount >", value, "sectionAmount");
            return (Criteria) this;
        }

        public Criteria andSectionAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("section_amount >=", value, "sectionAmount");
            return (Criteria) this;
        }

        public Criteria andSectionAmountLessThan(Integer value) {
            addCriterion("section_amount <", value, "sectionAmount");
            return (Criteria) this;
        }

        public Criteria andSectionAmountLessThanOrEqualTo(Integer value) {
            addCriterion("section_amount <=", value, "sectionAmount");
            return (Criteria) this;
        }

        public Criteria andSectionAmountIn(List<Integer> values) {
            addCriterion("section_amount in", values, "sectionAmount");
            return (Criteria) this;
        }

        public Criteria andSectionAmountNotIn(List<Integer> values) {
            addCriterion("section_amount not in", values, "sectionAmount");
            return (Criteria) this;
        }

        public Criteria andSectionAmountBetween(Integer value1, Integer value2) {
            addCriterion("section_amount between", value1, value2, "sectionAmount");
            return (Criteria) this;
        }

        public Criteria andSectionAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("section_amount not between", value1, value2, "sectionAmount");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yangmao_template_section
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
     * This class corresponds to the database table yangmao_template_section
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