package com.jingchao.service.impl;

import com.jingchao.mapper.DepartmentMapper;
import com.jingchao.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Map<String, Object>> getAllDepartment() {
        List<Map<String, Object>> list = departmentMapper.getAllDepartment();
        return list;
    }
}
