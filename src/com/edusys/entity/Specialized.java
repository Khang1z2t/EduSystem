/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.entity;

/**
 * @author ngocd
 */
public class Specialized {

    private String idCD;
    private String name;
    private float cost;
    private int time;
    private String image;
    private String decribe;
    private boolean trangthai;

    public Specialized() {
    }

    public Specialized(String idCD, String name, float cost, int time, String image, String decribe, boolean trangthai) {
        this.idCD = idCD;
        this.name = name;
        this.cost = cost;
        this.time = time;
        this.image = image;
        this.decribe = decribe;
        this.trangthai = trangthai;
    }

    public String getIdCD() {
        return idCD;
    }

    public void setIdCD(String idCD) {
        this.idCD = idCD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDecribe() {
        return decribe;
    }

    public void setDecribe(String decribe) {
        this.decribe = decribe;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
}
