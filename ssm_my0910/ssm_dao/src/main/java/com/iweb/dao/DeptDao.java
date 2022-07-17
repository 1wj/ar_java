package com.iweb.dao;

import com.iweb.model.Dept;

import java.util.List;

public interface DeptDao {
   Dept findDeptById(Integer id);

    List<Dept> findDepts();
}
