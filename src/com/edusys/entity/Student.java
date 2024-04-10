/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.entity;

/**
 * @author ngocd
 */
//học viên
public class Student {

    private int idHV;
    private int idKH;
    private String idNH;
    private float score;
    private boolean trangthai;

    public Student() {
    }

    public Student(int idHV, int idKH, String idNH, float score, boolean trangthai) {
        this.idHV = idHV;
        this.idKH = idKH;
        this.idNH = idNH;
        this.score = score;
        this.trangthai = trangthai;
    }

    public int getIdHV() {
        return idHV;
    }

    public void setIdHV(int idHV) {
        this.idHV = idHV;
    }

    public int getIdKH() {
        return idKH;
    }

    public void setIdKH(int idKH) {
        this.idKH = idKH;
    }

    public String getIdNH() {
        return idNH;
    }

    public void setIdNH(String idNH) {
        this.idNH = idNH;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }
}
