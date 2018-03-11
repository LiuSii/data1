package data.action.login;

import com.opensymphony.xwork2.ActionContext;
import data.entity.Orders;
import data.entity.OrdersOpt;
import data.entity.User;
import data.entity.UserOpts;

import java.util.List;

/**
 * Created by xuebastar on 2017/9/3.
 */
public class LoginAction {
    private String username;
    private int password;

    public  String execute() {

        User user = new User();
        user.setUser_nickname(username);
        user.setPassword(password);

        if(username != null && password != 0)
        {
            int result = UserOpts.LoginTest(user);
            if(result != 0) {
                ActionContext.getContext().getSession().put("username", username);
                return "success";
            }
            else
                return "error";
        }
        else
            return "error";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
