/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Khoa;

/**
 *
 * @author DELL
 */
public class XuLyKhoa {
    public static void fakeData() {
        themKhoa("CNTT", "công nghệ thông tin");
        themKhoa("DT", "Điện tử");
        themKhoa("CK", "Cơ khí");
    }
    
    public static boolean themKhoa(String ma, String ten) {
        if (Khoa.dsK.containsKey(ma)) {
            return false;
        }
        new Khoa(ma, ten);
        return true;
    }
    
}
