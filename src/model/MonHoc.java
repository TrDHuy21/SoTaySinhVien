/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.Objects;

/**
 *
 * @author DELL
 */
public class MonHoc {

    public static int dem = 0;
    public static HashMap<String, MonHoc> dsMonHoc = new HashMap<>();
    private String ma;
    private String ten;
    private int tinchi;

    public MonHoc(String ma, String ten, int tinchi) {
        

      
    }

    public MonHoc(String ten, int tinchi) {
        this.ma = "MH" + dem;
        this.ten = ten;
        this.tinchi = tinchi;
        
         MonHoc monhoc = this;
        dsMonHoc.put(ma, monhoc);
        dem++;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getTinchi() {
        return tinchi;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTinchi(int tinchi) {
        this.tinchi = tinchi;
    }

    @Override
    public String toString() {
        return "MonHoc{" + "ma=" + ma + ", ten=" + ten + ", tinchi=" + tinchi + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.ma);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MonHoc other = (MonHoc) obj;
        return true;
    }

    static void fakeData() {
//        try {
//             MonHoc mh1 = new MonHoc("KTLT", "KI THUAT LAP TRINH", 3);
//             MonHoc mh2 = new MonHoc("JAVACB", "JAVA CO BAN", 3);
//             MonHoc mh3 = new MonHoc("HQTCSDL", "HE QUAN TRI CO SO DU LIEU", 3);
//             MonHoc mh4 = new MonHoc("CTDLVGT", "CAU TRUC DU LIEU VA GIAI THUAT", 3);
//             MonHoc mh5 = new MonHoc("XSTK", "XAC SUAT THONG KE", 3);
//        } catch (Exception e) {
//        }
    }


}
