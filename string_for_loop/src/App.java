import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner  scnr = new Scanner(System.in);
        int arrayLen = 3;
        String[] stringArray = new String[arrayLen];
        
        // accept and modify user input in each iteration
        for (int i=0; i<arrayLen; i++) {
            System.out.println("Enter a string:");
            stringArray[i] = scnr.nextLine().toUpperCase();
        }
        
        // show array result after modification
        System.out.println(Arrays.toString(stringArray));
        scnr.close();
    }
}
