package data.action.manage.goods;

import com.opensymphony.xwork2.ActionContext;
import data.entity.Goods;
import data.entity.GoodsOpt;
import data.entity.UserOpts;

import java.util.List;

/**
 * Created by jingyu on 2017/9/3.
 */
public class DeleteGoods {
    private int goods_id;

    public  String execute() {
        int result = GoodsOpt.DeleteGoods(goods_id);

        List<Goods> goods1 = GoodsOpt.SelectAllGoods();
        ActionContext.getContext().put("goods", goods1);

        if(result != 0)
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
}
