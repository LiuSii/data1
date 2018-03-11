package data.action.buy;

import data.entity.OrdersOpt;

/**
 * Created by xuebastar on 2017/9/3.
 */
public class CancleAction {
    private int order_id;
    private int flag;

    public  String execute() {
        int result = OrdersOpt.CancleOrder(order_id);
        if(result == 1) {
            if(flag == 1)
                return "manage";
            else
                return "success";
        }
        else
            return "error";
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
