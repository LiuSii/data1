package data.action.reference;
import com.opensymphony.xwork2.ActionContext;
import data.entity.reference.City;
import data.entity.reference.CityOpt;

import java.util.List;

/**
 * Created by xuebastar on 2017/8/31.
 */

//public class SelectAction extends ActionSupport implements ModelDriven{
//
//    //City test = new City("a","b","c","d");
//
////    List<City> list = CityOpt.read();
//
//    //ActionContext.getContext().put("list", list);
////    ActionContext.getContext().put("list",list);
////    request.setAttribute("list",list);
//
//    public String execute() throws  Exception{
//        ActionContext.getContext().put("list",list);
//        return SUCCESS;
//    }
//
////    public Object getModel(){
////        return list;
////    }
//}

public class SelectAction {

    public  String execute() {

        List<City> cities = CityOpt.select();
        ActionContext.getContext().put("cities", cities);

        return "success";

    }
}

