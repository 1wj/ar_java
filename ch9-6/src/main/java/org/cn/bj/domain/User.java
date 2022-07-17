package org.cn.bj.domain;

public class User {
    private String userid;
    private String uname;
    private String upwd;
    private String unickname;
    private String aid;
    private Double tel;
    private Integer remaindays;

    @Override
    public String toString() {
        return "User{" +
                "userid='" + userid + '\'' +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", unickname='" + unickname + '\'' +
                ", aid='" + aid + '\'' +
                ", tel=" + tel +
                ", remaindays=" + remaindays +
                '}';
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUnickname() {
        return unickname;
    }

    public void setUnickname(String unickname) {
        this.unickname = unickname;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public Double getTel() {
        return tel;
    }

    public void setTel(Double tel) {
        this.tel = tel;
    }

    public Integer getRemaindays() {
        return remaindays;
    }

    public void setRemaindays(Integer remaindays) {
        this.remaindays = remaindays;
    }
}
