package com.domain;

public class Cate {
   private Integer cid;
   private String cname;
   private String describe_1;
   private String ccreatetime;

    public Cate() {
    }

    public Cate(Integer cid, String cname, String describe_1, String ccreatetime) {
        this.cid = cid;
        this.cname = cname;
        this.describe_1 = describe_1;
        this.ccreatetime = ccreatetime;
    }

    @Override
    public String toString() {
        return "Cate{" +
                "cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                ", describe_1='" + describe_1 + '\'' +
                ", ccreatetime='" + ccreatetime + '\'' +
                '}';
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getDescribe_1() {
        return describe_1;
    }

    public void setDescribe_1(String describe_1) {
        this.describe_1 = describe_1;
    }

    public String getCcreatetime() {
        return ccreatetime;
    }

    public void setCcreatetime(String ccreatetime) {
        this.ccreatetime = ccreatetime;
    }
}
