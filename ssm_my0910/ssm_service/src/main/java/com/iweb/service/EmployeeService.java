package com.iweb.service;

import com.iweb.model.*;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    List<Employee> findEmployee(Map<String, Object> mapselect, PageModel pageModel);

    List<Job> findJobs();

    List<Dept> findDepts();

    Employee findEmployeeById(Integer id);

    int deleteEmployee(Integer id);

    void addEmployee(Employee employee);
}
