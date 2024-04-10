package com.edusys.form;

import com.edusys.dao.StaffDAO;
import com.edusys.entity.Staff;
import com.edusys.model.Model_Card;
import com.edusys.model.StatusType;
import com.edusys.swing.ScrollBar;
import com.edusys.ui.Login;
import com.edusys.ui.Welcome;
import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.ImageIcon;
import java.net.URI;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class Home_Form extends javax.swing.JPanel {

    StaffDAO dao = new StaffDAO();

    public Home_Form() {
        initComponents();
        init();
    }

    private void init() {
        cardYT.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/edusys/img/ytb32.png")), "Youtube", "Yuno", "Từng làm vid lyric ehe."));
        cardFB.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/edusys/img/fb32.png")), "Facebook", "Khang Bảo", "Facebook nèee"));
        cardDis.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/edusys/img/dis32.png")), "Discord", "@yuno.k", "Discord đẹp lắm vô xem đi."));
        sp.setVerticalScrollBar(new ScrollBar());
        sp.getVerticalScrollBar().setBackground(Color.white);
        sp.getViewport().setBackground(Color.white);
        JPanel p=new JPanel();
        p.setBackground(Color.white);
        sp.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        if(Auth.isAdmin()){
            fillTable();
        } else {
            fillTable();
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        cardYT = new com.edusys.component.Card();
        cardFB = new com.edusys.component.Card();
        cardDis = new com.edusys.component.Card();
        panelBorder1 = new com.edusys.swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        sp = new javax.swing.JScrollPane();
        tblStaff = new com.edusys.swing.Table();

        setBackground(new java.awt.Color(242, 242, 242));

        jLayeredPane1.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        cardYT.setC1(new java.awt.Color(142, 142, 250));
        cardYT.setC2(new java.awt.Color(123, 123, 245));
        cardYT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardYTMouseClicked(evt);
            }
        });
        jLayeredPane1.add(cardYT);

        cardFB.setC1(new java.awt.Color(186, 123, 247));
        cardFB.setC2(new java.awt.Color(167, 94, 236));
        cardFB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardFBMouseClicked(evt);
            }
        });
        jLayeredPane1.add(cardFB);

        cardDis.setC1(new java.awt.Color(240, 208, 62));
        cardDis.setC2(new java.awt.Color(211, 184, 61));
        cardDis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardDisMouseClicked(evt);
            }
        });
        jLayeredPane1.add(cardDis);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Danh sách nhân viên");

        tblStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStaff.getTableHeader().setReorderingAllowed(false);
        sp.setViewportView(tblStaff);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sp)
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cardYTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardYTMouseClicked
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/channel/UC2P6YTrAHeuXg6tDCSwqt9g"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_cardYTMouseClicked

    private void cardFBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardFBMouseClicked
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().browse(new URI("https://www.facebook.com/Yuno1z2t/"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_cardFBMouseClicked

    private void cardDisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardDisMouseClicked
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().browse(new URI("https://discord.gg/P5g8vAerbN"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_cardDisMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.edusys.component.Card cardDis;
    private com.edusys.component.Card cardFB;
    private com.edusys.component.Card cardYT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private com.edusys.swing.PanelBorder panelBorder1;
    private javax.swing.JScrollPane sp;
    private com.edusys.swing.Table tblStaff;
    // End of variables declaration//GEN-END:variables
    private void fillTable() {
        tblStaff.setUseStatus(true);
        DefaultTableModel model = (DefaultTableModel) tblStaff.getModel();
        model.setColumnIdentifiers(new Object[]{
            "STT", "Mã Nhân Viên", "Họ và Tên", "Trạng Thái"
        });
        model.setRowCount(0);
        try {
            List<Staff> ds = dao.selectAll();
            int i = 1;
            for (Staff s : ds) {
                Object[] obj = {
                    i,
                    s.getIdNV(),
                    s.getName(),
                    s.isRole() ? StatusType.ADMIN : StatusType.STAFF
                };
                model.addRow(obj);
                i++;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
