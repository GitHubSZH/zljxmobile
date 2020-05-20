package com.zljx.verify;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TVerifyNodeInsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TVerifyNodeInsExample() {
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

        public Criteria andNodeInsIdIsNull() {
            addCriterion("node_ins_id is null");
            return (Criteria) this;
        }

        public Criteria andNodeInsIdIsNotNull() {
            addCriterion("node_ins_id is not null");
            return (Criteria) this;
        }

        public Criteria andNodeInsIdEqualTo(Long value) {
            addCriterion("node_ins_id =", value, "nodeInsId");
            return (Criteria) this;
        }

        public Criteria andNodeInsIdNotEqualTo(Long value) {
            addCriterion("node_ins_id <>", value, "nodeInsId");
            return (Criteria) this;
        }

        public Criteria andNodeInsIdGreaterThan(Long value) {
            addCriterion("node_ins_id >", value, "nodeInsId");
            return (Criteria) this;
        }

        public Criteria andNodeInsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("node_ins_id >=", value, "nodeInsId");
            return (Criteria) this;
        }

        public Criteria andNodeInsIdLessThan(Long value) {
            addCriterion("node_ins_id <", value, "nodeInsId");
            return (Criteria) this;
        }

        public Criteria andNodeInsIdLessThanOrEqualTo(Long value) {
            addCriterion("node_ins_id <=", value, "nodeInsId");
            return (Criteria) this;
        }

        public Criteria andNodeInsIdIn(List<Long> values) {
            addCriterion("node_ins_id in", values, "nodeInsId");
            return (Criteria) this;
        }

        public Criteria andNodeInsIdNotIn(List<Long> values) {
            addCriterion("node_ins_id not in", values, "nodeInsId");
            return (Criteria) this;
        }

        public Criteria andNodeInsIdBetween(Long value1, Long value2) {
            addCriterion("node_ins_id between", value1, value2, "nodeInsId");
            return (Criteria) this;
        }

        public Criteria andNodeInsIdNotBetween(Long value1, Long value2) {
            addCriterion("node_ins_id not between", value1, value2, "nodeInsId");
            return (Criteria) this;
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

        public Criteria andOperationIdIsNull() {
            addCriterion("operation_id is null");
            return (Criteria) this;
        }

        public Criteria andOperationIdIsNotNull() {
            addCriterion("operation_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperationIdEqualTo(Long value) {
            addCriterion("operation_id =", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdNotEqualTo(Long value) {
            addCriterion("operation_id <>", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdGreaterThan(Long value) {
            addCriterion("operation_id >", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("operation_id >=", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdLessThan(Long value) {
            addCriterion("operation_id <", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdLessThanOrEqualTo(Long value) {
            addCriterion("operation_id <=", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdIn(List<Long> values) {
            addCriterion("operation_id in", values, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdNotIn(List<Long> values) {
            addCriterion("operation_id not in", values, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdBetween(Long value1, Long value2) {
            addCriterion("operation_id between", value1, value2, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdNotBetween(Long value1, Long value2) {
            addCriterion("operation_id not between", value1, value2, "operationId");
            return (Criteria) this;
        }

        public Criteria andInsFlowOrderIsNull() {
            addCriterion("ins_flow_order is null");
            return (Criteria) this;
        }

        public Criteria andInsFlowOrderIsNotNull() {
            addCriterion("ins_flow_order is not null");
            return (Criteria) this;
        }

        public Criteria andInsFlowOrderEqualTo(Byte value) {
            addCriterion("ins_flow_order =", value, "insFlowOrder");
            return (Criteria) this;
        }

        public Criteria andInsFlowOrderNotEqualTo(Byte value) {
            addCriterion("ins_flow_order <>", value, "insFlowOrder");
            return (Criteria) this;
        }

        public Criteria andInsFlowOrderGreaterThan(Byte value) {
            addCriterion("ins_flow_order >", value, "insFlowOrder");
            return (Criteria) this;
        }

        public Criteria andInsFlowOrderGreaterThanOrEqualTo(Byte value) {
            addCriterion("ins_flow_order >=", value, "insFlowOrder");
            return (Criteria) this;
        }

        public Criteria andInsFlowOrderLessThan(Byte value) {
            addCriterion("ins_flow_order <", value, "insFlowOrder");
            return (Criteria) this;
        }

        public Criteria andInsFlowOrderLessThanOrEqualTo(Byte value) {
            addCriterion("ins_flow_order <=", value, "insFlowOrder");
            return (Criteria) this;
        }

        public Criteria andInsFlowOrderIn(List<Byte> values) {
            addCriterion("ins_flow_order in", values, "insFlowOrder");
            return (Criteria) this;
        }

        public Criteria andInsFlowOrderNotIn(List<Byte> values) {
            addCriterion("ins_flow_order not in", values, "insFlowOrder");
            return (Criteria) this;
        }

        public Criteria andInsFlowOrderBetween(Byte value1, Byte value2) {
            addCriterion("ins_flow_order between", value1, value2, "insFlowOrder");
            return (Criteria) this;
        }

        public Criteria andInsFlowOrderNotBetween(Byte value1, Byte value2) {
            addCriterion("ins_flow_order not between", value1, value2, "insFlowOrder");
            return (Criteria) this;
        }

        public Criteria andNextInsNodeIsNull() {
            addCriterion("next_ins_node is null");
            return (Criteria) this;
        }

        public Criteria andNextInsNodeIsNotNull() {
            addCriterion("next_ins_node is not null");
            return (Criteria) this;
        }

        public Criteria andNextInsNodeEqualTo(Long value) {
            addCriterion("next_ins_node =", value, "nextInsNode");
            return (Criteria) this;
        }

        public Criteria andNextInsNodeNotEqualTo(Long value) {
            addCriterion("next_ins_node <>", value, "nextInsNode");
            return (Criteria) this;
        }

        public Criteria andNextInsNodeGreaterThan(Long value) {
            addCriterion("next_ins_node >", value, "nextInsNode");
            return (Criteria) this;
        }

        public Criteria andNextInsNodeGreaterThanOrEqualTo(Long value) {
            addCriterion("next_ins_node >=", value, "nextInsNode");
            return (Criteria) this;
        }

        public Criteria andNextInsNodeLessThan(Long value) {
            addCriterion("next_ins_node <", value, "nextInsNode");
            return (Criteria) this;
        }

        public Criteria andNextInsNodeLessThanOrEqualTo(Long value) {
            addCriterion("next_ins_node <=", value, "nextInsNode");
            return (Criteria) this;
        }

        public Criteria andNextInsNodeIn(List<Long> values) {
            addCriterion("next_ins_node in", values, "nextInsNode");
            return (Criteria) this;
        }

        public Criteria andNextInsNodeNotIn(List<Long> values) {
            addCriterion("next_ins_node not in", values, "nextInsNode");
            return (Criteria) this;
        }

        public Criteria andNextInsNodeBetween(Long value1, Long value2) {
            addCriterion("next_ins_node between", value1, value2, "nextInsNode");
            return (Criteria) this;
        }

        public Criteria andNextInsNodeNotBetween(Long value1, Long value2) {
            addCriterion("next_ins_node not between", value1, value2, "nextInsNode");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIsNull() {
            addCriterion("is_verify is null");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIsNotNull() {
            addCriterion("is_verify is not null");
            return (Criteria) this;
        }

        public Criteria andIsVerifyEqualTo(Byte value) {
            addCriterion("is_verify =", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyNotEqualTo(Byte value) {
            addCriterion("is_verify <>", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyGreaterThan(Byte value) {
            addCriterion("is_verify >", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_verify >=", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyLessThan(Byte value) {
            addCriterion("is_verify <", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyLessThanOrEqualTo(Byte value) {
            addCriterion("is_verify <=", value, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyIn(List<Byte> values) {
            addCriterion("is_verify in", values, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyNotIn(List<Byte> values) {
            addCriterion("is_verify not in", values, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyBetween(Byte value1, Byte value2) {
            addCriterion("is_verify between", value1, value2, "isVerify");
            return (Criteria) this;
        }

        public Criteria andIsVerifyNotBetween(Byte value1, Byte value2) {
            addCriterion("is_verify not between", value1, value2, "isVerify");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIsNull() {
            addCriterion("verify_time is null");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIsNotNull() {
            addCriterion("verify_time is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeEqualTo(Date value) {
            addCriterion("verify_time =", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotEqualTo(Date value) {
            addCriterion("verify_time <>", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeGreaterThan(Date value) {
            addCriterion("verify_time >", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("verify_time >=", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLessThan(Date value) {
            addCriterion("verify_time <", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("verify_time <=", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIn(List<Date> values) {
            addCriterion("verify_time in", values, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotIn(List<Date> values) {
            addCriterion("verify_time not in", values, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeBetween(Date value1, Date value2) {
            addCriterion("verify_time between", value1, value2, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("verify_time not between", value1, value2, "verifyTime");
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