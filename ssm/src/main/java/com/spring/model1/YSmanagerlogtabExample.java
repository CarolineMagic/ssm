package com.spring.model1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YSmanagerlogtabExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_SMANAGERLOGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_SMANAGERLOGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ONLINEQC.Y_SMANAGERLOGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERLOGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public YSmanagerlogtabExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERLOGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERLOGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERLOGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERLOGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERLOGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERLOGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERLOGTAB
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
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERLOGTAB
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
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERLOGTAB
     *
     * @mbg.generated Tue Jan 08 16:40:09 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ONLINEQC.Y_SMANAGERLOGTAB
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
     * This class corresponds to the database table ONLINEQC.Y_SMANAGERLOGTAB
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

        public Criteria andLogidIsNull() {
            addCriterion("LOGID is null");
            return (Criteria) this;
        }

        public Criteria andLogidIsNotNull() {
            addCriterion("LOGID is not null");
            return (Criteria) this;
        }

        public Criteria andLogidEqualTo(BigDecimal value) {
            addCriterion("LOGID =", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotEqualTo(BigDecimal value) {
            addCriterion("LOGID <>", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidGreaterThan(BigDecimal value) {
            addCriterion("LOGID >", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOGID >=", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLessThan(BigDecimal value) {
            addCriterion("LOGID <", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOGID <=", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidIn(List<BigDecimal> values) {
            addCriterion("LOGID in", values, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotIn(List<BigDecimal> values) {
            addCriterion("LOGID not in", values, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOGID between", value1, value2, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOGID not between", value1, value2, "logid");
            return (Criteria) this;
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

        public Criteria andMgridIsNull() {
            addCriterion("MGRID is null");
            return (Criteria) this;
        }

        public Criteria andMgridIsNotNull() {
            addCriterion("MGRID is not null");
            return (Criteria) this;
        }

        public Criteria andMgridEqualTo(BigDecimal value) {
            addCriterion("MGRID =", value, "mgrid");
            return (Criteria) this;
        }

        public Criteria andMgridNotEqualTo(BigDecimal value) {
            addCriterion("MGRID <>", value, "mgrid");
            return (Criteria) this;
        }

        public Criteria andMgridGreaterThan(BigDecimal value) {
            addCriterion("MGRID >", value, "mgrid");
            return (Criteria) this;
        }

        public Criteria andMgridGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MGRID >=", value, "mgrid");
            return (Criteria) this;
        }

        public Criteria andMgridLessThan(BigDecimal value) {
            addCriterion("MGRID <", value, "mgrid");
            return (Criteria) this;
        }

        public Criteria andMgridLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MGRID <=", value, "mgrid");
            return (Criteria) this;
        }

        public Criteria andMgridIn(List<BigDecimal> values) {
            addCriterion("MGRID in", values, "mgrid");
            return (Criteria) this;
        }

        public Criteria andMgridNotIn(List<BigDecimal> values) {
            addCriterion("MGRID not in", values, "mgrid");
            return (Criteria) this;
        }

        public Criteria andMgridBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MGRID between", value1, value2, "mgrid");
            return (Criteria) this;
        }

        public Criteria andMgridNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MGRID not between", value1, value2, "mgrid");
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

        public Criteria andIpaddrIsNull() {
            addCriterion("IPADDR is null");
            return (Criteria) this;
        }

        public Criteria andIpaddrIsNotNull() {
            addCriterion("IPADDR is not null");
            return (Criteria) this;
        }

        public Criteria andIpaddrEqualTo(String value) {
            addCriterion("IPADDR =", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrNotEqualTo(String value) {
            addCriterion("IPADDR <>", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrGreaterThan(String value) {
            addCriterion("IPADDR >", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrGreaterThanOrEqualTo(String value) {
            addCriterion("IPADDR >=", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrLessThan(String value) {
            addCriterion("IPADDR <", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrLessThanOrEqualTo(String value) {
            addCriterion("IPADDR <=", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrLike(String value) {
            addCriterion("IPADDR like", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrNotLike(String value) {
            addCriterion("IPADDR not like", value, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrIn(List<String> values) {
            addCriterion("IPADDR in", values, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrNotIn(List<String> values) {
            addCriterion("IPADDR not in", values, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrBetween(String value1, String value2) {
            addCriterion("IPADDR between", value1, value2, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andIpaddrNotBetween(String value1, String value2) {
            addCriterion("IPADDR not between", value1, value2, "ipaddr");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("PORT is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("PORT is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(BigDecimal value) {
            addCriterion("PORT =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(BigDecimal value) {
            addCriterion("PORT <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(BigDecimal value) {
            addCriterion("PORT >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PORT >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(BigDecimal value) {
            addCriterion("PORT <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PORT <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<BigDecimal> values) {
            addCriterion("PORT in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<BigDecimal> values) {
            addCriterion("PORT not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PORT between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PORT not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andLogtypeIsNull() {
            addCriterion("LOGTYPE is null");
            return (Criteria) this;
        }

        public Criteria andLogtypeIsNotNull() {
            addCriterion("LOGTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLogtypeEqualTo(String value) {
            addCriterion("LOGTYPE =", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeNotEqualTo(String value) {
            addCriterion("LOGTYPE <>", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeGreaterThan(String value) {
            addCriterion("LOGTYPE >", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeGreaterThanOrEqualTo(String value) {
            addCriterion("LOGTYPE >=", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeLessThan(String value) {
            addCriterion("LOGTYPE <", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeLessThanOrEqualTo(String value) {
            addCriterion("LOGTYPE <=", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeLike(String value) {
            addCriterion("LOGTYPE like", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeNotLike(String value) {
            addCriterion("LOGTYPE not like", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeIn(List<String> values) {
            addCriterion("LOGTYPE in", values, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeNotIn(List<String> values) {
            addCriterion("LOGTYPE not in", values, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeBetween(String value1, String value2) {
            addCriterion("LOGTYPE between", value1, value2, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeNotBetween(String value1, String value2) {
            addCriterion("LOGTYPE not between", value1, value2, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogstatusIsNull() {
            addCriterion("LOGSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andLogstatusIsNotNull() {
            addCriterion("LOGSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andLogstatusEqualTo(BigDecimal value) {
            addCriterion("LOGSTATUS =", value, "logstatus");
            return (Criteria) this;
        }

        public Criteria andLogstatusNotEqualTo(BigDecimal value) {
            addCriterion("LOGSTATUS <>", value, "logstatus");
            return (Criteria) this;
        }

        public Criteria andLogstatusGreaterThan(BigDecimal value) {
            addCriterion("LOGSTATUS >", value, "logstatus");
            return (Criteria) this;
        }

        public Criteria andLogstatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOGSTATUS >=", value, "logstatus");
            return (Criteria) this;
        }

        public Criteria andLogstatusLessThan(BigDecimal value) {
            addCriterion("LOGSTATUS <", value, "logstatus");
            return (Criteria) this;
        }

        public Criteria andLogstatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOGSTATUS <=", value, "logstatus");
            return (Criteria) this;
        }

        public Criteria andLogstatusIn(List<BigDecimal> values) {
            addCriterion("LOGSTATUS in", values, "logstatus");
            return (Criteria) this;
        }

        public Criteria andLogstatusNotIn(List<BigDecimal> values) {
            addCriterion("LOGSTATUS not in", values, "logstatus");
            return (Criteria) this;
        }

        public Criteria andLogstatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOGSTATUS between", value1, value2, "logstatus");
            return (Criteria) this;
        }

        public Criteria andLogstatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOGSTATUS not between", value1, value2, "logstatus");
            return (Criteria) this;
        }

        public Criteria andLogparamsIsNull() {
            addCriterion("LOGPARAMS is null");
            return (Criteria) this;
        }

        public Criteria andLogparamsIsNotNull() {
            addCriterion("LOGPARAMS is not null");
            return (Criteria) this;
        }

        public Criteria andLogparamsEqualTo(String value) {
            addCriterion("LOGPARAMS =", value, "logparams");
            return (Criteria) this;
        }

        public Criteria andLogparamsNotEqualTo(String value) {
            addCriterion("LOGPARAMS <>", value, "logparams");
            return (Criteria) this;
        }

        public Criteria andLogparamsGreaterThan(String value) {
            addCriterion("LOGPARAMS >", value, "logparams");
            return (Criteria) this;
        }

        public Criteria andLogparamsGreaterThanOrEqualTo(String value) {
            addCriterion("LOGPARAMS >=", value, "logparams");
            return (Criteria) this;
        }

        public Criteria andLogparamsLessThan(String value) {
            addCriterion("LOGPARAMS <", value, "logparams");
            return (Criteria) this;
        }

        public Criteria andLogparamsLessThanOrEqualTo(String value) {
            addCriterion("LOGPARAMS <=", value, "logparams");
            return (Criteria) this;
        }

        public Criteria andLogparamsLike(String value) {
            addCriterion("LOGPARAMS like", value, "logparams");
            return (Criteria) this;
        }

        public Criteria andLogparamsNotLike(String value) {
            addCriterion("LOGPARAMS not like", value, "logparams");
            return (Criteria) this;
        }

        public Criteria andLogparamsIn(List<String> values) {
            addCriterion("LOGPARAMS in", values, "logparams");
            return (Criteria) this;
        }

        public Criteria andLogparamsNotIn(List<String> values) {
            addCriterion("LOGPARAMS not in", values, "logparams");
            return (Criteria) this;
        }

        public Criteria andLogparamsBetween(String value1, String value2) {
            addCriterion("LOGPARAMS between", value1, value2, "logparams");
            return (Criteria) this;
        }

        public Criteria andLogparamsNotBetween(String value1, String value2) {
            addCriterion("LOGPARAMS not between", value1, value2, "logparams");
            return (Criteria) this;
        }

        public Criteria andMgrnameIsNull() {
            addCriterion("MGRNAME is null");
            return (Criteria) this;
        }

        public Criteria andMgrnameIsNotNull() {
            addCriterion("MGRNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMgrnameEqualTo(String value) {
            addCriterion("MGRNAME =", value, "mgrname");
            return (Criteria) this;
        }

        public Criteria andMgrnameNotEqualTo(String value) {
            addCriterion("MGRNAME <>", value, "mgrname");
            return (Criteria) this;
        }

        public Criteria andMgrnameGreaterThan(String value) {
            addCriterion("MGRNAME >", value, "mgrname");
            return (Criteria) this;
        }

        public Criteria andMgrnameGreaterThanOrEqualTo(String value) {
            addCriterion("MGRNAME >=", value, "mgrname");
            return (Criteria) this;
        }

        public Criteria andMgrnameLessThan(String value) {
            addCriterion("MGRNAME <", value, "mgrname");
            return (Criteria) this;
        }

        public Criteria andMgrnameLessThanOrEqualTo(String value) {
            addCriterion("MGRNAME <=", value, "mgrname");
            return (Criteria) this;
        }

        public Criteria andMgrnameLike(String value) {
            addCriterion("MGRNAME like", value, "mgrname");
            return (Criteria) this;
        }

        public Criteria andMgrnameNotLike(String value) {
            addCriterion("MGRNAME not like", value, "mgrname");
            return (Criteria) this;
        }

        public Criteria andMgrnameIn(List<String> values) {
            addCriterion("MGRNAME in", values, "mgrname");
            return (Criteria) this;
        }

        public Criteria andMgrnameNotIn(List<String> values) {
            addCriterion("MGRNAME not in", values, "mgrname");
            return (Criteria) this;
        }

        public Criteria andMgrnameBetween(String value1, String value2) {
            addCriterion("MGRNAME between", value1, value2, "mgrname");
            return (Criteria) this;
        }

        public Criteria andMgrnameNotBetween(String value1, String value2) {
            addCriterion("MGRNAME not between", value1, value2, "mgrname");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ONLINEQC.Y_SMANAGERLOGTAB
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
     * This class corresponds to the database table ONLINEQC.Y_SMANAGERLOGTAB
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