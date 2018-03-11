package data.action.manage.user;

import com.opensymphony.xwork2.ActionContext;
import data.entity.User;
import data.entity.UserOpts;

import java.util.List;

/**
 * Created by xuebastar on 2017/9/2.
 */
public class ShowSingleUser {
    private int user_id;

    public  String execute() {
        User user = UserOpts.SelectSingleUser(user_id);
        ActionContext.getContext().put("user", user);

        if(user!=null)
            return "success";
        else
            return "error";
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
