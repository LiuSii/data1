package data.action.user;

import com.opensymphony.xwork2.ActionContext;
import data.entity.User;
import data.entity.UserOpts;

/**
 * Created by jingyu on 2017/9/3.
 */
public class EditMyInfo {
    private int user_id;

    public  String execute() {
        User user = UserOpts.SelectSingleUser(user_id);

//        System.out.println(user.getUser_id());
//        System.out.println(user.getUser_name());
//        System.out.println(user.getUser_nickname());
//        System.out.println(user.getUser_gender());
//        System.out.println(user.getUser_address());
//        System.out.println(user.getUser_phone());

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
