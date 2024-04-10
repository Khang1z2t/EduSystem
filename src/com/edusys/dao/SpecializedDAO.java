package com.edusys.dao;

import com.edusys.entity.Specialized;
import com.edusys.utils.JDBCHelper;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SpecializedDAO extends EduSystemDAO<Specialized, Object> {

    String insert_SQL = "insert into ChuyenDe(MaCD, TenCD, HocPhi, ThoiLuong, Hinh, MoTa, TrangThai) values (?, ?, ?, ?, ?, ?, ?)";
    String update_SQL = "update ChuyenDe set TenCD = ?, HocPhi = ?, ThoiLuong = ?, Hinh = ?, MoTa = ?, TrangThai =? where MaCD = ?";
    String delete_SQL = "update ChuyenDe set TrangThai = 1 where MaCD = ?";
    String select_all_SQL = "select * from ChuyenDe where TrangThai = 0";
    String select_by_id_SQL = "select * from ChuyenDe where MaCD = ?";

    @Override
    public void insert(Specialized spec) {
        JDBCHelper.update(insert_SQL,
                spec.getIdCD(), spec.getName(), spec.getCost(), spec.getTime(), spec.getImage(), spec.getDecribe(), spec.isTrangthai());
    }

    @Override
    public void update(Specialized spec) {
        JDBCHelper.update(update_SQL,
                spec.getName(), spec.getCost(), spec.getTime(), spec.getImage(), spec.getDecribe(), spec.isTrangthai(), spec.getIdCD());
    }

    @Override
    public void delete(Object key) {
        JDBCHelper.update(delete_SQL, key);
    }

    @Override
    public List<Specialized> selectAll() {
        return this.selectBySQL(select_all_SQL);
    }

    @Override
    public Specialized selectById(Object key) {
        List<Specialized> list = this.selectBySQL(select_by_id_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<Specialized> selectBySQL(String sql, Object... args) {
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            List<Specialized> list = new ArrayList<>();
            while (rs.next()) {
                Specialized spec = new Specialized();
                spec.setIdCD(rs.getString("MaCD"));
                spec.setName(rs.getString("TenCD"));
                spec.setCost(rs.getFloat("HocPhi"));
                spec.setTime(rs.getInt("ThoiLuong"));
                spec.setImage(rs.getString("Hinh"));
                spec.setDecribe(rs.getString("MoTa"));
                spec.setTrangthai(rs.getBoolean("TrangThai"));
                list.add(spec);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
