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
    public static LinkedHashMap<String, SinhVien> dsSinhVien = new LinkedHashMap<>();
    public static int dem = 0;
    
    private String ma;
    private String ten;
    private String que;
    private Date ngaySinh;
    private String sdt;
    private String email;
    private String cmnd;
    private String matKhau;
    
    private LopChinh lopChinh;
 
    private LinkedHashMap<String, LopMonHoc> dsLopMonHoc = new LinkedHashMap<>();

    public SinhVien(String ten, String que, Date ngaySinh, String sdt, String email, String cmnd) {
        this.ma = "SV" + dem;
        this.ten = ten;
        this.que = que;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.email = email;
        this.cmnd = cmnd;
        this.matKhau = ma;
        
        SinhVien sinhVien = this;
        dsSinhVien.put(ma, sinhVien);
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

    public LopChinh getLopChinh() {
        return lopChinh;
    }

    public LinkedHashMap<String, LopMonHoc> getDsLopMonHoc() {
        return dsLopMonHoc;
    }

    public String getMatKhau() {
        return matKhau;
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

    public void setLopChinh(LopChinh lopChinh) {
        this.lopChinh = lopChinh;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    
    public void thayDoiLopChinh(String maLopChinh) {
        lopChinh = LopChinh.getLopChinh(maLopChinh);
    }
    
    public static SinhVien getSinhVien(String maSinhVien) {
        if (!dsSinhVien.containsKey(maSinhVien)) {
            throw new IllegalArgumentException("Khong co sinh vien nay");
        }
        return dsSinhVien.get(maSinhVien);
    }

    @Override
    public String toString() {
        return "SinhVien{" + "ma=" + ma + ", ten=" + ten + ", que=" + que + ", ngaySinh=" + ngaySinh + ", sdt=" + sdt + ", email=" + email + ", cmnd=" + cmnd + ", matKhau=" + matKhau + ", lopChinh=" + lopChinh + '}';
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.ma);
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
        return Objects.equals(this.ma, other.ma);
    }  
}
