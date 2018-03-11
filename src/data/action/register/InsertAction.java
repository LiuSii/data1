package data.action.register;

import com.opensymphony.xwork2.ActionContext;
import data.entity.User;
import data.entity.UserOpts;
import data.entity.UserOpts;
import org.apache.struts2.ServletActionContext;

import javax.swing.*;
import java.util.List;

/**
 * Created by xuebastar on 2017/9/2.
 */
public class InsertAction {
    private String nickname;
    private String realname;
    private int gender;
    private String address;
    private String phone;
    private int password;

    public String execute() {
        User user = new User();
        user.setUser_nickname(nickname);
        user.setUser_name(realname);
        user.setUser_gender(gender);
        user.setUser_address(address);
        user.setUser_phone(phone);
        user.setPassword(password);

        int result = UserOpts.InsertNewUser(user);
        if(result != 0)
            return "success";
        else
            return "error";
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
