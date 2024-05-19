import java.util.Scanner;

public class Maximum {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter three numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + "is the greatest");
        }else if(num2 > num1 && num2 > num3){
            System.out.print(num2 + " is greatest");
        }else if (num3 > num1 && num3 > num2){
            System.out.print(num3 + "is greatest");
        }else{
            System.out.print("Some are equal");
        }
        scan.close();
    }
}
