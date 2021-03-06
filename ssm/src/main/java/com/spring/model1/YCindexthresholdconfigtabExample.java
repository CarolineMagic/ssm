package com.spring.model1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class YCindexthresholdconfigtabExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDCONFIGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDCONFIGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDCONFIGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDCONFIGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public YCindexthresholdconfigtabExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDCONFIGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDCONFIGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDCONFIGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDCONFIGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDCONFIGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDCONFIGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDCONFIGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDCONFIGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
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
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDCONFIGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDCONFIGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDCONFIGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
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

        public Criteria andTenantidIsNull() {
            addCriterion("TENANTID is null");
            return (Criteria) this;
        }

        public Criteria andTenantidIsNotNull() {
            addCriterion("TENANTID is not null");
            return (Criteria) this;
        }

        public Criteria andTenantidEqualTo(String value) {
            addCriterion("TENANTID =", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotEqualTo(String value) {
            addCriterion("TENANTID <>", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidGreaterThan(String value) {
            addCriterion("TENANTID >", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidGreaterThanOrEqualTo(String value) {
            addCriterion("TENANTID >=", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidLessThan(String value) {
            addCriterion("TENANTID <", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidLessThanOrEqualTo(String value) {
            addCriterion("TENANTID <=", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidLike(String value) {
            addCriterion("TENANTID like", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotLike(String value) {
            addCriterion("TENANTID not like", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidIn(List<String> values) {
            addCriterion("TENANTID in", values, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotIn(List<String> values) {
            addCriterion("TENANTID not in", values, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidBetween(String value1, String value2) {
            addCriterion("TENANTID between", value1, value2, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotBetween(String value1, String value2) {
            addCriterion("TENANTID not between", value1, value2, "tenantid");
            return (Criteria) this;
        }

        public Criteria andConfigidIsNull() {
            addCriterion("CONFIGID is null");
            return (Criteria) this;
        }

        public Criteria andConfigidIsNotNull() {
            addCriterion("CONFIGID is not null");
            return (Criteria) this;
        }

        public Criteria andConfigidEqualTo(Long value) {
            addCriterion("CONFIGID =", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidNotEqualTo(Long value) {
            addCriterion("CONFIGID <>", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidGreaterThan(Long value) {
            addCriterion("CONFIGID >", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidGreaterThanOrEqualTo(Long value) {
            addCriterion("CONFIGID >=", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidLessThan(Long value) {
            addCriterion("CONFIGID <", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidLessThanOrEqualTo(Long value) {
            addCriterion("CONFIGID <=", value, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidIn(List<Long> values) {
            addCriterion("CONFIGID in", values, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidNotIn(List<Long> values) {
            addCriterion("CONFIGID not in", values, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidBetween(Long value1, Long value2) {
            addCriterion("CONFIGID between", value1, value2, "configid");
            return (Criteria) this;
        }

        public Criteria andConfigidNotBetween(Long value1, Long value2) {
            addCriterion("CONFIGID not between", value1, value2, "configid");
            return (Criteria) this;
        }

        public Criteria andIndexidIsNull() {
            addCriterion("INDEXID is null");
            return (Criteria) this;
        }

        public Criteria andIndexidIsNotNull() {
            addCriterion("INDEXID is not null");
            return (Criteria) this;
        }

        public Criteria andIndexidEqualTo(String value) {
            addCriterion("INDEXID =", value, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidNotEqualTo(String value) {
            addCriterion("INDEXID <>", value, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidGreaterThan(String value) {
            addCriterion("INDEXID >", value, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidGreaterThanOrEqualTo(String value) {
            addCriterion("INDEXID >=", value, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidLessThan(String value) {
            addCriterion("INDEXID <", value, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidLessThanOrEqualTo(String value) {
            addCriterion("INDEXID <=", value, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidLike(String value) {
            addCriterion("INDEXID like", value, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidNotLike(String value) {
            addCriterion("INDEXID not like", value, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidIn(List<String> values) {
            addCriterion("INDEXID in", values, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidNotIn(List<String> values) {
            addCriterion("INDEXID not in", values, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidBetween(String value1, String value2) {
            addCriterion("INDEXID between", value1, value2, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidNotBetween(String value1, String value2) {
            addCriterion("INDEXID not between", value1, value2, "indexid");
            return (Criteria) this;
        }

        public Criteria andTargetvalueIsNull() {
            addCriterion("TARGETVALUE is null");
            return (Criteria) this;
        }

        public Criteria andTargetvalueIsNotNull() {
            addCriterion("TARGETVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andTargetvalueEqualTo(BigDecimal value) {
            addCriterion("TARGETVALUE =", value, "targetvalue");
            return (Criteria) this;
        }

        public Criteria andTargetvalueNotEqualTo(BigDecimal value) {
            addCriterion("TARGETVALUE <>", value, "targetvalue");
            return (Criteria) this;
        }

        public Criteria andTargetvalueGreaterThan(BigDecimal value) {
            addCriterion("TARGETVALUE >", value, "targetvalue");
            return (Criteria) this;
        }

        public Criteria andTargetvalueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TARGETVALUE >=", value, "targetvalue");
            return (Criteria) this;
        }

        public Criteria andTargetvalueLessThan(BigDecimal value) {
            addCriterion("TARGETVALUE <", value, "targetvalue");
            return (Criteria) this;
        }

        public Criteria andTargetvalueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TARGETVALUE <=", value, "targetvalue");
            return (Criteria) this;
        }

        public Criteria andTargetvalueIn(List<BigDecimal> values) {
            addCriterion("TARGETVALUE in", values, "targetvalue");
            return (Criteria) this;
        }

        public Criteria andTargetvalueNotIn(List<BigDecimal> values) {
            addCriterion("TARGETVALUE not in", values, "targetvalue");
            return (Criteria) this;
        }

        public Criteria andTargetvalueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TARGETVALUE between", value1, value2, "targetvalue");
            return (Criteria) this;
        }

        public Criteria andTargetvalueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TARGETVALUE not between", value1, value2, "targetvalue");
            return (Criteria) this;
        }

        public Criteria andThresholdvalueIsNull() {
            addCriterion("THRESHOLDVALUE is null");
            return (Criteria) this;
        }

        public Criteria andThresholdvalueIsNotNull() {
            addCriterion("THRESHOLDVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andThresholdvalueEqualTo(BigDecimal value) {
            addCriterion("THRESHOLDVALUE =", value, "thresholdvalue");
            return (Criteria) this;
        }

        public Criteria andThresholdvalueNotEqualTo(BigDecimal value) {
            addCriterion("THRESHOLDVALUE <>", value, "thresholdvalue");
            return (Criteria) this;
        }

        public Criteria andThresholdvalueGreaterThan(BigDecimal value) {
            addCriterion("THRESHOLDVALUE >", value, "thresholdvalue");
            return (Criteria) this;
        }

        public Criteria andThresholdvalueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("THRESHOLDVALUE >=", value, "thresholdvalue");
            return (Criteria) this;
        }

        public Criteria andThresholdvalueLessThan(BigDecimal value) {
            addCriterion("THRESHOLDVALUE <", value, "thresholdvalue");
            return (Criteria) this;
        }

        public Criteria andThresholdvalueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("THRESHOLDVALUE <=", value, "thresholdvalue");
            return (Criteria) this;
        }

        public Criteria andThresholdvalueIn(List<BigDecimal> values) {
            addCriterion("THRESHOLDVALUE in", values, "thresholdvalue");
            return (Criteria) this;
        }

        public Criteria andThresholdvalueNotIn(List<BigDecimal> values) {
            addCriterion("THRESHOLDVALUE not in", values, "thresholdvalue");
            return (Criteria) this;
        }

        public Criteria andThresholdvalueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THRESHOLDVALUE between", value1, value2, "thresholdvalue");
            return (Criteria) this;
        }

        public Criteria andThresholdvalueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THRESHOLDVALUE not between", value1, value2, "thresholdvalue");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue0IsNull() {
            addCriterion("THRESHOLDVALUE0 is null");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue0IsNotNull() {
            addCriterion("THRESHOLDVALUE0 is not null");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue0EqualTo(BigDecimal value) {
            addCriterion("THRESHOLDVALUE0 =", value, "thresholdvalue0");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue0NotEqualTo(BigDecimal value) {
            addCriterion("THRESHOLDVALUE0 <>", value, "thresholdvalue0");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue0GreaterThan(BigDecimal value) {
            addCriterion("THRESHOLDVALUE0 >", value, "thresholdvalue0");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue0GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("THRESHOLDVALUE0 >=", value, "thresholdvalue0");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue0LessThan(BigDecimal value) {
            addCriterion("THRESHOLDVALUE0 <", value, "thresholdvalue0");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue0LessThanOrEqualTo(BigDecimal value) {
            addCriterion("THRESHOLDVALUE0 <=", value, "thresholdvalue0");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue0In(List<BigDecimal> values) {
            addCriterion("THRESHOLDVALUE0 in", values, "thresholdvalue0");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue0NotIn(List<BigDecimal> values) {
            addCriterion("THRESHOLDVALUE0 not in", values, "thresholdvalue0");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue0Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("THRESHOLDVALUE0 between", value1, value2, "thresholdvalue0");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue0NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THRESHOLDVALUE0 not between", value1, value2, "thresholdvalue0");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue1IsNull() {
            addCriterion("THRESHOLDVALUE1 is null");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue1IsNotNull() {
            addCriterion("THRESHOLDVALUE1 is not null");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue1EqualTo(BigDecimal value) {
            addCriterion("THRESHOLDVALUE1 =", value, "thresholdvalue1");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue1NotEqualTo(BigDecimal value) {
            addCriterion("THRESHOLDVALUE1 <>", value, "thresholdvalue1");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue1GreaterThan(BigDecimal value) {
            addCriterion("THRESHOLDVALUE1 >", value, "thresholdvalue1");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("THRESHOLDVALUE1 >=", value, "thresholdvalue1");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue1LessThan(BigDecimal value) {
            addCriterion("THRESHOLDVALUE1 <", value, "thresholdvalue1");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("THRESHOLDVALUE1 <=", value, "thresholdvalue1");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue1In(List<BigDecimal> values) {
            addCriterion("THRESHOLDVALUE1 in", values, "thresholdvalue1");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue1NotIn(List<BigDecimal> values) {
            addCriterion("THRESHOLDVALUE1 not in", values, "thresholdvalue1");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("THRESHOLDVALUE1 between", value1, value2, "thresholdvalue1");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THRESHOLDVALUE1 not between", value1, value2, "thresholdvalue1");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue2IsNull() {
            addCriterion("THRESHOLDVALUE2 is null");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue2IsNotNull() {
            addCriterion("THRESHOLDVALUE2 is not null");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue2EqualTo(BigDecimal value) {
            addCriterion("THRESHOLDVALUE2 =", value, "thresholdvalue2");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue2NotEqualTo(BigDecimal value) {
            addCriterion("THRESHOLDVALUE2 <>", value, "thresholdvalue2");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue2GreaterThan(BigDecimal value) {
            addCriterion("THRESHOLDVALUE2 >", value, "thresholdvalue2");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("THRESHOLDVALUE2 >=", value, "thresholdvalue2");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue2LessThan(BigDecimal value) {
            addCriterion("THRESHOLDVALUE2 <", value, "thresholdvalue2");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("THRESHOLDVALUE2 <=", value, "thresholdvalue2");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue2In(List<BigDecimal> values) {
            addCriterion("THRESHOLDVALUE2 in", values, "thresholdvalue2");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue2NotIn(List<BigDecimal> values) {
            addCriterion("THRESHOLDVALUE2 not in", values, "thresholdvalue2");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("THRESHOLDVALUE2 between", value1, value2, "thresholdvalue2");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THRESHOLDVALUE2 not between", value1, value2, "thresholdvalue2");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue3IsNull() {
            addCriterion("THRESHOLDVALUE3 is null");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue3IsNotNull() {
            addCriterion("THRESHOLDVALUE3 is not null");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue3EqualTo(BigDecimal value) {
            addCriterion("THRESHOLDVALUE3 =", value, "thresholdvalue3");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue3NotEqualTo(BigDecimal value) {
            addCriterion("THRESHOLDVALUE3 <>", value, "thresholdvalue3");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue3GreaterThan(BigDecimal value) {
            addCriterion("THRESHOLDVALUE3 >", value, "thresholdvalue3");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("THRESHOLDVALUE3 >=", value, "thresholdvalue3");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue3LessThan(BigDecimal value) {
            addCriterion("THRESHOLDVALUE3 <", value, "thresholdvalue3");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("THRESHOLDVALUE3 <=", value, "thresholdvalue3");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue3In(List<BigDecimal> values) {
            addCriterion("THRESHOLDVALUE3 in", values, "thresholdvalue3");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue3NotIn(List<BigDecimal> values) {
            addCriterion("THRESHOLDVALUE3 not in", values, "thresholdvalue3");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("THRESHOLDVALUE3 between", value1, value2, "thresholdvalue3");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THRESHOLDVALUE3 not between", value1, value2, "thresholdvalue3");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue4IsNull() {
            addCriterion("THRESHOLDVALUE4 is null");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue4IsNotNull() {
            addCriterion("THRESHOLDVALUE4 is not null");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue4EqualTo(BigDecimal value) {
            addCriterion("THRESHOLDVALUE4 =", value, "thresholdvalue4");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue4NotEqualTo(BigDecimal value) {
            addCriterion("THRESHOLDVALUE4 <>", value, "thresholdvalue4");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue4GreaterThan(BigDecimal value) {
            addCriterion("THRESHOLDVALUE4 >", value, "thresholdvalue4");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("THRESHOLDVALUE4 >=", value, "thresholdvalue4");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue4LessThan(BigDecimal value) {
            addCriterion("THRESHOLDVALUE4 <", value, "thresholdvalue4");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("THRESHOLDVALUE4 <=", value, "thresholdvalue4");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue4In(List<BigDecimal> values) {
            addCriterion("THRESHOLDVALUE4 in", values, "thresholdvalue4");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue4NotIn(List<BigDecimal> values) {
            addCriterion("THRESHOLDVALUE4 not in", values, "thresholdvalue4");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("THRESHOLDVALUE4 between", value1, value2, "thresholdvalue4");
            return (Criteria) this;
        }

        public Criteria andThresholdvalue4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THRESHOLDVALUE4 not between", value1, value2, "thresholdvalue4");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDCONFIGTAB
     *
     * @mbg.generated do_not_delete_during_merge Tue Jan 08 16:40:09 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINEQC.Y_CINDEXTHRESHOLDCONFIGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
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