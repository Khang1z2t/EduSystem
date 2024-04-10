/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.edusys.ui;

import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import com.edusys.utils.XImg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;

/**
 * @author ngocd
 */
public class Home extends javax.swing.JFrame {

    public static boolean isHomeOpened = true;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        init();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnLogout = new javax.swing.JButton();
        btnEnd = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnSpecialized = new javax.swing.JButton();
        btnLearner = new javax.swing.JButton();
        btnCourse = new javax.swing.JButton();
        btnStudent = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuSystem = new javax.swing.JMenu();
        mniUsername = new javax.swing.JMenuItem();
        mniLogin = new javax.swing.JMenuItem();
        mniLogout = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mniChangePass = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mniEnd = new javax.swing.JMenuItem();
        mnuManage = new javax.swing.JMenu();
        mniSpecialized = new javax.swing.JMenuItem();
        mniCourse = new javax.swing.JMenuItem();
        mniLearner = new javax.swing.JMenuItem();
        mniStudent = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mniStaff = new javax.swing.JMenuItem();
        mnuStatistic = new javax.swing.JMenu();
        mniScores = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mniAoN = new javax.swing.JMenuItem();
        mniPoint = new javax.swing.JMenuItem();
        mniRevenue = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();
        mniHowToUse = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        mniInfor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hệ Thống Quản Lý Đào Tạo");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(217, 237, 191));
        jPanel1.setForeground(new java.awt.Color(123, 188, 196));

