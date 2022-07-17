package org.cn.bj.dao;

import org.cn.bj.domain.Teacher;

import java.util.List;

public interface TeacherDao {

    //根据系别编号，查询该系别下的老师的详细信息，不包含其他系别信息
    List<Teacher> queryByDno(String dno);

    //根据教师编号，查询该编号下的老师的详细信息，以及该教师所在系别的详细信息
    Teacher queryByTnoFoundDept(String tno);
}
