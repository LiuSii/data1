package data.entity;

import java.sql.Timestamp;

/**
 * Created by xuebastar on 2017/9/1.
 */
public class Goods {
    private int goods_id;
    private String goods_name;
    private String goods_type;
    private int goods_amount;
    private int store_id;
    private int goods_price;
    private int goods_discount;
    private String goods_describe;
    private Timestamp goods_upTime;
    private int goods_saleAmount;

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getGoods_type() {
        return goods_type;
    }

    public void setGoods_type(String goods_type) {
        this.goods_type = goods_type;
    }

    public int getGoods_amount() {
        return goods_amount;
    }

    public void setGoods_amount(int goods_amount) {
        this.goods_amount = goods_amount;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public int getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(int goods_price) {
        this.goods_price = goods_price;
    }

    public int getGoods_discount() {
        return goods_discount;
    }

    public void setGoods_discount(int goods_discount) {
        this.goods_discount = goods_discount;
    }

    public String getGoods_describe() {
        return goods_describe;
    }

    public void setGoods_describe(String goods_describe) {
        this.goods_describe = goods_describe;
    }

    public int getGoods_saleAmount() {
        return goods_saleAmount;
    }

    public void setGoods_saleAmount(int goods_saleAmount) {
        this.goods_saleAmount = goods_saleAmount;
    }

    public Timestamp getGoods_upTime() { return goods_upTime; }

    public void setGoods_upTime(Timestamp goods_upTime) { this.goods_upTime = goods_upTime; }
}
