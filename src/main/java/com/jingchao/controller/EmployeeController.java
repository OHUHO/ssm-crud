package com.jingchao.controller;


import com.github.pagehelper.PageInfo;
import com.jingchao.pojo.Emp;
import com.jingchao.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/employee/page/{pageNum}")
    @ResponseBody
    public PageInfo<Emp> getEmployeePage(@PathVariable("pageNum") Integer pageNum){
        PageInfo<Emp> pageInfo = employeeService.getEmployeePage(pageNum);
        // System.out.println(pageInfo);
        return pageInfo;
    }
    /* public String getEmployeePage(@PathVariable("pageNum") Integer pageNum, Model model){
        PageInfo<Emp> page = employeeService.getEmployeePage(pageNum);
        model.addAttribute("page", page);
        System.out.println(page);
        return "employee";
    } */

    @PostMapping("/employee")
    public String addNewEmployee(@RequestBody Emp emp){
        employeeService.addNewEmployee(emp);
        return "redirect:/employee/page/1";
    }

}
