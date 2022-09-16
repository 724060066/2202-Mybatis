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
     * 根据班级id取得学生信息列表
     * @param cId
     * @return
     */
    List<Students> listStudentByClassId(String cId);
}
