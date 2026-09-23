package homework;
import java.util.Scanner;

enum MenuOption {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE,
    EXIT
}

public class Menu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULATOR MENU");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        MenuOption option;

        if (choice == 1) {
            option = MenuOption.ADD;
        }
        else if (choice == 2) {
            option = MenuOption.SUBTRACT;
        }
        else if (choice == 3) {
            option = MenuOption.MULTIPLY;
        }
        else if (choice == 4) {
            option = MenuOption.DIVIDE;
        }
        else if (choice == 5) {
            option = MenuOption.EXIT;
        }
        else {
            System.out.println("Invalid choice");
            scanner.close();
            return;
        }

        switch (option) {

            case ADD:
                System.out.print("Enter first number: ");
                int num1 = scanner.nextInt();

                System.out.print("Enter second number: ");
                int num2 = scanner.nextInt();

                System.out.println("Result: " + (num1 + num2));
                break;

            case SUBTRACT:
                System.out.print("Enter first number: ");
                num1 = scanner.nextInt();

                System.out.print("Enter second number: ");
                num2 = scanner.nextInt();

                System.out.println("Result: " + (num1 - num2));
                break;

            case MULTIPLY:
                System.out.print("Enter first number: ");
                num1 = scanner.nextInt();

                System.out.print("Enter second number: ");
                num2 = scanner.nextInt();

                System.out.println("Result: " + (num1 * num2));
                break;

            case DIVIDE:
                System.out.print("Enter first number: ");
                num1 = scanner.nextInt();

                System.out.print("Enter second number: ");
                num2 = scanner.nextInt();

                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                }
                else {
                    System.out.println("Result: " + (num1 / num2));
                }
                break;

            case EXIT:
                System.out.println("Exiting...");
                break;
        }

        scanner.close();
    }
}