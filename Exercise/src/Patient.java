import java.util.Scanner;

public class Patient {
    public static void main(String[] args) {
        String patient[] = new String[4];
        int choice;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < patient.length; i++) {
            System.out.println("Enter the " + (i + 1) + "th First Name: ");
            patient[i] = input.nextLine();
        }
        System.out.println("Your Patients are: ");
        for (int i = 0; i < patient.length; i++) {
            System.out.println((i + 1) + ". " + patient[i]);
        }
        System.out.println("What Do You Want To Do Now? ");
        System.out.println("1. Modify");
        System.out.println("2. Delete");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter The Number of Patient You Want to Modify..");
                int patient_num = input.nextInt();
                input.nextLine(); // Added to consume the newline character
                if (patient_num > patient.length || patient_num <= 0) {
                    System.out.println("Invalid Patient Number.");
                    break;
                } else {
                    System.out.println("You Chose " + patient[patient_num - 1] + "To Modify Name.");
                    System.out.println("Enter the new First Name: ");
                    String new_name = input.nextLine(); // Now new_name is a working String
                    patient[patient_num - 1] = new_name;
                }
                break;
            case 2:
                System.out.println("Enter the number of paitent you want to delete");
                int patient_num1 = input.nextInt();
                if (patient_num1 > patient.length || patient_num1 <= 0) {
                    System.out.println("Invalid Patient Number.");
                    break;
                } else {
                    System.out.println("You Chose " + patient[patient_num1 - 1] + "To Delete.");
                }
            default:
                System.out.println("Enter a Valid Choice.");
                break;
        }
        input.close();
    }
}
