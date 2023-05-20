/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Date;
import model.SinhVien;

/**
 *
 * @author DELL
 */
public class XuLySinhVien {
    public static void fakeData() {
        SinhVien.fakeData();
    }
    public static void HienThiDsSV() {
        SinhVien.dsSinhVien.entrySet().forEach(e -> {
            System.out.println(e.getValue());
        });
            
    }
    public static void ThemGiaoVien(String ten, String que, Date ngaySinh, String sdt, String email, String cmnd) {
        if (SinhVien.dsSinhVien.entrySet().stream().anyMatch(gv -> {
            return gv.getValue().getCmnd().equals(cmnd);
        })) {
            throw new IllegalArgumentException("Da co sinh vien nay");
        }
        new SinhVien(ten, que, ngaySinh, sdt, email, cmnd);
    }
    
    public static void thayDoiLopChinhChoSV(String maLopChinh) {
        
    }
}
