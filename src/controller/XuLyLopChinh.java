/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.GiaoVien;
import model.LopChinh;
import model.SinhVien;

/**
 *
 * @author DELL
 */
public class XuLyLopChinh {
    public static void fakeData() {
        themLopChinh();
        themLopChinh();
        themLopChinh();
        fakeDataThayDoiGiaoVien();
        fakeDataThemSinhVien();
    }
    
    public static void fakeDataThayDoiGiaoVien() {
        
        thayDoiGiaoVien(LopChinh.getLopChinh("LC0"), "GV0");
        thayDoiGiaoVien(LopChinh.getLopChinh("LC1"), "GV1");
        thayDoiGiaoVien(LopChinh.getLopChinh("LC2"), "GV2");
    }
    
    public static void fakeDataThemSinhVien() {
        themSinhVien(LopChinh.getLopChinh("LC0"), "SV0");
        themSinhVien(LopChinh.getLopChinh("LC0"), "SV1");
        themSinhVien(LopChinh.getLopChinh("LC1"), "SV1");
        themSinhVien(LopChinh.getLopChinh("LC1"), "SV2");
        themSinhVien(LopChinh.getLopChinh("LC2"), "SV2");
        themSinhVien(LopChinh.getLopChinh("LC2"), "SV0");
       
    }

    public static void themLopChinh() {
        new LopChinh();
    }

    public static void thayDoiGiaoVien(LopChinh lopChinh, String maGiaoVien) {
        lopChinh.setGiaoVien(GiaoVien.getGiaoVien(maGiaoVien));
        GiaoVien.getGiaoVien(maGiaoVien).themLopChinh(lopChinh);
    }
    
    public static void themSinhVien(LopChinh lopChinh, String maSinhVien) {
        lopChinh.themSinhVien(maSinhVien);
        SinhVien.getSinhVien(maSinhVien).thayDoiLopChinh(lopChinh);
    }
    
    public static void xoaSinhVien(LopChinh lopChinh, String maSinhVien) {
        
    }
}
