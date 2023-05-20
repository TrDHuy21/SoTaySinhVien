/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;


/**
 *
 * @author DELL
 */
public class LopChinh {
    public static int dem = 0;
    public static HashMap<String, LopChinh> dsLopChinh;
    private String ma;
    private GiaoVien giaoVien;
    private HashMap<String, SinhVien> dsSinhVien;

    public LopChinh() {
        ma  = "LC" + dem;
        
        LopChinh lopChinh = this;
        LopChinh.dsLopChinh.put(ma, this);
        dem++;
    }

    public LopChinh(GiaoVien giaoVien, HashMap<String, SinhVien> dsSinhVien) {
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

    public HashMap<String, SinhVien> getDsSinhVien() {
        return dsSinhVien;
    }

    public void setGiaoVien(GiaoVien giaoVien) {
        this.giaoVien = giaoVien;
    }   
}
