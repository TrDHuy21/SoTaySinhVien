/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import javax.swing.JOptionPane;
import model.GiaoVien;
import model.SinhVien;
import view.*;
/**
 *
 * @author DELL
 */
public class XuLy {
    public static SinhVien user_sv;
    public static GiaoVien user_gv;
    
    public static void batDau() {
        // phương thức này sẽ gọi các hàm fakeData
        XuLySinhVien.fakeData();
        XuLyGiaoVien.fakeData();
        XuLyLopChinh.fakeData();
        
        //hien thi view dang nhap
        hienThiViewDangNhap();
    }
     
    public static void hienThiViewDangNhap() {
        if (ViewDangNhap.vdn != null) {
            ViewDangNhap.vdn.dispose();
            ViewDangNhap.vdn = null;
        }
        ViewDangNhap.vdn = new ViewDangNhap(); 
        ViewDangNhap.vdn.setVisible(true);
    }
    
    public static void dangNhap(String tk, String mk) {
        if(tk.equals("1") && mk.equals("1")) {
            System.out.println("view quan tri vien");
            return;
        } 
        try {
            if (SinhVien.dsSV.get(tk).getMatKhau().equals(mk)) {
                System.out.println("view sinh vien");
                return;
            }
            if (GiaoVien.dsGV.get(tk).getMatKhau().equals(mk)) {
                System.out.println("view giao vien");
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(ViewDangNhap.vdn, "Tài khoản hoặc mật khẩu không đúng");
        }
    }
 }
