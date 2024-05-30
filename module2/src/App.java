import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter weekly income in dollars: ");
        float income = userInput.nextFloat();
        float taxWithholding = 0;

        if (income < 0) {
            System.out.println("Error: income must be greater than or equal to zero dollars.");
        }

        else {
            if (income < 500) {
                taxWithholding = 0.1f * income;
            }
            else if (income < 1500) {
                taxWithholding = 0.15f * income;
            }
            else if (income < 2500) {
                taxWithholding = 0.2f * income;
            }
            else {
                taxWithholding = 0.3f * income;
            }
            
            System.out.println("Weekly tax withholding is " + taxWithholding);
        }

        userInput.close();
    }
}
