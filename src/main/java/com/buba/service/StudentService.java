package com.buba.service;

import com.buba.pojo.Students;

import java.util.List;

public interface StudentService {

    List<Students> listStudent(String studentCode, String studentName, String sex);
}
