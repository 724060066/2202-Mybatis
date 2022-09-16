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
     * 根据班级id取得学生信息列表
     * @param cId
     * @return
     */
    @Override
    public List<Students> listStudentByClassId(String cId) {
        return studentDao.listStudentByClassId(cId);
    }
}
