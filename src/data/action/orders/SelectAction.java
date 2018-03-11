package data.action.orders;

import com.opensymphony.xwork2.ActionContext;
import data.entity.Orders;
import data.entity.OrdersOpt;

import java.util.List;

/**
 * Created by xuebastar on 2017/9/1.
 */
public class  SelectAction {
    private int user_id;

    public  String execute() {

        List<Orders> orders = OrdersOpt.SelectMyOrder(1);
        ActionContext.getContext().put("orders", orders);
        if(orders!=null)
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
