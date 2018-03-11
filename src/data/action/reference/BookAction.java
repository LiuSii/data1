package data.action.reference;

/**
 * Created by xuebastar on 2017/9/1.
 */

import com.opensymphony.xwork2.ActionContext;

import java.util.List;

import data.entity.reference.City;
import data.entity.reference.CityOpt;

/*
 * 聂亚东  2015/6/3
 */
public class BookAction {
    private City city;

    private int Id;

    private int[] ID;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int[] getID() {
        return ID;
    }

    public void setID(int[] ID) {
        this.ID = ID;
    }

	/*
	 * 查询
	 */

    public String list() {
        List<City> cities = CityOpt.select();
        ActionContext.getContext().put("cities", cities);
        return "success";

    }

	/*
	 * 删除
	 */

    public String delete() {
        for (int string : ID) {
            System.out.println("ID [" + string + "]");
        }
        CityOpt.delete(ID);

        return list();
    }

	/*
	 * 插入
	 */

    public String insert() {
        CityOpt.insert(city);
        return list();
    }

    /*
     * 更新 1.先加载book的信息，用于后面的更新
     */
    public String detail() {
        System.out.println("Id [" + Id + "]");

        City city = CityOpt.getCity(Id);

        ActionContext.getContext().put("city", city);

        return "detail";
    }

    /*
     * 更新 2.更新book信息
     */
    public String update() {

        // 根据 bookID 获取book对象

        CityOpt.update(city);

        return list();
    }
}

