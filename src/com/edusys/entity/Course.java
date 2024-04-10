/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.entity;

import java.util.Date;

/**
 * @author ngocd
 */
public class Course {

    private int idKH;
    private String idCD;
    private float cost;
    private int time;
    private Date ngayKG;
    private String decribe;
    private String idNV;
    private Date ngayTao;
    private boolean trangThai;

    public Course() {
    }

    public Course(int idKH, String idCD, float cost, int time, Date ngayKG, String decribe, String idNV, Date ngayTao, boolean trangThai) {
        this.idKH = idKH;
        this.idCD = idCD;
        this.cost = cost;
        this.time = time;
        this.ngayKG = ngayKG;
        this.decribe = decribe;
        this.idNV = idNV;
        this.ngayTao = ngayTao;
        this.trangThai = trangThai;
    }

    public int getIdKH() {
        return idKH;
    }

    public void setIdKH(int idKH) {
        this.idKH = idKH;
    }

    public String getIdCD() {
        return idCD;
    }

    public void setIdCD(String idCD) {
        this.idCD = idCD;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Date getNgayKG() {
        return ngayKG;
    }

    public void setNgayKG(Date ngayKG) {
        this.ngayKG = ngayKG;
    }

    public String getDecribe() {
        return decribe;
    }

    public void setDecribe(String decribe) {
        this.decribe = decribe;
    }

    public String getIdNV() {
        return idNV;
    }

    public void setIdNV(String idNV) {
        this.idNV = idNV;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return this.idCD + " - " + this.ngayKG;
    }
}
