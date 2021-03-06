package com.spring.model1;

import java.util.ArrayList;
import java.util.List;

public class QcTalktextchecktabExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.QC_TALKTEXTCHECKTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.QC_TALKTEXTCHECKTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.QC_TALKTEXTCHECKTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_TALKTEXTCHECKTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public QcTalktextchecktabExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_TALKTEXTCHECKTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_TALKTEXTCHECKTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_TALKTEXTCHECKTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_TALKTEXTCHECKTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_TALKTEXTCHECKTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_TALKTEXTCHECKTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_TALKTEXTCHECKTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_TALKTEXTCHECKTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
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
     * This method corresponds to the database table ONLINEQC.QC_TALKTEXTCHECKTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.QC_TALKTEXTCHECKTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINEQC.QC_TALKTEXTCHECKTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
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

        public Criteria andTtcidIsNull() {
            addCriterion("TTCID is null");
            return (Criteria) this;
        }

        public Criteria andTtcidIsNotNull() {
            addCriterion("TTCID is not null");
            return (Criteria) this;
        }

        public Criteria andTtcidEqualTo(Long value) {
            addCriterion("TTCID =", value, "ttcid");
            return (Criteria) this;
        }

        public Criteria andTtcidNotEqualTo(Long value) {
            addCriterion("TTCID <>", value, "ttcid");
            return (Criteria) this;
        }

        public Criteria andTtcidGreaterThan(Long value) {
            addCriterion("TTCID >", value, "ttcid");
            return (Criteria) this;
        }

        public Criteria andTtcidGreaterThanOrEqualTo(Long value) {
            addCriterion("TTCID >=", value, "ttcid");
            return (Criteria) this;
        }

        public Criteria andTtcidLessThan(Long value) {
            addCriterion("TTCID <", value, "ttcid");
            return (Criteria) this;
        }

        public Criteria andTtcidLessThanOrEqualTo(Long value) {
            addCriterion("TTCID <=", value, "ttcid");
            return (Criteria) this;
        }

        public Criteria andTtcidIn(List<Long> values) {
            addCriterion("TTCID in", values, "ttcid");
            return (Criteria) this;
        }

        public Criteria andTtcidNotIn(List<Long> values) {
            addCriterion("TTCID not in", values, "ttcid");
            return (Criteria) this;
        }

        public Criteria andTtcidBetween(Long value1, Long value2) {
            addCriterion("TTCID between", value1, value2, "ttcid");
            return (Criteria) this;
        }

        public Criteria andTtcidNotBetween(Long value1, Long value2) {
            addCriterion("TTCID not between", value1, value2, "ttcid");
            return (Criteria) this;
        }

        public Criteria andCsidIsNull() {
            addCriterion("CSID is null");
            return (Criteria) this;
        }

        public Criteria andCsidIsNotNull() {
            addCriterion("CSID is not null");
            return (Criteria) this;
        }

        public Criteria andCsidEqualTo(Long value) {
            addCriterion("CSID =", value, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidNotEqualTo(Long value) {
            addCriterion("CSID <>", value, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidGreaterThan(Long value) {
            addCriterion("CSID >", value, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidGreaterThanOrEqualTo(Long value) {
            addCriterion("CSID >=", value, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidLessThan(Long value) {
            addCriterion("CSID <", value, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidLessThanOrEqualTo(Long value) {
            addCriterion("CSID <=", value, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidIn(List<Long> values) {
            addCriterion("CSID in", values, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidNotIn(List<Long> values) {
            addCriterion("CSID not in", values, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidBetween(Long value1, Long value2) {
            addCriterion("CSID between", value1, value2, "csid");
            return (Criteria) this;
        }

        public Criteria andCsidNotBetween(Long value1, Long value2) {
            addCriterion("CSID not between", value1, value2, "csid");
            return (Criteria) this;
        }

        public Criteria andTtidIsNull() {
            addCriterion("TTID is null");
            return (Criteria) this;
        }

        public Criteria andTtidIsNotNull() {
            addCriterion("TTID is not null");
            return (Criteria) this;
        }

        public Criteria andTtidEqualTo(Long value) {
            addCriterion("TTID =", value, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidNotEqualTo(Long value) {
            addCriterion("TTID <>", value, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidGreaterThan(Long value) {
            addCriterion("TTID >", value, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidGreaterThanOrEqualTo(Long value) {
            addCriterion("TTID >=", value, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidLessThan(Long value) {
            addCriterion("TTID <", value, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidLessThanOrEqualTo(Long value) {
            addCriterion("TTID <=", value, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidIn(List<Long> values) {
            addCriterion("TTID in", values, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidNotIn(List<Long> values) {
            addCriterion("TTID not in", values, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidBetween(Long value1, Long value2) {
            addCriterion("TTID between", value1, value2, "ttid");
            return (Criteria) this;
        }

        public Criteria andTtidNotBetween(Long value1, Long value2) {
            addCriterion("TTID not between", value1, value2, "ttid");
            return (Criteria) this;
        }

        public Criteria andCorpusidIsNull() {
            addCriterion("CORPUSID is null");
            return (Criteria) this;
        }

        public Criteria andCorpusidIsNotNull() {
            addCriterion("CORPUSID is not null");
            return (Criteria) this;
        }

        public Criteria andCorpusidEqualTo(Long value) {
            addCriterion("CORPUSID =", value, "corpusid");
            return (Criteria) this;
        }

        public Criteria andCorpusidNotEqualTo(Long value) {
            addCriterion("CORPUSID <>", value, "corpusid");
            return (Criteria) this;
        }

        public Criteria andCorpusidGreaterThan(Long value) {
            addCriterion("CORPUSID >", value, "corpusid");
            return (Criteria) this;
        }

        public Criteria andCorpusidGreaterThanOrEqualTo(Long value) {
            addCriterion("CORPUSID >=", value, "corpusid");
            return (Criteria) this;
        }

        public Criteria andCorpusidLessThan(Long value) {
            addCriterion("CORPUSID <", value, "corpusid");
            return (Criteria) this;
        }

        public Criteria andCorpusidLessThanOrEqualTo(Long value) {
            addCriterion("CORPUSID <=", value, "corpusid");
            return (Criteria) this;
        }

        public Criteria andCorpusidIn(List<Long> values) {
            addCriterion("CORPUSID in", values, "corpusid");
            return (Criteria) this;
        }

        public Criteria andCorpusidNotIn(List<Long> values) {
            addCriterion("CORPUSID not in", values, "corpusid");
            return (Criteria) this;
        }

        public Criteria andCorpusidBetween(Long value1, Long value2) {
            addCriterion("CORPUSID between", value1, value2, "corpusid");
            return (Criteria) this;
        }

        public Criteria andCorpusidNotBetween(Long value1, Long value2) {
            addCriterion("CORPUSID not between", value1, value2, "corpusid");
            return (Criteria) this;
        }

        public Criteria andCorpustypeIsNull() {
            addCriterion("CORPUSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCorpustypeIsNotNull() {
            addCriterion("CORPUSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCorpustypeEqualTo(String value) {
            addCriterion("CORPUSTYPE =", value, "corpustype");
            return (Criteria) this;
        }

        public Criteria andCorpustypeNotEqualTo(String value) {
            addCriterion("CORPUSTYPE <>", value, "corpustype");
            return (Criteria) this;
        }

        public Criteria andCorpustypeGreaterThan(String value) {
            addCriterion("CORPUSTYPE >", value, "corpustype");
            return (Criteria) this;
        }

        public Criteria andCorpustypeGreaterThanOrEqualTo(String value) {
            addCriterion("CORPUSTYPE >=", value, "corpustype");
            return (Criteria) this;
        }

        public Criteria andCorpustypeLessThan(String value) {
            addCriterion("CORPUSTYPE <", value, "corpustype");
            return (Criteria) this;
        }

        public Criteria andCorpustypeLessThanOrEqualTo(String value) {
            addCriterion("CORPUSTYPE <=", value, "corpustype");
            return (Criteria) this;
        }

        public Criteria andCorpustypeLike(String value) {
            addCriterion("CORPUSTYPE like", value, "corpustype");
            return (Criteria) this;
        }

        public Criteria andCorpustypeNotLike(String value) {
            addCriterion("CORPUSTYPE not like", value, "corpustype");
            return (Criteria) this;
        }

        public Criteria andCorpustypeIn(List<String> values) {
            addCriterion("CORPUSTYPE in", values, "corpustype");
            return (Criteria) this;
        }

        public Criteria andCorpustypeNotIn(List<String> values) {
            addCriterion("CORPUSTYPE not in", values, "corpustype");
            return (Criteria) this;
        }

        public Criteria andCorpustypeBetween(String value1, String value2) {
            addCriterion("CORPUSTYPE between", value1, value2, "corpustype");
            return (Criteria) this;
        }

        public Criteria andCorpustypeNotBetween(String value1, String value2) {
            addCriterion("CORPUSTYPE not between", value1, value2, "corpustype");
            return (Criteria) this;
        }

        public Criteria andCorpustextIsNull() {
            addCriterion("CORPUSTEXT is null");
            return (Criteria) this;
        }

        public Criteria andCorpustextIsNotNull() {
            addCriterion("CORPUSTEXT is not null");
            return (Criteria) this;
        }

        public Criteria andCorpustextEqualTo(Object value) {
            addCriterion("CORPUSTEXT =", value, "corpustext");
            return (Criteria) this;
        }

        public Criteria andCorpustextNotEqualTo(Object value) {
            addCriterion("CORPUSTEXT <>", value, "corpustext");
            return (Criteria) this;
        }

        public Criteria andCorpustextGreaterThan(Object value) {
            addCriterion("CORPUSTEXT >", value, "corpustext");
            return (Criteria) this;
        }

        public Criteria andCorpustextGreaterThanOrEqualTo(Object value) {
            addCriterion("CORPUSTEXT >=", value, "corpustext");
            return (Criteria) this;
        }

        public Criteria andCorpustextLessThan(Object value) {
            addCriterion("CORPUSTEXT <", value, "corpustext");
            return (Criteria) this;
        }

        public Criteria andCorpustextLessThanOrEqualTo(Object value) {
            addCriterion("CORPUSTEXT <=", value, "corpustext");
            return (Criteria) this;
        }

        public Criteria andCorpustextIn(List<Object> values) {
            addCriterion("CORPUSTEXT in", values, "corpustext");
            return (Criteria) this;
        }

        public Criteria andCorpustextNotIn(List<Object> values) {
            addCriterion("CORPUSTEXT not in", values, "corpustext");
            return (Criteria) this;
        }

        public Criteria andCorpustextBetween(Object value1, Object value2) {
            addCriterion("CORPUSTEXT between", value1, value2, "corpustext");
            return (Criteria) this;
        }

        public Criteria andCorpustextNotBetween(Object value1, Object value2) {
            addCriterion("CORPUSTEXT not between", value1, value2, "corpustext");
            return (Criteria) this;
        }

        public Criteria andCorpuscountIsNull() {
            addCriterion("CORPUSCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCorpuscountIsNotNull() {
            addCriterion("CORPUSCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCorpuscountEqualTo(Long value) {
            addCriterion("CORPUSCOUNT =", value, "corpuscount");
            return (Criteria) this;
        }

        public Criteria andCorpuscountNotEqualTo(Long value) {
            addCriterion("CORPUSCOUNT <>", value, "corpuscount");
            return (Criteria) this;
        }

        public Criteria andCorpuscountGreaterThan(Long value) {
            addCriterion("CORPUSCOUNT >", value, "corpuscount");
            return (Criteria) this;
        }

        public Criteria andCorpuscountGreaterThanOrEqualTo(Long value) {
            addCriterion("CORPUSCOUNT >=", value, "corpuscount");
            return (Criteria) this;
        }

        public Criteria andCorpuscountLessThan(Long value) {
            addCriterion("CORPUSCOUNT <", value, "corpuscount");
            return (Criteria) this;
        }

        public Criteria andCorpuscountLessThanOrEqualTo(Long value) {
            addCriterion("CORPUSCOUNT <=", value, "corpuscount");
            return (Criteria) this;
        }

        public Criteria andCorpuscountIn(List<Long> values) {
            addCriterion("CORPUSCOUNT in", values, "corpuscount");
            return (Criteria) this;
        }

        public Criteria andCorpuscountNotIn(List<Long> values) {
            addCriterion("CORPUSCOUNT not in", values, "corpuscount");
            return (Criteria) this;
        }

        public Criteria andCorpuscountBetween(Long value1, Long value2) {
            addCriterion("CORPUSCOUNT between", value1, value2, "corpuscount");
            return (Criteria) this;
        }

        public Criteria andCorpuscountNotBetween(Long value1, Long value2) {
            addCriterion("CORPUSCOUNT not between", value1, value2, "corpuscount");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINEQC.QC_TALKTEXTCHECKTAB
     *
     * @mbg.generated do_not_delete_during_merge Tue Jan 08 16:40:10 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINEQC.QC_TALKTEXTCHECKTAB
     *
     * @mbg.generated Tue Jan 08 16:40:10 CST 2019
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