package com.huangtan666.service.impl;

import com.huangtan666.domain.Student;
import com.huangtan666.service.StudentService;

/**
 * 服务提供者，这里提供的业务直接给消费者调用，并且实现的接口已经保存至本地，001-student-api
 * 模拟提供的服务是一个查询学生的业务
 * 注意：这里不使用@Service，因为@Service是spring的注解，我们现在使用的是dubbo框架
 */
public class StudentServiceImpl implements StudentService {
    @Override
    public Student queryStudentById(Integer id) {
        //直接创建公共接口的实体类对象
        Student student = new Student();
        //属性赋值
        student.setId(id);
        student.setName("zhangsan");
        student.setAge("23");
        return student;
    }
}
