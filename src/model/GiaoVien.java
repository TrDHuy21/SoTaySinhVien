/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.LinkedHashMap;

/**
 *
 * @author DELL
 */
public class GiaoVien {
    public static GiaoVien User;
    public static int dem = 0;
    public static LinkedHashMap<String, GiaoVien> dsGiaoVien = new LinkedHashMap();
    
    private String ma;
    private String ten;
    private String que;
    private Date ngaySinh;
    private String sdt;
    private String email;
    private String cmnd;
    private String matKhau;
    
    private LinkedHashMap<String, LopChinh> dsLopChinh = new LinkedHashMap<>();
    private LinkedHashMap<String, LopMonHoc> dsLopMonHoc = new LinkedHashMap<>();
    
    public GiaoVien(String ten, String que, Date ngaySinh, String sdt, String email, String cmnd) {
        this.ma = "GV" + dem;
        this.ten = ten;
        this.que = que;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.email = email;
        this.cmnd = cmnd;
        this.matKhau = ma;
        
        GiaoVien giaoVien = this;
        GiaoVien.dsGiaoVien.put(ma, giaoVien);
        dem++;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getQue() {
        return que;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public String getSdt() {
        return sdt;
    }

    public String getEmail() {
        return email;
    }

    public String getCmnd() {
        return cmnd;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public LinkedHashMap<String, LopChinh> getDsLopChinh() {
        return dsLopChinh;
    }

    public LinkedHashMap<String, LopMonHoc> getDsLopMonHoc() {
        return dsLopMonHoc;
    }
    
    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    
    public void themLopChinh(String maLopChinh) {
        this.dsLopChinh.put(maLopChinh, LopChinh.getLopChinh(maLopChinh));
    }
    public void themLopChinh(LopChinh lopChinh) {
        this.dsLopChinh.put(lopChinh.getMa(), lopChinh);
    }
     public void xoaLopChinh(String maLopChinh) {
        this.dsLopChinh.remove(maLopChinh);
    }
    public void xoaLopChinh(LopChinh lopChinh) {
        this.dsLopChinh.remove(lopChinh.getMa());
    }
    public static GiaoVien getGiaoVien(String maGiaoVien) {
        return dsGiaoVien.get(maGiaoVien);
    }
}
