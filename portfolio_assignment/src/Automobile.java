import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class Automobile {
    private String ID;
    private String make;
    private String model;
    private String color;
    private Integer year;
    private Integer mileage;
    // private ArrayList<String> fieldList = new ArrayList<>(Arrays.asList("make","model","color","year","mileage"));
     
    // add try catch blocks to most appropriate place, here or reference class?
    public Automobile() {
        ID = "0"; //FIXME: add auto-increment value
        make = "unknown";
        model = "unknown";
        color = "unknown";
        year = 0;
        mileage = 0;
    }

    public Automobile(String make, String model, String color, int year, int mileage) {
        ID = "0";
        this.make = make;
        this.model = model; 
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }
    // update vehicle attributes methods
    public void setMake(String make) {
        this.make = make;
    }

    // set all as method in class or reference class?
    // FIXME: list all atrtributes
    public String getMake() {return make;}
    
    public LinkedHashMap<String, String> getautoInfo() {
        LinkedHashMap<String, String> autoMap = new LinkedHashMap<String, String>();
        autoMap.put("ID", this.ID);
        autoMap.put("make", this.make);
        autoMap.put("model", this.model);
        autoMap.put("color", this.color);
        autoMap.put("year", Integer.toString(this.year));
        autoMap.put("mileage", Integer.toString(this.mileage));
        return autoMap;
    }
}
