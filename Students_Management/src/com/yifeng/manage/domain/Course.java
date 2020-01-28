package com.yifeng.manage.domain;

public class Course {
    private String classid;
    private String classname;
    private Double gread;
    private int num;

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public Double getGread() {
        return gread;
    }

    public void setGread(Double gread) {
        this.gread = gread;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Course{" +
                "classid='" + classid + '\'' +
                ", classname='" + classname + '\'' +
                ", gread=" + gread +
                ", num=" + num +
                '}';
    }
}
