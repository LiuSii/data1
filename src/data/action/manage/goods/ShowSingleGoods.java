package data.action.manage.goods;

import com.opensymphony.xwork2.ActionContext;
import data.entity.Goods;
import data.entity.GoodsOpt;
import data.entity.User;
import data.entity.UserOpts;

import static com.opensymphony.xwork2.ActionContext.getContext;

/**
 * Created by jingyu on 2017/9/3.
 */
public class ShowSingleGoods {
    private int goods_id;

    public  String execute() {
//        goods_id = getContext("user_id");
        Goods goods = GoodsOpt.selectById(goods_id);

//        System.out.println(user.getUser_id());
//        System.out.println(user.getUser_name());
//        System.out.println(user.getUser_nickname());
//        System.out.println(user.getUser_gender());
//        System.out.println(user.getUser_address());
//        System.out.println(user.getUser_phone());

        System.out.println(goods.getGoods_id());
        getContext().put("goods", goods);

        if(goods!=null)
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
