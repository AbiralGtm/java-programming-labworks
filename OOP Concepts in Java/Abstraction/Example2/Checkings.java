public class Checkings extends BankAccount
{
    double balance = 0.00;
    public void deposit(double amount)
    {
        balance += amount;
        System.out.println("Amount Deposited Successfully");
    }

    public void withdrawl(double amount)
    {
        if(amount <= balance)
        {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully. Remaining balance: "+ balance);
        }else{
            System.out.println("Funds not sufficient");
        }
    }

    public void displayBalance()
    {
        System.out.println("The current balance is :"+ balance);
    }
}