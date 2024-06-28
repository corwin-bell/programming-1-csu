import java.util.ArrayList;
import java.util.Arrays;

public class Automobile {
    private String ID;
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;
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
        // FIXME: implement parametarized constructor
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
    // public ArrayList<String> getFieldList() {return fieldList;}
    // list vehicle information (return String array)
    // redundant with get methods? maybe best to have in
    // reference class?  
    public String getautoInfo() {
        // try hashmap
        return "FIXME: list all auto info as String array";
    }
}
