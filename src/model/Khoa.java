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
public class Khoa {
    public static LinkedHashMap<String, Khoa> dsK = new LinkedHashMap<>();
    private String ma;
    private String ten;
    private LinkedHashMap<String, Nganh> dsN = new LinkedHashMap<>();

    public Khoa(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
        Khoa k = this;
        dsK.put(ma, k);
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }
    

    public LinkedHashMap<String, Nganh> getDsN() {
        return dsN;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.ma);
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
        final Khoa other = (Khoa) obj;
        return Objects.equals(this.ma, other.ma);
    }
    
}
