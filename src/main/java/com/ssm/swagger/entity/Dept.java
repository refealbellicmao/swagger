package com.ssm.swagger.entity;

public class Dept {
    private Integer uid;
    private String uname;
    private String pwd;

    public Dept() {
        super();
    }
    public Dept(Integer uid,String uname,String pwd) {
        super();
        this.uid = uid;
        this.uname = uname;
        this.pwd = pwd;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
