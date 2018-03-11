package data.action.goods;

import com.opensymphony.xwork2.ActionContext;
import data.entity.Goods;
import data.entity.GoodsOpt;

import java.util.List;

/**
 * Created by xuebastar on 2017/9/1.
 */
public class SelectAction {
    public String execute(){
        List<Goods> goods = GoodsOpt.select();
        ActionContext.getContext().put("goods",goods);
        if(goods != null)
            return "success";
        else
            return "error";
    }
}
