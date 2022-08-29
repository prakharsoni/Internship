import java.util.Scanner;
public class LargestofThree
{
    public static void main(String[] args)
    {
        int num1, num2, temp, num3, largest;
        try(Scanner obj = new Scanner(System.in))
        {
            System.out.print("Enter the First number : ");
            num1 = obj.nextInt();
            System.out.print("Enter the second number : ");
            num2 = obj.nextInt();
            System.out.print("Enter the third number : ");
            num3 = obj.nextInt();
        }
        temp = num1>num2?num1:num2;
        largest = num3>temp?num3:temp;
        System.out.print("The largest number is : "+largest);
    }
}