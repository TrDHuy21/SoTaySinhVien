/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.LinkedHashMap;


/**
 *
 * @author DELL
 */
public class LopChinh {
    public static int dem = 0;
    public static LinkedHashMap<String, LopChinh> dsLopChinh = new LinkedHashMap<>();
    private String ma;
    private GiaoVien giaoVien;
    private LinkedHashMap<String, SinhVien> dsSinhVien = new LinkedHashMap<>();

    public LopChinh() {
        ma  = "LC" + dem;
        
        LopChinh lopChinh = this;
        LopChinh.dsLopChinh.put(ma, this);
        dem++;
    }

    public LopChinh(GiaoVien giaoVien) {
        this.giaoVien = giaoVien;
    }

    public LopChinh(GiaoVien giaoVien, LinkedHashMap<String, SinhVien> dsSinhVien) {
        ma  = "LC" + dem;
         
        this.giaoVien = giaoVien;
        this.dsSinhVien = dsSinhVien;
        
        LopChinh lopChinh = this;
        LopChinh.dsLopChinh.put(ma, this);
        dem++;
    }

    public String getMa() {
        return ma;
    }

    public GiaoVien getGiaoVien() {
        return giaoVien;
    }

    public LinkedHashMap<String, SinhVien> getDsSinhVien() {
        return dsSinhVien;
    }

    public void setGiaoVien(GiaoVien giaoVien) {
        this.giaoVien = giaoVien;
    }   
    public void thayDoiGiaoVien(String maGiaoVien) {
        this.giaoVien = GiaoVien.getGiaoVien(maGiaoVien);
    }
    
    public void themSinhVien(String maSinhVien) {
        this.dsSinhVien.put(maSinhVien, SinhVien.getSinhVien(maSinhVien));
    }
    public void themSinhVien(SinhVien sinhVien) {
        this.dsSinhVien.put(sinhVien.getMa(), sinhVien);
    }
    public void xoaSinhVien(String maSinhVien) {
        this.dsSinhVien.remove(maSinhVien);
    }
    
    public void xoaSinhVien(SinhVien sinhVien) {
        this.dsSinhVien.remove(sinhVien.getMa());
    }
    
    public static LopChinh getLopChinh(String maLopChinh) {
        return dsLopChinh.get(maLopChinh);
    }
}
