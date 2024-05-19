import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Principle");
        double principle = scanner.nextDouble();

        System.out.println("Enter Time");
        double time = scanner.nextDouble();

        System.out.println("Enter Rate");
        double rate = scanner.nextDouble();

        double si = (principle * time * rate) /100;

        System.out.println("The simple interest is " + si);
    }
}
