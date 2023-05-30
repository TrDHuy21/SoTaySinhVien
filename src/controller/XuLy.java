/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.GiaoVien;
import model.SinhVien;
import view.ViewDangNhap;
import view.GiaoVien.ViewGiaoVien;
import view.QuanTri.ViewQuanTri;
import view.SinhVien.ViewSinhVien;

/**
 *
 * @author DELL
 */
public class XuLy {
    public static void batDau() {
        // phương thức này sẽ gọi các hàm fakeData
        XuLySinhVien.fakeData();
        XuLyGiaoVien.fakeData();
        XuLyLopChinh.fakeData();
        goiViewDangNhap();
    }
     
    public static void goiViewDangNhap() {
        if(ViewDangNhap.viewDangNhap == null) {
            ViewDangNhap.viewDangNhap = new ViewDangNhap();
        }
         ViewDangNhap.viewDangNhap.setVisible(true);
    }
    
    public static void dangNhap(String tk, String mk) {
        //biến check sẽ kiểm tra đây là tk giáo viên hay sinh viên
  
        if (XuLySinhVien.dangNhap(tk, mk)) {
            SinhVien.User = SinhVien.getSinhVien(tk);
            if (ViewSinhVien.viewSinhVien == null) {
                ViewSinhVien.viewSinhVien = new ViewSinhVien();
            }
            ViewDangNhap.viewDangNhap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ViewSinhVien.viewSinhVien.setVisible(true);
        } else if (XuLyGiaoVien.dangNhap(tk, mk)) {
            
           ViewDangNhap.viewDangNhap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            GiaoVien.User = GiaoVien.getGiaoVien(tk);
            ViewGiaoVien.viewGiaoVien.setVisible(true);
            
        } else if (tk.equals("qt1") && mk.equals("qt1")){
            ViewDangNhap.viewDangNhap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ViewQuanTri.viewQuanTri.setVisible(true);
        } else {
            
            JOptionPane.showMessageDialog(ViewDangNhap.viewDangNhap, "Tài khoản hoặc mật khẩu không đúng");
        }
        
    }
 }
