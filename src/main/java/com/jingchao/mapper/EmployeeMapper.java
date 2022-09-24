package com.jingchao.mapper;

import com.jingchao.entity.Employee;


import java.util.List;
import java.util.Map;

public interface EmployeeMapper {

    /**
     * 获取所有员工信息
     * @return
     */
    List<Map<String, Object>> getAllEmployee();

}