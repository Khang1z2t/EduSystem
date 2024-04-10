package com.edusys.form;

import com.edusys.dao.StaffDAO;
import com.edusys.swing.FileChooser;
import com.edusys.ui.Main;
import com.edusys.utils.AESUtil;
import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import com.edusys.utils.XImg;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

/**
 *
 * @author ngocd
 */
public class User_Form extends javax.swing.JPanel {

    FileChooser fileChooser = new FileChooser("logos/avts");
    StaffDAO dao = new StaffDAO();

    public User_Form() {
        initComponents();
        init();
        userAvt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblUserName = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        btnChangeEmail = new javax.swing.JButton();
        btnChangePass = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        lblEmail1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnGenerateQR = new javax.swing.JButton();
        userAvt = new com.edusys.swing.ImageAvatar();

        setBackground(new java.awt.Color(242, 242, 242));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(123, 188, 196));
        jLabel4.setText("Tên tài khoản:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(123, 188, 196));
        jLabel5.setText("Họ và tên:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(123, 188, 196));
        jLabel6.setText("Email:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(123, 188, 196));
        jLabel7.setText("Mật khẩu:");

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        lblUserName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(123, 188, 196));
        lblUserName.setText("XXXXXXX");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(123, 188, 196));
        lblEmail.setText("a***@***.com");

        btnChangeEmail.setBackground(new java.awt.Color(90, 139, 145));
        btnChangeEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnChangeEmail.setForeground(new java.awt.Color(217, 237, 191));
        btnChangeEmail.setText("Đổi");
        btnChangeEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChangeEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeEmailActionPerformed(evt);
            }
        });

        btnChangePass.setBackground(new java.awt.Color(90, 139, 145));
        btnChangePass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnChangePass.setForeground(new java.awt.Color(217, 237, 191));
        btnChangePass.setText("Đổi");
        btnChangePass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChangePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePassActionPerformed(evt);
            }
        });

        btnConfirm.setBackground(new java.awt.Color(90, 139, 145));
        btnConfirm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(217, 237, 191));
        btnConfirm.setText("Xác nhận");
        btnConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        lblEmail1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEmail1.setForeground(new java.awt.Color(123, 188, 196));
        lblEmail1.setText("Đổi mật khẩu");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(123, 188, 196));
        jLabel8.setText("Mã QR:");

        btnGenerateQR.setBackground(new java.awt.Color(90, 139, 145));
        btnGenerateQR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGenerateQR.setForeground(new java.awt.Color(217, 237, 191));
        btnGenerateQR.setText("Tạo mã QR");
        btnGenerateQR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerateQR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateQRActionPerformed(evt);
            }
        });

        userAvt.setForeground(new java.awt.Color(0, 0, 0));
        userAvt.setBorderSize(1);
        userAvt.setOpaque(true);
        userAvt.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                userAvtAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        userAvt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userAvtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(20, 20, 20)
                                .addComponent(lblEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                                .addComponent(btnChangePass))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGenerateQR, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnChangeEmail))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtName)))))
                .addContainerGap())
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(userAvt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(userAvt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblUserName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChangeEmail)
                    .addComponent(jLabel6)
                    .addComponent(lblEmail))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblEmail1)
                    .addComponent(btnChangePass))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(btnGenerateQR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangeEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeEmailActionPerformed
        // TODO add your handling code here:
        Main.currentInstance.setForm(new ChangeEmail_Form());
    }//GEN-LAST:event_btnChangeEmailActionPerformed

    private void btnChangePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePassActionPerformed
        // TODO add your handling code here:
        Main.currentInstance.setForm(new ChangePass_Form());
    }//GEN-LAST:event_btnChangePassActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        confirmEvt();
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnGenerateQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateQRActionPerformed
        // TODO add your handling code here:
        generateQREvt();
    }//GEN-LAST:event_btnGenerateQRActionPerformed

    private void userAvtAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_userAvtAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_userAvtAncestorAdded

    private void userAvtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userAvtMouseClicked
        // TODO add your handling code here:
        choosePicture();
    }//GEN-LAST:event_userAvtMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeEmail;
    private javax.swing.JButton btnChangePass;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnGenerateQR;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextField txtName;
    private com.edusys.swing.ImageAvatar userAvt;
    // End of variables declaration//GEN-END:variables
    private void init() {
        lblUserName.setText(Auth.user.getIdNV());
        txtName.setText(Auth.user.getName());
        userAvt.setIcon(XImg.read("user.png"));
        if (Auth.user.getImage() != null) {
            userAvt.setIcon(XImg.read(Auth.user.getImage()));
        }
        if (!Auth.user.getEmail().equals("")) {
            lblEmail.setText(Auth.hidenEmail(Auth.user.getEmail()));
        } else {
            lblEmail.setText("Chưa có email");
            btnChangeEmail.setText("Thêm");
        }
    }

    private void generateQREvt() {
        try {
            String qrCodeData = Auth.user.getIdNV() + "," + Auth.user.getPass();

            // Mã hóa dữ liệu
            String encrytedData = AESUtil.encrypt(qrCodeData);

            // Lưu QR code
            String path_file = "config/" + Auth.user.getIdNV() + "-key.png";
            ByteArrayOutputStream out = QRCode.from(encrytedData).to(ImageType.PNG).stream();
            File file = new File(path_file);
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(out.toByteArray());
            fos.close();

            if (MsgBox.confirm(this, "Mã Qr đã được lưu. Bạn có muốn mở lên không?")) {
//                Desktop.getDesktop().open(file);
                Runtime.getRuntime().exec("explorer.exe /select," + file);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void confirmEvt() {
        String name = txtName.getText();
        String avt = userAvt.getToolTipText();
        Auth.user.setName(name);
        Auth.user.setImage(avt);
        dao.update(Auth.user);
        MsgBox.alert(this, "Đã cập nhật thông tin.");
        Main.currentInstance.setForm(this);
    }

    private void choosePicture() {
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            fileChooser.setDialogTitle("Chọn hình Avatar");
            File file = fileChooser.getSelectedFile();
            XImg.save(file);
            ImageIcon icon = XImg.read(file.getName());
            userAvt.setIcon(icon);
            userAvt.setToolTipText(file.getName());
        }
    }
}
