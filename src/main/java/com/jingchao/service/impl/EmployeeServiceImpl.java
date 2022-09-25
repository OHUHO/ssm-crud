package com.jingchao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jingchao.mapper.EmployeeMapper;
import com.jingchao.pojo.Emp;
import com.jingchao.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    /* public PageInfo<Map<String, Object>> getEmployeePage(Integer pageNum) {
        // 开启分页功能
        PageHelper.startPage(pageNum,12);
        // 查询所有员工
        List<Map<String, Object>> list = employeeMapper.getAllEmployeeOne();
        // 获取分页相关数据
        PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(list, 5);
        return pageInfo;
    } */

    public PageInfo<Emp> getEmployeePage(Integer pageNum) {
        // 开启分页功能
        PageHelper.startPage(pageNum,12);
        // 查询所有员工
        List<Emp> list =  employeeMapper.getAllEmployeeTwo();
        // 获取分页相关数据
        PageInfo<Emp> pageInfo = new PageInfo<>(list, 5);
        return pageInfo;
    }
}
