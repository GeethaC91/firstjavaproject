import java.util.Scanner;

public class EqualCheck
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();
        equalCheck(a,b,c);
    }
    public static void equalCheck(int a,int b, int c)
    {
        if((a==b) && (b==c))
        {
            System.out.println("All the three numbers are equal");

        }
        else
        {
            System.out.println("Not Equal");
        }
    }
}
