
//Test How Input works
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int value = input.nextInt();
        for (int i = 0; i < value; i++) {
            System.out.println(value);
        }
        input.close();
    }
}
