package data.action.manage.user;

import com.opensymphony.xwork2.ActionContext;
import data.entity.Orders;
import data.entity.OrdersOpt;
import data.entity.User;
import data.entity.UserOpts;

import java.util.List;

/**
 * Created by xuebastar on 2017/9/2.
 */
public class ShowUserList {
    public  String execute() {
        List<User> users = UserOpts.SelectAllUser();
        ActionContext.getContext().put("users", users);

        if(users!=null)
            return "success";
        else
            return "error";

    }
}
