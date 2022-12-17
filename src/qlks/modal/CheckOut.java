/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.modal;

/**
 *
 * @author Admin
 */
public class CheckOut {

    private int ID;
    private String Name;
    private String Addr;
    private String phone;
    private String gender;
    private String room;

    public CheckOut() {
    }

    public CheckOut(int ID, String Name, String Addr, String phone, String gender, String room) {
        this.ID = ID;
        this.Name = Name;
        this.Addr = Addr;
        this.phone = phone;
        this.gender = gender;
        this.room = room;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddr() {
        return Addr;
    }

    public void setAddr(String Addr) {
        this.Addr = Addr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    
}
