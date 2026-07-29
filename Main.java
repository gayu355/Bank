import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount b = new BankAccount();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();

        b.createAccount(name, acc);

        int choice;

        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Amount: ");
                    double d = sc.nextDouble();
                    b.deposit(d);
                    break;

                case 2:
                    System.out.print("Enter Amount: ");
                    double w = sc.nextDouble();
                    b.withdraw(w);
                    break;

                case 3:
                    b.display();
                    break;

                case 4:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}