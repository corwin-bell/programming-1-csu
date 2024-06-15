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

        // while loop for program user interface, loop until q is entered
            // if average temps is empty, ask user for temps by day of week
            // else ask user what output they want
                // if user inputs "[Weekday] temps", display temps for that week day
                // if user inputs "weekly temps"; display temps by day and weekly average
            // if user inputs "q", end program

        System.out.println(Arrays.toString(weekDays));
    }
}
