package com.edusys.model;

import javax.swing.Icon;

public class Model_Card {
    Icon icon;
    String title;
    String value;
    String decription;

    public Model_Card() {
    }

    public Model_Card(Icon icon, String title, String value, String decription) {
        this.icon = icon;
        this.title = title;
        this.value = value;
        this.decription = decription;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }
    
}
