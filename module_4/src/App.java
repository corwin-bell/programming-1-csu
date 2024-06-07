import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner  scnr = new Scanner(System.in);
        int arrayLen = 10;
        float[] gradeArray = new float[arrayLen];
        float sumGrades = 0;
        Float minGrade = null;
        Float maxGrade = null;

        // take user input for grades, sum total for average
        for (int i=0; i<arrayLen; i++) {
            String promptString = String.format("Enter grade %d of 10 (between 0 - 100)", i + 1);
            System.out.println(promptString);
            float grade = scnr.nextFloat(); 
            
            // calculate sum of grades
            sumGrades += grade;

            // initialize min and max grade values
            if (minGrade == null && maxGrade == null) {
                minGrade = grade;
                maxGrade = grade;
            }
            else {
                // calculate min grade
                if (grade < minGrade) {
                    minGrade = grade;
                }
    
                // calculate max grade
                if (grade > maxGrade) {
                    maxGrade = grade;
                }
            } 
            // add to array of grades for verification
            gradeArray[i] = grade;  
        }

        // calculate average grade
        float avgGrade = sumGrades/arrayLen;
        
        // print results to console
        System.out.println("Grades: " + Arrays.toString(gradeArray));
        System.out.println("Minimum Grade: " + Float.toString(minGrade));
        System.out.println("Maximum Grade: " + Float.toString(maxGrade));
        System.out.println("Average Grade: " + Float.toString(avgGrade));

        scnr.close();
    }
}
