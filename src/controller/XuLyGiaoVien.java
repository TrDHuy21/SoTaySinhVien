package controller;

import java.util.Date;
import java.util.Map;
import java.util.Set;
import model.GiaoVien;
import model.LopChinh;

public class XuLyGiaoVien {

    public static void fakeData() {
        ThemGiaoVien("Vu thi duong", "hai Duong", new Date(1990, 8, 30), "087643123", "thiduong@gmail.com", "08635123");
        ThemGiaoVien("Tran PhuonG Nhung", "Ha Noi", new Date(1991, 7, 23), "089763453", "phuongnhung@gmail.com", "089129715");
        ThemGiaoVien("Nguyen Thi Huyen", "Hai Phong", new Date(1992, 6, 12), "089123123", "vancuong@gmail.com", "09725482");
        ThemGiaoVien("Tran Van Cuong", "Bac Ninh", new Date(1993, 5, 7), "033673123", "trahuyen@gmail.com", "098250123");
        ThemGiaoVien("Nguyen Thi Binh", "Hung Yen", new Date(1994, 11, 8), "099234123", "tranbinh@gmail.com", "026423123");
        ThemGiaoVien("Mai Thanh Hong", "Phu Tho", new Date(1995, 12, 1), "083453123", "thanhhong@gmail.com", "089197223");
    }

    public static void ThemGiaoVien(String ten, String que, Date ngaySinh, String sdt, String email, String cmnd) {
        if (GiaoVien.dsGiaoVien.entrySet().stream().anyMatch(gv -> {
            return gv.getValue().getCmnd().equals(cmnd);
        })) {
            throw new IllegalArgumentException("Da co giao vien nay");
        }
        new GiaoVien(ten, que, ngaySinh, sdt, email, cmnd);
    }

    public static void themLopChinhChoGV(GiaoVien gv, String maLopChinh) throws Exception {
        
        //them lop cho giao vien
        
        // thay doi thuoc tinh giao vien trong lop chinh
    }

    public static void xoaLopChinhChoGV(GiaoVien gv, String maLopChinh) throws Exception {
        //check Lớp này có thuộc Giao Vien này hay không
        boolean check = false;
        Set<Map.Entry<String, LopChinh>> entrySet = gv.getDsLopChinh().entrySet();
        for (Map.Entry<String, LopChinh> entry : entrySet) {
            String key = entry.getKey();
            if(key.equals(maLopChinh)){
                //Đã tồn tại lớp này
                check = true;
            }
        }
        
        gv.getDsLopChinh().containsKey(maLopChinh);
        if(check){
            //Xóa Lớp Chính
            gv.getDsLopChinh().remove(maLopChinh);
        }else{
            throw new Exception("Lop Hoc Khong Ton Tai !!!");
        }
        
        
        lopchinh.setgiaovien(null);
    }
}