
//Check Password for 3 attempts
import java.util.Scanner;

public class PassCheck {
    public static void main(String[] args) throws Exception {
        int count = 3;
        final String PASS = "yeah";
        String guess;
        Scanner input = new Scanner(System.in);
        System.out.println("You have " + count + "Tries.");
        while (count > 0) {
            System.out.println("Enter The Password: ");
            guess = input.nextLine();
            if (guess.equals(PASS)) {
                System.out.println("ACCESS GRANTED!!!");
                input.close();
                return;
            } else {
                System.out.println("Wrong Password, Try Again!!");
                count--;
                System.out.println("You Have " + count + "Tries left");
            }
        }
        System.out.println("ACCESS DENIED!!");
        input.close();
    }
}
