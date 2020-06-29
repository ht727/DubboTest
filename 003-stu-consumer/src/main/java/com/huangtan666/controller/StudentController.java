package com.huangtan666.controller;

import com.huangtan666.domain.Student;
import com.huangtan666.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 消费者，需要调用服务提供者查询学生的服务
 */
@Controller
public class StudentController {
    /**
     * 使用spring框架给属性赋值，但是spring中没有使用@Service，表示spring中没有这个对象，
     * 但是服务提供者拥有这个对象，并且将这个对象通过RPC传输给消费者，dubbo是强依赖于spring就是这么来的
     */
    @Autowired
    private StudentService studentService;

    @RequestMapping("/stu.action")
    public String queryStudentById(Integer id, Model model){
        //调用业务方法（消费服务）
        Student student = studentService.queryStudentById(id);

        //将查询结果保存到request中
        model.addAttribute("student",student);

        //请求转发
        return "stu";
    }
}
