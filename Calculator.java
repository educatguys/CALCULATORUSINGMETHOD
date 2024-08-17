import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Welcome to Calculator App");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter a: ");
                int a = sc.nextInt();
                System.out.print("Enter b: ");
                int b = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Addition of two numbers: " + (a + b));
                        break;
                    case 2:
                        System.out.println("Subtraction of two numbers: " + (a - b));
                        break;
                    case 3:
                        System.out.println("Multiplication of two numbers: " + (a * b));
                        break;
                    case 4:
                        if (b != 0) {
                            System.out.println("Division of two numbers: " + (a / b));
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                }
            } else if (choice == 5) {
                System.out.println("Thanks for using calculator app");
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
