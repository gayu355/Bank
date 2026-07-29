class BankAccount {
    String name;
    int accountNo;
    double balance;

    void createAccount(String n, int a) {
        name = n;
        accountNo = a;
        balance = 0;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited Successfully");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn Successfully");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void display() {
        System.out.println("\nAccount Holder : " + name);
        System.out.println("Account Number : " + accountNo);
        System.out.println("Balance : " + balance);
    }
}