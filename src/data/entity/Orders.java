package data.entity;

import java.sql.Timestamp;

/**
 * Created by xuebastar on 2017/9/1.
 */
public class Orders {
    private int order_id;
    private int goods_id;
    private int store_id;
    private int user_id;
    private int order_amount;
    private int order_price;
    private int order_status;
    private Timestamp order_timeToPay;
    private Timestamp order_timeToGet;

    private String goods_name;
    private String store_name;
    private String user_name;

    private String user_address;
    private String user_phone;

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setOrder_amount(int order_amount) {
        this.order_amount = order_amount;
    }

    public void setOrder_price(int order_price) {
        this.order_price = order_price;
    }

    public void setOrder_status(int order_status) {
        this.order_status = order_status;
    }

    public int getOrder_id() {
        return order_id;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public int getStore_id() {
        return store_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getOrder_amount() {
        return order_amount;
    }

    public int getOrder_price() {
        return order_price;
    }

    public int getOrder_status() {
        return order_status;
    }

    public Timestamp getOrder_timeToPay() {
        return order_timeToPay;
    }

    public void setOrder_timeToPay(Timestamp order_timeToPay) {
        this.order_timeToPay = order_timeToPay;
    }

    public Timestamp getOrder_timeToGet() {
        return order_timeToGet;
    }

    public void setOrder_timeToGet(Timestamp order_timeToGet) {
        this.order_timeToGet = order_timeToGet;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }
}
