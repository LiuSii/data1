package data.action.orders;

import com.opensymphony.xwork2.ActionContext;
import data.entity.Orders;
import data.entity.OrdersOpt;

import java.util.List;

/**
 * Created by xuebastar on 2017/9/5.
 */
public class SelectAllOrder {
    public String execute() {
        List<Orders> orders = OrdersOpt.SelectAllOrder();
        ActionContext.getContext().put("orders", orders);
        if (orders != null)
            return "success";
        else
            //  System.out.println(orders);
            return "error";

    }

}
