package data.entity.reference; /**
 * Created by xuebastar on 2017/8/30.
 */

public class City {
    private int Id;
    private String Name;
    private String CountryCode;
    private String District;

//    public City(int id, String name, String countrycode, String district) {
//        this.Id = id;
//        this.Name = name;
//        this.CountryCode = countrycode;
//        this.District = district;
//    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String District) {
        this.District = District;
    }

}



