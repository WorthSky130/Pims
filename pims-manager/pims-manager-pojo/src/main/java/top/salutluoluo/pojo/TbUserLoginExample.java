package top.salutluoluo.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbUserLoginExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbUserLoginExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andUserGlobalIdIsNull() {
            addCriterion("user_global_id is null");
            return (Criteria) this;
        }

        public Criteria andUserGlobalIdIsNotNull() {
            addCriterion("user_global_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserGlobalIdEqualTo(String value) {
            addCriterion("user_global_id =", value, "userGlobalId");
            return (Criteria) this;
        }

        public Criteria andUserGlobalIdNotEqualTo(String value) {
            addCriterion("user_global_id <>", value, "userGlobalId");
            return (Criteria) this;
        }

        public Criteria andUserGlobalIdGreaterThan(String value) {
            addCriterion("user_global_id >", value, "userGlobalId");
            return (Criteria) this;
        }

        public Criteria andUserGlobalIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_global_id >=", value, "userGlobalId");
            return (Criteria) this;
        }

        public Criteria andUserGlobalIdLessThan(String value) {
            addCriterion("user_global_id <", value, "userGlobalId");
            return (Criteria) this;
        }

        public Criteria andUserGlobalIdLessThanOrEqualTo(String value) {
            addCriterion("user_global_id <=", value, "userGlobalId");
            return (Criteria) this;
        }

        public Criteria andUserGlobalIdLike(String value) {
            addCriterion("user_global_id like", value, "userGlobalId");
            return (Criteria) this;
        }

        public Criteria andUserGlobalIdNotLike(String value) {
            addCriterion("user_global_id not like", value, "userGlobalId");
            return (Criteria) this;
        }

        public Criteria andUserGlobalIdIn(List<String> values) {
            addCriterion("user_global_id in", values, "userGlobalId");
            return (Criteria) this;
        }

        public Criteria andUserGlobalIdNotIn(List<String> values) {
            addCriterion("user_global_id not in", values, "userGlobalId");
            return (Criteria) this;
        }

        public Criteria andUserGlobalIdBetween(String value1, String value2) {
            addCriterion("user_global_id between", value1, value2, "userGlobalId");
            return (Criteria) this;
        }

        public Criteria andUserGlobalIdNotBetween(String value1, String value2) {
            addCriterion("user_global_id not between", value1, value2, "userGlobalId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
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

        public Criteria andLoginPasswordIsNull() {
            addCriterion("login_password is null");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordIsNotNull() {
            addCriterion("login_password is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordEqualTo(String value) {
            addCriterion("login_password =", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotEqualTo(String value) {
            addCriterion("login_password <>", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordGreaterThan(String value) {
            addCriterion("login_password >", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("login_password >=", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordLessThan(String value) {
            addCriterion("login_password <", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordLessThanOrEqualTo(String value) {
            addCriterion("login_password <=", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordLike(String value) {
            addCriterion("login_password like", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotLike(String value) {
            addCriterion("login_password not like", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordIn(List<String> values) {
            addCriterion("login_password in", values, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotIn(List<String> values) {
            addCriterion("login_password not in", values, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordBetween(String value1, String value2) {
            addCriterion("login_password between", value1, value2, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotBetween(String value1, String value2) {
            addCriterion("login_password not between", value1, value2, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andFreezingIsNull() {
            addCriterion("freezing is null");
            return (Criteria) this;
        }

        public Criteria andFreezingIsNotNull() {
            addCriterion("freezing is not null");
            return (Criteria) this;
        }

        public Criteria andFreezingEqualTo(Integer value) {
            addCriterion("freezing =", value, "freezing");
            return (Criteria) this;
        }

        public Criteria andFreezingNotEqualTo(Integer value) {
            addCriterion("freezing <>", value, "freezing");
            return (Criteria) this;
        }

        public Criteria andFreezingGreaterThan(Integer value) {
            addCriterion("freezing >", value, "freezing");
            return (Criteria) this;
        }

        public Criteria andFreezingGreaterThanOrEqualTo(Integer value) {
            addCriterion("freezing >=", value, "freezing");
            return (Criteria) this;
        }

        public Criteria andFreezingLessThan(Integer value) {
            addCriterion("freezing <", value, "freezing");
            return (Criteria) this;
        }

        public Criteria andFreezingLessThanOrEqualTo(Integer value) {
            addCriterion("freezing <=", value, "freezing");
            return (Criteria) this;
        }

        public Criteria andFreezingIn(List<Integer> values) {
            addCriterion("freezing in", values, "freezing");
            return (Criteria) this;
        }

        public Criteria andFreezingNotIn(List<Integer> values) {
            addCriterion("freezing not in", values, "freezing");
            return (Criteria) this;
        }

        public Criteria andFreezingBetween(Integer value1, Integer value2) {
            addCriterion("freezing between", value1, value2, "freezing");
            return (Criteria) this;
        }

        public Criteria andFreezingNotBetween(Integer value1, Integer value2) {
            addCriterion("freezing not between", value1, value2, "freezing");
            return (Criteria) this;
        }

        public Criteria andFreezeReasonIsNull() {
            addCriterion("freeze_reason is null");
            return (Criteria) this;
        }

        public Criteria andFreezeReasonIsNotNull() {
            addCriterion("freeze_reason is not null");
            return (Criteria) this;
        }

        public Criteria andFreezeReasonEqualTo(String value) {
            addCriterion("freeze_reason =", value, "freezeReason");
            return (Criteria) this;
        }

        public Criteria andFreezeReasonNotEqualTo(String value) {
            addCriterion("freeze_reason <>", value, "freezeReason");
            return (Criteria) this;
        }

        public Criteria andFreezeReasonGreaterThan(String value) {
            addCriterion("freeze_reason >", value, "freezeReason");
            return (Criteria) this;
        }

        public Criteria andFreezeReasonGreaterThanOrEqualTo(String value) {
            addCriterion("freeze_reason >=", value, "freezeReason");
            return (Criteria) this;
        }

        public Criteria andFreezeReasonLessThan(String value) {
            addCriterion("freeze_reason <", value, "freezeReason");
            return (Criteria) this;
        }

        public Criteria andFreezeReasonLessThanOrEqualTo(String value) {
            addCriterion("freeze_reason <=", value, "freezeReason");
            return (Criteria) this;
        }

        public Criteria andFreezeReasonLike(String value) {
            addCriterion("freeze_reason like", value, "freezeReason");
            return (Criteria) this;
        }

        public Criteria andFreezeReasonNotLike(String value) {
            addCriterion("freeze_reason not like", value, "freezeReason");
            return (Criteria) this;
        }

        public Criteria andFreezeReasonIn(List<String> values) {
            addCriterion("freeze_reason in", values, "freezeReason");
            return (Criteria) this;
        }

        public Criteria andFreezeReasonNotIn(List<String> values) {
            addCriterion("freeze_reason not in", values, "freezeReason");
            return (Criteria) this;
        }

        public Criteria andFreezeReasonBetween(String value1, String value2) {
            addCriterion("freeze_reason between", value1, value2, "freezeReason");
            return (Criteria) this;
        }

        public Criteria andFreezeReasonNotBetween(String value1, String value2) {
            addCriterion("freeze_reason not between", value1, value2, "freezeReason");
            return (Criteria) this;
        }

        public Criteria andLastPasswordIsNull() {
            addCriterion("last_password is null");
            return (Criteria) this;
        }

        public Criteria andLastPasswordIsNotNull() {
            addCriterion("last_password is not null");
            return (Criteria) this;
        }

        public Criteria andLastPasswordEqualTo(String value) {
            addCriterion("last_password =", value, "lastPassword");
            return (Criteria) this;
        }

        public Criteria andLastPasswordNotEqualTo(String value) {
            addCriterion("last_password <>", value, "lastPassword");
            return (Criteria) this;
        }

        public Criteria andLastPasswordGreaterThan(String value) {
            addCriterion("last_password >", value, "lastPassword");
            return (Criteria) this;
        }

        public Criteria andLastPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("last_password >=", value, "lastPassword");
            return (Criteria) this;
        }

        public Criteria andLastPasswordLessThan(String value) {
            addCriterion("last_password <", value, "lastPassword");
            return (Criteria) this;
        }

        public Criteria andLastPasswordLessThanOrEqualTo(String value) {
            addCriterion("last_password <=", value, "lastPassword");
            return (Criteria) this;
        }

        public Criteria andLastPasswordLike(String value) {
            addCriterion("last_password like", value, "lastPassword");
            return (Criteria) this;
        }

        public Criteria andLastPasswordNotLike(String value) {
            addCriterion("last_password not like", value, "lastPassword");
            return (Criteria) this;
        }

        public Criteria andLastPasswordIn(List<String> values) {
            addCriterion("last_password in", values, "lastPassword");
            return (Criteria) this;
        }

        public Criteria andLastPasswordNotIn(List<String> values) {
            addCriterion("last_password not in", values, "lastPassword");
            return (Criteria) this;
        }

        public Criteria andLastPasswordBetween(String value1, String value2) {
            addCriterion("last_password between", value1, value2, "lastPassword");
            return (Criteria) this;
        }

        public Criteria andLastPasswordNotBetween(String value1, String value2) {
            addCriterion("last_password not between", value1, value2, "lastPassword");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterionForJDBCTime("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterionForJDBCTime("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterionForJDBCTime("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("last_login_time not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastOutTimeIsNull() {
            addCriterion("last_out_time is null");
            return (Criteria) this;
        }

        public Criteria andLastOutTimeIsNotNull() {
            addCriterion("last_out_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastOutTimeEqualTo(Date value) {
            addCriterionForJDBCTime("last_out_time =", value, "lastOutTime");
            return (Criteria) this;
        }

        public Criteria andLastOutTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("last_out_time <>", value, "lastOutTime");
            return (Criteria) this;
        }

        public Criteria andLastOutTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("last_out_time >", value, "lastOutTime");
            return (Criteria) this;
        }

        public Criteria andLastOutTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("last_out_time >=", value, "lastOutTime");
            return (Criteria) this;
        }

        public Criteria andLastOutTimeLessThan(Date value) {
            addCriterionForJDBCTime("last_out_time <", value, "lastOutTime");
            return (Criteria) this;
        }

        public Criteria andLastOutTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("last_out_time <=", value, "lastOutTime");
            return (Criteria) this;
        }

        public Criteria andLastOutTimeIn(List<Date> values) {
            addCriterionForJDBCTime("last_out_time in", values, "lastOutTime");
            return (Criteria) this;
        }

        public Criteria andLastOutTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("last_out_time not in", values, "lastOutTime");
            return (Criteria) this;
        }

        public Criteria andLastOutTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("last_out_time between", value1, value2, "lastOutTime");
            return (Criteria) this;
        }

        public Criteria andLastOutTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("last_out_time not between", value1, value2, "lastOutTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginLocalIsNull() {
            addCriterion("last_login_local is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginLocalIsNotNull() {
            addCriterion("last_login_local is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginLocalEqualTo(String value) {
            addCriterion("last_login_local =", value, "lastLoginLocal");
            return (Criteria) this;
        }

        public Criteria andLastLoginLocalNotEqualTo(String value) {
            addCriterion("last_login_local <>", value, "lastLoginLocal");
            return (Criteria) this;
        }

        public Criteria andLastLoginLocalGreaterThan(String value) {
            addCriterion("last_login_local >", value, "lastLoginLocal");
            return (Criteria) this;
        }

        public Criteria andLastLoginLocalGreaterThanOrEqualTo(String value) {
            addCriterion("last_login_local >=", value, "lastLoginLocal");
            return (Criteria) this;
        }

        public Criteria andLastLoginLocalLessThan(String value) {
            addCriterion("last_login_local <", value, "lastLoginLocal");
            return (Criteria) this;
        }

        public Criteria andLastLoginLocalLessThanOrEqualTo(String value) {
            addCriterion("last_login_local <=", value, "lastLoginLocal");
            return (Criteria) this;
        }

        public Criteria andLastLoginLocalLike(String value) {
            addCriterion("last_login_local like", value, "lastLoginLocal");
            return (Criteria) this;
        }

        public Criteria andLastLoginLocalNotLike(String value) {
            addCriterion("last_login_local not like", value, "lastLoginLocal");
            return (Criteria) this;
        }

        public Criteria andLastLoginLocalIn(List<String> values) {
            addCriterion("last_login_local in", values, "lastLoginLocal");
            return (Criteria) this;
        }

        public Criteria andLastLoginLocalNotIn(List<String> values) {
            addCriterion("last_login_local not in", values, "lastLoginLocal");
            return (Criteria) this;
        }

        public Criteria andLastLoginLocalBetween(String value1, String value2) {
            addCriterion("last_login_local between", value1, value2, "lastLoginLocal");
            return (Criteria) this;
        }

        public Criteria andLastLoginLocalNotBetween(String value1, String value2) {
            addCriterion("last_login_local not between", value1, value2, "lastLoginLocal");
            return (Criteria) this;
        }

        public Criteria andUsePlatformIsNull() {
            addCriterion("use_platform is null");
            return (Criteria) this;
        }

        public Criteria andUsePlatformIsNotNull() {
            addCriterion("use_platform is not null");
            return (Criteria) this;
        }

        public Criteria andUsePlatformEqualTo(String value) {
            addCriterion("use_platform =", value, "usePlatform");
            return (Criteria) this;
        }

        public Criteria andUsePlatformNotEqualTo(String value) {
            addCriterion("use_platform <>", value, "usePlatform");
            return (Criteria) this;
        }

        public Criteria andUsePlatformGreaterThan(String value) {
            addCriterion("use_platform >", value, "usePlatform");
            return (Criteria) this;
        }

        public Criteria andUsePlatformGreaterThanOrEqualTo(String value) {
            addCriterion("use_platform >=", value, "usePlatform");
            return (Criteria) this;
        }

        public Criteria andUsePlatformLessThan(String value) {
            addCriterion("use_platform <", value, "usePlatform");
            return (Criteria) this;
        }

        public Criteria andUsePlatformLessThanOrEqualTo(String value) {
            addCriterion("use_platform <=", value, "usePlatform");
            return (Criteria) this;
        }

        public Criteria andUsePlatformLike(String value) {
            addCriterion("use_platform like", value, "usePlatform");
            return (Criteria) this;
        }

        public Criteria andUsePlatformNotLike(String value) {
            addCriterion("use_platform not like", value, "usePlatform");
            return (Criteria) this;
        }

        public Criteria andUsePlatformIn(List<String> values) {
            addCriterion("use_platform in", values, "usePlatform");
            return (Criteria) this;
        }

        public Criteria andUsePlatformNotIn(List<String> values) {
            addCriterion("use_platform not in", values, "usePlatform");
            return (Criteria) this;
        }

        public Criteria andUsePlatformBetween(String value1, String value2) {
            addCriterion("use_platform between", value1, value2, "usePlatform");
            return (Criteria) this;
        }

        public Criteria andUsePlatformNotBetween(String value1, String value2) {
            addCriterion("use_platform not between", value1, value2, "usePlatform");
            return (Criteria) this;
        }

        public Criteria andLoginFailureTimeIsNull() {
            addCriterion("login_failure_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginFailureTimeIsNotNull() {
            addCriterion("login_failure_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginFailureTimeEqualTo(Integer value) {
            addCriterion("login_failure_time =", value, "loginFailureTime");
            return (Criteria) this;
        }

        public Criteria andLoginFailureTimeNotEqualTo(Integer value) {
            addCriterion("login_failure_time <>", value, "loginFailureTime");
            return (Criteria) this;
        }

        public Criteria andLoginFailureTimeGreaterThan(Integer value) {
            addCriterion("login_failure_time >", value, "loginFailureTime");
            return (Criteria) this;
        }

        public Criteria andLoginFailureTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_failure_time >=", value, "loginFailureTime");
            return (Criteria) this;
        }

        public Criteria andLoginFailureTimeLessThan(Integer value) {
            addCriterion("login_failure_time <", value, "loginFailureTime");
            return (Criteria) this;
        }

        public Criteria andLoginFailureTimeLessThanOrEqualTo(Integer value) {
            addCriterion("login_failure_time <=", value, "loginFailureTime");
            return (Criteria) this;
        }

        public Criteria andLoginFailureTimeIn(List<Integer> values) {
            addCriterion("login_failure_time in", values, "loginFailureTime");
            return (Criteria) this;
        }

        public Criteria andLoginFailureTimeNotIn(List<Integer> values) {
            addCriterion("login_failure_time not in", values, "loginFailureTime");
            return (Criteria) this;
        }

        public Criteria andLoginFailureTimeBetween(Integer value1, Integer value2) {
            addCriterion("login_failure_time between", value1, value2, "loginFailureTime");
            return (Criteria) this;
        }

        public Criteria andLoginFailureTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("login_failure_time not between", value1, value2, "loginFailureTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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