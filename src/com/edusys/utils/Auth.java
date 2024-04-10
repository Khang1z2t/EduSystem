/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.utils;

import com.edusys.entity.Staff;

/**
 * @author ngocd
 */
public class Auth {
    public static Staff user = null;

    public static void clear() {
        Auth.user = null;
    }

    public static boolean isLogin() {
        return Auth.user != null;
    }

    public static boolean isManager() {
        return Auth.isLogin() && user.isRole();
    }

    public static boolean isAdmin() {
        return !(Auth.isLogin() && user.getIdNV().equals("khang"));
    }

    public static String hidenEmail(String email) {
        String[] parts = email.split("@");
        String ename = parts[0];
        String edomain = parts[1];

        String firstChars = ename.substring(0, 2);
        String lastChars = ename.substring(ename.length() - 2);

        StringBuilder sb = new StringBuilder();
        sb.append(firstChars);
        for (int i = 0; i < 4; i++) {
            sb.append("*");
        }
        sb.append(lastChars);
        sb.append("@");
        sb.append(edomain);

        return sb.toString();
    }
}
