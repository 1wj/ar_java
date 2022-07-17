package com.iweb.controller;


import com.iweb.model.*;
import com.iweb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class EmployeeController {

    @Autowired()
    @Qualifier("employeeServiceImpl")
    private EmployeeService employeeService;

    @RequestMapping("/selectEmployee")
    public String selectEmployee(String pageIndex, String likevalue,
                                 String selectjob_id, String selectdept_id,
                                 String selectsex, Model model){
        PageModel pageModel=new PageModel();
        pageModel.setPageIndex(pageIndex!=null?Integer.valueOf(pageIndex):1);
        /*
            封装查询条件
         */
        Map<String ,Object> mapselect =new HashMap<>();
        mapselect.put("likevalue",likevalue);
        mapselect.put("selectjob_id",selectjob_id);
        mapselect.put("selectdept_id",selectdept_id);
        mapselect.put("selectsex",selectsex);

        /*
            查询员工信息
         */
        List<Employee> employees=employeeService.findEmployee(mapselect,pageModel);
        /*
            查询职位下拉框
         */
        List<Job> selectjobs=employeeService.findJobs();
        /*
            查询部门下拉框
         */
        List<Dept> selectdepts=employeeService.findDepts();

        model.addAttribute("employees",employees);
        model.addAttribute("pageModel",pageModel);
        model.addAttribute("likevalue",likevalue);
        model.addAttribute("selectjob_id",selectjob_id);
        model.addAttribute("selectdept_id",selectdept_id);
        model.addAttribute("selectsex",selectsex);

        model.addAttribute("selectjobs",selectjobs);
        model.addAttribute("selectdepts",selectdepts);
        return "employee/employee";
    }


    @RequestMapping("/toUpdateEmployee")
    public ModelAndView updateUser(Integer id, ModelAndView mv){
        Employee employee=employeeService.findEmployeeById(id);
        mv.addObject("employee",employee);
        mv.setViewName("employee/addOrUpdateEmployee");
        return mv;

    }

    /*@RequestMapping("/updateUser")
    public ModelAndView updateUser(@ModelAttribute User user, ModelAndView mv){
        employeeService.updateUser(user);
        mv.setViewName("forward:/selectUser?pageIndex=1&likevalue=");
        return mv;

    }*/


    @RequestMapping("/deleteEmployee")
    public ModelAndView deleteUser(Integer id, ModelAndView mv){
            int i=employeeService.deleteEmployee(id);
            if(i!=0){
                System.out.println("员工删除成功");
            }
        mv.setViewName("forward:/selectEmployee?pageIndex=1&likevalue=");
        return mv;

    }

    @RequestMapping("/addEmployee")
    public ModelAndView addUser(@ModelAttribute Employee employee, ModelAndView mv){
        employeeService.addEmployee(employee);
        mv.setViewName("forward:/selectEmployee?pageIndex=1&likevalue=");
        return mv;

    }
    @RequestMapping("/toAddEmployee")
    public String toAddEmployee(Model model){
        List<Job> selectjobs=employeeService.findJobs();
        List<Dept> selectdepts=employeeService.findDepts();
        model.addAttribute("selectjobs",selectjobs);
        model.addAttribute("selectdepts",selectdepts);
        return "employee/addOrUpdateEmployee";

    }

}
