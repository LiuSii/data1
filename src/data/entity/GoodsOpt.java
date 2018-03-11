package data.entity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jingyu on 2017/9/2.
 */
public class GoodsOpt {
    //查询操作
    public static List select(){
        List<Goods> list = new ArrayList<>();
        Connection conn = data.db.DB.getConn();
        String sql = "SELECT * FROM goods";
        Statement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt = conn.createStatement();
            rs = pstmt.executeQuery(sql);
            while (rs.next())
            {
                Goods goods = new Goods();
                goods.setGoods_id(rs.getInt("goods_id"));
                goods.setGoods_name(rs.getString("goods_name"));
                goods.setGoods_type(rs.getString("goods_type"));
                goods.setGoods_amount(rs.getInt("goods_amount"));
                goods.setStore_id(rs.getInt("store_id"));
                goods.setGoods_price(rs.getInt("goods_price"));
                goods.setGoods_discount(rs.getInt("goods_discount"));
                goods.setGoods_describe(rs.getString("goods_describe"));
                goods.setGoods_upTime(rs.getTimestamp("goods_upTime"));
                goods.setGoods_saleAmount(rs.getInt("goods_saleAmount"));

                list.add(goods);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            data.db.DB.close(rs, pstmt, conn);
        }
        return list;
    }

    //查询
    //通过id查询一个商品
    //增删改查方法
    public static Goods selectById(int id) {
        Goods goods = new Goods();
        //获得jsp界面传入的good值
        //id为1时输出数据库内id为1的数，以此类推

        //配置数据库
//        List<Goods> list =new ArrayList<>();
        Connection conn = data.db.DB.getConn();
        String sql = "select * from goods where goods_id="+id;
        Statement pstmt=null;
        ResultSet rs = null;
        try {
            pstmt = conn.createStatement();
            rs = pstmt.executeQuery(sql);

            while(rs.next()) {
                goods.setGoods_id(rs.getInt("goods_id"));
                goods.setGoods_name(rs.getString("goods_name"));
                goods.setGoods_price(rs.getInt("goods_price"));
                goods.setGoods_describe(rs.getString("goods_describe"));
                goods.setGoods_amount(rs.getInt("goods_amount"));
                goods.setGoods_discount(rs.getInt("goods_discount"));
                goods.setGoods_saleAmount(rs.getInt("goods_saleAmount"));
                goods.setGoods_type(rs.getString("goods_type"));
                goods.setGoods_upTime(rs.getTimestamp("goods_upTime"));
                goods.setStore_id(rs.getInt("store_id"));


//                list.add(goods);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            data.db.DB.close(rs, pstmt, conn);
        }
        return goods;
    }

    //插入操作
    public static int InsertNewGoods(Goods goods){
        Connection conn = data.db.DB.getConn();
        String sql = "INSERT INTO `goods`(goods_name,goods_type,goods_amount,store_id,goods_price,goods_discount,goods_describe,goods_upTime,goods_saleAmount) values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            statement = conn.prepareStatement(sql);

            statement.setString(1,goods.getGoods_name());
            statement.setString(2, goods.getGoods_type());
            statement.setInt(3, goods.getGoods_amount());
            statement.setInt(4, goods.getStore_id());
            statement.setInt(5, goods.getGoods_price());
            statement.setInt(6, goods.getGoods_discount());
            statement.setString(7, goods.getGoods_describe());
            statement.setTimestamp(8, Timestamp.valueOf("2017-08-31 11:17:11"));
            statement.setInt(9, 0);

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

    //查询操作
    public static List SelectAllGoods(){
        List<Goods> list =new ArrayList<>();
        Connection conn = data.db.DB.getConn();
        String sql = "SELECT * FROM  `goods`";
        Statement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt  = conn.createStatement();
            rs = pstmt.executeQuery(sql);
            while(rs.next())
            {
                Goods goods = new Goods();
                goods.setGoods_id(rs.getInt("goods_id"));
                goods.setGoods_name(rs.getString("goods_name"));
                goods.setGoods_type(rs.getString("goods_type"));
                goods.setGoods_amount(rs.getInt("goods_amount"));
                goods.setStore_id(rs.getInt("store_id"));
                goods.setGoods_price(rs.getInt("goods_price"));
                goods.setGoods_discount(rs.getInt("goods_discount"));
                goods.setGoods_describe(rs.getString("goods_describe"));
                goods.setGoods_upTime(rs.getTimestamp("goods_upTime"));
                goods.setGoods_saleAmount(rs.getInt("goods_saleAmount"));

                list.add(goods);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally
        {
            data.db.DB.close(rs, pstmt, conn);
        }
        return list;
    }

    //更新操作
    public static Goods UpdateGoods(Goods goods){
        Connection conn = data.db.DB.getConn();
        String sql = "UPDATE `goods` SET goods_name=?,goods_type=?,goods_amount=? , goods_price=?, goods_discount=?,goods_describe=?  WHERE goods_id=?";
        PreparedStatement statement = null;
        ResultSet rs = null;
        int a = 5;
        try {
//            pstmt  = conn.createStatement();
//            rs = pstmt.executeQuery(sql);

            statement = conn.prepareStatement(sql);

            statement.setString(1,goods.getGoods_name());
            statement.setString(2,goods.getGoods_type());
            statement.setInt(3, goods.getGoods_amount());
            statement.setInt(4, goods.getGoods_price());
            statement.setInt(5, goods.getGoods_discount());
            statement.setString(6, goods.getGoods_describe());
            statement.setInt(7, goods.getGoods_id());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
//            return 0;
        }finally
        {
            data.db.DB.close(rs, statement, conn);
        }
        return goods;
    }

    //删除操作
    public static int DeleteGoods(int goods_id){
        Connection conn = data.db.DB.getConn();
        String sql = "DELETE FROM `goods` WHERE goods_id=?";
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            statement = conn.prepareStatement(sql);

            statement.setInt(1,goods_id);

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
