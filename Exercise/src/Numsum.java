
//Sum of only positive numbers from 10 inputs
import java.util.Scanner;

public class Numsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter the " + i + "th Number: ");
            int num = input.nextInt();
            if (num > 0) {
                sum += num;
            }
        }
        System.out.println("The sum of the Positive numbers are: " + sum);
        input.close();
    }
}
