package com.jingchao.controller;


import com.jingchao.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/all/department")
    @ResponseBody
    public List<Map<String, Object>> getAllDepartment(){
        List<Map<String, Object>> list = departmentService.getAllDepartment();
        return list;
    }
}
