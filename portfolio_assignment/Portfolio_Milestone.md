Student: Corwin Bell
Course: Programming 1
Instructor: Farhad Bari
6/21/2024
# Portfolio Milestone Option 1 - Automobile Inventory
Create an automobile class that will be used by a dealership as a vehicle inventory program.

## Pseudocode
```
// Declare Automobile Class
    
    // Declare private Attributes
    private String ID
    private String make
    private String model
    private String color
    private int year
    private int mileage
    
    // Declare Automobile Methods
    // add try-catch with success/failure message
    
    Automobile() { // default constructor 
        // Set default values for attributes
        ID
        make
        model
        color
        year
        mileage
    }
    
    Automobile(String make, String model, String color, int year, int mileage) { 
        // parameterized constructor
        // Set given values for attributes
        this.ID
        this.make
        this.model
        this.color
        this.year
        this.mileage
    }
    
    // repeat set method template for all fields
    setMake(String make) { // update vehicle attributes methods
        this.make = make 
    }
    
    updateAuto() { // iterate through Automobile set methods for user input
        try
            print attribute
            ask user for attribute updated value
            pass value to attribute set method
            print success message
        catch typeError for user input is wrong type
            print error message
    }
    
    // repeat get method template for all fields
    getMake() {return make} // list single atrtributes
    
    getAutoInfo() { // list vehicle information (return HashMap)
        HashMap<String, String> autoInfo = new HashMap<>()
        // add Auto attribute name, value pairs for each attribute
        autoInfo.put("make", getmake()) // "make" attribute example
        print HashMap
    }

// Declare AutomobileInventory Class
    // Declare main method

        // Declare objects
        ArrayList<Automobile> autoList
        Scanner
        
        // While loop to call methods with user input
        While userinput not "q"
            // try-catch for user commands
                addAuto()
                listAutoInventory()
                removeAuto()
                addAuto()
                updateAuto()
                exportInventory()
            //finally block to close open resources
        
    // Declare AutomobileInventory methods
    addAuto() { // parametarized Automobile constructor with user input
        try
            for each attribute
                print attribute name
                ask for user input with Scanner
            call parameterized Automobile constructor with user input
            print success message
        catch typeError if input wrong type
            print error message

    }
    
    listAutoInventory() { // print each Automobile in inventory per row}

    removeAuto() { // remove auto from inventory based on ID from user input
        try
            remove Automobile from autoList
            print success message
        catch value not found
            print error message
    }
    
    exportInventory() { // print information to file}

```
