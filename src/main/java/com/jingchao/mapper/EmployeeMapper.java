package com.jingchao.mapper;

import com.jingchao.entity.Employee;
import com.jingchao.pojo.Emp;


import java.util.List;
import java.util.Map;

public interface EmployeeMapper {

    /**
     * 获取所有员工信息
     * @return
     */
    // List<Map<String, Object>> getAllEmployeeOne();
    List<Emp> getAllEmployee();

}