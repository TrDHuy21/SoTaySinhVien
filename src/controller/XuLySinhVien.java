/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Date;
import model.LopChinh;
import model.SinhVien;
import model.User;
import view.*;

/**
 *
 * @author DELL
 */
public class XuLySinhVien {

    public static void fakeData() {
        ThemSinhVien("Tran Duc Huy", "Ha Noi", new Date(2003, 9, 21), "012348234321", "vlsvhuy@gmail.com", "2021605056");
        ThemSinhVien("Nguyen Hoai Linh", "Ha Noi", new Date(2003, 9, 8), "012348234321", "NHL@gmail.com", "012348234321");
        ThemSinhVien("Nguyen Thien Lam", "Ha Noi", new Date(2003, 4, 4), "324542642", "ThienLam@gmail.com", "324542642");
    }
    
    public static boolean dangNhap(String tk, String mk) {
        SinhVien sv = SinhVien.getSinhVien(tk);
        if (sv == null)
            return false;
        if(sv.getMatKhau().equals(mk)) {
            User.sv = SinhVien.getSinhVien(tk);
            return true;
        }
        return false;
    }

    public static void ThemSinhVien(String ten, String que, Date ngaySinh, String sdt, String email, String cmnd) {
        if (SinhVien.dsSinhVien.entrySet().stream().anyMatch(gv -> {
            return gv.getValue().getCmnd().equals(cmnd);
        })) {
            throw new IllegalArgumentException("Da co sinh vien nay");
        }
        new SinhVien(ten, que, ngaySinh, sdt, email, cmnd);
    }

    public static void thayDoiLopChinhChoSV(SinhVien sinhVien, String maLopChinh) {
        // phải xóa sinh viên này trong danh sách lớp cũ và thêm sinh viên này vào danh sách lớp mới
        try {
            LopChinh lopChinhCu = sinhVien.getLopChinh();
            LopChinh lopChinhMoi = LopChinh.getLopChinh(maLopChinh);

            sinhVien.thayDoiLopChinh(maLopChinh);
            lopChinhMoi.themSinhVien(sinhVien);
            lopChinhCu.xoaSinhVien(sinhVien);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
