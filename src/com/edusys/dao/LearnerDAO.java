/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.dao;

import com.edusys.entity.Learner;
import com.edusys.utils.JDBCHelper;

import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * @author ngocd
 */
public class LearnerDAO extends EduSystemDAO<Learner, Object> {

    String insert_SQL = "insert into NguoiHoc(MANH, HoTen, NgaySinh, GioiTinh, DienThoai, Email, GhiChu, MaNV, NgayDK, TrangThai) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    String update_SQL = "update NguoiHoc set HoTen = ?, NgaySinh = ?, GioiTinh = ?, DienThoai = ?, Email = ?, GhiChu = ?, MaNV = ?, NgayDK = ?, TrangThai = ? where MaNH = ?";
    String delete_SQL = "update NguoiHoc set TrangThai = 1 where MaNH = ?";
    String select_all_SQL = "select * from NguoiHoc where TrangThai = 0";
    String select_by_id_SQL = "select * from NguoiHoc where MaNH = ?";
//    String select_by_keyword_SQL = "select * from NguoiHoc where HoTen like ?";

    @Override
    public void insert(Learner l) {
        JDBCHelper.update(insert_SQL,
                l.getIdNH(), l.getName(), l.getBrithday(), l.isGender(), l.getPhone(), l.getEmail(), l.getDecribe(), l.getIdnv(), l.getNgaydk(), l.isTrangthai());
    }

    @Override
    public void update(Learner l) {
        JDBCHelper.update(update_SQL,
                l.getName(), l.getBrithday(), l.isGender(), l.getPhone(), l.getEmail(), l.getDecribe(), l.getIdnv(), l.getNgaydk(), l.isTrangthai(), l.getIdNH());
    }

    @Override
    public void delete(Object key) {
        JDBCHelper.update(delete_SQL, key);
    }

    @Override
    public List<Learner> selectAll() {
        return this.selectBySQL(select_all_SQL);
    }

    @Override
    public Learner selectById(Object key) {
        List<Learner> list = this.selectBySQL(select_by_id_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<Learner> selectBySQL(String sql, Object... args) {
        List<Learner> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            while (rs.next()) {
                Learner l = new Learner();
                l.setIdNH(rs.getString("MaNH"));
                l.setName(rs.getString("HoTen"));
                l.setBrithday(rs.getDate("NgaySinh"));
                l.setGender(rs.getBoolean("GioiTinh"));
                l.setPhone(rs.getString("DienThoai"));
                l.setEmail(rs.getString("Email"));
                l.setDecribe(rs.getString("GhiChu"));
                l.setIdnv(rs.getString("MaNV"));
                l.setNgaydk(rs.getDate("NgayDK"));
                l.setTrangthai(rs.getBoolean("TrangThai"));
                list.add(l);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Learner> selectByKeyWord(String keyword) {
        String sql = "select * from NguoiHoc where (MaNH LIKE ? OR HoTen LIKE ? OR NgaySinh LIKE ? OR GioiTinh LIKE ? OR DienThoai LIKE ? OR Email LIKE ? OR MaNV LIKE ? OR NgayDK LIKE ?)"
                + "AND TrangThai = 0";
        String key = "%" + keyword + "%";
        return this.selectBySQL(sql, key, key, key, key, key, key, key, key);
    }

    public List<Learner> selectNotInCourse(int makh, String keyword) {
        String sql = "SELECT * FROM NguoiHoc WHERE (MaNH LIKE ? OR HoTen LIKE ? OR NgaySinh LIKE ? OR GioiTinh LIKE ? OR DienThoai LIKE ? OR Email LIKE ? OR MaNV LIKE ? OR NgayDK LIKE ?) "
            + "AND MaNH NOT IN (SELECT MaNH FROM HocVien WHERE MaKH = ?)" + "AND TrangThai = 0";
    String key = "%" + keyword + "%";
    return this.selectBySQL(sql, key, key, key, key, key, key, key, key, makh);
    }

}
