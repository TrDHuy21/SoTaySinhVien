/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Date;
import model.Khoa;
import model.LopChinh;
import model.Nganh;
import model.SinhVien;

/**
 *
 * @author DELL
 */
public class XuLySinhVien {

    public static void fakeData() {
        ThemSinhVien("Tran Duc Huy", "nam","Ha Noi", new Date(2003, 9, 21), "012348234321", "vlsvhuy@gmail.com", "2021605056", "LC0");
        ThemSinhVien("Nguyen Hoai Linh","nam", "Ha Noi", new Date(2003, 9, 8), "012348234321", "NHL@gmail.com", "012348234321", "LC0");
        ThemSinhVien("Nguyen Thien Lam","nam", "Ha Noi", new Date(2003, 4, 4), "324542642", "ThienLam@gmail.com", "324542642", "LC0");
    }
    public static boolean ThemSinhVien(String ten, String gioitinh, String que, Date ngaySinh, String sdt, 
            String email, String cmnd, String maLopchinh) {
        if (SinhVien.dsSV.containsValue(cmnd)) {
            return false;
        }
        LopChinh lc = LopChinh.dsLC.get(maLopchinh);
        new SinhVien(ten, gioitinh, que, ngaySinh, sdt, email, cmnd, lc);
        return true;
    }

    public static void thayDoiLopChinhChoSV(SinhVien sinhVien, String maLopChinh) {
       
    }
    
}
