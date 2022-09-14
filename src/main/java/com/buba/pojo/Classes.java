package com.buba.pojo;

import java.util.List;

public class Classes {

  private long id;
  private String className;
  private java.sql.Date createDate;

  private List<Students> studentsList;

  public List<Students> getStudentsList() {
    return studentsList;
  }

  public void setStudentsList(List<Students> studentsList) {
    this.studentsList = studentsList;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }


  public java.sql.Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(java.sql.Date createDate) {
    this.createDate = createDate;
  }

}
