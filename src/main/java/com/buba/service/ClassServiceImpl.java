package com.buba.service;

import com.buba.dao.ClassDao;
import com.buba.pojo.Classes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenrui
 * @version 1.0
 * @description: TODO
 * @date 2022/9/15 08:32
 */
@Service
public class ClassServiceImpl implements ClassService{

    @Autowired
    ClassDao classDao;

    /**
     * 查询班级列表
     * @return
     */
    @Override
    public List<Classes> listClass() {
        return classDao.listClass();
    }

    /**
     * 查询所有班级和学生
     * @return
     */
    @Override
    public List<Classes> listClassAndStudent() {
        return classDao.listClassAndStudent();
    }
}
