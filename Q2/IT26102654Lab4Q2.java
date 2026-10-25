
import java.util.Scanner;

public class IT26102654Lab4Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double examMarks, labMarks;
        double examPercentage, labPercentage;
        double finalMarks;

        System.out.print("Enter exam marks: ");
        examMarks = input.nextDouble();

        System.out.print("Enter lab submission marks: ");
        labMarks = input.nextDouble();

        // Validate marks
        if (examMarks < 0 || examMarks > 100 ||
            labMarks < 0 || labMarks > 100) {

            System.out.println("Invalid marks! Marks should be between 0 and 100.");
            input.close();
            return;
        }

        System.out.print("Enter exam percentage: ");
        examPercentage = input.nextDouble();

        System.out.print("Enter lab percentage: ");
        labPercentage = input.nextDouble();

        // Validate percentages
        if (examPercentage + labPercentage != 100) {
            System.out.println("Invalid percentages! Percentages should add up to 100.");
            input.close();
            return;
        }

        // Calculate final marks
        finalMarks = (examMarks * examPercentage / 100)
                   + (labMarks * labPercentage / 100);

        System.out.printf("Final marks: %.2f%n", finalMarks);

        input.close();
    }
}
