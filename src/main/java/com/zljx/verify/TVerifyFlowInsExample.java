package com.zljx.verify;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TVerifyFlowInsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TVerifyFlowInsExample() {
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

        public Criteria andFlowInsIdIsNull() {
            addCriterion("flow_ins_id is null");
            return (Criteria) this;
        }

        public Criteria andFlowInsIdIsNotNull() {
            addCriterion("flow_ins_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlowInsIdEqualTo(Long value) {
            addCriterion("flow_ins_id =", value, "flowInsId");
            return (Criteria) this;
        }

        public Criteria andFlowInsIdNotEqualTo(Long value) {
            addCriterion("flow_ins_id <>", value, "flowInsId");
            return (Criteria) this;
        }

        public Criteria andFlowInsIdGreaterThan(Long value) {
            addCriterion("flow_ins_id >", value, "flowInsId");
            return (Criteria) this;
        }

        public Criteria andFlowInsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("flow_ins_id >=", value, "flowInsId");
            return (Criteria) this;
        }

        public Criteria andFlowInsIdLessThan(Long value) {
            addCriterion("flow_ins_id <", value, "flowInsId");
            return (Criteria) this;
        }

        public Criteria andFlowInsIdLessThanOrEqualTo(Long value) {
            addCriterion("flow_ins_id <=", value, "flowInsId");
            return (Criteria) this;
        }

        public Criteria andFlowInsIdIn(List<Long> values) {
            addCriterion("flow_ins_id in", values, "flowInsId");
            return (Criteria) this;
        }

        public Criteria andFlowInsIdNotIn(List<Long> values) {
            addCriterion("flow_ins_id not in", values, "flowInsId");
            return (Criteria) this;
        }

        public Criteria andFlowInsIdBetween(Long value1, Long value2) {
            addCriterion("flow_ins_id between", value1, value2, "flowInsId");
            return (Criteria) this;
        }

        public Criteria andFlowInsIdNotBetween(Long value1, Long value2) {
            addCriterion("flow_ins_id not between", value1, value2, "flowInsId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Long value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Long value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Long value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Long value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Long value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Long value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Long> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Long> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Long value1, Long value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Long value1, Long value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeIsNull() {
            addCriterion("verify_type is null");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeIsNotNull() {
            addCriterion("verify_type is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeEqualTo(Byte value) {
            addCriterion("verify_type =", value, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeNotEqualTo(Byte value) {
            addCriterion("verify_type <>", value, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeGreaterThan(Byte value) {
            addCriterion("verify_type >", value, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("verify_type >=", value, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeLessThan(Byte value) {
            addCriterion("verify_type <", value, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeLessThanOrEqualTo(Byte value) {
            addCriterion("verify_type <=", value, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeIn(List<Byte> values) {
            addCriterion("verify_type in", values, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeNotIn(List<Byte> values) {
            addCriterion("verify_type not in", values, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeBetween(Byte value1, Byte value2) {
            addCriterion("verify_type between", value1, value2, "verifyType");
            return (Criteria) this;
        }

        public Criteria andVerifyTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("verify_type not between", value1, value2, "verifyType");
            return (Criteria) this;
        }

        public Criteria andNextIdIsNull() {
            addCriterion("next_id is null");
            return (Criteria) this;
        }

        public Criteria andNextIdIsNotNull() {
            addCriterion("next_id is not null");
            return (Criteria) this;
        }

        public Criteria andNextIdEqualTo(Long value) {
            addCriterion("next_id =", value, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdNotEqualTo(Long value) {
            addCriterion("next_id <>", value, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdGreaterThan(Long value) {
            addCriterion("next_id >", value, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdGreaterThanOrEqualTo(Long value) {
            addCriterion("next_id >=", value, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdLessThan(Long value) {
            addCriterion("next_id <", value, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdLessThanOrEqualTo(Long value) {
            addCriterion("next_id <=", value, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdIn(List<Long> values) {
            addCriterion("next_id in", values, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdNotIn(List<Long> values) {
            addCriterion("next_id not in", values, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdBetween(Long value1, Long value2) {
            addCriterion("next_id between", value1, value2, "nextId");
            return (Criteria) this;
        }

        public Criteria andNextIdNotBetween(Long value1, Long value2) {
            addCriterion("next_id not between", value1, value2, "nextId");
            return (Criteria) this;
        }

        public Criteria andLastVerifyIdIsNull() {
            addCriterion("last_verify_id is null");
            return (Criteria) this;
        }

        public Criteria andLastVerifyIdIsNotNull() {
            addCriterion("last_verify_id is not null");
            return (Criteria) this;
        }

        public Criteria andLastVerifyIdEqualTo(Long value) {
            addCriterion("last_verify_id =", value, "lastVerifyId");
            return (Criteria) this;
        }

        public Criteria andLastVerifyIdNotEqualTo(Long value) {
            addCriterion("last_verify_id <>", value, "lastVerifyId");
            return (Criteria) this;
        }

        public Criteria andLastVerifyIdGreaterThan(Long value) {
            addCriterion("last_verify_id >", value, "lastVerifyId");
            return (Criteria) this;
        }

        public Criteria andLastVerifyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("last_verify_id >=", value, "lastVerifyId");
            return (Criteria) this;
        }

        public Criteria andLastVerifyIdLessThan(Long value) {
            addCriterion("last_verify_id <", value, "lastVerifyId");
            return (Criteria) this;
        }

        public Criteria andLastVerifyIdLessThanOrEqualTo(Long value) {
            addCriterion("last_verify_id <=", value, "lastVerifyId");
            return (Criteria) this;
        }

        public Criteria andLastVerifyIdIn(List<Long> values) {
            addCriterion("last_verify_id in", values, "lastVerifyId");
            return (Criteria) this;
        }

        public Criteria andLastVerifyIdNotIn(List<Long> values) {
            addCriterion("last_verify_id not in", values, "lastVerifyId");
            return (Criteria) this;
        }

        public Criteria andLastVerifyIdBetween(Long value1, Long value2) {
            addCriterion("last_verify_id between", value1, value2, "lastVerifyId");
            return (Criteria) this;
        }

        public Criteria andLastVerifyIdNotBetween(Long value1, Long value2) {
            addCriterion("last_verify_id not between", value1, value2, "lastVerifyId");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIsNull() {
            addCriterion("verify_status is null");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIsNotNull() {
            addCriterion("verify_status is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusEqualTo(Byte value) {
            addCriterion("verify_status =", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotEqualTo(Byte value) {
            addCriterion("verify_status <>", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusGreaterThan(Byte value) {
            addCriterion("verify_status >", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("verify_status >=", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusLessThan(Byte value) {
            addCriterion("verify_status <", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusLessThanOrEqualTo(Byte value) {
            addCriterion("verify_status <=", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIn(List<Byte> values) {
            addCriterion("verify_status in", values, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotIn(List<Byte> values) {
            addCriterion("verify_status not in", values, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusBetween(Byte value1, Byte value2) {
            addCriterion("verify_status between", value1, value2, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("verify_status not between", value1, value2, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andLastVerifyTimeIsNull() {
            addCriterion("last_verify_time is null");
            return (Criteria) this;
        }

        public Criteria andLastVerifyTimeIsNotNull() {
            addCriterion("last_verify_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastVerifyTimeEqualTo(Date value) {
            addCriterion("last_verify_time =", value, "lastVerifyTime");
            return (Criteria) this;
        }

        public Criteria andLastVerifyTimeNotEqualTo(Date value) {
            addCriterion("last_verify_time <>", value, "lastVerifyTime");
            return (Criteria) this;
        }

        public Criteria andLastVerifyTimeGreaterThan(Date value) {
            addCriterion("last_verify_time >", value, "lastVerifyTime");
            return (Criteria) this;
        }

        public Criteria andLastVerifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_verify_time >=", value, "lastVerifyTime");
            return (Criteria) this;
        }

        public Criteria andLastVerifyTimeLessThan(Date value) {
            addCriterion("last_verify_time <", value, "lastVerifyTime");
            return (Criteria) this;
        }

        public Criteria andLastVerifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_verify_time <=", value, "lastVerifyTime");
            return (Criteria) this;
        }

        public Criteria andLastVerifyTimeIn(List<Date> values) {
            addCriterion("last_verify_time in", values, "lastVerifyTime");
            return (Criteria) this;
        }

        public Criteria andLastVerifyTimeNotIn(List<Date> values) {
            addCriterion("last_verify_time not in", values, "lastVerifyTime");
            return (Criteria) this;
        }

        public Criteria andLastVerifyTimeBetween(Date value1, Date value2) {
            addCriterion("last_verify_time between", value1, value2, "lastVerifyTime");
            return (Criteria) this;
        }

        public Criteria andLastVerifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_verify_time not between", value1, value2, "lastVerifyTime");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonIsNull() {
            addCriterion("refuse_reason is null");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonIsNotNull() {
            addCriterion("refuse_reason is not null");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonEqualTo(String value) {
            addCriterion("refuse_reason =", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonNotEqualTo(String value) {
            addCriterion("refuse_reason <>", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonGreaterThan(String value) {
            addCriterion("refuse_reason >", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonGreaterThanOrEqualTo(String value) {
            addCriterion("refuse_reason >=", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonLessThan(String value) {
            addCriterion("refuse_reason <", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonLessThanOrEqualTo(String value) {
            addCriterion("refuse_reason <=", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonLike(String value) {
            addCriterion("refuse_reason like", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonNotLike(String value) {
            addCriterion("refuse_reason not like", value, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonIn(List<String> values) {
            addCriterion("refuse_reason in", values, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonNotIn(List<String> values) {
            addCriterion("refuse_reason not in", values, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonBetween(String value1, String value2) {
            addCriterion("refuse_reason between", value1, value2, "refuseReason");
            return (Criteria) this;
        }

        public Criteria andRefuseReasonNotBetween(String value1, String value2) {
            addCriterion("refuse_reason not between", value1, value2, "refuseReason");
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