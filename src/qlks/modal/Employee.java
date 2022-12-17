/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.modal;

/**
 *
 * @author Admin
 */
public class Employee {

    private int id;
    private String name;
    private String Age;
    private String gender;
    private String job;
    private String luong;
    private String phone;
    private String DiaChi;

    public Employee() {
    }

    public Employee(int id, String name, String Age, String gender, String job, String luong, String phone, String DiaChi) {
        this.id = id;
        this.name = name;
        this.Age = Age;
        this.gender = gender;
        this.job = job;
        this.luong = luong;
        this.phone = phone;
        this.DiaChi = DiaChi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    
    

}
