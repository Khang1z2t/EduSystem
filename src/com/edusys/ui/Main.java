package com.edusys.ui;

import com.edusys.event.EventMenuSelected;
import com.edusys.form.Help_Form;
import com.edusys.form.Home_Form;
import com.edusys.form.Infor_Form;
import com.edusys.form.QLCD_Form;
import com.edusys.form.QLHV_Form;
import com.edusys.form.QLKH_Form;
import com.edusys.form.QLNH_Form;
import com.edusys.form.QLNV_Form;
import com.edusys.form.THTK_Form;
import com.edusys.form.User_Form;
import com.edusys.swing.ScrollBar;
import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import com.edusys.utils.XImg;
import java.awt.Color;
import javax.swing.JComponent;
import org.opencv.core.Core;

/**
 *
 * @author ngocd
 */
public class Main extends javax.swing.JFrame {

    public static boolean isMainOpened = true;
    public static Main currentInstance;

    public Main() {
        initComponents();
        init();
        setBackground(new Color(0, 0, 0, 0));
        Menu.initMoving(Main.this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pannelBorder1 = new com.edusys.swing.PanelBorder();
        Menu = new com.edusys.component.Menu();
        header1 = new com.edusys.component.Header();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edusys");
        setUndecorated(true);

        pannelBorder1.setBackground(new java.awt.Color(242, 242, 242));

        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pannelBorder1Layout = new javax.swing.GroupLayout(pannelBorder1);
        pannelBorder1.setLayout(pannelBorder1Layout);
        pannelBorder1Layout.setHorizontalGroup(
            pannelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelBorder1Layout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pannelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pannelBorder1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        pannelBorder1Layout.setVerticalGroup(
            pannelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(pannelBorder1Layout.createSequentialGroup()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pannelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pannelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.edusys.component.Menu Menu;
    private com.edusys.component.Header header1;
    private javax.swing.JPanel mainPanel;
    private com.edusys.swing.PanelBorder pannelBorder1;
    // End of variables declaration//GEN-END:variables
    private void init() {
        setTitle("Hệ Thống Quản Lý Đào Tạo");
        setIconImage(XImg.getAppIcon());
        if (!Auth.isLogin()) {
            new Welcome(this, true).setVisible(true);
            new Login(this, true).setVisible(true);
            if (!Auth.isLogin()) {
                System.exit(0);
            }
        }
        Menu.addEventMenuSelected(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                if (index == 0) {
                    setForm(new Home_Form());
                } else if (index == 1) {
                    setForm(new QLCD_Form());
                } else if (index == 2) {
                    setForm(new QLKH_Form());
                } else if (index == 3) {
                    setForm(new QLNH_Form());
                } else if (index == 4) {
                    setForm(new QLHV_Form());
                } else if (index == 5) {
                    if (!Auth.isManager()) {
                        MsgBox.alert(Main.this, "Bạn không đủ quyền để truy cập.");
                        return;
                    }
                    setForm(new QLNV_Form());
                } else if (index == 6) {
                    setForm(new THTK_Form());
                } else if (index == 7) {
//                    Menu Title nên ko cần evt
                } else if (index == 8) {
                    setForm(new Help_Form());
                } else if (index == 9) {
                    setForm(new Infor_Form());
                } else if (index == 10) {
                    setForm(new User_Form());
                } else if (index == 11) {
                    Auth.clear();
                    isMainOpened = false;
                    Main.this.dispose();
                    new Login(Main.this, true).setVisible(true);
                }
            }
        });
        setForm(new Home_Form());
        currentInstance = this;
    }

    public void setForm(JComponent comp) {
        mainPanel.removeAll();
        mainPanel.add(comp);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

}
