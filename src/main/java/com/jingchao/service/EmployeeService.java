package com.jingchao.service;

import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface EmployeeService {

    /**
     * 获取员工的分页信息
     *
     * @param pageNum
     * @return
     */
    PageInfo<Map<String, Object>> getEmployeePage(Integer pageNum);


}
