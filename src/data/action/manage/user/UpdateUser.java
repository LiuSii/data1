package data.action.manage.user;

import com.opensymphony.xwork2.ActionContext;
import data.entity.User;
import data.entity.UserOpts;

import java.util.List;

/**
 * Created by xuebastar on 2017/9/2.
 */
public class UpdateUser {
    private int user_id;
    private String nickname;
    private String realname;
    private int gender;
    private String address;
    private String phone;
    private int password;
    private int flag;

    public String execute() {
        User user = new User();
        user.setUser_id(user_id);
        user.setUser_nickname(nickname);
        user.setUser_name(realname);
        user.setUser_gender(gender);
        user.setUser_address(address);
        user.setUser_phone(phone);
        user.setPassword(password);

        User user1 = UserOpts.UpdateUser(user);

        List<User> users = UserOpts.SelectAllUser();
        ActionContext.getContext().put("users", users);

        if(user1 != null) {
            if(flag == 0)
                return "manager";
            else
                return  "user";
        }
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

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
