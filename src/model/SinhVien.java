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
public class SinhVien {
    public static LinkedHashMap<String, SinhVien> dsSV = new LinkedHashMap<>();
    public static int dem = 0;
    
    private String ma;
    private String matKhau;
    private String ten;
    private String gioitinh;
    private String que;
    private Date ngaySinh;
    private String sdt;
    private String email;
    private String cmnd;
    private LopChinh lopChinh;
    private LinkedHashMap<String, LopMonHoc> dsLMH = new LinkedHashMap<>();

    public SinhVien() {
    }

    public SinhVien(String ten, String gioitinh, String que, Date ngaySinh, String sdt, String email, String cmnd, LopChinh lopChinh) {
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.que = que;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.email = email;
        this.cmnd = cmnd;
        this.lopChinh = lopChinh;
        this.ma = "sv" + dem++;
        SinhVien s = this;
        SinhVien.dsSV.put(ma, s);
    }

    public static LinkedHashMap<String, SinhVien> getDsSV() {
        return dsSV;
    }

    public static int getDem() {
        return dem;
    }

    public String getMa() {
        return ma;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public String getTen() {
        return ten;
    }

    public String getGioitinh() {
        return gioitinh;
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

    public LopChinh getLopChinh() {
        return lopChinh;
    }

    public LinkedHashMap<String, LopMonHoc> getDsLMH() {
        return dsLMH;
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.ma);
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
        final SinhVien other = (SinhVien) obj;
        return Objects.equals(this.cmnd, other.cmnd);
    }
}
