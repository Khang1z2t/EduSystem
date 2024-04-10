package com.edusys.form;

import com.edusys.dao.StaffDAO;
import com.edusys.entity.Staff;
import com.edusys.swing.FileChooser;
import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import com.edusys.utils.XImg;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ngocd
 */
public class QLNV_Form extends javax.swing.JPanel {

    FileChooser fileChooser = new FileChooser("logos/avts");
    StaffDAO dao = new StaffDAO();
    int index = -1;

    public QLNV_Form() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        popupMenu = new javax.swing.JPopupMenu();
        pAdd = new javax.swing.JMenuItem();
        pUpdate = new javax.swing.JMenuItem();
        pDelete = new javax.swing.JMenuItem();
        tabs = new javax.swing.JTabbedPane();
        panelEdit = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPre = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        txtCheckPass = new javax.swing.JPasswordField();
        rdoManager = new javax.swing.JRadioButton();
        rdoStaff = new javax.swing.JRadioButton();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cboTinhTrang = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        lblPic = new javax.swing.JLabel();
        lblRecord = new javax.swing.JLabel();
        panelList = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStaff = new com.edusys.swing.Table();

        pAdd.setText("Thêm");
        pAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pAddActionPerformed(evt);
            }
        });
        popupMenu.add(pAdd);

        pUpdate.setText("Sửa");
        pUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pUpdateActionPerformed(evt);
            }
        });
        popupMenu.add(pUpdate);

        pDelete.setText("Xóa");
        pDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pDeleteActionPerformed(evt);
            }
        });
        popupMenu.add(pDelete);

        setBackground(new java.awt.Color(242, 242, 242));

        tabs.setBackground(new java.awt.Color(242, 242, 242));

        panelEdit.setBackground(new java.awt.Color(242, 242, 242));
        panelEdit.setForeground(new java.awt.Color(123, 188, 196));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(123, 188, 196));
        jLabel2.setText("Ảnh");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(123, 188, 196));
        jLabel5.setText("Mật khẩu");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(123, 188, 196));
        jLabel6.setText("Xác nhận mật khẩu");

        btnAdd.setBackground(new java.awt.Color(90, 139, 145));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(217, 237, 191));
        btnAdd.setText("Thêm");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnLast.setBackground(new java.awt.Color(90, 139, 145));
        btnLast.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLast.setForeground(new java.awt.Color(217, 237, 191));
        btnLast.setText(">|");
        btnLast.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(90, 139, 145));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(217, 237, 191));
        btnUpdate.setText("Sửa");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(90, 139, 145));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(217, 237, 191));
        btnDelete.setText("Xóa");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnNew.setBackground(new java.awt.Color(90, 139, 145));
        btnNew.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNew.setForeground(new java.awt.Color(217, 237, 191));
        btnNew.setText("Mới");
        btnNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnFirst.setBackground(new java.awt.Color(90, 139, 145));
        btnFirst.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFirst.setForeground(new java.awt.Color(217, 237, 191));
        btnFirst.setText("|<");
        btnFirst.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPre.setBackground(new java.awt.Color(90, 139, 145));
        btnPre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPre.setForeground(new java.awt.Color(217, 237, 191));
        btnPre.setText("<<");
        btnPre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(90, 139, 145));
        btnNext.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNext.setForeground(new java.awt.Color(217, 237, 191));
        btnNext.setText(">>");
        btnNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(123, 188, 196));
        jLabel8.setText("Họ và tên");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(123, 188, 196));
        jLabel9.setText("Vai trò");

        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtCheckPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        rdoManager.setBackground(new java.awt.Color(242, 242, 242));
        buttonGroup1.add(rdoManager);
        rdoManager.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rdoManager.setForeground(new java.awt.Color(123, 188, 196));
        rdoManager.setText("Trưởng phòng");

        rdoStaff.setBackground(new java.awt.Color(242, 242, 242));
        buttonGroup1.add(rdoStaff);
        rdoStaff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rdoStaff.setForeground(new java.awt.Color(123, 188, 196));
        rdoStaff.setText("Nhân viên");

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(123, 188, 196));
        jLabel10.setText("Email");

        txtID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(123, 188, 196));
        jLabel11.setText("Tình trạng hôn nhân");

        cboTinhTrang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(123, 188, 196));
        jLabel3.setText("Mã nhân viên");

        lblPic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/img/profile.png"))); // NOI18N
        lblPic.setText("Ảnh");
        lblPic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(123, 188, 196)));
        lblPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPicMouseClicked(evt);
            }
        });

        lblRecord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRecord.setForeground(new java.awt.Color(123, 188, 196));
        lblRecord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRecord.setText("0/0");

        javax.swing.GroupLayout panelEditLayout = new javax.swing.GroupLayout(panelEdit);
        panelEdit.setLayout(panelEditLayout);
        panelEditLayout.setHorizontalGroup(
            panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEditLayout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addGap(6, 6, 6)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRecord, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPre, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEditLayout.createSequentialGroup()
                        .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblPic, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rdoManager, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(rdoStaff))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboTinhTrang, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCheckPass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPass)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtName)
                            .addGroup(panelEditLayout.createSequentialGroup()
                                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        panelEditLayout.setVerticalGroup(
            panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEditLayout.createSequentialGroup()
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPic, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEditLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(panelEditLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCheckPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoManager))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdoStaff)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdd)
                        .addComponent(btnUpdate)
                        .addComponent(btnDelete)
                        .addComponent(btnNew)
                        .addComponent(btnLast)
                        .addComponent(btnNext)
                        .addComponent(btnPre)
                        .addComponent(btnFirst)))
                .addContainerGap())
        );

        tabs.addTab("Cập Nhật", panelEdit);

        panelList.setBackground(new java.awt.Color(242, 242, 242));
        panelList.setForeground(new java.awt.Color(123, 188, 196));

        tblStaff.setBackground(new java.awt.Color(242, 242, 242));
        tblStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblStaffMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblStaff);

        javax.swing.GroupLayout panelListLayout = new javax.swing.GroupLayout(panelList);
        panelList.setLayout(panelListLayout);
        panelListLayout.setHorizontalGroup(
            panelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelListLayout.setVerticalGroup(
            panelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        tabs.addTab("Danh Sách", panelList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabs))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pAddActionPerformed
        // TODO add your handling code here:
        tabs.setSelectedIndex(0);
        clearForm();
    }//GEN-LAST:event_pAddActionPerformed

    private void pUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pUpdateActionPerformed
        // TODO add your handling code here:
        this.index = tblStaff.getSelectedRow();
        if (this.index >= 0) {
            this.edit();
        }
    }//GEN-LAST:event_pUpdateActionPerformed

    private void pDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pDeleteActionPerformed
        // TODO add your handling code here:
        this.index = tblStaff.getSelectedRow();
        if (this.index >= 0) {
            deleteNV();
        }
    }//GEN-LAST:event_pDeleteActionPerformed

    private void lblPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPicMouseClicked
        // TODO add your handling code here:
        choosePicture();
    }//GEN-LAST:event_lblPicMouseClicked

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        navNext();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreActionPerformed
        // TODO add your handling code here:
        navPre();
    }//GEN-LAST:event_btnPreActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        navFirst();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        deleteNV();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        updateNV();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        navLast();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        addNV();
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblStaffMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStaffMouseReleased
        // TODO add your handling code here:
        if (evt.isPopupTrigger()) {
            showPopup(evt);
        }
    }//GEN-LAST:event_tblStaffMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPre;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboTinhTrang;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPic;
    private javax.swing.JLabel lblRecord;
    private javax.swing.JMenuItem pAdd;
    private javax.swing.JMenuItem pDelete;
    private javax.swing.JMenuItem pUpdate;
    private javax.swing.JPanel panelEdit;
    private javax.swing.JPanel panelList;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JRadioButton rdoManager;
    private javax.swing.JRadioButton rdoStaff;
    private javax.swing.JTabbedPane tabs;
    private com.edusys.swing.Table tblStaff;
    private javax.swing.JPasswordField txtCheckPass;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
    private void init() {
        this.fillTable();
        this.fillComboBox();
        this.index = -1;
        this.updateStatus();

        if (!Auth.isLogin()) {
            MsgBox.alert(this, "Vui lòng đăng nhập.");
            System.exit(0);
        }
    }

    private void choosePicture() {
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            fileChooser.setDialogTitle("Chọn hình chuyên đề");
            File file = fileChooser.getSelectedFile();
            XImg.save(file);
            ImageIcon icon = XImg.read(file.getName());
            lblPic.setIcon(icon);
            lblPic.setToolTipText(file.getName());
            lblPic.setText("");
        }
    }

    private void addNV() {
        if (valiForm()) {
            Staff s = getForm();
            String checkPass = String.valueOf(txtCheckPass.getPassword());
            if (!checkPass.equalsIgnoreCase(s.getPass())) {
                MsgBox.alert(this, "Xác nhận mật khẩu không đúng!");
            } else {
                try {
                    dao.insert(s);
                    this.fillTable();
                    this.clearForm();
                    MsgBox.alert(this, "Thêm mới thành công.");
                } catch (Exception e) {
                    MsgBox.alert(this, "Thêm mới thất bại.");
                    throw new RuntimeException(e);
                }
            }
        }

    }

    private void updateNV() {
        Staff s = getForm();
        String checkPass = String.valueOf(txtCheckPass.getPassword());
        if (!checkPass.equalsIgnoreCase(s.getPass())) {
            MsgBox.alert(this, "Xác nhận mật khẩu không đúng!");
        } else if (Auth.isAdmin()) {
            MsgBox.alert(this, "Bạn không có quyền chỉnh sửa tài khoản này!!");
        } else {
            try {
                dao.update(s);
                this.fillTable();
                MsgBox.alert(this, "Cập nhật thành công.");
            } catch (Exception e) {
                MsgBox.alert(this, "Cập nhật thất bại.");
                throw new RuntimeException(e);
            }
        }
    }

    private void deleteNV() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa nhân viên!");
        } else {
            String id;
            if (tabs.getSelectedIndex() == 1) {
                id = (String) tblStaff.getValueAt(this.index, 0);
            } else {
                id = txtID.getText();
            }
            if (Auth.isAdmin()) {
                MsgBox.alert(this, "Bạn không có quyền xóa tài khoản này!!");
            } else if (id.equals(Auth.user.getIdNV())) {
                MsgBox.alert(this, "Bạn không được xóa chính mình!");
            } else if (MsgBox.confirm(this, "Bạn có muốn xóa nhân viên này?")) {
                try {
                    dao.delete(id);
                    this.fillTable();
                    this.clearForm();
                    MsgBox.alert(this, "Xóa thành công.");
                } catch (Exception e) {
                    MsgBox.alert(this, "Xóa thất bại.");
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private void clearForm() {
        Staff s = new Staff();
        this.setForm(s);
        this.index = -1;
        this.updateStatus();
    }

    private void navFirst() {
        this.index = 0;
        this.edit();
    }

    private void navPre() {
        if (this.index > 0) {
            this.index--;
            this.edit();
        }
    }

    private void navNext() {
        if (this.index < tblStaff.getRowCount() - 1) {
            this.index++;
            this.edit();
        }
    }

    private void navLast() {
        this.index = tblStaff.getRowCount() - 1;
        this.edit();
    }

    private void edit() {
        String id = (String) tblStaff.getValueAt(this.index, 0);
        Staff s = dao.selectById(id);
        this.setForm(s);
//        this.updateRecord();
        tabs.setSelectedIndex(0);
        this.updateStatus();
    }

    private void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblStaff.getModel();
        model.setColumnIdentifiers(new String[]{"Mã NV", "Họ và Tên", "Email", "Mật khẩu", "Tình trạng", "Hình", "Vai trò"});
        model.setRowCount(0);
        try {
            List<Staff> ds = dao.selectAll();
            for (Staff s : ds) {
                Object[] obj = {s.getIdNV(),
                    s.getName(),
                    s.getEmail(),
                    s.getPass(),
                    s.getTinhTrang(),
                    s.getImage(),
                    s.isRole() ? "Trưởng phòng" : "Nhân viên"
                };
                model.addRow(obj);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
            throw new RuntimeException(e);
        }

    }

    private void setForm(Staff s) {
        txtID.setText(s.getIdNV());
        txtEmail.setText(s.getEmail());
        txtName.setText(s.getName());
        txtPass.setText(s.getPass());
        rdoManager.setSelected(s.isRole());
        rdoStaff.setSelected(!s.isRole());
        txtCheckPass.setText("");
        cboTinhTrang.setSelectedItem(s.getTinhTrang());
        if (s.getImage() != null) {
            lblPic.setToolTipText(s.getImage());
            lblPic.setIcon(XImg.read(s.getImage()));
            lblPic.setText("");
        } else {
            lblPic.setIcon(new ImageIcon("logos/profile.png"));
            lblPic.setToolTipText("profile.png");
            lblPic.setText("Ảnh");
        }
    }

    private Staff getForm() {
        Staff s = new Staff();
        s.setIdNV(txtID.getText());
        s.setEmail(txtEmail.getText());
        s.setName(txtName.getText());
        s.setPass(String.valueOf(txtPass.getPassword()));
        s.setRole(rdoManager.isSelected());
        s.setTinhTrang((String) cboTinhTrang.getSelectedItem());
        s.setImage(lblPic.getToolTipText());
        return s;
    }

    private void updateStatus() {
        boolean edit = (this.index >= 0);
        boolean first = (this.index == 0);
        boolean last = (this.index == tblStaff.getRowCount() - 1);

        //form status
        txtID.setEditable(!edit);
        btnAdd.setEnabled(!edit);
        btnUpdate.setEnabled(edit);
        btnDelete.setEnabled(edit);

        //navigate status
        btnFirst.setEnabled(edit && !first);
        btnPre.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);

        updateRecord();
    }

    private void updateRecord() {
        int total = tblStaff.getRowCount();
        lblRecord.setText((index + 1) + "/" + total);
    }

    private boolean valiForm() {
        String id = txtID.getText().trim();
        String name = txtName.getText().trim();
        String pass = String.valueOf(txtPass.getPassword()).trim();
        String checkPass = String.valueOf(txtCheckPass.getPassword()).trim();

        if (id.isBlank()) {
            MsgBox.alert(this, "Mã nhân viên không được để trống!");
            return false;
        }

        if (name.isBlank()) {
            MsgBox.alert(this, "Họ và tên không được để trống!");
            return false;
        }

        if (pass.isBlank()) {
            MsgBox.alert(this, "Mật khẩu không được để trống!");
            return false;
        }

        if (checkPass.isBlank()) {
            MsgBox.alert(this, "Xác nhận mật khẩu không được để trống!");
            return false;
        }

        if (!pass.equals(checkPass)) {
            MsgBox.alert(this, "Xác nhận mật khẩu không đúng!");
            return false;
        }

        Staff nv = dao.selectById(id);
        if (nv != null) {
            MsgBox.alert(this, "Tên tài khoản đã tồn tại!");
            return false;
        }

        return true;
    }

    private void fillComboBox() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboTinhTrang.getModel();
        model.removeAllElements();
        HashSet<String> set = new HashSet<>();
        try {
            List<Staff> list = dao.selectAll();
            for (Staff s : list) {
                String tinhTrang = s.getTinhTrang();
                if (!set.contains(tinhTrang)) {
                    model.addElement(tinhTrang);
                    set.add(tinhTrang);
                }
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
            throw new RuntimeException(e);
        }
    }

    private void showPopup(MouseEvent e) {
        if (SwingUtilities.isRightMouseButton(e)) {
            int row = tblStaff.rowAtPoint(e.getPoint());
            int column = tblStaff.columnAtPoint(e.getPoint());
            tblStaff.getSelectionModel().setSelectionInterval(row, row);
            popupMenu.show(tblStaff, e.getX(), e.getY());
        }
    }
}
