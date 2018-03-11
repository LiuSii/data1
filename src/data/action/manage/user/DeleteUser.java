package data.action.manage.user;

import com.opensymphony.xwork2.ActionContext;
import data.entity.User;
import data.entity.UserOpts;

import java.util.List;

/**
 * Created by xuebastar on 2017/9/2.
 */
public class DeleteUser {
    private int user_id;

    public  String execute() {
        int result = UserOpts.DeleteUser(user_id);

        List<User> users = UserOpts.SelectAllUser();
        ActionContext.getContext().put("users", users);

        if(result != 0)
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
