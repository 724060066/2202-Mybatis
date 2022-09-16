package com.buba.dao;

import com.buba.pojo.Students;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {

    /**
     * 查询学生列表
     * @param studentCode
     * @param studentName
     * @param sex
     * @return
     */
    List<Students> listStudent(@Param("stCode") String studentCode, @Param("stName") String studentName, @Param("sex") String sex);

    /**
     * 根据班级id取得学生信息列表
     * @param cId
     * @return
     */
    List<Students> listStudentByClassId(String cId);
}
