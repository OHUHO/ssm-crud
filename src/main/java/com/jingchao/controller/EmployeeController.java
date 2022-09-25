package com.jingchao.controller;


import com.github.pagehelper.PageInfo;
import com.jingchao.pojo.Emp;
import com.jingchao.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/employee/page/{pageNum}")
    public String getEmployeePage(@PathVariable("pageNum") Integer pageNum, Model model){
        PageInfo<Emp> page = employeeService.getEmployeePage(pageNum);
        model.addAttribute("page", page);
        System.out.println(page);
        return "employee";
    }

    @PostMapping("/employee")
    public String addNewEmployee(@RequestBody Emp emp){
        employeeService.addNewEmployee(emp);
        return "redirect:/employee/page/1";
    }

}
