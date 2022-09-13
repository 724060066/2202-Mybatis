package com.buba.pojo;


public class Dangan {

  private long id;
  private String shichangbu;
  private String jiguan;
  private String minzu;
  private String jianhuren;
  private String phone;

  private Students students;

  public Students getStudents() {
    return students;
  }

  public void setStudents(Students students) {
    this.students = students;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getShichangbu() {
    return shichangbu;
  }

  public void setShichangbu(String shichangbu) {
    this.shichangbu = shichangbu;
  }


  public String getJiguan() {
    return jiguan;
  }

  public void setJiguan(String jiguan) {
    this.jiguan = jiguan;
  }


  public String getMinzu() {
    return minzu;
  }

  public void setMinzu(String minzu) {
    this.minzu = minzu;
  }


  public String getJianhuren() {
    return jianhuren;
  }

  public void setJianhuren(String jianhuren) {
    this.jianhuren = jianhuren;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

}
