package com.jingchao.service;

import com.github.pagehelper.PageInfo;
import com.jingchao.pojo.Emp;

public interface EmployeeService {

    /**
     * 获取员工的分页信息
     * @param pageNum
     * @return
     */
    PageInfo<Emp> getEmployeePage(Integer pageNum);
}
