/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.entity;

/**
 * @author ngocd
 */
public class Staff {

    private static boolean isFirstAdmin = true;

    private String idNV;
    private String email;
    private String name;
    private String pass;
    private String tinhTrang;
    private String image;
    private boolean trangThai;
    private boolean role;

    public Staff() {
    }

    public Staff(String idNV, String email, String name, String pass, String tinhTrang, String image, boolean trangThai, boolean role) {
        this.idNV = idNV;
        this.email = email;
        this.name = name;
        this.pass = pass;
        this.tinhTrang = tinhTrang;
        this.image = image;
        this.trangThai = trangThai;
        this.role = role;
    }

    public static boolean isIsFirstAdmin() {
        return isFirstAdmin;
    }

    public static void setIsFirstAdmin(boolean isFirstAdmin) {
        Staff.isFirstAdmin = isFirstAdmin;
    }

    public String getIdNV() {
        return idNV;
    }

    public void setIdNV(String idNV) {
        this.idNV = idNV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }
}
