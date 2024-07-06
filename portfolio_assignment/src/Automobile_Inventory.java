import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.lang.IndexOutOfBoundsException;
public class Automobile_Inventory {
    
    // declare variable
    
    public static void main(String[] args) throws Exception {
        // consider refactor as linkedlist
        ArrayList<Automobile> autoList = new ArrayList<>();
        String command = "";
        try (Scanner scnr = new Scanner(System.in)) {
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
                    removeAuto(autoList, scnr);
                }
                else if (command.equalsIgnoreCase("updateAuto")) {
                    updateAuto(autoList, scnr);
                }
                else if (command.equalsIgnoreCase("exportInventory")) {
                    exportInventory(autoList, scnr);
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
        }
        }
    
    public static void listAutoInventory(ArrayList<Automobile> autoList) {
        if (autoList.isEmpty()) {
            System.out.println("Auto inventory is empty, add an auto in order to list an inventory.");
        }
        else {
            autoList.forEach((auto) -> System.out.println(auto.getautoInfo()));
        } 
    }
    
    public static void removeAuto(ArrayList<Automobile> autoList, Scanner scnr) { // remove auto from inventory based on ID from user input
        try {
            System.out.print("Enter autoList index to remove: ");
            int index = scnr.nextInt();
            scnr.nextLine();
            autoList.remove(index);
            System.out.printf("Auto index: %d removed\n", index);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Auto index not found");
        }
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
                    System.out.println("make updated");
                }
                // FIX: add other fields
                break;
            }
        System.out.println("Auto ID not found");
        }
    }
    public static void exportInventory(ArrayList<Automobile> autoList, Scanner scnr) {

        // The file path where you want to save the string
        System.out.print("Enter file path: ");
        String filePath = scnr.nextLine();

        // Try-with-resources to ensure the file is closed after writing
        try (FileWriter fileWriter = new FileWriter(filePath);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            for (int i = 0; i < autoList.size(); i++) {
                printWriter.println(autoList.get(i).getautoInfo());
            }
            System.out.println("export to file successful");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}
