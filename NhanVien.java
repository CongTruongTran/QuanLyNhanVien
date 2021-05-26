/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class NhanVien {
    private  String MaNV, TenNV,Gtinh,Tuoi,SDT,Luong;

    public NhanVien() {
    }

    public NhanVien(String MaNV, String TenNV, String Gtinh, String Tuoi, String SDT, String Luong) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.Gtinh = Gtinh;
        this.Tuoi = Tuoi;
        this.SDT = SDT;
        this.Luong = Luong;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getGtinh() {
        return Gtinh;
    }

    public void setGtinh(String Gtinh) {
        this.Gtinh = Gtinh;
    }

    public String getTuoi() {
        return Tuoi;
    }

    public void setTuoi(String Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getLuong() {
        return Luong;
    }

    public void setLuong(String Luong) {
        this.Luong = Luong;
    }
    
}