package com.eliteams.quick4j.web.model;

public class Fault {
    private Long faultid;

    private String faultname;

    private Integer parentid;

    public Long getFaultid() {
        return faultid;
    }

    public void setFaultid(Long faultid) {
        this.faultid = faultid;
    }

    public String getFaultname() {
        return faultname;
    }

    public void setFaultname(String faultname) {
        this.faultname = faultname == null ? null : faultname.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}