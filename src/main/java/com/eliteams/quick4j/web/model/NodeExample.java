package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class NodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NodeExample() {
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

        public Criteria andNodeidIsNull() {
            addCriterion("NodeId is null");
            return (Criteria) this;
        }

        public Criteria andNodeidIsNotNull() {
            addCriterion("NodeId is not null");
            return (Criteria) this;
        }

        public Criteria andNodeidEqualTo(Long value) {
            addCriterion("NodeId =", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotEqualTo(Long value) {
            addCriterion("NodeId <>", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidGreaterThan(Long value) {
            addCriterion("NodeId >", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidGreaterThanOrEqualTo(Long value) {
            addCriterion("NodeId >=", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidLessThan(Long value) {
            addCriterion("NodeId <", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidLessThanOrEqualTo(Long value) {
            addCriterion("NodeId <=", value, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidIn(List<Long> values) {
            addCriterion("NodeId in", values, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotIn(List<Long> values) {
            addCriterion("NodeId not in", values, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidBetween(Long value1, Long value2) {
            addCriterion("NodeId between", value1, value2, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodeidNotBetween(Long value1, Long value2) {
            addCriterion("NodeId not between", value1, value2, "nodeid");
            return (Criteria) this;
        }

        public Criteria andNodenameIsNull() {
            addCriterion("NodeName is null");
            return (Criteria) this;
        }

        public Criteria andNodenameIsNotNull() {
            addCriterion("NodeName is not null");
            return (Criteria) this;
        }

        public Criteria andNodenameEqualTo(String value) {
            addCriterion("NodeName =", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameNotEqualTo(String value) {
            addCriterion("NodeName <>", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameGreaterThan(String value) {
            addCriterion("NodeName >", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameGreaterThanOrEqualTo(String value) {
            addCriterion("NodeName >=", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameLessThan(String value) {
            addCriterion("NodeName <", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameLessThanOrEqualTo(String value) {
            addCriterion("NodeName <=", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameLike(String value) {
            addCriterion("NodeName like", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameNotLike(String value) {
            addCriterion("NodeName not like", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameIn(List<String> values) {
            addCriterion("NodeName in", values, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameNotIn(List<String> values) {
            addCriterion("NodeName not in", values, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameBetween(String value1, String value2) {
            addCriterion("NodeName between", value1, value2, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameNotBetween(String value1, String value2) {
            addCriterion("NodeName not between", value1, value2, "nodename");
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

        public Criteria andLevIsNull() {
            addCriterion("Lev is null");
            return (Criteria) this;
        }

        public Criteria andLevIsNotNull() {
            addCriterion("Lev is not null");
            return (Criteria) this;
        }

        public Criteria andLevEqualTo(Integer value) {
            addCriterion("Lev =", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevNotEqualTo(Integer value) {
            addCriterion("Lev <>", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevGreaterThan(Integer value) {
            addCriterion("Lev >", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevGreaterThanOrEqualTo(Integer value) {
            addCriterion("Lev >=", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevLessThan(Integer value) {
            addCriterion("Lev <", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevLessThanOrEqualTo(Integer value) {
            addCriterion("Lev <=", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevIn(List<Integer> values) {
            addCriterion("Lev in", values, "lev");
            return (Criteria) this;
        }

        public Criteria andLevNotIn(List<Integer> values) {
            addCriterion("Lev not in", values, "lev");
            return (Criteria) this;
        }

        public Criteria andLevBetween(Integer value1, Integer value2) {
            addCriterion("Lev between", value1, value2, "lev");
            return (Criteria) this;
        }

        public Criteria andLevNotBetween(Integer value1, Integer value2) {
            addCriterion("Lev not between", value1, value2, "lev");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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