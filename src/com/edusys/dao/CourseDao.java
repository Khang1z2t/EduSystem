package com.edusys.dao;

import com.edusys.entity.Course;
import com.edusys.utils.JDBCHelper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CourseDao extends EduSystemDAO<Course, Object> {

    String insert_SQL = "insert into KhoaHoc(MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV, NgayTao, TrangThai) values (?, ?, ?, ?, ?, ?, ?, ?)";
    String update_SQL = "update KhoaHoc set MaCD = ?, HocPhi = ?, ThoiLuong = ?, NgayKG = ?, GhiChu = ?, MaNV = ?, NgayTao = ?, TrangThai = ? where MaKH = ?";
    String delete_SQL = "update KhoaHoc set TrangThai = 1 where MaKH = ?";
    String select_all_SQL = "select * from KhoaHoc where TrangThai = 0";
    String select_by_id_SQL = "select * from KhoaHoc where MaKH = ? and TrangThai = 0";

    @Override
    public void insert(Course c) {
        JDBCHelper.update(insert_SQL, c.getIdCD(), c.getCost(), c.getTime(), c.getNgayKG(), c.getDecribe(), c.getIdNV(), c.getNgayTao(), c.getTrangThai());
    }

    @Override
    public void update(Course c) {
        JDBCHelper.update(update_SQL, c.getIdCD(), c.getCost(), c.getTime(), c.getNgayKG(), c.getDecribe(), c.getIdNV(), c.getNgayTao(), c.getTrangThai(), c.getIdKH());
    }

    @Override
    public void delete(Object key) {
        JDBCHelper.update(delete_SQL, key);
    }

    @Override
    public List<Course> selectAll() {
        return this.selectBySQL(select_all_SQL);
    }

    @Override
    public Course selectById(Object key) {
        List<Course> list = this.selectBySQL(select_by_id_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<Course> selectBySQL(String sql, Object... args) {
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            List<Course> list = new ArrayList<>();
            while (rs.next()) {
                Course c = new Course();
                c.setIdKH(rs.getInt("MaKH"));
                c.setIdCD(rs.getString("MaCD"));
                c.setCost(rs.getFloat("HocPhi"));
                c.setTime(rs.getInt("ThoiLuong"));
                c.setNgayKG(rs.getDate("NgayKG"));
                c.setDecribe(rs.getString("GhiChu"));
                c.setIdNV(rs.getString("MaNV"));
                c.setNgayTao(rs.getDate("NgayTao"));
                c.setTrangThai(rs.getBoolean("TrangThai"));
                list.add(c);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Course> selectByCD(String macd) {
        String sql = "select * from KhoaHoc where MaCD = ? and TrangThai = 0";
        return this.selectBySQL(sql, macd);
    }

    public List<Integer> selectYears() {
        String SQL = "SELECT DISTINCT year(NgayKG) Year FROM KhoaHoc ORDER BY Year DESC";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.query(SQL);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
