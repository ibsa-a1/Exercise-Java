import java.util.Scanner;
import java.util.Random;

public class GuessNum {
    public static void main(String[] args) {
        int count = 2;
        Random num = new Random();
        final int NUM = num.nextInt(5, 10);
        int guess;
        Scanner input = new Scanner(System.in);
        System.out.println("You have " + count + "Tries.");
        while (count > 0) {
            System.out.println("Enter The Number");
            guess = input.nextInt();
            if (guess == NUM) {
                System.out.println("You've Got The Number!");
                input.close();
                return;
            } else if (guess > NUM) {
                System.out.println("Your Guess is above the number");
            } else {
                System.out.println("Your Guess is below the number");
            }
            count--;
            System.out.println("You have " + count + " tries left");
        }
        System.out.println("Failed to guess. The correct Number is: " + NUM);
        input.close();
    }
}
