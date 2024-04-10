/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * @author ngocd
 */
public class AppConfig {
    private final String user;
    private final String pass;
    private final boolean remember;

    public AppConfig(String user, String pass, boolean remember) {
        this.user = user;
        this.pass = pass;
        this.remember = remember;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public boolean isRemember() {
        return remember;
    }


    private static final String config_file = "config/config.properties";

    public static void saveConfig(String user, String pass, boolean remember) {

        try (OutputStream output = new FileOutputStream(config_file)) {
            Properties prop = new Properties();
            prop.setProperty("user", user);
            prop.setProperty("pass", pass);
            prop.setProperty("remember", String.valueOf(remember));
            prop.store(output, null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static AppConfig loadConfig() {
        Properties prop = new Properties();
        try (InputStream input = new FileInputStream(config_file)) {
            prop.load(input);
            String user = prop.getProperty("user");
            String pass = prop.getProperty("pass");
            boolean remeber = Boolean.parseBoolean(prop.getProperty("remember"));
            return new AppConfig(user, pass, remeber);
        } catch (Exception e) {
            return new AppConfig("", "", false);
        }
    }

    public static void clear() {
        AppConfig.saveConfig("", "", false);
    }

}
