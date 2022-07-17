package com.iweb.service;

import com.iweb.dao.DeptDao;
import com.iweb.dao.EmployeeDao;
import com.iweb.dao.JobDao;
import com.iweb.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("employeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private JobDao jobDao;
    @Autowired
    private DeptDao deptDao;


    @Override
    public List<Employee> findEmployee(Map<String, Object> mapselect, PageModel pageModel) {
        //查询总记录数
        int recordCount=employeeDao.count(mapselect);
        pageModel.setRecodeCount(recordCount);
        //开始分页查询数据：查询第几页的数据
        mapselect.put("pageIndex",pageModel.getPageIndex());
        mapselect.put("pageSize",pageModel.getPageSize());
       List<Employee> employees=employeeDao.selectByPage(mapselect);
       pageModel.setTotalSize();
       return employees;

    }

    @Override
    public List<Job> findJobs() {
        List<Job> jobs=jobDao.findJobs();
        return jobs;
    }

    @Override
    public List<Dept> findDepts() {
        List<Dept> depts=deptDao.findDepts();
        return depts;
    }

    @Override
    public Employee findEmployeeById(Integer id) {
        return employeeDao.findEmployeeById(id);
    }

    @Override
    public int deleteEmployee(Integer id) {
       int i=employeeDao.deleteEmployee(id);
       return i;
    }

    @Override
    public void addEmployee(Employee employee) {
       int i=employeeDao.addEmployee(employee);
    }
}
