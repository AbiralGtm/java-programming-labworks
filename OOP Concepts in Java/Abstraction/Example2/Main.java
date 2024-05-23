public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1000, 0.05);
        CheckingsAccount checking = new CheckingsAccount(500, 200);

        savings.deposit(200);
        savings.withdraw(150);
        savings.applyInterest();
        savings.displayBalance();

        checking.deposit(100);
        checking.withdraw(700);
        checking.displayBalance();
    }
}