package com.edusys.form;

import com.edusys.dao.CourseDao;
import com.edusys.dao.StatisticDAO;
import com.edusys.entity.Course;
import com.edusys.swing.FileChooser;
import com.edusys.swing.ScrollBar;
import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author ngocd
 */
public class THTK_Form extends javax.swing.JPanel {

    StatisticDAO tkDAO = new StatisticDAO();
    CourseDao khDAO = new CourseDao();

    public THTK_Form() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cboKhoaHoc = new javax.swing.JComboBox<>();
        spBangDiem = new javax.swing.JScrollPane();
        tblBangDiem = new com.edusys.swing.Table();
        jPanel4 = new javax.swing.JPanel();
        spLearner = new javax.swing.JScrollPane();
        tblLearner = new com.edusys.swing.Table();
        jPanel5 = new javax.swing.JPanel();
        spCD = new javax.swing.JScrollPane();
        tblSpecializedScore = new com.edusys.swing.Table();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cboYear = new javax.swing.JComboBox<>();
        printReport = new javax.swing.JButton();
        spRevenue = new javax.swing.JScrollPane();
        tblRevenue = new com.edusys.swing.Table();

        setBackground(new java.awt.Color(242, 242, 242));

        jPanel3.setBackground(new java.awt.Color(242, 242, 242));
        jPanel3.setForeground(new java.awt.Color(123, 188, 196));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(123, 188, 196));
        jLabel3.setText("Khóa học");

        cboKhoaHoc.setBackground(new java.awt.Color(123, 188, 196));
        cboKhoaHoc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboKhoaHoc.setForeground(new java.awt.Color(217, 237, 191));
        cboKhoaHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboKhoaHocActionPerformed(evt);
            }
        });

        tblBangDiem.setBackground(new java.awt.Color(242, 242, 242));
        tblBangDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        spBangDiem.setViewportView(tblBangDiem);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spBangDiem)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboKhoaHoc, 0, 603, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spBangDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        tabs.addTab("Bảng Điểm", jPanel3);

        jPanel4.setBackground(new java.awt.Color(242, 242, 242));
        jPanel4.setForeground(new java.awt.Color(123, 188, 196));

        tblLearner.setBackground(new java.awt.Color(242, 242, 242));
        tblLearner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        spLearner.setViewportView(tblLearner);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spLearner, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spLearner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        tabs.addTab("Người Học", jPanel4);

        jPanel5.setBackground(new java.awt.Color(242, 242, 242));
        jPanel5.setForeground(new java.awt.Color(123, 188, 196));

        tblSpecializedScore.setBackground(new java.awt.Color(242, 242, 242));
        tblSpecializedScore.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        spCD.setViewportView(tblSpecializedScore);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spCD, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spCD, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        tabs.addTab("Điểm Chuyên Đề", jPanel5);

        jPanel7.setBackground(new java.awt.Color(242, 242, 242));
        jPanel7.setForeground(new java.awt.Color(123, 188, 196));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(123, 188, 196));
        jLabel5.setText("Năm");

        cboYear.setBackground(new java.awt.Color(123, 188, 196));
        cboYear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboYear.setForeground(new java.awt.Color(217, 237, 191));
        cboYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboYearActionPerformed(evt);
            }
        });

        printReport.setBackground(new java.awt.Color(90, 139, 145));
        printReport.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        printReport.setForeground(new java.awt.Color(217, 237, 191));
        printReport.setText("In báo cáo");
        printReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printReportActionPerformed(evt);
            }
        });

        tblRevenue.setBackground(new java.awt.Color(242, 242, 242));
        tblRevenue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        spRevenue.setViewportView(tblRevenue);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(cboYear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(spRevenue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(printReport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(printReport)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("Doanh Thu", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabs))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void printReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printReportActionPerformed
        // TODO add your handling code here:
        FileChooser chooser = new FileChooser(System.getProperty("user.home") + "/Desktop");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("EXCEL FILES", ".xls", ".xlsx", ".xln");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Save As");

        int value = chooser.showSaveDialog(null);
        if (value == FileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            printReport(tblRevenue, file);
        }
    }//GEN-LAST:event_printReportActionPerformed

    private void cboYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboYearActionPerformed
        // TODO add your handling code here:
        fillTableDoanhThu();
    }//GEN-LAST:event_cboYearActionPerformed

    private void cboKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboKhoaHocActionPerformed
        // TODO add your handling code here:
        int currentIndex = cboKhoaHoc.getSelectedIndex();
        fillCboKhoaHoc();
        if (currentIndex != -1 && currentIndex < cboKhoaHoc.getItemCount()) {
            cboKhoaHoc.setSelectedIndex(currentIndex);
        }
        fillTableBangDiem();
    }//GEN-LAST:event_cboKhoaHocActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboKhoaHoc;
    private javax.swing.JComboBox<String> cboYear;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton printReport;
    private javax.swing.JScrollPane spBangDiem;
    private javax.swing.JScrollPane spCD;
    private javax.swing.JScrollPane spLearner;
    private javax.swing.JScrollPane spRevenue;
    private javax.swing.JTabbedPane tabs;
    private com.edusys.swing.Table tblBangDiem;
    private com.edusys.swing.Table tblLearner;
    private com.edusys.swing.Table tblRevenue;
    private com.edusys.swing.Table tblSpecializedScore;
    // End of variables declaration//GEN-END:variables
    private void init() {
        fillCboYear();
        fillCboKhoaHoc();
        fillTableBangDiem();
        fillTableDiemCD();
        fillTableNH();
        fillTableDoanhThu();
        this.selectTab(0);
        if (!Auth.isManager()) {
            tabs.remove(3);
        }
        if (!Auth.isLogin()) {
            MsgBox.alert(this, "Vui lòng đăng nhập.");
            System.exit(0);
        }
    }

    private void selectTab(int index) {
        tabs.setSelectedIndex(index);
    }

    private void fillTableBangDiem() {
        DefaultTableModel model = (DefaultTableModel) tblBangDiem.getModel();
        model.setColumnIdentifiers(new Object[]{"Mã HV", "Họ và Tên", "Điểm", "Xếp loại"});
        model.setRowCount(0);
        Course kh = (Course) cboKhoaHoc.getSelectedItem();
        List<Object[]> list = tkDAO.getBangDiem(kh.getIdKH());
        for (Object[] row : list) {
            double score = (double) row[2];
            model.addRow(new Object[]{row[0], row[1], score, getXepLoai(score)});
        }
        spBangDiem.setVerticalScrollBar(new ScrollBar());
        spBangDiem.getVerticalScrollBar().setBackground(Color.white);
        spBangDiem.getViewport().setBackground(Color.white);
    }

    private void fillTableNH() {
        DefaultTableModel model = (DefaultTableModel) tblLearner.getModel();
        model.setColumnIdentifiers(new Object[]{"Năm", "Số NH", "ĐK Sớm nhất", "ĐK Muộn nhất"});
        model.setRowCount(0);
        List<Object[]> list = tkDAO.getLuongNguoiHoc();
        for (Object[] row : list) {
            model.addRow(row);
        }
        spLearner.setVerticalScrollBar(new ScrollBar());
        spLearner.getVerticalScrollBar().setBackground(Color.white);
        spLearner.getViewport().setBackground(Color.white);
    }

    private void fillTableDiemCD() {
        DefaultTableModel model = (DefaultTableModel) tblSpecializedScore.getModel();
        model.setColumnIdentifiers(new Object[]{"Chuyên Đề", "Số lượng HV", "Điểm TN", "Điểm CN", "Điểm TB"});
        model.setRowCount(0);
        List<Object[]> list = tkDAO.getDiemChuyenDe();
        for (Object[] row : list) {
            model.addRow(new Object[]{row[0], row[1], row[2], row[3], new DecimalFormat("####0.00").format(row[4])});
        }
        spCD.setVerticalScrollBar(new ScrollBar());
        spCD.getVerticalScrollBar().setBackground(Color.white);
        spCD.getViewport().setBackground(Color.white);
    }

    private void fillCboYear() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboYear.getModel();
        model.removeAllElements();
        List<Integer> list = khDAO.selectYears();
        for (Integer year : list) {
            model.addElement(year);
        }
    }

    private void fillTableDoanhThu() {
        fillCboYear();
        DefaultTableModel model = (DefaultTableModel) tblRevenue.getModel();
        model.setColumnIdentifiers(new Object[]{"Chuyên Đề", "Số KH", "Số HV", "Doanh Thu", "Thấp Nhất", "Cao Nhất", "Trung Bình"});
        model.setRowCount(0);
        int year = (Integer) cboYear.getSelectedItem();
        List<Object[]> list = tkDAO.getDoanhThu(year);
        for (Object[] row : list) {
            model.addRow(new Object[]{row[0], row[1], row[2], row[3],
                    row[4], row[5], new DecimalFormat("####0.00").format(row[6])});
        }
        spRevenue.setVerticalScrollBar(new ScrollBar());
        spRevenue.getVerticalScrollBar().setBackground(Color.white);
        spRevenue.getViewport().setBackground(Color.white);
    }

    private void fillCboKhoaHoc() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboKhoaHoc.getModel();
        model.removeAllElements();
        List<Course> list = khDAO.selectAll();
        for (Course kh : list) {
            model.addElement(kh);
        }
    }

    private String getXepLoai(double score) {
        if (score < 5) {
            return "Không đạt";
        } else if (score < 6.5) {
            return "Trung bình";
        } else if (score < 7.5) {
            return "Trên trung bình";
        } else if (score < 9) {
            return "Giỏi";
        }
        return "Xuất xắc";
    }

    private void printReport(JTable table, File file) {
        try {
            Workbook wb = new XSSFWorkbook();
            Sheet sheet = wb.createSheet("Report");
//            tạo header của cột
            Row r = sheet.createRow(0);
            TableModel model = table.getModel();
            for (int i = 0; i < model.getColumnCount(); i++) {
                Cell cell = r.createCell(i);
                cell.setCellValue(model.getColumnName(i));
            }

//            tạo dữ liẹt của bảng
            for (int i = 0; i < model.getRowCount(); i++) {
                Row row = sheet.createRow(i + 1);
                for (int j = 0; j < model.getColumnCount(); j++) {
                    Cell cell = row.createCell(j);
                    cell.setCellValue(model.getValueAt(i, j).toString());
                }
            }
            FileOutputStream fos = new FileOutputStream(file + ".xlsx");
            wb.write(fos);
            fos.close();
            wb.close();

            if (MsgBox.confirm(this, "Lưu thàng công. Bạn có muốn mở file lên không?")) {
                Desktop.getDesktop().open(new File(file + ".xlsx"));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
