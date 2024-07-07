import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.lang.IndexOutOfBoundsException;
public class Automobile_Inventory {

    public static void main(String[] args) throws Exception {
        ArrayList<Automobile> autoList = new ArrayList<>();
        String command = "";
        try (Scanner scnr = new Scanner(System.in)) {
            do {
                System.out.println("Commands: 'addAuto', 'listAutoInventory', 'removeAuto', 'updateAuto','exportInventory', 'quit'");
                command = scnr.nextLine();
                if (command.equalsIgnoreCase("addAuto")) {
                    addAuto(autoList, scnr);
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
                scnr.nextLine(); // clears scanner before next userInput
            }
            while (!command.equalsIgnoreCase("quit"));   
        }       
    }
    
    public static void addAuto(ArrayList<Automobile> autoList, Scanner scnr) {
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
            System.out.println("auto added");
        }
        catch (InputMismatchException e) {
            System.err.println("must enter correct data type for each field");
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public static void listAutoInventory(ArrayList<Automobile> autoList) {
        // print all autos in inventory to a new line
        if (autoList.isEmpty()) {
            System.out.println("Auto inventory is empty, add an auto in order to list an inventory.");
        }
        else {
            autoList.forEach((auto) -> System.out.println(auto.getautoInfo()));
        } 
    }
    
    public static void removeAuto(ArrayList<Automobile> autoList, Scanner scnr) { 
        // remove auto from inventory based on index from user input
        try {
            System.out.print("Enter autoList index to remove: ");
            int index = scnr.nextInt();
            autoList.remove(index);
            System.out.printf("Auto index: %d removed\n", index);
        }
        catch (IndexOutOfBoundsException e) {
            System.err.println("Auto index not found");
        }
    }
    
    public static void updateAuto(ArrayList<Automobile> autoList, Scanner scnr) {
        // access auto class getters for selected auto index in inventory
        try {
            System.out.print("Enter an auto index to update: ");
            int index = scnr.nextInt();
            scnr.nextLine();
            System.out.println(autoList.get(index).getautoInfo());
            System.out.print("Enter field to update: ");
            String field = scnr.nextLine();
            if (field.equalsIgnoreCase("make")) {
                System.out.print("Enter new value: ");
                autoList.get(index).setMake(scnr.nextLine());
                System.out.println("make updated");
            }
            else if (field.equalsIgnoreCase("model")) {
                System.out.print("Enter new value: ");
                autoList.get(index).setModel(scnr.nextLine());
                System.out.println("model updated");
            }
            else if (field.equalsIgnoreCase("color")) {
                System.out.print("Enter new value: ");
                autoList.get(index).setColor(scnr.nextLine());
                System.out.println("color updated");
            }
            else if (field.equalsIgnoreCase("year")) {
                System.out.print("Enter new value: ");
                autoList.get(index).setYear(scnr.nextInt());
                System.out.println("year updated");
            }
            else if (field.equalsIgnoreCase("mileage")) {
                System.out.print("Enter new value: ");
                autoList.get(index).setMileage(scnr.nextInt());
                System.out.println("mileage updated");
            }
            else {
                System.out.println("Field not found");
            }
        }
        catch (InputMismatchException e) {
            System.err.println("must enter correct data type for each field");
        }
        catch (IndexOutOfBoundsException e) {
            System.err.println("Auto index not found");
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void exportInventory(ArrayList<Automobile> autoList, Scanner scnr) {
        // export inventory to file in current directory
        System.out.print("Enter file path: ");
        String filePath = scnr.nextLine();

        // Try-with-resources to ensure the file is closed after writing
        try (FileWriter fileWriter = new FileWriter(filePath);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            autoList.forEach((auto) -> printWriter.println(auto.getautoInfo()));
            System.out.println("export to file successful");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }  
}
