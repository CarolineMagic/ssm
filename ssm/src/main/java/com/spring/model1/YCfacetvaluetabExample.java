package com.spring.model1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YCfacetvaluetabExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_CFACETVALUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_CFACETVALUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_CFACETVALUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CFACETVALUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    public YCfacetvaluetabExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CFACETVALUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CFACETVALUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CFACETVALUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CFACETVALUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CFACETVALUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CFACETVALUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CFACETVALUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CFACETVALUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
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
     * This method corresponds to the database table ONLINEQC.Y_CFACETVALUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CFACETVALUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINEQC.Y_CFACETVALUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("PID is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("PID is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Long value) {
            addCriterion("PID =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Long value) {
            addCriterion("PID <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Long value) {
            addCriterion("PID >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Long value) {
            addCriterion("PID >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Long value) {
            addCriterion("PID <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Long value) {
            addCriterion("PID <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Long> values) {
            addCriterion("PID in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Long> values) {
            addCriterion("PID not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Long value1, Long value2) {
            addCriterion("PID between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Long value1, Long value2) {
            addCriterion("PID not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andFacetrootidIsNull() {
            addCriterion("FACETROOTID is null");
            return (Criteria) this;
        }

        public Criteria andFacetrootidIsNotNull() {
            addCriterion("FACETROOTID is not null");
            return (Criteria) this;
        }

        public Criteria andFacetrootidEqualTo(Long value) {
            addCriterion("FACETROOTID =", value, "facetrootid");
            return (Criteria) this;
        }

        public Criteria andFacetrootidNotEqualTo(Long value) {
            addCriterion("FACETROOTID <>", value, "facetrootid");
            return (Criteria) this;
        }

        public Criteria andFacetrootidGreaterThan(Long value) {
            addCriterion("FACETROOTID >", value, "facetrootid");
            return (Criteria) this;
        }

        public Criteria andFacetrootidGreaterThanOrEqualTo(Long value) {
            addCriterion("FACETROOTID >=", value, "facetrootid");
            return (Criteria) this;
        }

        public Criteria andFacetrootidLessThan(Long value) {
            addCriterion("FACETROOTID <", value, "facetrootid");
            return (Criteria) this;
        }

        public Criteria andFacetrootidLessThanOrEqualTo(Long value) {
            addCriterion("FACETROOTID <=", value, "facetrootid");
            return (Criteria) this;
        }

        public Criteria andFacetrootidIn(List<Long> values) {
            addCriterion("FACETROOTID in", values, "facetrootid");
            return (Criteria) this;
        }

        public Criteria andFacetrootidNotIn(List<Long> values) {
            addCriterion("FACETROOTID not in", values, "facetrootid");
            return (Criteria) this;
        }

        public Criteria andFacetrootidBetween(Long value1, Long value2) {
            addCriterion("FACETROOTID between", value1, value2, "facetrootid");
            return (Criteria) this;
        }

        public Criteria andFacetrootidNotBetween(Long value1, Long value2) {
            addCriterion("FACETROOTID not between", value1, value2, "facetrootid");
            return (Criteria) this;
        }

        public Criteria andFacetidIsNull() {
            addCriterion("FACETID is null");
            return (Criteria) this;
        }

        public Criteria andFacetidIsNotNull() {
            addCriterion("FACETID is not null");
            return (Criteria) this;
        }

        public Criteria andFacetidEqualTo(Long value) {
            addCriterion("FACETID =", value, "facetid");
            return (Criteria) this;
        }

        public Criteria andFacetidNotEqualTo(Long value) {
            addCriterion("FACETID <>", value, "facetid");
            return (Criteria) this;
        }

        public Criteria andFacetidGreaterThan(Long value) {
            addCriterion("FACETID >", value, "facetid");
            return (Criteria) this;
        }

        public Criteria andFacetidGreaterThanOrEqualTo(Long value) {
            addCriterion("FACETID >=", value, "facetid");
            return (Criteria) this;
        }

        public Criteria andFacetidLessThan(Long value) {
            addCriterion("FACETID <", value, "facetid");
            return (Criteria) this;
        }

        public Criteria andFacetidLessThanOrEqualTo(Long value) {
            addCriterion("FACETID <=", value, "facetid");
            return (Criteria) this;
        }

        public Criteria andFacetidIn(List<Long> values) {
            addCriterion("FACETID in", values, "facetid");
            return (Criteria) this;
        }

        public Criteria andFacetidNotIn(List<Long> values) {
            addCriterion("FACETID not in", values, "facetid");
            return (Criteria) this;
        }

        public Criteria andFacetidBetween(Long value1, Long value2) {
            addCriterion("FACETID between", value1, value2, "facetid");
            return (Criteria) this;
        }

        public Criteria andFacetidNotBetween(Long value1, Long value2) {
            addCriterion("FACETID not between", value1, value2, "facetid");
            return (Criteria) this;
        }

        public Criteria andAliasIsNull() {
            addCriterion("ALIAS is null");
            return (Criteria) this;
        }

        public Criteria andAliasIsNotNull() {
            addCriterion("ALIAS is not null");
            return (Criteria) this;
        }

        public Criteria andAliasEqualTo(String value) {
            addCriterion("ALIAS =", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotEqualTo(String value) {
            addCriterion("ALIAS <>", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThan(String value) {
            addCriterion("ALIAS >", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThanOrEqualTo(String value) {
            addCriterion("ALIAS >=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThan(String value) {
            addCriterion("ALIAS <", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThanOrEqualTo(String value) {
            addCriterion("ALIAS <=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLike(String value) {
            addCriterion("ALIAS like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotLike(String value) {
            addCriterion("ALIAS not like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasIn(List<String> values) {
            addCriterion("ALIAS in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotIn(List<String> values) {
            addCriterion("ALIAS not in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasBetween(String value1, String value2) {
            addCriterion("ALIAS between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotBetween(String value1, String value2) {
            addCriterion("ALIAS not between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatoridIsNull() {
            addCriterion("CREATORID is null");
            return (Criteria) this;
        }

        public Criteria andCreatoridIsNotNull() {
            addCriterion("CREATORID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatoridEqualTo(Long value) {
            addCriterion("CREATORID =", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotEqualTo(Long value) {
            addCriterion("CREATORID <>", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridGreaterThan(Long value) {
            addCriterion("CREATORID >", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATORID >=", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLessThan(Long value) {
            addCriterion("CREATORID <", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridLessThanOrEqualTo(Long value) {
            addCriterion("CREATORID <=", value, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridIn(List<Long> values) {
            addCriterion("CREATORID in", values, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotIn(List<Long> values) {
            addCriterion("CREATORID not in", values, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridBetween(Long value1, Long value2) {
            addCriterion("CREATORID between", value1, value2, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatoridNotBetween(Long value1, Long value2) {
            addCriterion("CREATORID not between", value1, value2, "creatorid");
            return (Criteria) this;
        }

        public Criteria andCreatornameIsNull() {
            addCriterion("CREATORNAME is null");
            return (Criteria) this;
        }

        public Criteria andCreatornameIsNotNull() {
            addCriterion("CREATORNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatornameEqualTo(String value) {
            addCriterion("CREATORNAME =", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameNotEqualTo(String value) {
            addCriterion("CREATORNAME <>", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameGreaterThan(String value) {
            addCriterion("CREATORNAME >", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameGreaterThanOrEqualTo(String value) {
            addCriterion("CREATORNAME >=", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameLessThan(String value) {
            addCriterion("CREATORNAME <", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameLessThanOrEqualTo(String value) {
            addCriterion("CREATORNAME <=", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameLike(String value) {
            addCriterion("CREATORNAME like", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameNotLike(String value) {
            addCriterion("CREATORNAME not like", value, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameIn(List<String> values) {
            addCriterion("CREATORNAME in", values, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameNotIn(List<String> values) {
            addCriterion("CREATORNAME not in", values, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameBetween(String value1, String value2) {
            addCriterion("CREATORNAME between", value1, value2, "creatorname");
            return (Criteria) this;
        }

        public Criteria andCreatornameNotBetween(String value1, String value2) {
            addCriterion("CREATORNAME not between", value1, value2, "creatorname");
            return (Criteria) this;
        }

        public Criteria andChangetimeIsNull() {
            addCriterion("CHANGETIME is null");
            return (Criteria) this;
        }

        public Criteria andChangetimeIsNotNull() {
            addCriterion("CHANGETIME is not null");
            return (Criteria) this;
        }

        public Criteria andChangetimeEqualTo(Date value) {
            addCriterion("CHANGETIME =", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotEqualTo(Date value) {
            addCriterion("CHANGETIME <>", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeGreaterThan(Date value) {
            addCriterion("CHANGETIME >", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CHANGETIME >=", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeLessThan(Date value) {
            addCriterion("CHANGETIME <", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeLessThanOrEqualTo(Date value) {
            addCriterion("CHANGETIME <=", value, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeIn(List<Date> values) {
            addCriterion("CHANGETIME in", values, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotIn(List<Date> values) {
            addCriterion("CHANGETIME not in", values, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeBetween(Date value1, Date value2) {
            addCriterion("CHANGETIME between", value1, value2, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangetimeNotBetween(Date value1, Date value2) {
            addCriterion("CHANGETIME not between", value1, value2, "changetime");
            return (Criteria) this;
        }

        public Criteria andChangeridIsNull() {
            addCriterion("CHANGERID is null");
            return (Criteria) this;
        }

        public Criteria andChangeridIsNotNull() {
            addCriterion("CHANGERID is not null");
            return (Criteria) this;
        }

        public Criteria andChangeridEqualTo(Long value) {
            addCriterion("CHANGERID =", value, "changerid");
            return (Criteria) this;
        }

        public Criteria andChangeridNotEqualTo(Long value) {
            addCriterion("CHANGERID <>", value, "changerid");
            return (Criteria) this;
        }

        public Criteria andChangeridGreaterThan(Long value) {
            addCriterion("CHANGERID >", value, "changerid");
            return (Criteria) this;
        }

        public Criteria andChangeridGreaterThanOrEqualTo(Long value) {
            addCriterion("CHANGERID >=", value, "changerid");
            return (Criteria) this;
        }

        public Criteria andChangeridLessThan(Long value) {
            addCriterion("CHANGERID <", value, "changerid");
            return (Criteria) this;
        }

        public Criteria andChangeridLessThanOrEqualTo(Long value) {
            addCriterion("CHANGERID <=", value, "changerid");
            return (Criteria) this;
        }

        public Criteria andChangeridIn(List<Long> values) {
            addCriterion("CHANGERID in", values, "changerid");
            return (Criteria) this;
        }

        public Criteria andChangeridNotIn(List<Long> values) {
            addCriterion("CHANGERID not in", values, "changerid");
            return (Criteria) this;
        }

        public Criteria andChangeridBetween(Long value1, Long value2) {
            addCriterion("CHANGERID between", value1, value2, "changerid");
            return (Criteria) this;
        }

        public Criteria andChangeridNotBetween(Long value1, Long value2) {
            addCriterion("CHANGERID not between", value1, value2, "changerid");
            return (Criteria) this;
        }

        public Criteria andChangernameIsNull() {
            addCriterion("CHANGERNAME is null");
            return (Criteria) this;
        }

        public Criteria andChangernameIsNotNull() {
            addCriterion("CHANGERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andChangernameEqualTo(String value) {
            addCriterion("CHANGERNAME =", value, "changername");
            return (Criteria) this;
        }

        public Criteria andChangernameNotEqualTo(String value) {
            addCriterion("CHANGERNAME <>", value, "changername");
            return (Criteria) this;
        }

        public Criteria andChangernameGreaterThan(String value) {
            addCriterion("CHANGERNAME >", value, "changername");
            return (Criteria) this;
        }

        public Criteria andChangernameGreaterThanOrEqualTo(String value) {
            addCriterion("CHANGERNAME >=", value, "changername");
            return (Criteria) this;
        }

        public Criteria andChangernameLessThan(String value) {
            addCriterion("CHANGERNAME <", value, "changername");
            return (Criteria) this;
        }

        public Criteria andChangernameLessThanOrEqualTo(String value) {
            addCriterion("CHANGERNAME <=", value, "changername");
            return (Criteria) this;
        }

        public Criteria andChangernameLike(String value) {
            addCriterion("CHANGERNAME like", value, "changername");
            return (Criteria) this;
        }

        public Criteria andChangernameNotLike(String value) {
            addCriterion("CHANGERNAME not like", value, "changername");
            return (Criteria) this;
        }

        public Criteria andChangernameIn(List<String> values) {
            addCriterion("CHANGERNAME in", values, "changername");
            return (Criteria) this;
        }

        public Criteria andChangernameNotIn(List<String> values) {
            addCriterion("CHANGERNAME not in", values, "changername");
            return (Criteria) this;
        }

        public Criteria andChangernameBetween(String value1, String value2) {
            addCriterion("CHANGERNAME between", value1, value2, "changername");
            return (Criteria) this;
        }

        public Criteria andChangernameNotBetween(String value1, String value2) {
            addCriterion("CHANGERNAME not between", value1, value2, "changername");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINEQC.Y_CFACETVALUETAB
     *
     * @mbg.generated do_not_delete_during_merge Tue Jan 08 16:40:05 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINEQC.Y_CFACETVALUETAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
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