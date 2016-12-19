package com.eliteams.quick4j.web.model;

public class Corelation {
    private Long relId;

    private String relationname;

    private Long sourid;

    private Long targid;

    public Long getRelId() {
        return relId;
    }

    public void setRelId(Long relId) {
        this.relId = relId;
    }

    public String getRelationname() {
        return relationname;
    }

    public void setRelationname(String relationname) {
        this.relationname = relationname == null ? null : relationname.trim();
    }

    public Long getSourid() {
        return sourid;
    }

    public void setSourid(Long sourid) {
        this.sourid = sourid;
    }

    public Long getTargid() {
        return targid;
    }

    public void setTargid(Long targid) {
        this.targid = targid;
    }
}