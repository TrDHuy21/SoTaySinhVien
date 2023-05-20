/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Date;
import model.GiaoVien;

/**
 *
 * @author DELL
 */
public class XuLyGiaoVien {
    public static void ThemGiaoVien(String ten, String que, Date ngaySinh, String sdt, String email, String cmnd) {
        if (GiaoVien.dsGiaoVien.entrySet().stream().anyMatch(gv -> {
            return gv.getValue().getCmnd().equals(cmnd);
        })) {
            throw new IllegalArgumentException("Da co giao vien nay");
        }
        new GiaoVien(ten, que, ngaySinh, sdt, email, cmnd);
    }
    
    public static void themLopChinhChoGV() {
        
    }
    
    public static void xoaLopChinhChoGV() {
        
    }
}
