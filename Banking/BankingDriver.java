package Banking;


interface Account {
    void depositMoney(double amount);

    void withdrawMoney(double amount);

    void checkBalance();

}

abstract class BankAccount implements Account {

    protected double accountBalance;

    BankAccount(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void depositMoney(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println(amount + " deposited successfully");
        } else {
            System.out.println("Deposit amount should be positive");
        }
    }

    public void withdrawMoney(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    public void checkBalance() {
        System.out.println("Your current balance is: " + accountBalance);
    }
}

class SavingsAccount extends BankAccount {

    private static final int ACCOUNT_COUNTER = 1000000000;
    int accountNumber;
    private double balance;

    String name;
    String surname;

    protected SavingsAccount(String name, String surname, double depositeAmount) {

        super(depositeAmount);
        this.balance = depositeAmount;
        this.accountNumber = (int) (Math.random() * ACCOUNT_COUNTER) + 1;
        this.name = name;
        this.surname = surname;
        System.out.println("Account created successfully");
        System.out.println(name + " " + surname + ", your account number is: " + accountNumber);
        System.out.println(this.balance + " deposited in in your account " + accountNumber);
    }

    

    private static final double INTEREST_RATE = 0.05;

    public void addInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Your amount after annual interest rate of " + INTEREST_RATE + " is: " + balance);
    }

}

class CurrentAccount extends BankAccount{
    private double balance;
    private static final int ACCOUNT_COUNTER = 1000000000;
    int accountNumber;
    String name;
    String surname;


    protected CurrentAccount(String name, String surname, double balance) {

        super(balance);
        this.balance = balance;
        this.accountNumber = (int) (Math.random() * ACCOUNT_COUNTER) + 1;
        this.name = name;
        this.surname = surname;
        System.out.println("Account created successfully");
        System.out.println(name + " " + surname + ", your account number is: " + accountNumber);
        System.out.println(this.balance + " deposited in in your account " + accountNumber);
    }
public void withdrawMoney(double amount) {
    if (amount > 0 && amount <= accountBalance) {
        accountBalance -= amount + 1;
        System.out.println("Amount withdrawn: " + amount);
    } else {
        System.out.println("Insufficient balance or invalid amount");
    }
}
}

class Main{
    public static void main(String[] args) {
        SavingsAccount sa =  new SavingsAccount("Nikita", "Vishnoi", 76859);
        sa.depositMoney(45000);
        sa.addInterest();
        sa.checkBalance();
        sa.withdrawMoney(900);
        sa.checkBalance();

        CurrentAccount c = new CurrentAccount("Nikita ", "Vishnoi ", 890000 );
        c.checkBalance();
        c.depositMoney(8900);
        c.withdrawMoney(870);
        c.checkBalance();


    }
}
