/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.modal;

/**
 *
 * @author Admin
 */
public class User {
    private int id;
    private String name;
    private String Address;
    private String phone;
    private  String gioiTinh;
    private  String room;

    public User() {
    }

    public User(int id, String name, String Address, String phone, String gioiTinh, String room) {
        this.id = id;
        this.name = name;
        this.Address = Address;
        this.phone = phone;
        this.gioiTinh = gioiTinh;
        this.room = room;
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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    
    
}
