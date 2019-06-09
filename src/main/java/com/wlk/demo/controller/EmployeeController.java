package com.wlk.demo.controller;

import com.wlk.demo.dao.DepartmentDao;
import com.wlk.demo.dao.EmployeeDao;
import com.wlk.demo.pojo.Department;
import com.wlk.demo.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import javax.websocket.server.PathParam;
import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;

    @GetMapping(value = "/emps")
    public String list(Model model){
        Collection<Employee> emps = employeeDao.getAll();
        model.addAttribute("emps" ,emps);
        return "emp/list";
    }


    // 来到员工添加的页面
    @GetMapping(value = "/emp")
    public String toAddPage(Model model){
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts" ,departments);
        return "/emp/add";
    }

     // 员工添加
    @PostMapping(value = "emp")
    public String addEmp(Employee employee){
        employeeDao.save(employee);
         // 来到员工列表页面
        // redirect:表示重定向到一个地址
        // forward：表示转发到一个地址
        return "redirect:/emps";
    }


    @GetMapping(value = "/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id , Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute("emp" , employee);
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts" ,departments);
        return "/emp/add";
    }

    @PutMapping(value = "/emp")
    public String updateEmply(Employee employee){
        employeeDao.save(employee);
        return "redirect:/emps";
    }


    @DeleteMapping(value = "/emp/{id}")
    public String deleteId(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/emps";
    }

}
