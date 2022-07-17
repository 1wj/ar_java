package org.cn.bj.dao;

import org.cn.bj.domain.Card;

public interface CardDao {
    /*
        根据身份证号查询身份证信息
     */
    public Card selectByCardId(String cardId);
}
