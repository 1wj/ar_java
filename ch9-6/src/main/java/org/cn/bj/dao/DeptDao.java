package org.cn.bj.dao;

import org.cn.bj.domain.Dept;

public interface DeptDao {
    //根据系别编号，查询改系别的详细信息，不包含系别下的老师信息
    Dept queryDeptByDeptId(String dno);

    //根据系别编号，查询该系别的详细信息，以及该系别下的老师的详细信息（级联查询）
    Dept queryDeptByDeptIdFoundTeacher(String dno);
}
