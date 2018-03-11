package data.db;

import java.sql.*;

/**
 * Created by xuebastar on 2017/9/1.
 */

public class DB {
    static String driver = "com.mysql.jdbc.Driver";
    //url=jdbc:mysql://localhost:3306/ssh?useUnicode=true&characterEncoding=UTF-8
    static String url = "jdbc:mysql://127.0.0.1:3306/shoppingonline?characterEncoding=utf8&useSSL=false";
    //static String url = "jdbc:mysql://192.168.79.131:3306/shoppingonline";
    static String username = "root";
    static String password = "123456";
    // static String password = "123";

    //开启数据库连接
    public static Connection getConn() {
        Connection conn = null;
        try {
            Class.forName(driver); //classLoader,加载对应驱动
            conn = (Connection) DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    //关闭数据库连接
    public static void close(ResultSet rs, Statement se, Connection con) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (Exception e) {
        }
        try {
            if (se != null) {
                se.close();
            }
        } catch (Exception e) {
        }
        try {
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
        }

    }
}
