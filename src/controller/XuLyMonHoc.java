/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.MonHoc;

/**
 *
 * @author DELL
 */
public class XuLyMonHoc {
    public static void themMonHoc(String ten, int tinChi) {
        String tenChuanHoa = ten.toUpperCase();
        
        if (MonHoc.dsMonHoc.entrySet().stream().anyMatch(e -> {
            return e.getValue().getTen().equals(tenChuanHoa);
        })) {
            throw new IllegalArgumentException("Da co mon hoc nay");
        }
        new MonHoc(tenChuanHoa, tinChi);
    }
}
