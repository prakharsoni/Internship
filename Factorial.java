import java.util.Scanner;
public class Factorial 
{
    public static void main(String[] args)
    {
        int i, num, fact=1;
        try (Scanner myObj = new Scanner(System.in))
        {
            System.out.print("Enter the number for factorial : ");
            num = myObj.nextInt();
        }
        for(i=1;i<=num;i++)
        {
            fact = fact*i;
        }
        System.out.print("Factorial is "+fact);
    }    
}
