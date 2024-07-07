import java.util.LinkedHashMap;

public class Automobile {
    private String make;
    private String model;
    private String color;
    private Integer year;
    private Integer mileage;
    
    public Automobile() {
        make = "unknown";
        model = "unknown";
        color = "unknown";
        year = 0;
        mileage = 0;
    }

    public Automobile(String make, String model, String color, int year, int mileage) throws Exception{
        if (year < 0) {
            throw new Exception("year must be a postive integer");
        }
        else if (mileage < 0) {
            throw new Exception("mileage must be a postive integer");
        }
        else {
            this.make = make;
            this.model = model; 
            this.color = color;
            this.year = year;
            this.mileage = mileage;
        }
    }
    // setters
    public void setMake(String make) {this.make = make;}
    public void setModel(String model) {this.model = model;}
    public void setColor(String color) {this.color = color;}
    public void setYear(Integer year) throws Exception{
        if (year < 0) {
            throw new Exception("year must be positive integer");
        }
        else {
            this.year = year;
        }
    }
    public void setMileage(Integer mileage) throws Exception{
        if (mileage < 0) {
            throw new Exception("mileage must be positive integer");
        }
        else {
            this.mileage = mileage;
        }
    }

    // getters
    public String getMake() {return make;}
    public String getModel() {return model;}
    public String getColor() {return color;}
    public Integer getYear() {return year;}
    public Integer getMileage() {return mileage;}
    
    // store auto info in hashmap for easier viewing
    public LinkedHashMap<String, String> getautoInfo() {
        LinkedHashMap<String, String> autoMap = new LinkedHashMap<String, String>();
        autoMap.put("make", this.make);
        autoMap.put("model", this.model);
        autoMap.put("color", this.color);
        autoMap.put("year", Integer.toString(this.year));
        autoMap.put("mileage", Integer.toString(this.mileage));
        return autoMap;
    }
}
