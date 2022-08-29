import java.util.Scanner;
public class PrimeNumber
{
    public static void main(String[] args)
    {
        int num, flag=0, i, num1;
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.println("Enter the number : ");
            num = sc.nextInt();
        }
        num1=num/2;
        if(num==0||num==1)
        {
            System.out.println(num+" is not the prime number.");
        }
        else
        {
            for(i=2;i<=num1;i++)
            {
                if(num%i==0)
                {
                    System.out.println(num+" is not the prime number.");
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println(num+" is the prime number");
            } 
        }
    }
}