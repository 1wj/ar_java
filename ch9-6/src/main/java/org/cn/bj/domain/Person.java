package org.cn.bj.domain;

public class Person {
    private String pno;
    private String pname;
    private String page;
    private String psex;
    private Card card ;

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getPsex() {
        return psex;
    }

    public void setPsex(String psex) {
        this.psex = psex;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pno='" + pno + '\'' +
                ", pname='" + pname + '\'' +
                ", page='" + page + '\'' +
                ", psex='" + psex + '\'' +
                ", card=" + card +
                '}';
    }
}
