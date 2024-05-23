import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Savings savings = new Savings();

        System.out.println("Enter amount to deposit in savings account");
        double depositAmount = scanner.nextDouble();

        savings.deposit(depositAmount);

        System.out.println("Enter amount to withdraw from savings account");
        double withdrawAmount = scanner.nextDouble();

        savings.withdrawl(withdrawAmount);

        savings.displayBalance();

        Checkings checkings = new Checkings();

        System.out.println("Enter amount to deposit in checkings account");
        depositAmount = scanner.nextDouble();

        checkings.deposit(depositAmount);

        System.out.println("Enter amount to withdraw from checkings account");
        withdrawAmount = scanner.nextDouble();

        checkings.withdrawl(withdrawAmount);

        checkings.displayBalance();
    }
}
