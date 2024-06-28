import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Automobile_Inventory {
    
    // declare variable
    
    public static void main(String[] args) throws Exception {
        // consider refactor as linkedlist
        ArrayList<Automobile> autoList = new ArrayList<>();
        String command = "";
        try (Scanner scnr = new Scanner(System.in)) { // try with Scanner to ensure it closes
            do {
                System.out.println("Commands: 'addAuto', 'listAutoInventory', 'removeAuto', 'updateAuto','exportInventory', 'quit'");
                command = scnr.nextLine();
                if (command.equalsIgnoreCase("addAuto")) {
                    addAuto(scnr, autoList);
                }
            }
            while (!command.equalsIgnoreCase("quit"));   

        }
            // try-catch for user commands
                // addAuto()
                // listAutoInventory()
                // removeAuto()
                // addAuto()
                // updateAuto()
                // exportInventory()
    }
    
    public static void addAuto(Scanner scnr, ArrayList<Automobile> autoList) {
        // add new auto to autoList inventory
        try {
            System.out.println("Enter make(String)");
            String make = scnr.next();
            System.out.println("Enter model(String)");
            String model = scnr.next();
            System.out.println("Enter color(String)");
            String color = scnr.next();
            System.out.println("Enter year(int)");
            int year = scnr.nextInt();
            System.out.println("Enter mileage(int)");
            int mileage = scnr.nextInt();
            
            Automobile auto = new Automobile(make, model, color, year, mileage);
            autoList.add(auto);
            System.out.println(autoList.get(0).getMake());
            System.out.println("auto added");
        }
        catch (InputMismatchException e) {
            System.out.println("must enter correct data type for each field");
            scnr.nextLine(); // clears scanner before next userInput
            // FIXME: route user to failed input attempt
        }
        }
    
    public static void listAutoInventory() {

    }
    
    public static void removeAuto() { // remove auto from inventory based on ID from user input
        // try
        //     remove Automobile from autoList
        //     print success message
        // catch value not found
        //     print error message
    }
    
    public static void exportInventory() { // print information to file
    }
    
}
