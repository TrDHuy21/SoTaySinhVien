/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author DELL
 */
public class LopMonHoc {
//    static int dem;
//    private String ma;
//    private MonHoc subject;
//    private GiaoVien giaoVien;
//    private HashSet<SinhVien> danhSachSinhVien;
//    
//    private int soSVMax;
//    private int soSVMin;
//    
//    private Date ngayBD;
//    private Date ngayDK;
//    private Date ngayHetDK;
//    
//    private ArrayList<TietHoc> lichHocTrongTuan;
//    private int soTietMotBuoi;
//    a
//    private String trangThai;

    /**
     *
     */
    public static int dem = 0;
    static public HashMap<String, LopMonHoc> dsLopMonHoc;
    private String ma;
    private MonHoc monHoc;
    private GiaoVien giaoVien;
    private HashMap<String, SinhVien> dsSinhVien;
    private ArrayList<Integer> lichHoc;     
    
    private int soTietMotBuoi;

    public LopMonHoc(String ma, MonHoc monHoc, GiaoVien giaoVien, ArrayList<Integer> lichHoc, int soTietMotBuoi) {
        this.ma = ma;
        this.monHoc = monHoc;
        this.giaoVien = giaoVien;
        this.lichHoc = lichHoc;
        this.soTietMotBuoi = soTietMotBuoi;
    }
    
    public LopMonHoc(String maMonHoc, String maGiaoVien, ArrayList<Integer> lichHoc, int soTietMotBuoi) {
//        this.()
        this.monHoc = monHoc;
        this.giaoVien = giaoVien;
        this.lichHoc = lichHoc;
        this.soTietMotBuoi = soTietMotBuoi;
    }

    public String getMa() {
        return ma;
    }

    public MonHoc getMonHoc() {
        return monHoc;
    }

    public GiaoVien getGiaoVien() {
        return giaoVien;
    }

    public HashMap<String, SinhVien> getDsSinhVien() {
        return dsSinhVien;
    }

    public ArrayList<Integer> getLichHoc() {
        return lichHoc;
    }

    public int getSoTietMotBuoi() {
        return soTietMotBuoi;
    }
    
    
    static public void fakeData() {
        
    }
            
}

