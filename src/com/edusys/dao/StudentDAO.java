/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.dao;

import com.edusys.entity.Student;
import com.edusys.utils.JDBCHelper;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ngocd
 */
public class StudentDAO extends EduSystemDAO<Student, Object> {

    String insert_SQL = "insert into HocVien(MaKH, MaNH, Diem, TrangThai) values ( ?, ?, ?, ?)";
    String update_SQL = "update HocVien set MaKH = ?, MaNH = ?, Diem = ?, TrangThai = ? where MaHV = ?";
    String delete_SQL = "update HocVien set TrangThai = 1 where MaHV = ?";
    String select_all_SQL = "select * from HocVien where TrangThai = 0";
    String select_by_id_SQL = "select * from HocVien where MaHV = ?";

    @Override
    public void insert(Student s) {
        JDBCHelper.update(insert_SQL,
                 s.getIdKH(), s.getIdNH(), s.getScore(), s.isTrangthai());
    }

    @Override
    public void update(Student s) {
        JDBCHelper.update(update_SQL,
                s.getIdKH(), s.getIdNH(), s.getScore(), s.isTrangthai(), s.getIdHV());
    }

    @Override
    public void delete(Object key) {
        JDBCHelper.update(delete_SQL, key);
    }

    @Override
    public List<Student> selectAll() {
        return this.selectBySQL(select_all_SQL);
    }

    @Override
    public Student selectById(Object key) {
        List<Student> list = this.selectBySQL(select_by_id_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<Student> selectBySQL(String sql, Object... args) {
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            List<Student> list = new ArrayList<>();
            while (rs.next()) {
                Student s = new Student();
                s.setIdHV(rs.getInt("MaHV"));
                s.setIdKH(rs.getInt("MaKH"));
                s.setIdNH(rs.getString("MaNH"));
                s.setScore(rs.getFloat("Diem"));
                s.setTrangthai(rs.getBoolean("TrangThai"));
                list.add(s);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Student> selectByKH(int idKH) {
        String sql = "select * from HocVien where MaKH = ? and TrangThai = 0";
        return this.selectBySQL(sql, idKH);
    }
}
