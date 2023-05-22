/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import controller.XuLySinhVien;
import java.util.Date;
import model.SinhVien;

/**
 *
 * @author DELL
 */
public class SoTaySinhVien {
    public static void main(String[] args) {
       XuLySinhVien.fakeData();
       XuLySinhVien.ThemSinhVien("abc", "fas", new Date(200,1,1), "2424", "abc@gmail.com", "2424");
       XuLySinhVien.HienThiDsSV();    
       
    }
    
}
