package data.entity.reference;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by xuebastar on 2017/8/31.
 */
public class CityOpt {

    //查询操作
    public static List select(){
        List<City> list =new ArrayList<>();
        Connection conn = data.db.DB.getConn();
        String sql = "select * from city";
        Statement pstmt=null;
        ResultSet rs = null;
        try {
            pstmt  = conn.createStatement();
            rs = pstmt.executeQuery(sql);
            while(rs.next())
            {
                City city = new City();
                city.setId(rs.getInt("ID"));
                city.setName(rs.getString("Name"));
                city.setCountryCode(rs.getString("CountryCode"));
                city.setDistrict(rs.getString("District"));
//                int id=rs.getInt("ID");
//                String name=rs.getString("Name");
//                String code=rs.getString("CountryCode");
//                String district=rs.getString("District");
                //City tl=new City(id, name, code, district);
                list.add(city);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally
        {
            data.db.DB.close(rs, pstmt, conn);
        }
        return list;
    }

    //插入操作
    public static void insert(City city) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            // 获取连接 connection
            conn = data.db.DB.getConn();
            String sql = "INSERT  INTO city" + "(Name,CountryCode,District) values(?,?,?)";
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, city.getName());
            pstmt.setString(2, city.getCountryCode());
            pstmt.setString(3, city.getDistrict());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            data.db.DB.close(rs, pstmt, conn);
        }
    }
//        Connection conn = City.getConn();
//        int i = 0;
//        String sql = "insert into city (Name,CountryCode,District) values(null,null,null)";
//        PreparedStatement pstmt;
//        try {
//            pstmt = (PreparedStatement) conn.prepareStatement(sql);
//            pstmt.setString(1, "a");
//            pstmt.setString(2, "b");
//            pstmt.setString(3, "c");
//            i = pstmt.executeUpdate();
//            pstmt.close();
//            conn.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

    /*
	 * 更新
	 */

    public static City getCity(int Id) {
        City city = null;

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            // 获取连接 connection
            conn = data.db.DB.getConn();
            String sql = "SELECT * FROM city WHERE ID = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Id);

            rs = pstmt.executeQuery();

            if (rs.next()) {

                city = new City();
                city.setId(rs.getInt("ID"));
                city.setName(rs.getString("Name"));
                city.setCountryCode(rs.getString("CountryCode"));
                city.setDistrict(rs.getString("District"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            data.db.DB.close(rs, pstmt, conn);
        }
        return city;
    }

    //更新操作    
    public static void update(City city) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            // 获取连接 connection
            conn = data.db.DB.getConn();
            String sql = "UPDATE city SET Name=?,CountryCode=?,District=? WHERE ID=?";
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, city.getName());
            pstmt.setString(2, city.getCountryCode());
            pstmt.setString(3, city.getDistrict());
            pstmt.setInt(4, city.getId());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            data.db.DB.close(rs, pstmt, conn);
        }
    }
//        Connection conn = getConn();
//        int i = 0;
//        String sql = "update city set Age='" + student.getAge() + "' where Name='" + student.getName() + "'";
//        PreparedStatement pstmt;
//        try {
//            pstmt = (PreparedStatement) conn.prepareStatement(sql);
//            i = pstmt.executeUpdate();
//            System.out.println("result: " + i);
//            pstmt.close();
//            conn.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return i;

//
//public static void getAll() {
//    Connection conn = getConn();
//    String sql = "select * from city";
//    PreparedStatement pstmt;
//    try {
//        pstmt = (PreparedStatement)conn.prepareStatement(sql);
//        ResultSet rs = pstmt.executeQuery();
//        //public ResultSet a = r;
//        int col = rs.getMetaData().getColumnCount();
//        return rs;
//        System.out.println("============================");
//        while (rs.next()) {
//            for (int i = 1; i <= col; i++) {
//                System.out.print(rs.getString(i) + "\t");
//                if ((i == 2) && (rs.getString(i).length() < 8)) {
//                    System.out.print("\t");
//                }
//            }
//            System.out.println("");
//        }
//        System.out.println("============================");
//    } catch (SQLException e) {
//        e.printStackTrace();
//    }
//ResultSet rs;
//    return null;
//}
//
    //删除操作
    public static void delete(int[] ids) {
        // 判断ids 是否为空，如果为空就返回
        if (ids == null) {
            System.out.println("1");
            return;
        }
        // 用PreparedStatement 批量执行 删除操作
        String sql = "DELETE FROM city WHERE ID=?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = data.db.DB.getConn();
            // 创建语句对象
            pstmt = conn.prepareStatement(sql);
            for (int ID : ids) {
                pstmt.setInt(1, ID);
                pstmt.addBatch();
            }
            // 批量执行SQL语句
            int[] executeBatch = pstmt.executeBatch();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            data.db.DB.close(null, pstmt, conn);
        }
    }

//    private static int delete(String name) {
//        Connection conn = getConn();
//        int i = 0;
//        String sql = "delete from city where Name='" + name + "'";
//        PreparedStatement pstmt;
//        try {
//            pstmt = (PreparedStatement) conn.prepareStatement(sql);
//            i = pstmt.executeUpdate();
//            System.out.println("result: " + i);
//            pstmt.close();
//            conn.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return i;
//    }
}




