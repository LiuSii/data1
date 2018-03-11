package data.action.manage.goods;

import com.opensymphony.xwork2.ActionContext;
import data.entity.Goods;
import data.entity.GoodsOpt;
import data.entity.User;
import data.entity.UserOpts;

import java.util.List;

/**
 * Created by jingyu on 2017/9/3.
 */
public class ShowGoodsList {

    public String execute() {
        List<Goods> goods = GoodsOpt.SelectAllGoods();
        ActionContext.getContext().put("goods", goods);

        if (goods != null)
            return "success";
        else
            return "error";

    }
}
