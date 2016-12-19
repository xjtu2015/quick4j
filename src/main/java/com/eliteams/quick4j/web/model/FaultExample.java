package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class FaultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FaultExample() {
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

        public Criteria andFaultidIsNull() {
            addCriterion("FaultId is null");
            return (Criteria) this;
        }

        public Criteria andFaultidIsNotNull() {
            addCriterion("FaultId is not null");
            return (Criteria) this;
        }

        public Criteria andFaultidEqualTo(Long value) {
            addCriterion("FaultId =", value, "faultid");
            return (Criteria) this;
        }

        public Criteria andFaultidNotEqualTo(Long value) {
            addCriterion("FaultId <>", value, "faultid");
            return (Criteria) this;
        }

        public Criteria andFaultidGreaterThan(Long value) {
            addCriterion("FaultId >", value, "faultid");
            return (Criteria) this;
        }

        public Criteria andFaultidGreaterThanOrEqualTo(Long value) {
            addCriterion("FaultId >=", value, "faultid");
            return (Criteria) this;
        }

        public Criteria andFaultidLessThan(Long value) {
            addCriterion("FaultId <", value, "faultid");
            return (Criteria) this;
        }

        public Criteria andFaultidLessThanOrEqualTo(Long value) {
            addCriterion("FaultId <=", value, "faultid");
            return (Criteria) this;
        }

        public Criteria andFaultidIn(List<Long> values) {
            addCriterion("FaultId in", values, "faultid");
            return (Criteria) this;
        }

        public Criteria andFaultidNotIn(List<Long> values) {
            addCriterion("FaultId not in", values, "faultid");
            return (Criteria) this;
        }

        public Criteria andFaultidBetween(Long value1, Long value2) {
            addCriterion("FaultId between", value1, value2, "faultid");
            return (Criteria) this;
        }

        public Criteria andFaultidNotBetween(Long value1, Long value2) {
            addCriterion("FaultId not between", value1, value2, "faultid");
            return (Criteria) this;
        }

        public Criteria andFaultnameIsNull() {
            addCriterion("FaultName is null");
            return (Criteria) this;
        }

        public Criteria andFaultnameIsNotNull() {
            addCriterion("FaultName is not null");
            return (Criteria) this;
        }

        public Criteria andFaultnameEqualTo(String value) {
            addCriterion("FaultName =", value, "faultname");
            return (Criteria) this;
        }

        public Criteria andFaultnameNotEqualTo(String value) {
            addCriterion("FaultName <>", value, "faultname");
            return (Criteria) this;
        }

        public Criteria andFaultnameGreaterThan(String value) {
            addCriterion("FaultName >", value, "faultname");
            return (Criteria) this;
        }

        public Criteria andFaultnameGreaterThanOrEqualTo(String value) {
            addCriterion("FaultName >=", value, "faultname");
            return (Criteria) this;
        }

        public Criteria andFaultnameLessThan(String value) {
            addCriterion("FaultName <", value, "faultname");
            return (Criteria) this;
        }

        public Criteria andFaultnameLessThanOrEqualTo(String value) {
            addCriterion("FaultName <=", value, "faultname");
            return (Criteria) this;
        }

        public Criteria andFaultnameLike(String value) {
            addCriterion("FaultName like", value, "faultname");
            return (Criteria) this;
        }

        public Criteria andFaultnameNotLike(String value) {
            addCriterion("FaultName not like", value, "faultname");
            return (Criteria) this;
        }

        public Criteria andFaultnameIn(List<String> values) {
            addCriterion("FaultName in", values, "faultname");
            return (Criteria) this;
        }

        public Criteria andFaultnameNotIn(List<String> values) {
            addCriterion("FaultName not in", values, "faultname");
            return (Criteria) this;
        }

        public Criteria andFaultnameBetween(String value1, String value2) {
            addCriterion("FaultName between", value1, value2, "faultname");
            return (Criteria) this;
        }

        public Criteria andFaultnameNotBetween(String value1, String value2) {
            addCriterion("FaultName not between", value1, value2, "faultname");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("ParentId is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("ParentId is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(Integer value) {
            addCriterion("ParentId =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(Integer value) {
            addCriterion("ParentId <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(Integer value) {
            addCriterion("ParentId >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParentId >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(Integer value) {
            addCriterion("ParentId <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(Integer value) {
            addCriterion("ParentId <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<Integer> values) {
            addCriterion("ParentId in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<Integer> values) {
            addCriterion("ParentId not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(Integer value1, Integer value2) {
            addCriterion("ParentId between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("ParentId not between", value1, value2, "parentid");
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