package com.buba.service;

import com.buba.pojo.Students;

import java.util.List;

public interface StudentService {

    /**
     * 查询学生列表
     * @param studentCode
     * @param studentName
     * @param sex
     * @return
     */
    List<Students> listStudent(String studentCode, String studentName, String sex);

    /**
     * 添加学生信息
     * @param students
     */
    void insertStudent(Students students);

    /**
     * 根据班级id取得学生信息列表
     * @param cId
     * @return
     */
    List<Students> listStudentByClassId(String cId);

    /**
     * 根据id取得学生信息
     * @param sId
     * @return
     */
    Students getStudentById(String sId);

    /**
     * 根据id修改学生信息
     * @param students
     */
    void updateStudentById(Students students);

    /**
     * 根据id删除学生
     * @param sId
     */
    void removeStudentById(String sId);
}
