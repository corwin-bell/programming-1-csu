import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
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
                else if (command.equalsIgnoreCase("listAutoInventory")) {
                    listAutoInventory(autoList);
                }
                else if (command.equalsIgnoreCase("removeAuto")) {
                    // move this stuff inside remove method?
                    System.out.print("Enter auto ID to remove: ");
                    int ID = scnr.nextInt();
                    scnr.nextLine();
                    removeAuto(autoList, ID);
                }
                else if (command.equalsIgnoreCase("updateAuto")) {
                    updateAuto(autoList, scnr);
                }
                else if (command.equalsIgnoreCase("exportInventory")) {
                    exportInventory();
                }
            }
            while (!command.equalsIgnoreCase("quit"));   

        }
        // catch blocks?
                
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
            scnr.nextLine(); // clear scanner before next userInput
            
            Automobile auto = new Automobile(make, model, color, year, mileage);
            autoList.add(auto);
            System.out.println("auto added");
        }
        catch (InputMismatchException e) {
            System.out.println("must enter correct data type for each field");
            scnr.nextLine(); // clears scanner before next userInput
            // FIXME: route user to failed input attempt
        }
        }
    
    public static void listAutoInventory(ArrayList<Automobile> autoList) {
        // if inventory empty print 'inventory empty'
        // else
            // for auto in autolist print autoInfo
        autoList.forEach((auto) -> System.out.println(auto.getautoInfo()));
    }
    
    public static void removeAuto(ArrayList<Automobile> autoList, int ID) { // remove auto from inventory based on ID from user input
        // try
        for (int i = 0; i < autoList.size(); i++) {
            if (ID == autoList.get(i).getID()) {
                autoList.remove(i);
                System.out.printf("Auto ID: %d removed\n", ID);
                break;
            }
        System.out.println("Auto ID not found");
        }
        // catch value not found
        //     print error message
    }
    
    public static void updateAuto(ArrayList<Automobile> autoList, Scanner scnr) {
        System.out.print("Enter an auto ID to update: ");
        int ID = scnr.nextInt();
        scnr.nextLine();
        for (int i = 0; i < autoList.size(); i++) {
            if (ID == autoList.get(i).getID()) {
                System.out.println(autoList.get(i).getautoInfo());
                System.out.print("Enter field to update: ");
                String field = scnr.nextLine();
                if (field.equalsIgnoreCase("make")) {
                    System.out.print("Enter new value: ");
                    autoList.get(i).setMake(scnr.nextLine());
                }
                // FIX: add other fields
                break;
            }
        System.out.println("Auto ID not found");
        }
    }
    public static void exportInventory() {
        String content = "Hello, World!";

        // The file path where you want to save the string
        String filePath = "output.txt";

        // Try-with-resources to ensure the file is closed after writing
        try (FileWriter fileWriter = new FileWriter(filePath);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}
