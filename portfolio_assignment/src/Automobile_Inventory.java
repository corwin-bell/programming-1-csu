import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

public class Automobile_Inventory {
    
    // declare variables
    
    public static void main(String[] args) throws Exception {
        ArrayList<Automobile> autoList = new ArrayList<>();
        // add while loop for user input
        autoList.add(new Automobile());
        // test to make sure Automobile object added to list
        System.out.println(autoList.get(0).getMake());
    }
    
    public static void addAuto() {
            //FIXME: ask user for auto attribute input
        }
    
    public static void removeAuto() {
            //FIXME: remove auto based on ID from user input
        }
    
}
