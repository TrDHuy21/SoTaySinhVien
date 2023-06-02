/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Objects;

/**
 *
 * @author DELL
 */
public class GiaoVien {
    public static int dem = 0;
    public static LinkedHashMap<String, GiaoVien> dsGV = new LinkedHashMap();
    
    private String ma;
    private String ten;
    private String que;
    private Date ngaySinh;
    private String sdt;
    private String email;
    private String cmnd;
    private String matKhau;

    private LinkedHashMap<String, LopChinh> dsLC = new LinkedHashMap<>();
    private LinkedHashMap<String, LopMonHoc> dsLMH = new LinkedHashMap<>(); 

    public GiaoVien(String ten, String que, Date ngaySinh, String sdt, String email, String cmnd) {
        this.ten = ten;
        this.que = que;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.email = email;
        this.cmnd = cmnd;
        
        this.ma = "gv" + dem++;
        GiaoVien g = this;
        GiaoVien.dsGV.put(this.ma, g);
    }

    public static LinkedHashMap<String, GiaoVien> getDsGV() {
        return dsGV;
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

    public LinkedHashMap<String, LopChinh> getDsLC() {
        return dsLC;
    }

    public LinkedHashMap<String, LopMonHoc> getDsLMH() {
        return dsLMH;
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

    public void setDsLC(LinkedHashMap<String, LopChinh> dsLC) {
        this.dsLC = dsLC;
    }

    public void setDsLMH(LinkedHashMap<String, LopMonHoc> dsLMH) {
        this.dsLMH = dsLMH;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.ma);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GiaoVien other = (GiaoVien) obj;
        return Objects.equals(this.cmnd, other.cmnd);
    }   
}
