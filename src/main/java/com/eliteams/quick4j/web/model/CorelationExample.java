package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class CorelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CorelationExample() {
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

        public Criteria andRelIdIsNull() {
            addCriterion("Rel_id is null");
            return (Criteria) this;
        }

        public Criteria andRelIdIsNotNull() {
            addCriterion("Rel_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelIdEqualTo(Long value) {
            addCriterion("Rel_id =", value, "relId");
            return (Criteria) this;
        }

        public Criteria andRelIdNotEqualTo(Long value) {
            addCriterion("Rel_id <>", value, "relId");
            return (Criteria) this;
        }

        public Criteria andRelIdGreaterThan(Long value) {
            addCriterion("Rel_id >", value, "relId");
            return (Criteria) this;
        }

        public Criteria andRelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("Rel_id >=", value, "relId");
            return (Criteria) this;
        }

        public Criteria andRelIdLessThan(Long value) {
            addCriterion("Rel_id <", value, "relId");
            return (Criteria) this;
        }

        public Criteria andRelIdLessThanOrEqualTo(Long value) {
            addCriterion("Rel_id <=", value, "relId");
            return (Criteria) this;
        }

        public Criteria andRelIdIn(List<Long> values) {
            addCriterion("Rel_id in", values, "relId");
            return (Criteria) this;
        }

        public Criteria andRelIdNotIn(List<Long> values) {
            addCriterion("Rel_id not in", values, "relId");
            return (Criteria) this;
        }

        public Criteria andRelIdBetween(Long value1, Long value2) {
            addCriterion("Rel_id between", value1, value2, "relId");
            return (Criteria) this;
        }

        public Criteria andRelIdNotBetween(Long value1, Long value2) {
            addCriterion("Rel_id not between", value1, value2, "relId");
            return (Criteria) this;
        }

        public Criteria andRelationnameIsNull() {
            addCriterion("relationName is null");
            return (Criteria) this;
        }

        public Criteria andRelationnameIsNotNull() {
            addCriterion("relationName is not null");
            return (Criteria) this;
        }

        public Criteria andRelationnameEqualTo(String value) {
            addCriterion("relationName =", value, "relationname");
            return (Criteria) this;
        }

        public Criteria andRelationnameNotEqualTo(String value) {
            addCriterion("relationName <>", value, "relationname");
            return (Criteria) this;
        }

        public Criteria andRelationnameGreaterThan(String value) {
            addCriterion("relationName >", value, "relationname");
            return (Criteria) this;
        }

        public Criteria andRelationnameGreaterThanOrEqualTo(String value) {
            addCriterion("relationName >=", value, "relationname");
            return (Criteria) this;
        }

        public Criteria andRelationnameLessThan(String value) {
            addCriterion("relationName <", value, "relationname");
            return (Criteria) this;
        }

        public Criteria andRelationnameLessThanOrEqualTo(String value) {
            addCriterion("relationName <=", value, "relationname");
            return (Criteria) this;
        }

        public Criteria andRelationnameLike(String value) {
            addCriterion("relationName like", value, "relationname");
            return (Criteria) this;
        }

        public Criteria andRelationnameNotLike(String value) {
            addCriterion("relationName not like", value, "relationname");
            return (Criteria) this;
        }

        public Criteria andRelationnameIn(List<String> values) {
            addCriterion("relationName in", values, "relationname");
            return (Criteria) this;
        }

        public Criteria andRelationnameNotIn(List<String> values) {
            addCriterion("relationName not in", values, "relationname");
            return (Criteria) this;
        }

        public Criteria andRelationnameBetween(String value1, String value2) {
            addCriterion("relationName between", value1, value2, "relationname");
            return (Criteria) this;
        }

        public Criteria andRelationnameNotBetween(String value1, String value2) {
            addCriterion("relationName not between", value1, value2, "relationname");
            return (Criteria) this;
        }

        public Criteria andSouridIsNull() {
            addCriterion("SourId is null");
            return (Criteria) this;
        }

        public Criteria andSouridIsNotNull() {
            addCriterion("SourId is not null");
            return (Criteria) this;
        }

        public Criteria andSouridEqualTo(Long value) {
            addCriterion("SourId =", value, "sourid");
            return (Criteria) this;
        }

        public Criteria andSouridNotEqualTo(Long value) {
            addCriterion("SourId <>", value, "sourid");
            return (Criteria) this;
        }

        public Criteria andSouridGreaterThan(Long value) {
            addCriterion("SourId >", value, "sourid");
            return (Criteria) this;
        }

        public Criteria andSouridGreaterThanOrEqualTo(Long value) {
            addCriterion("SourId >=", value, "sourid");
            return (Criteria) this;
        }

        public Criteria andSouridLessThan(Long value) {
            addCriterion("SourId <", value, "sourid");
            return (Criteria) this;
        }

        public Criteria andSouridLessThanOrEqualTo(Long value) {
            addCriterion("SourId <=", value, "sourid");
            return (Criteria) this;
        }

        public Criteria andSouridIn(List<Long> values) {
            addCriterion("SourId in", values, "sourid");
            return (Criteria) this;
        }

        public Criteria andSouridNotIn(List<Long> values) {
            addCriterion("SourId not in", values, "sourid");
            return (Criteria) this;
        }

        public Criteria andSouridBetween(Long value1, Long value2) {
            addCriterion("SourId between", value1, value2, "sourid");
            return (Criteria) this;
        }

        public Criteria andSouridNotBetween(Long value1, Long value2) {
            addCriterion("SourId not between", value1, value2, "sourid");
            return (Criteria) this;
        }

        public Criteria andTargidIsNull() {
            addCriterion("TargId is null");
            return (Criteria) this;
        }

        public Criteria andTargidIsNotNull() {
            addCriterion("TargId is not null");
            return (Criteria) this;
        }

        public Criteria andTargidEqualTo(Long value) {
            addCriterion("TargId =", value, "targid");
            return (Criteria) this;
        }

        public Criteria andTargidNotEqualTo(Long value) {
            addCriterion("TargId <>", value, "targid");
            return (Criteria) this;
        }

        public Criteria andTargidGreaterThan(Long value) {
            addCriterion("TargId >", value, "targid");
            return (Criteria) this;
        }

        public Criteria andTargidGreaterThanOrEqualTo(Long value) {
            addCriterion("TargId >=", value, "targid");
            return (Criteria) this;
        }

        public Criteria andTargidLessThan(Long value) {
            addCriterion("TargId <", value, "targid");
            return (Criteria) this;
        }

        public Criteria andTargidLessThanOrEqualTo(Long value) {
            addCriterion("TargId <=", value, "targid");
            return (Criteria) this;
        }

        public Criteria andTargidIn(List<Long> values) {
            addCriterion("TargId in", values, "targid");
            return (Criteria) this;
        }

        public Criteria andTargidNotIn(List<Long> values) {
            addCriterion("TargId not in", values, "targid");
            return (Criteria) this;
        }

        public Criteria andTargidBetween(Long value1, Long value2) {
            addCriterion("TargId between", value1, value2, "targid");
            return (Criteria) this;
        }

        public Criteria andTargidNotBetween(Long value1, Long value2) {
            addCriterion("TargId not between", value1, value2, "targid");
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