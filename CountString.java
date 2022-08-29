import java.util.Scanner;
public class CountString
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int i, count=0;
        System.out.print("Enter the sentence to count the number of characters : ");
        String string = obj.nextLine();
        for(i=0;i<string.length();i++)
        {
            if(string.charAt(i)!=' ')
            {
                count++;
            }
        }
        System.out.println();
        System.out.print("The number of characters are : "+count);
    }
}