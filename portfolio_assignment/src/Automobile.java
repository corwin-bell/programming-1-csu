public class Automobile {
    private String ID;
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;
     
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
        // ID = "0";
        // this.make = make;
        // this.model 
        // this.color
        // this.year
        // this.mileage
    }
    // update vehicle attributes methods
    public void setMake(String make) {
        this.make = make;
    }
    // FIXME: list all atrtributes
    public String getMake() {return make;}
    
    // list vehicle information (return String array)
    public String getautoInfo() {
        return "FIXME: list all auto info as String array";
    }
}