        jToolBar1.setBackground(new java.awt.Color(123, 188, 196));
        jToolBar1.setRollover(true);

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/img/logout.png"))); // NOI18N
        btnLogout.setText("Đăng xuất");
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.setFocusable(false);
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout.setMaximumSize(new java.awt.Dimension(66, 44));
        btnLogout.setMinimumSize(new java.awt.Dimension(66, 44));
        btnLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLogout);

        btnEnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/img/turn-off.png"))); // NOI18N
        btnEnd.setText("Kết thúc");
        btnEnd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnd.setFocusable(false);
        btnEnd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEnd.setMaximumSize(new java.awt.Dimension(66, 44));
        btnEnd.setMinimumSize(new java.awt.Dimension(66, 44));
        btnEnd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEnd);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jToolBar1.add(jSeparator1);

        btnSpecialized.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/img/paper.png"))); // NOI18N
        btnSpecialized.setText("Chuyên đề");
        btnSpecialized.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSpecialized.setFocusable(false);
        btnSpecialized.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSpecialized.setMaximumSize(new java.awt.Dimension(66, 44));
        btnSpecialized.setMinimumSize(new java.awt.Dimension(66, 44));
        btnSpecialized.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSpecialized.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpecializedActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSpecialized);

        btnLearner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/img/people.png"))); // NOI18N
        btnLearner.setText("Người học");
        btnLearner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLearner.setFocusable(false);
        btnLearner.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLearner.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLearner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLearnerActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLearner);

        btnCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/img/course.png"))); // NOI18N
        btnCourse.setText("Khóa học");
        btnCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCourse.setFocusable(false);
        btnCourse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCourse.setMaximumSize(new java.awt.Dimension(66, 44));
        btnCourse.setMinimumSize(new java.awt.Dimension(66, 44));
        btnCourse.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCourse);

        btnStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/img/reading-book.png"))); // NOI18N
        btnStudent.setText("Học viên");
        btnStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStudent.setFocusable(false);
        btnStudent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStudent.setMaximumSize(new java.awt.Dimension(66, 44));
        btnStudent.setMinimumSize(new java.awt.Dimension(66, 44));
        btnStudent.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });
        jToolBar1.add(btnStudent);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jToolBar1.add(jSeparator2);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/img/global-network.png"))); // NOI18N
        jButton1.setText("Hướng dẫn");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/img/infor.png"))); // NOI18N
        jLabel1.setText("Hệ thống đào tạo");

        lblTime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/img/clock.png"))); // NOI18N
        lblTime.setText("00:00:00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblTime))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 339, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setBackground(new java.awt.Color(217, 237, 191));
        jMenuBar1.setForeground(new java.awt.Color(123, 188, 196));

        mnuSystem.setText("Hệ Thống");

        mniUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/img/user.png"))); // NOI18N
        mniUsername.setText("Username");
        mniUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniUsernameActionPerformed(evt);
            }
        });
        mnuSystem.add(mniUsername);

        mniLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/img/key.png"))); // NOI18N
        mniLogin.setText("Đăng nhập");
        mniLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLoginActionPerformed(evt);
            }
        });
        mnuSystem.add(mniLogin);

        mniLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/img/logout1.png"))); // NOI18N
        mniLogout.setText("Đăng xuất");
        mniLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLogoutActionPerformed(evt);
            }
        });
        mnuSystem.add(mniLogout);
        mnuSystem.add(jSeparator3);

        mniChangePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/img/exchange.png"))); // NOI18N
        mniChangePass.setText("Đổi mật khẩu");
        mniChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniChangePassActionPerformed(evt);
            }
        });
        mnuSystem.add(mniChangePass);
        mnuSystem.add(jSeparator4);

        mniEnd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mniEnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/img/shutdown.png"))); // NOI18N
        mniEnd.setText("Kết thúc");
        mniEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEndActionPerformed(evt);
            }
        });
        mnuSystem.add(mniEnd);

        jMenuBar1.add(mnuSystem);

        mnuManage.setText("Quản Lý");

        mniSpecialized.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/img/paper1.png"))); // NOI18N
        mniSpecialized.setText("Chuyên đề");
        mniSpecialized.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSpecializedActionPerformed(evt);
            }
        });
        mnuManage.add(mniSpecialized);

        mniCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/img/diploma.png"))); // NOI18N
        mniCourse.setText("Khóa học");
        mniCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCourseActionPerformed(evt);
            }
        });
        mnuManage.add(mniCourse);

        mniLearner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/img/ppl.png"))); // NOI18N
        mniLearner.setText("Người học");
        mniLearner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLearnerActionPerformed(evt);
            }
        });
        mnuManage.add(mniLearner);

        mniStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/img/rbook.png"))); // NOI18N
        mniStudent.setText("Học viên");
        mniStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniStudentActionPerformed(evt);
            }
        });
        mnuManage.add(mniStudent);
        mnuManage.add(jSeparator5);

        mniStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/img/staff.png"))); // NOI18N
        mniStaff.setText("Nhân viên");
        mniStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniStaffActionPerformed(evt);
            }
        });
        mnuManage.add(mniStaff);

        jMenuBar1.add(mnuManage);

        mnuStatistic.setText("Thống Kê");

        mniScores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/img/files.png"))); // NOI18N
        mniScores.setText("Bảng điểm");
        mniScores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniScoresActionPerformed(evt);
            }
        });
        mnuStatistic.add(mniScores);
        mnuStatistic.add(jSeparator6);

        mniAoN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/img/competitive-analysis.png"))); // NOI18N
        mniAoN.setText("Lượng người học");
        mniAoN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAoNActionPerformed(evt);
            }
        });
        mnuStatistic.add(mniAoN);

        mniPoint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/img/analysis.png"))); // NOI18N
        mniPoint.setText("Điểm chuyên đề");
        mniPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPointActionPerformed(evt);
            }
        });
        mnuStatistic.add(mniPoint);

        mniRevenue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/img/money.png"))); // NOI18N
        mniRevenue.setText("Doanh thu");
        mniRevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRevenueActionPerformed(evt);
            }
        });
        mnuStatistic.add(mniRevenue);

        jMenuBar1.add(mnuStatistic);

        mnuHelp.setText("Trợ Giúp");

        mniHowToUse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/img/earth.png"))); // NOI18N
        mniHowToUse.setText("Hướng dẫn sử dụng");
        mniHowToUse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHowToUseActionPerformed(evt);
            }
        });
        mnuHelp.add(mniHowToUse);
        mnuHelp.add(jSeparator7);

        mniInfor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/img/information.png"))); // NOI18N
        mniInfor.setText("Giới thiệu sản phẩm");
        mniInfor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniInforActionPerformed(evt);
            }
        });
        mnuHelp.add(mniInfor);

        jMenuBar1.add(mnuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniSpecializedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSpecializedActionPerformed
        // TODO add your handling code here:
        openSpecticalized();
    }//GEN-LAST:event_mniSpecializedActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        logoutEvt();

    }//GEN-LAST:event_btnLogoutActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void mniUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniUsernameActionPerformed
        // TODO add your handling code here:
        openUserInfor();
    }//GEN-LAST:event_mniUsernameActionPerformed

    private void mniLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLoginActionPerformed
        // TODO add your handling code here:
        loginEvt();
    }//GEN-LAST:event_mniLoginActionPerformed

    private void mniLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLogoutActionPerformed
        // TODO add your handling code here:
        logoutEvt();
    }//GEN-LAST:event_mniLogoutActionPerformed

    private void mniChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniChangePassActionPerformed
        // TODO add your handling code here:
        openChangePass();
    }//GEN-LAST:event_mniChangePassActionPerformed

    private void mniEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEndActionPerformed
        // TODO add your handling code here:
        endEvt();
    }//GEN-LAST:event_mniEndActionPerformed

    private void mniCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCourseActionPerformed
        // TODO add your handling code here:
        openCourse();
    }//GEN-LAST:event_mniCourseActionPerformed

    private void mniLearnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLearnerActionPerformed
        // TODO add your handling code here:
        openLearner();
    }//GEN-LAST:event_mniLearnerActionPerformed

    private void mniStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniStudentActionPerformed
        // TODO add your handling code here:
        openStudent();
    }//GEN-LAST:event_mniStudentActionPerformed

    private void mniStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniStaffActionPerformed
        // TODO add your handling code here:
        openStaff();
    }//GEN-LAST:event_mniStaffActionPerformed

    private void mniScoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniScoresActionPerformed
        // TODO add your handling code here:
        openScores();
    }//GEN-LAST:event_mniScoresActionPerformed

    private void mniAoNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAoNActionPerformed
        // TODO add your handling code here:
        openScores();
    }//GEN-LAST:event_mniAoNActionPerformed

    private void mniPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPointActionPerformed
        // TODO add your handling code here:
        openScores();
    }//GEN-LAST:event_mniPointActionPerformed

    private void mniRevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRevenueActionPerformed
        // TODO add your handling code here:
        openScores();
    }//GEN-LAST:event_mniRevenueActionPerformed

    private void mniHowToUseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHowToUseActionPerformed
        // TODO add your handling code here:
        openHelp();
    }//GEN-LAST:event_mniHowToUseActionPerformed

    private void mniInforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniInforActionPerformed
        // TODO add your handling code here:
        openInfor();
    }//GEN-LAST:event_mniInforActionPerformed

    private void btnEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndActionPerformed
        // TODO add your handling code here:
        endEvt();
    }//GEN-LAST:event_btnEndActionPerformed

    private void btnSpecializedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpecializedActionPerformed
        // TODO add your handling code here:
        openSpecticalized();
    }//GEN-LAST:event_btnSpecializedActionPerformed

    private void btnLearnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLearnerActionPerformed
        // TODO add your handling code here:
        openLearner();
    }//GEN-LAST:event_btnLearnerActionPerformed

    private void btnCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseActionPerformed
        // TODO add your handling code here:
        openCourse();
    }//GEN-LAST:event_btnCourseActionPerformed

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        // TODO add your handling code here:
        openStudent();
    }//GEN-LAST:event_btnStudentActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        openHelp();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCourse;
    private javax.swing.JButton btnEnd;
    private javax.swing.JButton btnLearner;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSpecialized;
    private javax.swing.JButton btnStudent;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblTime;
    private javax.swing.JMenuItem mniAoN;
    private javax.swing.JMenuItem mniChangePass;
    private javax.swing.JMenuItem mniCourse;
    private javax.swing.JMenuItem mniEnd;
    private javax.swing.JMenuItem mniHowToUse;
    private javax.swing.JMenuItem mniInfor;
    private javax.swing.JMenuItem mniLearner;
    private javax.swing.JMenuItem mniLogin;
    private javax.swing.JMenuItem mniLogout;
    private javax.swing.JMenuItem mniPoint;
    private javax.swing.JMenuItem mniRevenue;
    private javax.swing.JMenuItem mniScores;
    private javax.swing.JMenuItem mniSpecialized;
    private javax.swing.JMenuItem mniStaff;
    private javax.swing.JMenuItem mniStudent;
    private javax.swing.JMenuItem mniUsername;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenu mnuManage;
    private javax.swing.JMenu mnuStatistic;
    private javax.swing.JMenu mnuSystem;
    // End of variables declaration//GEN-END:variables

    private void init() {
        setLocationRelativeTo(null);
        setIconImage(XImg.getAppIcon());
        if (checkUser()) {
            new Welcome(this, true).setVisible(true);
            new Login(this, true).setVisible(true);
            if(checkUser()){
                System.exit(0);
            }
        }
        new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date date = new Date();
                SimpleDateFormat formater = new SimpleDateFormat("hh:mm:ss a");
                String time = formater.format(date);
                lblTime.setText(time);
            }
        }).start();
        checkLogin();
        checkManager();
    }

    private void openSpecticalized() {
        new QLCD(this, true).setVisible(true);
    }

    private void openCourse() {
        new QLKH(this, true).setVisible(true);
    }

    private void openLearner() {
        new QLNH(this, true).setVisible(true);
    }

    private void openStaff() {
        new QLNV(this, true).setVisible(true);
    }

    private void openStudent() {
        new QLHV(this, true).setVisible(true);
    }

    private void openScores() {
        new THTK(this, true).setVisible(true);
    }

    private void openHelp() {
        new Help(this, true).setVisible(true);
    }

    private void openInfor() {
        new Infor(this, true).setVisible(true);
    }

    private void openUserInfor() {
        new UserInfor(this, true).setVisible(true);
    }

    private void openChangePass() {
        new ChangePass(this, true).setVisible(true);
    }

    private void loginEvt() {
        this.dispose();
        new Login(this, true).setVisible(true);
    }

    private void logoutEvt() {
        Auth.clear();
        isHomeOpened = false;
        this.dispose();
        new Login(this, true).setVisible(true);
    }

    private void endEvt() {
        if (MsgBox.confirm(this, "Xác nhận thoát!")) {
            System.exit(0);
        }
    }

    private boolean checkUser() {
        if (Auth.isLogin()) {
            return false;
        }
        return true;
    }

    private void checkLogin() {
        if (Auth.isLogin()) {
            mniUsername.setText(Auth.user.getIdNV().toUpperCase());
            mniLogin.setVisible(false);
        } else {
            //menu item
            mniUsername.setVisible(false);
            mniLogout.setVisible(false);
            mniChangePass.setEnabled(false);

            mniCourse.setEnabled(false);
            mniLearner.setEnabled(false);
            mniSpecialized.setEnabled(false);
            mniStudent.setEnabled(false);
            mniStaff.setEnabled(false);

            mniScores.setEnabled(false);
            mniPoint.setEnabled(false);
            mniRevenue.setEnabled(false);
            mniAoN.setEnabled(false);

            //button
            btnSpecialized.setEnabled(false);
            btnStudent.setEnabled(false);
            btnCourse.setEnabled(false);
            btnLearner.setEnabled(false);
            isHomeOpened = false;
        }
    }

    private void checkManager() {
        if (!Auth.isManager()) {
            mniStaff.setEnabled(false);
        }
    }
}
