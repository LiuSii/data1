package data.entity;

import data.entity.Orders;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuebastar on 2017/9/1.
 */
public class OrdersOpt {
    //查询操作
    public static List SelectMyOrder(int id){
        List<Orders> list =new ArrayList<>();
        Connection conn = data.db.DB.getConn();
        String sql = "SELECT * FROM  `orderview` WHERE user_id = "+id;
        Statement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt  = conn.createStatement();
            rs = pstmt.executeQuery(sql);
            while(rs.next())
            {
                Orders order = new Orders();
                order.setOrder_id(rs.getInt("order_id"));
                order.setGoods_id(rs.getInt("goods_id"));
                order.setStore_id(rs.getInt("store_id"));
                order.setUser_id(rs.getInt("user_id"));
                order.setGoods_name(rs.getString("goods_name"));
                order.setStore_name(rs.getString("store_name"));
                order.setUser_name(rs.getString("user_name"));
                order.setOrder_amount(rs.getInt("order_amount"));
                order.setOrder_price(rs.getInt("order_price"));
                order.setOrder_status(rs.getInt("order_status"));
                order.setOrder_timeToPay(rs.getTimestamp("order_timeToPay"));
                order.setOrder_timeToGet(rs.getTimestamp("order_timeToGet"));
                order.setUser_address(rs.getString("user_address"));
                order.setUser_phone(rs.getString("user_phone"));

                list.add(order);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally
        {
            data.db.DB.close(rs, pstmt, conn);
        }
        return list;
    }

    //查询操作
    public static List SelectAllOrder(){
        List<Orders> list =new ArrayList<>();
        Connection conn = data.db.DB.getConn();
        String sql = "SELECT * FROM  `orderview`";
        Statement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt  = conn.createStatement();
            rs = pstmt.executeQuery(sql);
            while(rs.next())
            {
                Orders order = new Orders();
                order.setOrder_id(rs.getInt("order_id"));
                order.setGoods_id(rs.getInt("goods_id"));
                order.setStore_id(rs.getInt("store_id"));
                order.setUser_id(rs.getInt("user_id"));
                order.setGoods_name(rs.getString("goods_name"));
                order.setStore_name(rs.getString("store_name"));
                order.setUser_name(rs.getString("user_name"));
                order.setOrder_amount(rs.getInt("order_amount"));
                order.setOrder_price(rs.getInt("order_price"));
                order.setOrder_status(rs.getInt("order_status"));
                order.setOrder_timeToPay(rs.getTimestamp("order_timeToPay"));
                order.setOrder_timeToGet(rs.getTimestamp("order_timeToGet"));
                order.setUser_address(rs.getString("user_address"));
                order.setUser_phone(rs.getString("user_phone"));

                list.add(order);
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
    public static void InsertOrder(Goods goods, int buy_amount) {//参数中缺少用户信息
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        System.out.println(goods.getGoods_name());
        try {
            // 获取连接 connection
            conn = data.db.DB.getConn();
            String sql = "INSERT  INTO `order`(goods_id,store_id,user_id,order_amount,order_price,order_status,order_timeToPay,order_timeToGet) values(?,?,?,?,?,?,?,?)";
            pstmt = conn.prepareStatement(sql);

            //pstmt.setString(2, orderid);//orderid应该不用专门生成
//            pstmt.setInt(1,4);
            pstmt.setInt(1,goods.getGoods_id());
            pstmt.setInt(2,goods.getStore_id());
            pstmt.setInt(3,1);
            pstmt.setInt(4,buy_amount);
            pstmt.setInt(5,goods.getGoods_price()*buy_amount);
            pstmt.setInt(6,1);
            pstmt.setTimestamp(7, Timestamp.valueOf("2017-08-31 11:17:11"));
            pstmt.setTimestamp(8, Timestamp.valueOf("2017-08-31 11:17:11"));


            System.out.println("order_id:3");
            System.out.println(goods.getGoods_id());
            System.out.println(goods.getStore_id());
            System.out.println("user_id:1");

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            data.db.DB.close(rs, pstmt, conn);
        }
    }

    //更新操作
    public static int PayUpdate(int id){
        Connection conn = data.db.DB.getConn();
        String sql = "UPDATE `order` SET order_status=? WHERE order_id=?";
        PreparedStatement statement = null;
        ResultSet rs = null;

        try {
//            pstmt  = conn.createStatement();
//            rs = pstmt.executeQuery(sql);

            statement = conn.prepareStatement(sql);

            statement.setInt(1,2);
            statement.setInt(2, id);


            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }finally
        {
            data.db.DB.close(rs, statement, conn);
        }
        return 1;
    }


    //更新操作
    public static int GetUpdate(int id){
        Connection conn = data.db.DB.getConn();
        String sql = "UPDATE `order` SET order_status=? WHERE order_id=?";
        PreparedStatement statement = null;
        ResultSet rs = null;

        try {
//            pstmt  = conn.createStatement();
//            rs = pstmt.executeQuery(sql);

            statement = conn.prepareStatement(sql);

            statement.setInt(1,5);
            statement.setInt(2, id);


            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }finally
        {
            data.db.DB.close(rs, statement, conn);
        }
        return 1;
    }

    //删除操作
    public static int CancleOrder(int id){
        Connection conn = data.db.DB.getConn();
        String sql = "UPDATE `order` SET order_status=? WHERE order_id=?";
        PreparedStatement statement = null;
        ResultSet rs = null;

        try {
//            pstmt  = conn.createStatement();
//            rs = pstmt.executeQuery(sql);

            statement = conn.prepareStatement(sql);

            statement.setInt(1,6);
            statement.setInt(2, id);


            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }finally
        {
            data.db.DB.close(rs, statement, conn);
        }
        return 1;
    }


}
