
import java.util.Scanner;

public class ITxxxxxxxxLab4Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        String result = (number > 0) ? "Positive" :
                        (number < 0) ? "Negative" : "Zero";

        System.out.println("Number is " + result);

        input.close();
    }
}
