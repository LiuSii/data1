package data.entity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import data.entity.User;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by xuebastar on 2017/9/1.
 */
public class UserOpts{
    //查询操作
    public static List SelectAllUser(){
        List<User> list =new ArrayList<>();
        Connection conn = data.db.DB.getConn();
        String sql = "SELECT * FROM  `user`";
        Statement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt  = conn.createStatement();
            rs = pstmt.executeQuery(sql);
            while(rs.next())
            {
                User user = new User();
                user.setUser_id(rs.getInt("user_id"));
                user.setUser_name(rs.getString("user_name"));
                user.setUser_nickname(rs.getString("user_nickname"));
                user.setUser_gender(rs.getInt("user_gender"));
                user.setUser_address(rs.getString("user_address"));
                user.setUser_phone(rs.getString("user_phone"));

                list.add(user);
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
    public static User SelectSingleUser(int id){
        User user = new User();
        Connection conn = data.db.DB.getConn();
        String sql = "SELECT * FROM  `user` WHERE user_id = " +id;
        Statement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt  = conn.createStatement();
            rs = pstmt.executeQuery(sql);

            while(rs.next()) {

                user.setUser_id(rs.getInt("user_id"));
                user.setUser_name(rs.getString("user_name"));
                user.setUser_nickname(rs.getString("user_nickname"));
                user.setUser_gender(rs.getInt("user_gender"));
                user.setUser_address(rs.getString("user_address"));
                user.setUser_phone(rs.getString("user_phone"));
                user.setPassword(rs.getInt("password"));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally
        {
            data.db.DB.close(rs, pstmt, conn);
        }
        return user;
    }

    //插入新用户操作
    public static int InsertNewUser(User user){
        Connection conn = data.db.DB.getConn();
        String sql = "INSERT INTO `user`(user_name,user_nickname,user_gender,user_phone,user_address,password) values(?,?,?,?,?,?)";
        PreparedStatement statement = null;
        ResultSet rs = null;

        try {
            statement = conn.prepareStatement(sql);

            statement.setString(1,user.getUser_name());
            statement.setString(2, user.getUser_nickname());
            statement.setInt(3, user.getUser_gender());
            statement.setString(5, user.getUser_address());
            statement.setString(4, user.getUser_phone());
            statement.setInt(6, user.getPassword());

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


    //更新用户信息操作
    public static User UpdateUser(User user){
        Connection conn = data.db.DB.getConn();
        String sql = "UPDATE `user` SET user_name=?,user_nickname=?,user_gender=? , user_address=?, user_phone=? ,password = ? WHERE user_id=?";
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            statement = conn.prepareStatement(sql);

            statement.setString(1,user.getUser_name());
            statement.setString(2,user.getUser_nickname());
            statement.setInt(3, user.getUser_gender());
            statement.setString(4, user.getUser_address());
            statement.setString(5, user.getUser_phone());
            statement.setInt(6, user.getPassword());
            statement.setInt(7, user.getUser_id());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally
        {
            data.db.DB.close(rs, statement, conn);
        }
        return user;
    }

//    String sql = "DELETE FROM `user` WHERE user_id=?";

    //删除操作
    public static int DeleteUser(int user_id){
        Connection conn = data.db.DB.getConn();
        String sql = "DELETE FROM `user` WHERE user_id=?";
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            statement = conn.prepareStatement(sql);

            statement.setInt(1,user_id);

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

    //登录检测操作
    public static int LoginTest(User user){
        Connection conn = data.db.DB.getConn();

        String sql = "SELECT * FROM  `user` WHERE user_nickname = ? AND password = ?";
        System.out.println(sql);
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            statement = conn.prepareStatement(sql);

            statement.setString(1,user.getUser_nickname());
            statement.setInt(2,user.getPassword());

            System.out.println(sql);

            rs = statement.executeQuery();

            System.out.println(rs);
            if(rs == null)
                return 0;

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
