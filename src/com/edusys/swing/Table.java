package com.edusys.swing;

import com.edusys.model.StatusType;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Table extends JTable {

    private boolean useStatus = false;

    public void setUseStatus(boolean useStatus) {
        this.useStatus = useStatus;
    }

    public Table() {
        setShowHorizontalLines(true);
        setGridColor(new Color(230, 230, 230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                TableHeader header = new TableHeader(value + "");
                header.setHorizontalAlignment(JLabel.CENTER);
                return header;
            }

        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                if (column != 3 || !useStatus) {
                    Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    ((JLabel) comp).setHorizontalAlignment(JLabel.CENTER);
                    comp.setBackground(Color.white);
                    setBorder(noFocusBorder);
                    if (isSelected) {
                        comp.setForeground(new Color(15, 89, 140));
                    } else {
                        comp.setForeground(new Color(102, 102, 102));
                    }
                    return comp;
                } else {
                    StatusType type = (StatusType) value;
                    CellStatus cell = new CellStatus(type);
                    return cell;
                }
            }

        });
    }

}
