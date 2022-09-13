package com.buba.pojo;


public class Students {

  private Integer id;
  private String studentCode;
  private String studentName;
  private Integer age;
  private String sex;
  private String phone;
  private Integer classId;
  private Integer danganId;

  private Dangan dangan;

  private Classes classes;

  public Classes getClasses() {
    return classes;
  }

  public void setClasses(Classes classes) {
    this.classes = classes;
  }

  public Dangan getDangan() {
    return dangan;
  }

  public void setDangan(Dangan dangan) {
    this.dangan = dangan;
  }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getDanganId() {
        return danganId;
    }

    public void setDanganId(Integer danganId) {
        this.danganId = danganId;
    }

    public String getStudentCode() {
    return studentCode;
  }

  public void setStudentCode(String studentCode) {
    this.studentCode = studentCode;
  }

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

}
