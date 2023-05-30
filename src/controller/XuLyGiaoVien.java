package controller;

import java.util.Date;
import model.GiaoVien;
import model.User;

public class XuLyGiaoVien {

    public static void fakeData() {
        ThemGiaoVien("Vu thi duong", "hai Duong", new Date(1990, 8, 30), "087643123", "thiduong@gmail.com", "08635123");
        ThemGiaoVien("Tran PhuonG Nhung", "Ha Noi", new Date(1991, 7, 23), "089763453", "phuongnhung@gmail.com", "089129715");
        ThemGiaoVien("Nguyen Thi Huyen", "Hai Phong", new Date(1992, 6, 12), "089123123", "vancuong@gmail.com", "09725482");
        ThemGiaoVien("Tran Van Cuong", "Bac Ninh", new Date(1993, 5, 7), "033673123", "trahuyen@gmail.com", "098250123");
        ThemGiaoVien("Nguyen Thi Binh", "Hung Yen", new Date(1994, 11, 8), "099234123", "tranbinh@gmail.com", "026423123");
        ThemGiaoVien("Mai Thanh Hong", "Phu Tho", new Date(1995, 12, 1), "083453123", "thanhhong@gmail.com", "089197223");
    }
    
    public static boolean dangNhap(String tk, String mk) {
        GiaoVien gv = GiaoVien.getGiaoVien(tk);
        if (gv == null)
            return false;
        if(gv.getMatKhau().equals(mk)) {
            User.gv = GiaoVien.getGiaoVien(tk);
            return true;
        }
        return false;
    }

    public static void ThemGiaoVien(String ten, String que, Date ngaySinh, String sdt, String email, String cmnd) {
        if (GiaoVien.dsGiaoVien.entrySet().stream().anyMatch(gv -> {
            return gv.getValue().getCmnd().equals(cmnd);
        })) {
            throw new IllegalArgumentException("Da co giao vien nay");
        }
        new GiaoVien(ten, que, ngaySinh, sdt, email, cmnd);
    }
}