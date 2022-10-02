package com.jingchao.mapper;

import com.jingchao.entity.Employee;
import com.jingchao.pojo.Emp;
import org.apache.ibatis.annotations.Param;


import java.util.List;
import java.util.Map;

public interface EmployeeMapper {

    /**
     * 获取所有员工信息
     * @return
     */
    // List<Map<String, Object>> getAllEmployeeOne();
    List<Emp> getAllEmployee();

    /**
     * 添加新员工
     * @param emp
     */
    void addNewEmployee(Emp emp);

    /**
     * 更新员工信息
     * @param emp
     */
    void updateEmployee(Emp emp);

    /**
     * 根据员工id删除
     * @param id
     */
    void deleteEmployeeById(@Param("id") Integer id);

    /**
     * 批量删除员工
     * @param ids
     */
    void batchDeleteEmployee(@Param("ids") List<Integer> ids);
}