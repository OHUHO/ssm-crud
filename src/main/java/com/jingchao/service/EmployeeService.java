package com.jingchao.service;

import com.github.pagehelper.PageInfo;
import com.jingchao.pojo.Emp;

public interface EmployeeService {

    /**
     * 获取员工的分页信息
     *
     * @param pageNum
     * @return
     */
    PageInfo<Emp> getEmployeePage(Integer pageNum);

    /**
     * 保存新员工
     * @param emp
     */
    void addNewEmployee(Emp emp);

    /**
     * 修改用户信息
     */
    void updateEmployee(Emp emp);

    /**
     * 根据员工id删除员工
     * @param id
     */
    void deleteEmployeeById(Integer id);
}
