package org.cn.bj.domain;

public class Card {
    private String cardid;
    private String cardplace;
    private String cardDate;

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public String getCardplace() {
        return cardplace;
    }

    public void setCardplace(String cardplace) {
        this.cardplace = cardplace;
    }

    public String getCardDate() {
        return cardDate;
    }

    public void setCardDate(String cardDate) {
        this.cardDate = cardDate;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardid='" + cardid + '\'' +
                ", cardplace='" + cardplace + '\'' +
                ", cardDate='" + cardDate + '\'' +
                '}';
    }
}
