package com.spring.model1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YCapplicationtabExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_CAPPLICATIONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_CAPPLICATIONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_CAPPLICATIONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CAPPLICATIONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    public YCapplicationtabExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CAPPLICATIONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CAPPLICATIONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CAPPLICATIONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CAPPLICATIONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CAPPLICATIONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CAPPLICATIONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CAPPLICATIONTAB
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
     * This method corresponds to the database table ONLINEQC.Y_CAPPLICATIONTAB
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
     * This method corresponds to the database table ONLINEQC.Y_CAPPLICATIONTAB
     *
     * @mbg.generated Tue Jan 08 16:40:05 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_CAPPLICATIONTAB
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
     * This class corresponds to the database table ONLINEQC.Y_CAPPLICATIONTAB
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

        public Criteria andAppidIsNull() {
            addCriterion("APPID is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("APPID is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(BigDecimal value) {
            addCriterion("APPID =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(BigDecimal value) {
            addCriterion("APPID <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(BigDecimal value) {
            addCriterion("APPID >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPID >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(BigDecimal value) {
            addCriterion("APPID <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPID <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<BigDecimal> values) {
            addCriterion("APPID in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<BigDecimal> values) {
            addCriterion("APPID not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPID between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPID not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andHostidIsNull() {
            addCriterion("HOSTID is null");
            return (Criteria) this;
        }

        public Criteria andHostidIsNotNull() {
            addCriterion("HOSTID is not null");
            return (Criteria) this;
        }

        public Criteria andHostidEqualTo(BigDecimal value) {
            addCriterion("HOSTID =", value, "hostid");
            return (Criteria) this;
        }

        public Criteria andHostidNotEqualTo(BigDecimal value) {
            addCriterion("HOSTID <>", value, "hostid");
            return (Criteria) this;
        }

        public Criteria andHostidGreaterThan(BigDecimal value) {
            addCriterion("HOSTID >", value, "hostid");
            return (Criteria) this;
        }

        public Criteria andHostidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HOSTID >=", value, "hostid");
            return (Criteria) this;
        }

        public Criteria andHostidLessThan(BigDecimal value) {
            addCriterion("HOSTID <", value, "hostid");
            return (Criteria) this;
        }

        public Criteria andHostidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HOSTID <=", value, "hostid");
            return (Criteria) this;
        }

        public Criteria andHostidIn(List<BigDecimal> values) {
            addCriterion("HOSTID in", values, "hostid");
            return (Criteria) this;
        }

        public Criteria andHostidNotIn(List<BigDecimal> values) {
            addCriterion("HOSTID not in", values, "hostid");
            return (Criteria) this;
        }

        public Criteria andHostidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOSTID between", value1, value2, "hostid");
            return (Criteria) this;
        }

        public Criteria andHostidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOSTID not between", value1, value2, "hostid");
            return (Criteria) this;
        }

        public Criteria andAppnameIsNull() {
            addCriterion("APPNAME is null");
            return (Criteria) this;
        }

        public Criteria andAppnameIsNotNull() {
            addCriterion("APPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAppnameEqualTo(String value) {
            addCriterion("APPNAME =", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotEqualTo(String value) {
            addCriterion("APPNAME <>", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameGreaterThan(String value) {
            addCriterion("APPNAME >", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameGreaterThanOrEqualTo(String value) {
            addCriterion("APPNAME >=", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameLessThan(String value) {
            addCriterion("APPNAME <", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameLessThanOrEqualTo(String value) {
            addCriterion("APPNAME <=", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameLike(String value) {
            addCriterion("APPNAME like", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotLike(String value) {
            addCriterion("APPNAME not like", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameIn(List<String> values) {
            addCriterion("APPNAME in", values, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotIn(List<String> values) {
            addCriterion("APPNAME not in", values, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameBetween(String value1, String value2) {
            addCriterion("APPNAME between", value1, value2, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotBetween(String value1, String value2) {
            addCriterion("APPNAME not between", value1, value2, "appname");
            return (Criteria) this;
        }

        public Criteria andApptypeIsNull() {
            addCriterion("APPTYPE is null");
            return (Criteria) this;
        }

        public Criteria andApptypeIsNotNull() {
            addCriterion("APPTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andApptypeEqualTo(Integer value) {
            addCriterion("APPTYPE =", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeNotEqualTo(Integer value) {
            addCriterion("APPTYPE <>", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeGreaterThan(Integer value) {
            addCriterion("APPTYPE >", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("APPTYPE >=", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeLessThan(Integer value) {
            addCriterion("APPTYPE <", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeLessThanOrEqualTo(Integer value) {
            addCriterion("APPTYPE <=", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeIn(List<Integer> values) {
            addCriterion("APPTYPE in", values, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeNotIn(List<Integer> values) {
            addCriterion("APPTYPE not in", values, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeBetween(Integer value1, Integer value2) {
            addCriterion("APPTYPE between", value1, value2, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeNotBetween(Integer value1, Integer value2) {
            addCriterion("APPTYPE not between", value1, value2, "apptype");
            return (Criteria) this;
        }

        public Criteria andAppworkdirectoryIsNull() {
            addCriterion("APPWORKDIRECTORY is null");
            return (Criteria) this;
        }

        public Criteria andAppworkdirectoryIsNotNull() {
            addCriterion("APPWORKDIRECTORY is not null");
            return (Criteria) this;
        }

        public Criteria andAppworkdirectoryEqualTo(String value) {
            addCriterion("APPWORKDIRECTORY =", value, "appworkdirectory");
            return (Criteria) this;
        }

        public Criteria andAppworkdirectoryNotEqualTo(String value) {
            addCriterion("APPWORKDIRECTORY <>", value, "appworkdirectory");
            return (Criteria) this;
        }

        public Criteria andAppworkdirectoryGreaterThan(String value) {
            addCriterion("APPWORKDIRECTORY >", value, "appworkdirectory");
            return (Criteria) this;
        }

        public Criteria andAppworkdirectoryGreaterThanOrEqualTo(String value) {
            addCriterion("APPWORKDIRECTORY >=", value, "appworkdirectory");
            return (Criteria) this;
        }

        public Criteria andAppworkdirectoryLessThan(String value) {
            addCriterion("APPWORKDIRECTORY <", value, "appworkdirectory");
            return (Criteria) this;
        }

        public Criteria andAppworkdirectoryLessThanOrEqualTo(String value) {
            addCriterion("APPWORKDIRECTORY <=", value, "appworkdirectory");
            return (Criteria) this;
        }

        public Criteria andAppworkdirectoryLike(String value) {
            addCriterion("APPWORKDIRECTORY like", value, "appworkdirectory");
            return (Criteria) this;
        }

        public Criteria andAppworkdirectoryNotLike(String value) {
            addCriterion("APPWORKDIRECTORY not like", value, "appworkdirectory");
            return (Criteria) this;
        }

        public Criteria andAppworkdirectoryIn(List<String> values) {
            addCriterion("APPWORKDIRECTORY in", values, "appworkdirectory");
            return (Criteria) this;
        }

        public Criteria andAppworkdirectoryNotIn(List<String> values) {
            addCriterion("APPWORKDIRECTORY not in", values, "appworkdirectory");
            return (Criteria) this;
        }

        public Criteria andAppworkdirectoryBetween(String value1, String value2) {
            addCriterion("APPWORKDIRECTORY between", value1, value2, "appworkdirectory");
            return (Criteria) this;
        }

        public Criteria andAppworkdirectoryNotBetween(String value1, String value2) {
            addCriterion("APPWORKDIRECTORY not between", value1, value2, "appworkdirectory");
            return (Criteria) this;
        }

        public Criteria andAppcommandlineIsNull() {
            addCriterion("APPCOMMANDLINE is null");
            return (Criteria) this;
        }

        public Criteria andAppcommandlineIsNotNull() {
            addCriterion("APPCOMMANDLINE is not null");
            return (Criteria) this;
        }

        public Criteria andAppcommandlineEqualTo(String value) {
            addCriterion("APPCOMMANDLINE =", value, "appcommandline");
            return (Criteria) this;
        }

        public Criteria andAppcommandlineNotEqualTo(String value) {
            addCriterion("APPCOMMANDLINE <>", value, "appcommandline");
            return (Criteria) this;
        }

        public Criteria andAppcommandlineGreaterThan(String value) {
            addCriterion("APPCOMMANDLINE >", value, "appcommandline");
            return (Criteria) this;
        }

        public Criteria andAppcommandlineGreaterThanOrEqualTo(String value) {
            addCriterion("APPCOMMANDLINE >=", value, "appcommandline");
            return (Criteria) this;
        }

        public Criteria andAppcommandlineLessThan(String value) {
            addCriterion("APPCOMMANDLINE <", value, "appcommandline");
            return (Criteria) this;
        }

        public Criteria andAppcommandlineLessThanOrEqualTo(String value) {
            addCriterion("APPCOMMANDLINE <=", value, "appcommandline");
            return (Criteria) this;
        }

        public Criteria andAppcommandlineLike(String value) {
            addCriterion("APPCOMMANDLINE like", value, "appcommandline");
            return (Criteria) this;
        }

        public Criteria andAppcommandlineNotLike(String value) {
            addCriterion("APPCOMMANDLINE not like", value, "appcommandline");
            return (Criteria) this;
        }

        public Criteria andAppcommandlineIn(List<String> values) {
            addCriterion("APPCOMMANDLINE in", values, "appcommandline");
            return (Criteria) this;
        }

        public Criteria andAppcommandlineNotIn(List<String> values) {
            addCriterion("APPCOMMANDLINE not in", values, "appcommandline");
            return (Criteria) this;
        }

        public Criteria andAppcommandlineBetween(String value1, String value2) {
            addCriterion("APPCOMMANDLINE between", value1, value2, "appcommandline");
            return (Criteria) this;
        }

        public Criteria andAppcommandlineNotBetween(String value1, String value2) {
            addCriterion("APPCOMMANDLINE not between", value1, value2, "appcommandline");
            return (Criteria) this;
        }

        public Criteria andAppargumentsIsNull() {
            addCriterion("APPARGUMENTS is null");
            return (Criteria) this;
        }

        public Criteria andAppargumentsIsNotNull() {
            addCriterion("APPARGUMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andAppargumentsEqualTo(String value) {
            addCriterion("APPARGUMENTS =", value, "apparguments");
            return (Criteria) this;
        }

        public Criteria andAppargumentsNotEqualTo(String value) {
            addCriterion("APPARGUMENTS <>", value, "apparguments");
            return (Criteria) this;
        }

        public Criteria andAppargumentsGreaterThan(String value) {
            addCriterion("APPARGUMENTS >", value, "apparguments");
            return (Criteria) this;
        }

        public Criteria andAppargumentsGreaterThanOrEqualTo(String value) {
            addCriterion("APPARGUMENTS >=", value, "apparguments");
            return (Criteria) this;
        }

        public Criteria andAppargumentsLessThan(String value) {
            addCriterion("APPARGUMENTS <", value, "apparguments");
            return (Criteria) this;
        }

        public Criteria andAppargumentsLessThanOrEqualTo(String value) {
            addCriterion("APPARGUMENTS <=", value, "apparguments");
            return (Criteria) this;
        }

        public Criteria andAppargumentsLike(String value) {
            addCriterion("APPARGUMENTS like", value, "apparguments");
            return (Criteria) this;
        }

        public Criteria andAppargumentsNotLike(String value) {
            addCriterion("APPARGUMENTS not like", value, "apparguments");
            return (Criteria) this;
        }

        public Criteria andAppargumentsIn(List<String> values) {
            addCriterion("APPARGUMENTS in", values, "apparguments");
            return (Criteria) this;
        }

        public Criteria andAppargumentsNotIn(List<String> values) {
            addCriterion("APPARGUMENTS not in", values, "apparguments");
            return (Criteria) this;
        }

        public Criteria andAppargumentsBetween(String value1, String value2) {
            addCriterion("APPARGUMENTS between", value1, value2, "apparguments");
            return (Criteria) this;
        }

        public Criteria andAppargumentsNotBetween(String value1, String value2) {
            addCriterion("APPARGUMENTS not between", value1, value2, "apparguments");
            return (Criteria) this;
        }

        public Criteria andAppdescrIsNull() {
            addCriterion("APPDESCR is null");
            return (Criteria) this;
        }

        public Criteria andAppdescrIsNotNull() {
            addCriterion("APPDESCR is not null");
            return (Criteria) this;
        }

        public Criteria andAppdescrEqualTo(String value) {
            addCriterion("APPDESCR =", value, "appdescr");
            return (Criteria) this;
        }

        public Criteria andAppdescrNotEqualTo(String value) {
            addCriterion("APPDESCR <>", value, "appdescr");
            return (Criteria) this;
        }

        public Criteria andAppdescrGreaterThan(String value) {
            addCriterion("APPDESCR >", value, "appdescr");
            return (Criteria) this;
        }

        public Criteria andAppdescrGreaterThanOrEqualTo(String value) {
            addCriterion("APPDESCR >=", value, "appdescr");
            return (Criteria) this;
        }

        public Criteria andAppdescrLessThan(String value) {
            addCriterion("APPDESCR <", value, "appdescr");
            return (Criteria) this;
        }

        public Criteria andAppdescrLessThanOrEqualTo(String value) {
            addCriterion("APPDESCR <=", value, "appdescr");
            return (Criteria) this;
        }

        public Criteria andAppdescrLike(String value) {
            addCriterion("APPDESCR like", value, "appdescr");
            return (Criteria) this;
        }

        public Criteria andAppdescrNotLike(String value) {
            addCriterion("APPDESCR not like", value, "appdescr");
            return (Criteria) this;
        }

        public Criteria andAppdescrIn(List<String> values) {
            addCriterion("APPDESCR in", values, "appdescr");
            return (Criteria) this;
        }

        public Criteria andAppdescrNotIn(List<String> values) {
            addCriterion("APPDESCR not in", values, "appdescr");
            return (Criteria) this;
        }

        public Criteria andAppdescrBetween(String value1, String value2) {
            addCriterion("APPDESCR between", value1, value2, "appdescr");
            return (Criteria) this;
        }

        public Criteria andAppdescrNotBetween(String value1, String value2) {
            addCriterion("APPDESCR not between", value1, value2, "appdescr");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("CTIME is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("CTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("CTIME =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("CTIME <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("CTIME >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CTIME >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("CTIME <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("CTIME <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("CTIME in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("CTIME not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("CTIME between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("CTIME not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andMtimeIsNull() {
            addCriterion("MTIME is null");
            return (Criteria) this;
        }

        public Criteria andMtimeIsNotNull() {
            addCriterion("MTIME is not null");
            return (Criteria) this;
        }

        public Criteria andMtimeEqualTo(Date value) {
            addCriterion("MTIME =", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotEqualTo(Date value) {
            addCriterion("MTIME <>", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeGreaterThan(Date value) {
            addCriterion("MTIME >", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MTIME >=", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeLessThan(Date value) {
            addCriterion("MTIME <", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeLessThanOrEqualTo(Date value) {
            addCriterion("MTIME <=", value, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeIn(List<Date> values) {
            addCriterion("MTIME in", values, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotIn(List<Date> values) {
            addCriterion("MTIME not in", values, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeBetween(Date value1, Date value2) {
            addCriterion("MTIME between", value1, value2, "mtime");
            return (Criteria) this;
        }

        public Criteria andMtimeNotBetween(Date value1, Date value2) {
            addCriterion("MTIME not between", value1, value2, "mtime");
            return (Criteria) this;
        }

        public Criteria andVersIsNull() {
            addCriterion("VERS is null");
            return (Criteria) this;
        }

        public Criteria andVersIsNotNull() {
            addCriterion("VERS is not null");
            return (Criteria) this;
        }

        public Criteria andVersEqualTo(String value) {
            addCriterion("VERS =", value, "vers");
            return (Criteria) this;
        }

        public Criteria andVersNotEqualTo(String value) {
            addCriterion("VERS <>", value, "vers");
            return (Criteria) this;
        }

        public Criteria andVersGreaterThan(String value) {
            addCriterion("VERS >", value, "vers");
            return (Criteria) this;
        }

        public Criteria andVersGreaterThanOrEqualTo(String value) {
            addCriterion("VERS >=", value, "vers");
            return (Criteria) this;
        }

        public Criteria andVersLessThan(String value) {
            addCriterion("VERS <", value, "vers");
            return (Criteria) this;
        }

        public Criteria andVersLessThanOrEqualTo(String value) {
            addCriterion("VERS <=", value, "vers");
            return (Criteria) this;
        }

        public Criteria andVersLike(String value) {
            addCriterion("VERS like", value, "vers");
            return (Criteria) this;
        }

        public Criteria andVersNotLike(String value) {
            addCriterion("VERS not like", value, "vers");
            return (Criteria) this;
        }

        public Criteria andVersIn(List<String> values) {
            addCriterion("VERS in", values, "vers");
            return (Criteria) this;
        }

        public Criteria andVersNotIn(List<String> values) {
            addCriterion("VERS not in", values, "vers");
            return (Criteria) this;
        }

        public Criteria andVersBetween(String value1, String value2) {
            addCriterion("VERS between", value1, value2, "vers");
            return (Criteria) this;
        }

        public Criteria andVersNotBetween(String value1, String value2) {
            addCriterion("VERS not between", value1, value2, "vers");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINEQC.Y_CAPPLICATIONTAB
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
     * This class corresponds to the database table ONLINEQC.Y_CAPPLICATIONTAB
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