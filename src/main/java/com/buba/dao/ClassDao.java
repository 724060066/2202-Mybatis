package com.buba.dao;

import com.buba.pojo.Classes;

import java.util.List;

public interface ClassDao {

    /**
     * 查询班级列表
     * @return
     */
    List<Classes> listClass();

    /**
     * 查询所有班级和学生
     * @return
     */
    List<Classes> listClassAndStudent();
}
