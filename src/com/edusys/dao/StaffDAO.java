/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.dao;

import com.edusys.entity.Staff;
import com.edusys.utils.JDBCHelper;

import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 * @author ngocd
 */
public class StaffDAO extends EduSystemDAO<Staff, Object> {

    String insert_SQL = "insert into NhanVien(MaNV, Email, MatKhau, HoTen, TinhTrang, Hinh, VaiTro, TrangThai) values (?, ?, ?, ?, ?, ?, ?, ?)";
    String update_SQL = "update NhanVien set Email = ?, MatKhau = ?, HoTen = ?,  TinhTrang = ?, Hinh = ?, VaiTro = ?, TrangThai = ? where MaNV = ?";
    String delete_SQL = "update NhanVien set TrangThai = 1 where MaNV = ?";
    String select_all_SQL = "select * from NhanVien where TrangThai = 0";
    String select_by_id_SQL = "select * from NhanVien where MaNV = ?";
    String select_by_email_SQL = "select * from NhanVien where Email = ? and TrangThai = 0";

    @Override
    public void insert(Staff s) {
        JDBCHelper.update(insert_SQL,
                s.getIdNV(), s.getEmail(), s.getPass(), s.getName(), s.getTinhTrang(), s.getImage(), s.isRole(), s.isTrangThai());
    }

    @Override
    public void update(Staff s) {
        JDBCHelper.update(update_SQL,
                s.getEmail(), s.getPass(), s.getName(), s.getTinhTrang(), s.getImage(), s.isRole(), s.isTrangThai(), s.getIdNV());
    }

    @Override
    public void delete(Object key) {
        JDBCHelper.update(delete_SQL, key);
    }

    @Override
    public List<Staff> selectAll() {
        return this.selectBySQL(select_all_SQL);
    }

    @Override
    public Staff selectById(Object key) {
        List<Staff> list = this.selectBySQL(select_by_id_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public Staff selectByEmail(String email) {
        List<Staff> list = this.selectBySQL(select_by_email_SQL, email);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<Staff> selectBySQL(String sql, Object... args) {
        List<Staff> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                Staff s = new Staff();
                s.setIdNV(rs.getString("MaNV"));
                s.setEmail(rs.getString("Email"));
                s.setPass(rs.getString("MatKhau"));
                s.setName(rs.getString("HoTen"));
                s.setTinhTrang(rs.getString("TinhTrang"));
                s.setImage(rs.getString("Hinh"));
                s.setRole(rs.getBoolean("VaiTro"));
                s.setTrangThai(rs.getBoolean("TrangThai"));
                list.add(s);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
