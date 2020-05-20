package com.zljx.verify;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TVerifyFlowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TVerifyFlowExample() {
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

        public Criteria andVerifyFlowIdIsNull() {
            addCriterion("verify_flow_id is null");
            return (Criteria) this;
        }

        public Criteria andVerifyFlowIdIsNotNull() {
            addCriterion("verify_flow_id is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyFlowIdEqualTo(Long value) {
            addCriterion("verify_flow_id =", value, "verifyFlowId");
            return (Criteria) this;
        }

        public Criteria andVerifyFlowIdNotEqualTo(Long value) {
            addCriterion("verify_flow_id <>", value, "verifyFlowId");
            return (Criteria) this;
        }

        public Criteria andVerifyFlowIdGreaterThan(Long value) {
            addCriterion("verify_flow_id >", value, "verifyFlowId");
            return (Criteria) this;
        }

        public Criteria andVerifyFlowIdGreaterThanOrEqualTo(Long value) {
            addCriterion("verify_flow_id >=", value, "verifyFlowId");
            return (Criteria) this;
        }

        public Criteria andVerifyFlowIdLessThan(Long value) {
            addCriterion("verify_flow_id <", value, "verifyFlowId");
            return (Criteria) this;
        }

        public Criteria andVerifyFlowIdLessThanOrEqualTo(Long value) {
            addCriterion("verify_flow_id <=", value, "verifyFlowId");
            return (Criteria) this;
        }

        public Criteria andVerifyFlowIdIn(List<Long> values) {
            addCriterion("verify_flow_id in", values, "verifyFlowId");
            return (Criteria) this;
        }

        public Criteria andVerifyFlowIdNotIn(List<Long> values) {
            addCriterion("verify_flow_id not in", values, "verifyFlowId");
            return (Criteria) this;
        }

        public Criteria andVerifyFlowIdBetween(Long value1, Long value2) {
            addCriterion("verify_flow_id between", value1, value2, "verifyFlowId");
            return (Criteria) this;
        }

        public Criteria andVerifyFlowIdNotBetween(Long value1, Long value2) {
            addCriterion("verify_flow_id not between", value1, value2, "verifyFlowId");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(Long value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(Long value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(Long value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(Long value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(Long value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(Long value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<Long> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<Long> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(Long value1, Long value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(Long value1, Long value2) {
            addCriterion("app_id not between", value1, value2, "appId");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateOperationIsNull() {
            addCriterion("create_operation is null");
            return (Criteria) this;
        }

        public Criteria andCreateOperationIsNotNull() {
            addCriterion("create_operation is not null");
            return (Criteria) this;
        }

        public Criteria andCreateOperationEqualTo(Long value) {
            addCriterion("create_operation =", value, "createOperation");
            return (Criteria) this;
        }

        public Criteria andCreateOperationNotEqualTo(Long value) {
            addCriterion("create_operation <>", value, "createOperation");
            return (Criteria) this;
        }

        public Criteria andCreateOperationGreaterThan(Long value) {
            addCriterion("create_operation >", value, "createOperation");
            return (Criteria) this;
        }

        public Criteria andCreateOperationGreaterThanOrEqualTo(Long value) {
            addCriterion("create_operation >=", value, "createOperation");
            return (Criteria) this;
        }

        public Criteria andCreateOperationLessThan(Long value) {
            addCriterion("create_operation <", value, "createOperation");
            return (Criteria) this;
        }

        public Criteria andCreateOperationLessThanOrEqualTo(Long value) {
            addCriterion("create_operation <=", value, "createOperation");
            return (Criteria) this;
        }

        public Criteria andCreateOperationIn(List<Long> values) {
            addCriterion("create_operation in", values, "createOperation");
            return (Criteria) this;
        }

        public Criteria andCreateOperationNotIn(List<Long> values) {
            addCriterion("create_operation not in", values, "createOperation");
            return (Criteria) this;
        }

        public Criteria andCreateOperationBetween(Long value1, Long value2) {
            addCriterion("create_operation between", value1, value2, "createOperation");
            return (Criteria) this;
        }

        public Criteria andCreateOperationNotBetween(Long value1, Long value2) {
            addCriterion("create_operation not between", value1, value2, "createOperation");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("last_update_time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_update_time not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateOperationIsNull() {
            addCriterion("last_update_operation is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateOperationIsNotNull() {
            addCriterion("last_update_operation is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateOperationEqualTo(Long value) {
            addCriterion("last_update_operation =", value, "lastUpdateOperation");
            return (Criteria) this;
        }

        public Criteria andLastUpdateOperationNotEqualTo(Long value) {
            addCriterion("last_update_operation <>", value, "lastUpdateOperation");
            return (Criteria) this;
        }

        public Criteria andLastUpdateOperationGreaterThan(Long value) {
            addCriterion("last_update_operation >", value, "lastUpdateOperation");
            return (Criteria) this;
        }

        public Criteria andLastUpdateOperationGreaterThanOrEqualTo(Long value) {
            addCriterion("last_update_operation >=", value, "lastUpdateOperation");
            return (Criteria) this;
        }

        public Criteria andLastUpdateOperationLessThan(Long value) {
            addCriterion("last_update_operation <", value, "lastUpdateOperation");
            return (Criteria) this;
        }

        public Criteria andLastUpdateOperationLessThanOrEqualTo(Long value) {
            addCriterion("last_update_operation <=", value, "lastUpdateOperation");
            return (Criteria) this;
        }

        public Criteria andLastUpdateOperationIn(List<Long> values) {
            addCriterion("last_update_operation in", values, "lastUpdateOperation");
            return (Criteria) this;
        }

        public Criteria andLastUpdateOperationNotIn(List<Long> values) {
            addCriterion("last_update_operation not in", values, "lastUpdateOperation");
            return (Criteria) this;
        }

        public Criteria andLastUpdateOperationBetween(Long value1, Long value2) {
            addCriterion("last_update_operation between", value1, value2, "lastUpdateOperation");
            return (Criteria) this;
        }

        public Criteria andLastUpdateOperationNotBetween(Long value1, Long value2) {
            addCriterion("last_update_operation not between", value1, value2, "lastUpdateOperation");
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