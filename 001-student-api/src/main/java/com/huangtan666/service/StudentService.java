package com.huangtan666.service;

import com.huangtan666.domain.Student;

/**
 * 学生服务的公共接口,使用maven的install可以打包至本地maven仓库
 */
public interface StudentService {
    Student queryStudentById(Integer id);
}
