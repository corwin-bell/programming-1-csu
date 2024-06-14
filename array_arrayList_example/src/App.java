import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        String[] DenverTop5Restos = {
            "54thirty Rooftop",
            "The Fire Restaurant & Lounge",
            "Bubba Gump Shrimp Co.",
            "Corinne Restaurant",
            "Izakaya Den"
        };
        System.out.println("The top restaurant in Denver is " + DenverTop5Restos[0]);

        Scanner scnr = new Scanner(System.in);
        // declare empty ArrayList to add to later
        ArrayList<String> groceryList = new ArrayList<>();
        
        System.out.println("Add 2 items to grocery list");
        groceryList.add(scnr.nextLine()); // Eggs
        groceryList.add(scnr.nextLine()); // Kale

        // remove item from grocery list
        System.out.println("Remove an item from grocery list");
        groceryList.remove(0); // Removes Eggs

        System.out.println(groceryList); // Prints [Kale]






    }
}
