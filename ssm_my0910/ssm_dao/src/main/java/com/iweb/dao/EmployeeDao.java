package com.iweb.dao;

import com.iweb.model.Employee;
import com.iweb.model.User;

import java.util.List;
import java.util.Map;

public interface EmployeeDao {
    List<Employee> selectByPage(Map<String, Object> mapselect);

    int count(Map<String, Object> mapselect);

    Employee findEmployeeById(Integer id);

    int deleteEmployee(Integer id);

    int addEmployee(Employee employee);
}
