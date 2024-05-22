import java.util.Scanner;
class ATM {
    private Scanner scanner;
    public ATM() {
        scanner = new Scanner(System.in);
    }

    public void display() {
        System.out.println("Welcome to the ATM. Please select an option:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check balance");
        System.out.println("4. Exit");
    }

    public void info() {
        while (true) {
            display();
            int choice = scanner.nextInt();
            double amount;
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to withdraw:");
                    amount = scanner.nextDouble();
                    System.out.println("Withdrawal amount: " + amount);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit:");
                    amount = scanner.nextDouble();
                    System.out.println("Deposit amount: " + amount);
                    break;
                case 3:
                    System.out.println("Checking balance...");
                    break;
                case 4:
                    System.out.println("Exiting the ATM. Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
public class Task3 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.info();
    }
}
