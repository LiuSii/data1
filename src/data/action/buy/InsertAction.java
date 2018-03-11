package data.action.buy;

import com.opensymphony.xwork2.ActionContext;
import data.entity.Goods;
import data.entity.GoodsOpt;
import data.entity.Orders;
import data.entity.OrdersOpt;

import java.util.List;

/**
 * Created by xuebastar on 2017/9/3.
 */
public class InsertAction {
    private int goods_id;
    private int buy_amount;

    public  String execute() {
        Goods goods = GoodsOpt.selectById(goods_id);//获得goods信息，同时传入goodsid，获得需要购买的商品信息
        OrdersOpt.InsertOrder(goods,buy_amount);//直接插入新订单

        List<Orders> orders = OrdersOpt.SelectAllOrder();
        ActionContext.getContext().put("orders", orders);
        if (orders != null)
            return "success";
        else
            return "error";
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public int getBuy_amount() {
        return buy_amount;
    }

    public void setBuy_amount(int buy_amount) {
        this.buy_amount = buy_amount;
    }
}
