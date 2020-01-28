package com.yifeng.manage.domain;

public class Teacher {
    private String workid;
    private String workname;
    private String acollege;
    private String asystem;

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid;
    }

    public String getWorkname() {
        return workname;
    }

    public void setWorkname(String workname) {
        this.workname = workname;
    }

    public String getAcollege() {
        return acollege;
    }

    public void setAcollege(String acollege) {
        this.acollege = acollege;
    }

    public String getAsystem() {
        return asystem;
    }

    public void setAsystem(String asystem) {
        this.asystem = asystem;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "workid='" + workid + '\'' +
                ", workname='" + workname + '\'' +
                ", acollege='" + acollege + '\'' +
                ", asystem='" + asystem + '\'' +
                '}';
    }
}
