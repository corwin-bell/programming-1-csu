/*
 * Develop a Java program that will store data in the form of daily average temperatures for one week. 
 * Store the day and average temperature in two different arraylists. 
 * Your program should prompt the user for the day of the week (Monday through Sunday) 
 * and display both the day and temperature for each day. 
 * If "week" is entered, the output for your program should provide the temperature for each day and the weekly average.
 */
import java.util.Scanner;
import java.util.Arrays;

 public class App {
    public static void main(String[] args) throws Exception {
        // declare variables
        final int DAYS_PER_WEEK = 7;
        String[] weekDays = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
        };
        int[] avgTemps = new int[DAYS_PER_WEEK];
        Scanner scnr = new Scanner(System.in);
        String userInput = "-";

        // ask user for avg temps for each day
        System.out.println(" enter average temps for each weekday: ");
        for (int i = 0; i < weekDays.length; i++) {
            System.out.print(weekDays[i] + ": ");
            avgTemps[i] = scnr.nextInt();
        }
        System.out.println("\n Commands: '<WEEKDAY>' print temps for given weekday,");
        System.out.println("'weekly temps' print temps for all weekdays with average");
        System.out.println("'q' quit program");
        // while loop for program user interface, loop until q is entered
        while (!userInput.equalsIgnoreCase("q")) {
            System.out.print("Command: ");
            userInput = scnr.nextLine();
            
            // if user inputs "weekly temps"; display temps by day and weekly average
            if (userInput.equalsIgnoreCase("weekly temps")) {
                int tempSum = 0;
                for (int i = 0; i < weekDays.length; i++) {
                    System.out.printf("%s: %d %n", weekDays[i], avgTemps[i]);
                    tempSum += avgTemps[i];
                }
                System.out.printf("Weekly avg temp: %d %n", tempSum/DAYS_PER_WEEK);
            }
            
            // else, if user inputs "[Weekday]", display temps for that week day
            else {
                for (int i = 0; i < weekDays.length; i++) {
                    if (userInput.equalsIgnoreCase(weekDays[i])) {
                        System.out.printf("%s: %d %n", weekDays[i], avgTemps[i]);
                        break;
                    }
                }
            }
        }

        scnr.close();
    }
        
}
