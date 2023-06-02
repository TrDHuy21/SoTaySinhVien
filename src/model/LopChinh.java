/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;


/**
 *
 * @author DELL
 */
public class LopChinh {
    public static int dem = 0;
    public static LinkedHashMap<String, LopChinh> dsLC = new LinkedHashMap<>();
    private String ma;
    private String ten;
    private GiaoVien gv;
    private Nganh n; 
    private LinkedHashMap<String, SinhVien> dsSV = new LinkedHashMap<>();

    public LopChinh() {
    }
    

    public LopChinh(GiaoVien gv, Nganh n) {
        this.ten = n.getTen() + n.getSoLop();
        this.gv = gv;
        this.n = n;
        this.ma = n.getMa() + n.getSoLop();
        n.setSoLop(n.getSoLop()+1);
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public GiaoVien getGv() {
        return gv;
    }

    public Nganh getN() {
        return n;
    }

    public LinkedHashMap<String, SinhVien> getDsSV() {
        return dsSV;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGv(GiaoVien gv) {
        this.gv = gv;
    }

    public void setN(Nganh n) {
        this.n = n;
    }

    public void setDsSV(LinkedHashMap<String, SinhVien> dsSV) {
        this.dsSV = dsSV;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.ma);
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
        final LopChinh other = (LopChinh) obj;
        return Objects.equals(this.ma, other.ma);
    } 
}
