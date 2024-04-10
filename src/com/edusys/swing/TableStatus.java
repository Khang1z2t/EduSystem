package com.edusys.swing;

import com.edusys.model.StatusType;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;

public class TableStatus extends JLabel {

    public TableStatus() {
        setForeground(Color.WHITE);
    }

    private StatusType type;

    public void setType(StatusType type) {
        this.type = type;
        this.setText(type.toString());
        repaint();
    }

    public StatusType getType() {
        return type;
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (type != null) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            GradientPaint gp;
            if (type == StatusType.ADMIN) {
                gp = new GradientPaint(0, 0, new Color(165, 254, 203), 0, getHeight(), new Color(160, 252, 205));
            } else {
                gp = new GradientPaint(0, 0, new Color(32, 189, 255), 0, getHeight(), new Color(25, 151, 204));
            }
            g2.setPaint(gp);
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 1, 1);
        }
        super.paintComponent(g);
    }

}
