/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.entity;

import java.util.Date;

/**
 * @author ngocd
 */
//người học
public class Learner {

    private String idNH;
    private String name;
    private Date brithday;
    private boolean gender;
    private String phone;
    private String email;
    private String decribe;
    private String idnv;
    private Date ngaydk = new Date();
    private boolean trangthai;

    public Learner() {
    }

    public Learner(String idNH, String name, Date brithday, boolean gender, String phone, String email, String decribe, String idnv, Date ngaydk, boolean trangthai) {
        this.idNH = idNH;
        this.name = name;
        this.brithday = brithday;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.decribe = decribe;
        this.idnv = idnv;
        this.ngaydk = ngaydk;
        this.trangthai = trangthai;
    }

    public String getIdNH() {
        return idNH;
    }

    public void setIdNH(String idNH) {
        this.idNH = idNH;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDecribe() {
        return decribe;
    }

    public void setDecribe(String decribe) {
        this.decribe = decribe;
    }

    public String getIdnv() {
        return idnv;
    }

    public void setIdnv(String idnv) {
        this.idnv = idnv;
    }

    public Date getNgaydk() {
        return ngaydk;
    }

    public void setNgaydk(Date ngaydk) {
        this.ngaydk = ngaydk;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }
}
