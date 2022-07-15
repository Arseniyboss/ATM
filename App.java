import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Which account would you like to access? ");

        String name = scanner.nextLine();

        Account account = new Account();

        int amount;

        while (true) {
            int balance = account.getBalance();

            System.out.println("\nHi " + name);

            System.out.println("\nChoose 1 to Withdraw");
            System.out.println("Choose 2 to Deposit");
            System.out.println("Choose 3 to Check Balance");
            System.out.println("Choose 4 to Exit");
            System.out.print("\nChoose the operation you want to perform: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to be withdrawn: ");

                    amount = scanner.nextInt();

                    if (balance < amount) {
                        System.out.println("\nInsufficient Balance");
                    } else {
                        account.withdraw(amount);
                        System.out.println("\nPlease collect your money");
                    }
                    break;
                case 2:
                    System.out.print("Enter the amount to be deposited: ");

                    amount = scanner.nextInt();

                    account.deposit(amount);

                    System.out.println("\nYour money has been successfully deposited");
                    break;
                case 3:
                    System.out.println("\nYour Balance : " + balance);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nInvalid Operation");
            }
        }
    }
}