
package com.edusys.form;

import com.edusys.dao.SpecializedDAO;
import com.edusys.entity.Specialized;
import com.edusys.swing.FileChooser;
import com.edusys.swing.ScrollBar;
import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import com.edusys.utils.XImg;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ngocd
 */
public class QLCD_Form extends javax.swing.JPanel {

    SpecializedDAO dao = new SpecializedDAO();
    FileChooser fileChooser = new FileChooser("logos");
    int index = -1;

    public QLCD_Form() {
        initComponents();
        init();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu = new javax.swing.JPopupMenu();
        pAdd = new javax.swing.JMenuItem();
        pUpdate = new javax.swing.JMenuItem();
        pDelete = new javax.swing.JMenuItem();
        tabs = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblPic = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFee = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDecribe = new javax.swing.JTextArea();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPre = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        lblRecord = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        spTable = new javax.swing.JScrollPane();
        tblSpecialized = new com.edusys.swing.Table();

        popupMenu.setBackground(new java.awt.Color(242, 242, 242));
        popupMenu.setOpaque(false);

        pAdd.setBackground(new java.awt.Color(242, 242, 242));
        pAdd.setText("Thêm");
        pAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pAddActionPerformed(evt);
            }
        });
        popupMenu.add(pAdd);

        pUpdate.setBackground(new java.awt.Color(242, 242, 242));
        pUpdate.setText("Sửa");
        pUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pUpdateActionPerformed(evt);
            }
        });
        popupMenu.add(pUpdate);

        pDelete.setBackground(new java.awt.Color(242, 242, 242));
        pDelete.setText("Xóa");
        pDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pDeleteActionPerformed(evt);
            }
        });
        popupMenu.add(pDelete);

        setBackground(new java.awt.Color(242, 242, 242));

        tabs.setForeground(new java.awt.Color(217, 237, 191));

        jPanel2.setBackground(new java.awt.Color(242, 242, 242));
        jPanel2.setForeground(new java.awt.Color(123, 188, 196));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(123, 188, 196));
        jLabel2.setText("Hình logo");

        lblPic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/img/profile.png"))); // NOI18N
        lblPic.setText("Ảnh");
        lblPic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(123, 188, 196)));
        lblPic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPicMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(123, 188, 196));
        jLabel4.setText("Mã chuyên đề");

        txtID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(123, 188, 196));
        jLabel5.setText("Tên chuyên đề");

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(123, 188, 196));
        jLabel6.setText("Thời lượng (giờ)");

        txtTime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(123, 188, 196));
        jLabel7.setText("Học phí");

        txtFee.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(123, 188, 196));
        jLabel8.setText("Mô tả chuyên đề");

        txtDecribe.setColumns(20);
        txtDecribe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDecribe.setRows(5);
        jScrollPane2.setViewportView(txtDecribe);

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

        lblRecord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRecord.setForeground(new java.awt.Color(123, 188, 196));
        lblRecord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRecord.setText("0/0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPic, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID)
                            .addComponent(txtName)
                            .addComponent(txtTime)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtFee)))
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRecord, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPre, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLast)
                        .addComponent(btnNext)
                        .addComponent(btnPre)
                        .addComponent(btnFirst)
                        .addComponent(lblRecord))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNew, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("Câp Nhật", jPanel2);

        jPanel4.setBackground(new java.awt.Color(242, 242, 242));
        jPanel4.setForeground(new java.awt.Color(123, 188, 196));

        tblSpecialized.setBackground(new java.awt.Color(242, 242, 242));
        tblSpecialized.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSpecialized.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblSpecializedMouseReleased(evt);
            }
        });
        spTable.setViewportView(tblSpecialized);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spTable)
                .addContainerGap())
        );

        tabs.addTab("Danh Sách", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblPicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPicMouseClicked
        // TODO add your handling code here:
        choosePicture();
    }//GEN-LAST:event_lblPicMouseClicked

    private void txtTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        updateCD();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        addCD();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        deleteCD();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        navLast();
    }//GEN-LAST:event_btnLastActionPerformed

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

    private void pAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pAddActionPerformed
        // TODO add your handling code here:
        tabs.setSelectedIndex(0);
        clearForm();
    }//GEN-LAST:event_pAddActionPerformed

    private void pUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pUpdateActionPerformed
        // TODO add your handling code here:
        this.index = tblSpecialized.getSelectedRow();
        if (this.index >= 0) {
            this.edit();
        }
    }//GEN-LAST:event_pUpdateActionPerformed

    private void pDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pDeleteActionPerformed
        // TODO add your handling code here:
        this.index = tblSpecialized.getSelectedRow();
        if (this.index >= 0) {
            deleteCD();
        }
    }//GEN-LAST:event_pDeleteActionPerformed

    private void tblSpecializedMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSpecializedMouseReleased
        // TODO add your handling code here:
        if(evt.isPopupTrigger()){
            showPopup(evt);
        }
    }//GEN-LAST:event_tblSpecializedMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPre;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPic;
    private javax.swing.JLabel lblRecord;
    private javax.swing.JMenuItem pAdd;
    private javax.swing.JMenuItem pDelete;
    private javax.swing.JMenuItem pUpdate;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JScrollPane spTable;
    private javax.swing.JTabbedPane tabs;
    private com.edusys.swing.Table tblSpecialized;
    private javax.swing.JTextArea txtDecribe;
    private javax.swing.JTextField txtFee;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables
    private void init() {
        this.fillTable();
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
        }
    }

    private void addCD() {
        if (valiForm()) {
            String id = txtID.getText();
            if (dao.selectById(id) != null) {
                MsgBox.alert(this, "Mã chuyên đề đã tồn tại.");
            } else {
                Specialized cd = getForm();
                try {
                    dao.insert(cd);
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

    private void updateCD() {
        if (valiForm()) {
            if (!Auth.isManager()) {
                MsgBox.alert(this, "Bạn không có quyền cập nhật chuyên đề.");
                return;
            }
            Specialized cd = getForm();
            try {
                dao.update(cd);
                this.fillTable();
                MsgBox.alert(this, "Cập nhật thành công.");
            } catch (Exception e) {
                MsgBox.alert(this, "Cập nhật thất bại.");
                throw new RuntimeException(e);
            }
        }
    }

    private void deleteCD() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa chuyên đề.");
            return;
        }
        if (!MsgBox.confirm(this, "Bạn có muốn xóa chuyên đề này?")) {
            return;
        }

        String id;
        if (tabs.getSelectedIndex() == 1){
            id=(String) tblSpecialized.getValueAt(index, 0);
        } else {
            id = txtID.getText();
        }
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

    private void clearForm() {
        Specialized cd = new Specialized();
        this.setForm(cd);
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
        if (this.index < tblSpecialized.getRowCount() - 1) {
            this.index++;
            this.edit();
        }
    }

    private void navLast() {
        this.index = tblSpecialized.getRowCount() - 1;
        this.edit();
    }

    private void edit() {
        String id = (String) tblSpecialized.getValueAt(this.index, 0);
        Specialized cd = dao.selectById(id);
        this.setForm(cd);
        tabs.setSelectedIndex(0);
        this.updateStatus();
    }

    private void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblSpecialized.getModel();
        model.setColumnIdentifiers(new String[]{"Mã CD", "Tên CD", "Thời lượng", "Học phí", "Hình"});
        model.setRowCount(0);
        try {
            List<Specialized> ds = dao.selectAll();
            for (Specialized s : ds) {
                Object[] obj = {s.getIdCD(),
                    s.getName(),
                    s.getTime(),
                    s.getCost(),
                    s.getImage()
                };
                model.addRow(obj);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
            throw new RuntimeException(e);
        }
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.white);
        spTable.getViewport().setBackground(Color.white);
    }

    private void setForm(Specialized cd) {
        txtID.setText(cd.getIdCD());
        txtName.setText(cd.getName());
        txtTime.setText(String.valueOf(cd.getTime()));
        txtFee.setText(String.valueOf(cd.getCost()));
        txtDecribe.setText(cd.getDecribe());
        if (cd.getImage() != null) {
            lblPic.setToolTipText(cd.getImage());
            lblPic.setIcon(XImg.read(cd.getImage()));
        } else {
            lblPic.setIcon(new ImageIcon("logos/profile.png"));
            lblPic.setToolTipText("profile.png");
            lblPic.setText("Ảnh");
        }
    }

    private Specialized getForm() {
        Specialized cd = new Specialized();
        cd.setIdCD(txtID.getText());
        cd.setName(txtName.getText());
        cd.setTime(Integer.parseInt(txtTime.getText()));
        cd.setCost(Float.parseFloat(txtFee.getText()));
        cd.setDecribe(txtDecribe.getText());
        cd.setImage(lblPic.getToolTipText());
        return cd;
    }

    private void updateStatus() {
        boolean edit = (this.index >= 0);
        boolean first = (this.index == 0);
        boolean last = (this.index == tblSpecialized.getRowCount() - 1);
        
        //form state
        txtID.setEditable(!edit);
        btnAdd.setEnabled(!edit);
        btnUpdate.setEnabled(edit);
        btnDelete.setEnabled(edit);

        //Directional state
        btnPre.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnFirst.setEnabled(edit && !first);
        btnLast.setEnabled(edit && !last);
        
        updateRecord();
    }
    
    private void updateRecord() {
        int total = tblSpecialized.getRowCount();
        lblRecord.setText((index + 1) + "/" + total);
    }

    private boolean valiForm() {
        if (txtID.getText().isEmpty()) {
            MsgBox.alert(this, "Không để trống mã chuyên đề");
            txtID.requestFocus();
            return false;
        }

        if (txtName.getText().isEmpty()) {
            MsgBox.alert(this, "Không để trống tên chuyên đề");
            txtName.requestFocus();
            return false;
        }

        if (txtTime.getText().isEmpty()) {
            MsgBox.alert(this, "Không để trống thời lượng");
            txtTime.requestFocus();
            return false;
        }

        if (txtFee.getText().isEmpty()) {
            MsgBox.alert(this, "Không để trống học phí");
            txtFee.requestFocus();
            return false;
        }

        return true;
    }
    private void showPopup(MouseEvent e){
        if (SwingUtilities.isRightMouseButton(e)) {
            int row = tblSpecialized.rowAtPoint(e.getPoint());
            int column = tblSpecialized.columnAtPoint(e.getPoint());
            tblSpecialized.getSelectionModel().setSelectionInterval(row, row);
            popupMenu.show(tblSpecialized, e.getX(), e.getY());
        }
    }
}
