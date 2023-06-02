/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.LinkedHashMap;
import java.util.Objects;

/**
 *
 * @author DELL
 */
public class Nganh {
    public static LinkedHashMap<String, Nganh> dsN = new LinkedHashMap<>();
    private String ma;
    private String ten;
    private Khoa k;
    private int soLop=0;

    public Nganh(String ma, String ten, Khoa k) {
        this.ma = ma;
        this.ten = ten;
        this.k = k;
        Nganh n = this;
        dsN.put(ma, n);
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public Khoa getK() {
        return k;
    }

    public int getSoLop() {
        return soLop;
    }

    public void setSoLop(int soLop) {
        this.soLop = soLop;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.ma);
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
        final Nganh other = (Nganh) obj;
        return Objects.equals(this.ma, other.ma);
    }
    
    
}
