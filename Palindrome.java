import java.util.Scanner;
public class Palindrome 
{
    public static void main(String[] args)
    {
        int num, r, sum=0, temp;
        try(Scanner obj = new Scanner(System.in))
        {
            System.out.print("Enter the number : ");
            num = obj.nextInt();
        }
        temp=num;
        while(num>0)
        {
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(temp==sum)
        System.out.print("The number is palindrome.");
        else
        System.out.print("The number is not palindrome.");
    }   
}
