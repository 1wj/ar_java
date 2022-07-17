package org.cn.bj.dao;

import org.cn.bj.domain.Person;

public interface PersonDao {
    /*
        根据人员编号查询人员信息，以及他的身份证信息
     */
    Person queryByPno(String pno);

}
