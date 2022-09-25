package com.jingchao.mapper;

import com.jingchao.entity.Department;

import java.util.List;
import java.util.Map;

public interface DepartmentMapper {

    /**
     * 获取所有的部门
     * @return
     */
    List<Map<String, Object>> getAllDepartment();

}