import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args)
    {
        int i,m=0,flag=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int n = scan.nextInt();
        m=n/2;
        if(n == 0 || n == 1){
            System.out.println("They are not prime number");
        }else{
            for(i = 2; i<=m; i++)
            {
                if(n % i == 0 ){
                    System.out.println(n + " is not a prime number");
                    flag = 1;
                    break;

                }
            }
            if(flag==0)  { System.out.println(n+" is prime number"); }

        }

        scan.close();
    }
}
