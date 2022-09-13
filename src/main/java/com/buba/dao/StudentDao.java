package com.buba.dao;

import com.buba.pojo.Students;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {

    List<Students> listStudent(@Param("stCode") String studentCode, @Param("stName") String studentName, @Param("sex") String sex);
}
