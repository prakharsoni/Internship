import java.util.Scanner;
public class Percentage
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks for english : ");
        float a = sc.nextFloat();
        System.out.println("Enter the marks for Maths : ");
        float b = sc.nextFloat();
        System.out.println("Enter the marks for History : ");
        float c = sc.nextFloat();
        System.out.println("Enter the marks for Hindi : ");
        float d = sc.nextFloat();
        System.out.println("Enter the marks for Physics : ");
        float e = sc.nextFloat();
        float percent = (a+b+c+d+e)/5;
        System.out.print("The percentage is : "+percent+"%");
    }
}