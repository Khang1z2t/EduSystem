package com.edusys.form;

import com.edusys.dao.CourseDao;
import com.edusys.dao.LearnerDAO;
import com.edusys.dao.SpecializedDAO;
import com.edusys.dao.StudentDAO;
import com.edusys.entity.Course;
import com.edusys.entity.Learner;
import com.edusys.entity.Specialized;
import com.edusys.entity.Student;
import com.edusys.swing.ScrollBar;
import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import com.edusys.utils.XDate;
import java.awt.Color;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 * @author ngocd
 */
public class QLHV_Form extends javax.swing.JPanel {

    SpecializedDAO cdDAO = new SpecializedDAO();
    CourseDao khDAO = new CourseDao();
    LearnerDAO nhDAO = new LearnerDAO();
    StudentDAO hvDAO = new StudentDAO();

    public QLHV_Form() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        cboSpecialized = new javax.swing.JComboBox<>();
        tabs = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        spTblStudent = new javax.swing.JScrollPane();
        tblStudent = new com.edusys.swing.Table();
        jPanel4 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        txtFindLearner = new javax.swing.JTextField();
        spTblLeaner = new javax.swing.JScrollPane();
        tblLearner = new com.edusys.swing.Table();
        jPanel5 = new javax.swing.JPanel();
        cboCourse = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(242, 242, 242));

        jPanel2.setBackground(new java.awt.Color(242, 242, 242));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(90, 139, 145), 3, true), "Chuyên Đề", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(123, 188, 196))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(90, 139, 145));

        cboSpecialized.setBackground(new java.awt.Color(123, 188, 196));
        cboSpecialized.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboSpecialized.setForeground(new java.awt.Color(217, 237, 191));
        cboSpecialized.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboSpecialized.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboSpecialized.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSpecializedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboSpecialized, 0, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboSpecialized, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(242, 242, 242));
        jPanel3.setForeground(new java.awt.Color(123, 188, 196));

        btnDelete.setBackground(new java.awt.Color(90, 139, 145));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(217, 237, 191));
        btnDelete.setText("Xóa khỏi khóa học");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(90, 139, 145));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(217, 237, 191));
        btnUpdate.setText("Cập nhật theo điểm");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        tblStudent.setBackground(new java.awt.Color(242, 242, 242));
        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        spTblStudent.setViewportView(tblStudent);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate))
                    .addComponent(spTblStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spTblStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("Học Viên", jPanel3);

        jPanel4.setBackground(new java.awt.Color(242, 242, 242));
        jPanel4.setForeground(new java.awt.Color(123, 188, 196));

        btnAdd.setBackground(new java.awt.Color(90, 139, 145));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(217, 237, 191));
        btnAdd.setText("Thêm vào khóa học");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(242, 242, 242));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(123, 188, 196))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(123, 188, 196));

        txtFindLearner.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFindLearner.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFindLearnerKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFindLearner)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(txtFindLearner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        tblLearner.setBackground(new java.awt.Color(242, 242, 242));
        tblLearner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        spTblLeaner.setViewportView(tblLearner);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdd))
                    .addComponent(spTblLeaner, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTblLeaner, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd)
                .addContainerGap())
        );

        tabs.addTab("Người Học", jPanel4);

        jPanel5.setBackground(new java.awt.Color(242, 242, 242));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(90, 139, 145), 3, true), "Khóa Học", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(123, 188, 196))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(90, 139, 145));

        cboCourse.setBackground(new java.awt.Color(123, 188, 196));
        cboCourse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboCourse.setForeground(new java.awt.Color(217, 237, 191));
        cboCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cboCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCourseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboCourse, 0, 261, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboSpecializedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSpecializedActionPerformed
        // TODO add your handling code here:
        fillComboBoxKH();
    }//GEN-LAST:event_cboSpecializedActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        deleteHV();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        updateHV();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        addHV();
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtFindLearnerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindLearnerKeyReleased
        // TODO add your handling code here:
        fillTableNH();
    }//GEN-LAST:event_txtFindLearnerKeyReleased

    private void cboCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCourseActionPerformed
        // TODO add your handling code here:
        //        fillComboBoxKH();
    }//GEN-LAST:event_cboCourseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboCourse;
    private javax.swing.JComboBox<String> cboSpecialized;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane spTblLeaner;
    private javax.swing.JScrollPane spTblStudent;
    private javax.swing.JTabbedPane tabs;
    private com.edusys.swing.Table tblLearner;
    private com.edusys.swing.Table tblStudent;
    private javax.swing.JTextField txtFindLearner;
    // End of variables declaration//GEN-END:variables
    private void init() {
        this.fillComboBoxCD();
    }

    private void fillComboBoxCD() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboSpecialized.getModel();
        model.removeAllElements();
        List<Specialized> list = cdDAO.selectAll();
        for (Specialized cd : list) {
            model.addElement(cd);
        }
        this.fillComboBoxKH();
    }

    private void fillComboBoxKH() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboCourse.getModel();
        model.removeAllElements();
        Specialized cd = (Specialized) cboSpecialized.getSelectedItem();
        if (cd != null) {
            List<Course> list = khDAO.selectByCD(cd.getIdCD());
            if (list.isEmpty()) {
                MsgBox.alert(this, "Chuyên đề này chưa có khóa học nào.");
            } else {
                for (Course kh : list) {
                    model.addElement(kh);
                }
            }

            this.fillTableHV();
        }
    }

    private void fillTableHV() {
        DefaultTableModel model = (DefaultTableModel) tblStudent.getModel();
        model.setColumnIdentifiers(new Object[]{"STT", "Mã HV", "Mã NH", "Họ và Tên", "Điểm"});
        model.setRowCount(0);
        Course kh = (Course) cboCourse.getSelectedItem();
        if (kh != null) {
            List<Student> list = hvDAO.selectByKH(kh.getIdKH());
            for (int i = 0; i < list.size(); i++) {
                Student s = list.get(i);
                String hoten = nhDAO.selectById(s.getIdNH()).getName();
                model.addRow(new Object[]{
                        i + 1, s.getIdHV(), s.getIdNH(), hoten, s.getScore()
                });
            }
            this.fillTableNH();
        }
        spTblStudent.setVerticalScrollBar(new ScrollBar());
        spTblStudent.getVerticalScrollBar().setBackground(Color.white);
        spTblStudent.getViewport().setBackground(Color.white);
    }

    private void fillTableNH() {
        DefaultTableModel model = (DefaultTableModel) tblLearner.getModel();
        model.setColumnIdentifiers(new Object[]{"Mã NH", "Họ và Tên", "Giới tính", "Ngày sinh", "Điện thoại", "Email"});
        model.setRowCount(0);
        Course kh = (Course) cboCourse.getSelectedItem();
        String keyword = txtFindLearner.getText();
        List<Learner> list = nhDAO.selectNotInCourse(kh.getIdKH(), keyword);
        for (Learner nh : list) {
            model.addRow(new Object[]{
                    nh.getIdNH(), nh.getName(), nh.isGender() ? "Nam" : "Nữ",
                    XDate.toString(nh.getBrithday(), "dd/MM/yyyy"), nh.getPhone(), nh.getEmail()
            });
        }
        spTblLeaner.setVerticalScrollBar(new ScrollBar());
        spTblLeaner.getVerticalScrollBar().setBackground(Color.white);
        spTblLeaner.getViewport().setBackground(Color.white);
    }

    private void addHV() {
        Course kh = (Course) cboCourse.getSelectedItem();
        int[] rows = tblLearner.getSelectedRows();
        for (int i : rows) {
            String idnh = (String) tblLearner.getValueAt(i, 0);
            Student hv = new Student();
            hv.setIdKH(kh.getIdKH());
            hv.setIdNH(idnh);
            hv.setScore(0);
            hvDAO.insert(hv);
        }
        this.fillTableHV();
        this.fillTableNH();
    }

    private void deleteHV() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa học viên");
            return;
        }
        int[] rows = tblStudent.getSelectedRows();
        if (rows.length > 0 && MsgBox.confirm(this, "Bạn có chắc chắn muốn xóa?")) {
            for (int i : rows) {
                int idhv = (int) tblStudent.getValueAt(i, 1);
                hvDAO.delete(idhv);
            }
            this.fillTableHV();
            this.fillTableNH();
        }

    }

    private void updateHV() {
        int n = tblStudent.getRowCount();
        for (int i = 0; i < n; i++) {
            int idhv = (Integer) tblStudent.getValueAt(i, 1);
            float diem = Float.valueOf(tblStudent.getValueAt(i, 4).toString());
            Student hv = hvDAO.selectById(idhv);
            hv.setScore(diem);
            hvDAO.update(hv);
        }
        this.fillTableHV();
        MsgBox.alert(this, "Cập nhật điểm thành công");
    }
}
