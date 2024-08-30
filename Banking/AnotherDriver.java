package Banking;

import java.util.Scanner;

class AnotherDriver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to open an account? Y/N");
        char choice = sc.next().charAt(0);
        sc.nextLine();
        double amount;
        if (choice == 'Y' || choice == 'y') {
            System.out.println("Enter 'saving' to open a Saving Account");
            System.out.println("Enter 'current' to open a Current Account");
            String accountType = sc.nextLine();
            if (accountType.equalsIgnoreCase("saving")) {

                System.out.println("Enter your first name: ");
                String firstName = sc.nextLine();
                System.out.println("Enter your second name: ");
                String secondName = sc.nextLine();
                System.out.println("Enter amount you want to deposite in your account");
                int depositeAmount = sc.nextInt();
                SavingsAccount account = new SavingsAccount(firstName, secondName, (double) depositeAmount);

                System.out.println("Do you want to withdraw, deposite or check balance? Y/N");
                char userChoice = sc.next().charAt(0);
                sc.nextLine();
                if (userChoice == 'y' || userChoice == 'Y') {
                    while (userChoice == 'y' || userChoice == 'Y') {

                        System.out.println("Enter 'withdraw' to withdraw money");
                        System.out.println("Enter 'check' to check balance");
                        System.out.println("Enter 'deposite' to deposite money");
                        String userOperation = sc.nextLine();
                        switch (userOperation) {
                            case "withdraw": case "WITHDRAW":
                                System.out.println("Enter the amount to withdraw: ");
                                amount = sc.nextDouble();
                                sc.nextLine();
                                account.withdrawMoney(amount);
                                break;

                            case "check": case "CHECK":
                                account.checkBalance();
                                break;

                            case "deposite": case "DEPOSITE":
                                System.out.println("Enter your account number: ");
                                int userAccount = sc.nextInt();
                                sc.nextLine(); 
                                if (userAccount == account.accountNumber) {
                                    System.out.println("Enter the amount to deposit: ");
                                    amount = sc.nextDouble();
                                    sc.nextLine(); 
                                    account.depositMoney(amount);
                                    account.addInterest();
                                } else {
                                    System.out.println("Wrong account number");
                                }
                                break;

                            default:
                                System.out.println("Invalid choice");
                                break;
                        }

                        System.out.println("Do you want to withdraw, deposite money, or check balance? Y/N");
                        userChoice = sc.next().charAt(0);
                        sc.nextLine();
                        if (userChoice == 'n' || userChoice == 'N') {
                            System.out.println("Thank you for visiting");
                            break; 
                        }
                    }
                } else if (userChoice == 'n' || userChoice == 'N') {
                    System.out.println("Thank you for visiting");
                } else {
                    System.out.println("Invalid choice");
                }
            }

            if (accountType.equalsIgnoreCase("current")) {
                System.out.println("Enter your first name: ");
                String firstName = sc.nextLine();
                System.out.println("Enter your second name: ");
                String secondName = sc.nextLine();
                System.out.println("Enter amount you want to deposite in your account");
                int depositeAmount = sc.nextInt();
                CurrentAccount account = new CurrentAccount(firstName, secondName, depositeAmount);

                System.out.println("Do you want to withdraw, deposite money, or check balance? Y/N");
                char userChoice = sc.next().charAt(0);
                sc.nextLine(); 
                if (userChoice == 'y' || userChoice == 'Y') {
                    while (userChoice == 'y' || userChoice == 'Y') {

                        System.out.println("Enter 'withdraw' to withdraw money");
                        System.out.println("Enter 'check' to check balance");
                        System.out.println("Enter 'deposite' to deposite money");
                        String userOperation = sc.nextLine();
                        switch (userOperation) {
                            case "withdraw": case "WITHDRAW":
                                System.out.println("Enter the amount to withdraw: ");
                                amount = sc.nextDouble();
                                sc.nextLine(); 
                                account.withdrawMoney(amount);
                                break;

                                case "check": case "CHECK":
                                account.checkBalance();
                                break;

                                case "deposite": case "DEPOSITE":
                                System.out.println("Enter your account number: ");
                                int userAccount = sc.nextInt();
                                sc.nextLine(); 
                                if (userAccount == account.accountNumber) {
                                    System.out.println("Enter the amount to deposit: ");
                                    amount = sc.nextDouble();
                                    sc.nextLine(); 
                                    account.depositMoney(amount);
                                } else {
                                    System.out.println("Wrong account number");
                                }
                                break;

                            default:
                                System.out.println("Invalid choice");
                                break;
                        }
                        System.out.println("Do you want to withdraw, deposite money, or check balance? Y/N");
                        userChoice = sc.next().charAt(0);
                        sc.nextLine(); 
                        if (userChoice == 'n' || userChoice == 'N') {
                            System.out.println("Thank you for visiting");
                            break; 
                    }
                 else if (userChoice == 'n' || userChoice == 'N') {
                    System.out.println("Thank you for visiting");
                } else {
                    System.out.println("Invalid choice");
                }
            }
        } else if (choice == 'N' || choice == 'n') {
            System.out.println("Thank you for visiting");
        } else {
            System.out.println("Invalid choice");
        }
    }
        sc.close();
    
}
}
}