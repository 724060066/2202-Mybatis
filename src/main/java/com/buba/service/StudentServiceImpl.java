package com.buba.service;

import com.buba.dao.StudentDao;
import com.buba.pojo.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenrui
 * @version 1.0
 * @description: TODO
 * @date 2022/9/12 09:41
 */
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDao studentDao;

    /**
     * 查询学生列表
     * @param studentCode
     * @param studentName
     * @param sex
     * @return
     */
    @Override
    public List<Students> listStudent(String studentCode, String studentName, String sex) {
        return studentDao.listStudent(studentCode, studentName, sex);
    }

    /**
     * 添加学生信息
     * @param students
     */
    @Override
    public void insertStudent(Students students) {
        studentDao.insertStudent(students);
    }

    /**
     * 根据班级id取得学生信息列表
     * @param cId
     * @return
     */
    @Override
    public List<Students> listStudentByClassId(String cId) {
        return studentDao.listStudentByClassId(cId);
    }

    /**
     * 根据id取得学生信息
     * @param sId
     * @return
     */
    @Override
    public Students getStudentById(String sId) {
        return studentDao.getStudentById(sId);
    }

    /**
     * 根据id修改学生信息
     * @param students
     */
    @Override
    public void updateStudentById(Students students) {
        studentDao.updateStudentById(students);
    }

    /**
     * 根据id删除学生
     * @param sId
     */
    @Override
    public void removeStudentById(String sId) {
        studentDao.removeStudentById(sId);
    }
}
