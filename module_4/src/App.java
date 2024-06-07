import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /* 
         * The program will utilize a for-loop to read ten floating-point grades from user input. 
         * Include code to prevent an endless loop. 
         * Ask the user to enter the values, then print the following data:
            Average
            Maximum
            Minimum
         */
        Scanner  scnr = new Scanner(System.in);
        int arrayLen = 10;
        float[] gradeArray = new float[arrayLen];
        
        // accept and modify user input in each iteration
        for (int i=0; i<arrayLen; i++) {
            String promptString = String.format("Enter grade %d of 10 (between 0 - 100)", i + 1);
            System.out.println(promptString);
            gradeArray[i] = scnr.nextFloat();
        }
        
        // show array result after modification
        System.out.println(Arrays.toString(gradeArray));
        scnr.close();
    }
}
