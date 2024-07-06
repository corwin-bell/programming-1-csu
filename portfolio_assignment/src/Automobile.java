import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class Automobile {
    private final Integer ID;
    private String make;
    private String model;
    private String color;
    private Integer year;
    private Integer mileage;
    // private ArrayList<String> fieldList = new ArrayList<>(Arrays.asList("make","model","color","year","mileage"));
     
    // add testbench for each class
    // add try catch blocks to most appropriate place, here or reference class?
    public Automobile() {
        ID = 0; //FIXME: add auto-increment value
        make = "unknown";
        model = "unknown";
        color = "unknown";
        year = 0;
        mileage = 0;
    }

    public Automobile(String make, String model, String color, int year, int mileage) {
        ID = 0;
        this.make = make;
        this.model = model; 
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }
    // update vehicle attributes methods
    public void setMake(String make) {this.make = make;}
    public void setModel(String model) {this.model = model;}
    public void setColor(String color) {this.color = color;}
    public void setYear(Integer year) {this.year = year;}
    public void setMileage(Integer mileage) {this.mileage = mileage;}

    // set all as method in class or reference class?
    public Integer getID() {return ID;}
    public String getMake() {return make;}
    public String getModel() {return model;}
    public String getColor() {return color;}
    public Integer getYear() {return year;}
    public Integer getMileage() {return mileage;}
    
    public LinkedHashMap<String, String> getautoInfo() {
        LinkedHashMap<String, String> autoMap = new LinkedHashMap<String, String>();
        autoMap.put("ID", Integer.toString(this.ID));
        autoMap.put("make", this.make);
        autoMap.put("model", this.model);
        autoMap.put("color", this.color);
        autoMap.put("year", Integer.toString(this.year));
        autoMap.put("mileage", Integer.toString(this.mileage));
        return autoMap;
    }
}
