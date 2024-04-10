package com.edusys.utils;

import java.sql.*;

public class JDBCHelper {

    private static String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String SERVER_NAME = "localhost";
    private static String HOST = "1433";
    private static String DATABASE_NAME = "EduSystem";
    private static String USERNAME = "sa";
    private static String PASSWORD = "12345";

    private static String URL = "jdbc:sqlserver://" + SERVER_NAME + ":" + HOST + ";"
            + "databaseName=" + DATABASE_NAME
            + ";user=" + USERNAME
            + ";password=" + PASSWORD
            + ";encrypt=true;trustServerCertificate=true";

    static {
        try {
            Class.forName(DRIVER);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static PreparedStatement getSt(String sql, Object... args) throws SQLException {
        Connection con = DriverManager.getConnection(URL);
        PreparedStatement ps;
        if (sql.trim().startsWith("{")) {
            ps = con.prepareCall(sql); //proc
        } else {
            ps = con.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            ps.setObject((i + 1), args[i]);
        }
        return ps;
    }

    public static int update(String sql, Object... args) {
        try {
            PreparedStatement ps = JDBCHelper.getSt(sql, args);
            try {
                return ps.executeUpdate();
            } finally {
                ps.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static ResultSet query(String sql, Object... args) throws SQLException {
        PreparedStatement ps = JDBCHelper.getSt(sql, args);
        return ps.executeQuery();
    }

    public static Object value(String sql, Object... args) {
        try {
            ResultSet rs = JDBCHelper.query(sql, args);
            if (rs.next()) {
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
