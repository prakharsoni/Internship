import java.util.Scanner;
public class ReverseString
{
    public static void main(String[] args)
    {
        int i;
        String reverseStr = "", string;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        string = obj.nextLine();
        for(i=string.length()-1;i>=0;i--)
        {
            reverseStr = reverseStr + string.charAt(i);
        }
        System.out.println();
        System.out.print("The reverse of this is : "+reverseStr);
    }
}