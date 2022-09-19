package com.buba.controller;

import com.buba.pojo.Classes;
import com.buba.pojo.Students;
import com.buba.service.ClassService;
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

    @Autowired
    private ClassService classService;

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
     * 初始化添加页面
     * @param model
     * @return
     */
    @RequestMapping("/getClassForInsert")
    public String getClassForInsert(Model model) {
        List<Classes> classesList = classService.listClass();
        model.addAttribute("classesList", classesList);
        return "studentsadd";
    }

    /**
     * 添加学生信息
     * @param students
     * @return
     */
    @RequestMapping("/insertStudent")
    public String insertStudent(Students students) {
        studentService.insertStudent(students);
        return "redirect:/student/listStudent";
    }

    /**
     * 初始化修改页面
     * @param model
     * @param sId
     * @return
     */
    @RequestMapping("/getClassForUpdate")
    public String getClassForUpdate(Model model, String sId) {
        Students student = studentService.getStudentById(sId);
        model.addAttribute("student", student);

        List<Classes> classesList = classService.listClass();
        model.addAttribute("classesList", classesList);
        return "studentsupdate";
    }

    /**
     * 根据id修改学生信息
     * @param students
     * @return
     */
    @RequestMapping("/updateStudentById")
    public String updateStudentById(Students students) {
        studentService.updateStudentById(students);
        return "redirect:/student/listStudent";
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
