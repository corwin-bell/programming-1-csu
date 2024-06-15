import java.util.Scanner;

 public class App {
    public static void main(String[] args) throws Exception {
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

        System.out.println("\nenter average temps for each weekday: ");
        for (int i = 0; i < weekDays.length; i++) {
            System.out.print(weekDays[i] + ": ");
            avgTemps[i] = scnr.nextInt();
        }
        
        System.out.println("\nCommands: '<WEEKDAY>' print temps for given weekday,");
        System.out.println("'weekly temps' print temps for all weekdays with average");
        System.out.println("'q' quit program");
        while (!userInput.equalsIgnoreCase("q")) {
            System.out.print("\nCommand: ");
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
            
            // else, if user inputs a day of week, display temps for that week day
            else {
                for (int i = 0; i < weekDays.length; i++) {
                    if (userInput.equalsIgnoreCase(weekDays[i])) {
                        System.out.printf("%s: %d %n", weekDays[i], avgTemps[i]);
                        break; // exit loop once a match is found
                    }
                }
            }
        }

        scnr.close();
    }
        
}
