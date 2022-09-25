package com.jingchao.service;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    /**
     * 获取所有的部门信息
     * @return
     */
    List<Map<String, Object>> getAllDepartment();
}
