import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter weekly income in dollars: ");
        float income = userInput.nextFloat();
        // 		Declare float taxWithholding field
        float taxWithholding = 0;
        // 		If income less than 0:
        // 			Print income must be greater than or equal to zero
        if (income < 0) {
            System.out.println("income must be greater than or equal to zero dollars.");
        }
        else {
            if (income < 500) {
                taxWithholding = 0.1f * income;
            }
            // 		Else if income less than 1500:
            // 			Assign taxWithholding to 0.15 * income
            else if (income < 1500) {
                taxWithholding = 0.15f * income;
            }
            // 		Else if income less than 2500:
            // 			Assign taxWithholding to 0.20 * income
            else if (income < 2500) {
                taxWithholding = 0.2f * income;
            }
            // 		Else:
            // 			Assign taxWithholding to 0.30 * income
            else {
                taxWithholding = 0.3f * income;
            }
            System.out.println("Weekly tax withholding is " + taxWithholding);
        }
        userInput.close();
    }
}
