package data.action.buy;

import data.entity.Goods;
import data.entity.GoodsOpt;
import data.entity.OrdersOpt;

/**
 * Created by xuebastar on 2017/9/3.
 */
public class PayAction {
    private int order_id;

    public  String execute() {
        int result = OrdersOpt.PayUpdate(order_id);
        if(result == 1)
            return "success";
        else
            return "error";
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }
}
