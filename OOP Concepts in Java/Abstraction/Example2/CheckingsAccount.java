class CheckingsAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingsAccount(double initialBalance, double overdraftLimit) {
        super(initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " into Checking Account.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount >= -overdraftLimit)) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Checking Account.");
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit or is not positive.");
        }
    }

    @Override
    public void displayBalance() {
        System.out.println("Checking Account Balance: " + balance);
    }
}