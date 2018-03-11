package data.action.reference;
import data.entity.reference.City;

/**
 * Created by xuebastar on 2017/8/31.
 */
//public class InsertAction extends ActionSupport{
//
//    //City test = new City("a","b","c","d");
//
//    private List<City> list = null;
//
//    //ActionContext.getContext().put("list", list);
////    ActionContext.getContext().put("list",list);
////    request.setAttribute("list",list);
//
//    public String execute() throws  Exception{
//
//
//        for(City t:list){  //tplist有get，set方法，提交表单此时已有数据，遍历每一个对象进行修改
//           setList(list);
//        }
//        ActionContext.getContext().put("list",list);
//        return SUCCESS;
//    }
//
//    public List<City> getList() {
//        return list;
//    }
//
//    public void setList(List<City> list) {
//        this.list = list;
//    }
//
//
////    public Object getModel(){
////        return list;
////    }
//}

public class InsertAction {
    private City city;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    //public String execute() {
//		int insert = BookService.insertBook(book);
//
//		if (insert == 1) {
//			ActionContext.getContext().getSession().put("success", "添加成功");
//			return "success";
//		}
//		return "error";

}