/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.modal;

/**
 *
 * @author Admin
 */
public class AllRoom {
    private String MaPhong;
    private String TinhTrang;
    private String CleanStatus;
    private String bedType;
    private String Gia ;

    public AllRoom() {
    }

    public AllRoom(String MaPhong, String TinhTrang, String CleanStatus, String bedType, String Gia) {
        this.MaPhong = MaPhong;
        this.TinhTrang = TinhTrang;
        this.CleanStatus = CleanStatus;
        this.bedType = bedType;
        this.Gia = Gia;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public String getCleanStatus() {
        return CleanStatus;
    }

    public void setCleanStatus(String CleanStatus) {
        this.CleanStatus = CleanStatus;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String Gia) {
        this.Gia = Gia;
    }
    
    
}
