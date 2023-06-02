/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Khoa;
import model.Nganh;

/**
 *
 * @author DELL
 */
public class XuLyNganh {
    public static void fakeData() {
        themNganh("CNTT", "công nghệ thông tin", "CNTT");
        themNganh("KHMT", "Khoa học máy tính", "CNTT");
        themNganh("KTPM", "Kỹ thuật phần mềm", "CNTT");
        themNganh("HTTT", "Hệ thống thông tin", "CNTT");
    }
    public static boolean themNganh(String ma, String ten, String maKHoa) {
        //kiểm tra đã có ngành này chưa
        if(Nganh.dsN.containsKey(ma)){
            return false;
        }
        //tạo ngành và thêm ngành đó vào danh sách khoa
        Khoa k = Khoa.dsK.get(maKHoa);
        k.getDsN().put(ma, new Nganh(ma, ten, k));
        return true;
    }
}
