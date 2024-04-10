package com.edusys.component;

import com.edusys.model.Model_Card;

import java.awt.*;

public class Card extends javax.swing.JPanel {
    
    private Color c1;
    private Color c2;
    
    public Color getC1() {
        return c1;
    }
    
    public void setC1(Color c1) {
        this.c1 = c1;
    }
    
    public Color getC2() {
        return c2;
    }
    
    public void setC2(Color c2) {
        this.c2 = c2;
    }
    
    public Card() {
        initComponents();
        setOpaque(false);
        c1 = Color.BLACK;
        c2 = Color.WHITE;
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    
    public void setData(Model_Card data) {
        lblIcon.setIcon(data.getIcon());
        lblTitle.setText(data.getTitle());
        lblValues.setText(data.getValue());
        lblDecriptions.setText(data.getDecription());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIcon = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblValues = new javax.swing.JLabel();
        lblDecriptions = new javax.swing.JLabel();

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/img/youtube.png"))); // NOI18N

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitle.setText("Title");

        lblValues.setBackground(new java.awt.Color(255, 255, 255));
        lblValues.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblValues.setText("Values");

        lblDecriptions.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDecriptions.setText("Decriptions");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDecriptions)
                    .addComponent(lblValues)
                    .addComponent(lblTitle)
                    .addComponent(lblIcon))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblIcon)
                .addGap(18, 18, 18)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblValues)
                .addGap(18, 18, 18)
                .addComponent(lblDecriptions)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gp = new GradientPaint(0, 0, c1, 0, getHeight(), c2);
        g2.setPaint(gp);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(new Color(255, 255, 255, 50));
        g2.fillOval(getWidth() - (getHeight() / 2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth() - (getHeight() / 2) - 20, getHeight() / 2 + 20, getHeight(), getHeight());
        super.paintComponent(g);        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblDecriptions;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblValues;
    // End of variables declaration//GEN-END:variables
}
