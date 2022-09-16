package com.buba.controller;

import com.buba.pojo.Students;
import com.buba.service.StudentService;
import com.buba.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author chenrui
 * @version 1.0
 * @description: TODO
 * @date 2022/9/12 09:38
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * 查询学生列表
     * @param model
     * @param studentCode
     * @param studentName
     * @param sex
     * @return
     */
    @RequestMapping("/listStudent")
    public String listStudent(Model model, String studentCode,
                              String studentName, String sex) {
        List<Students> studentsList = studentService.listStudent(studentCode, studentName, sex);

        model.addAttribute("studentsList", studentsList);

        return "studentslist";
    }

    /**
     * 根据班级id取得学生信息列表
     * @param model
     * @param cId
     * @return
     */
    @RequestMapping("/listStudentByClassId")
    public String listStudentByClassId(Model model, String cId, String cName) {

        List<Students> studentsList = studentService.listStudentByClassId(cId);

        model.addAttribute("studentsList", studentsList);
        model.addAttribute("cName", cName);

        return "studentslist1";
    }
}
