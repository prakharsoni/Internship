import java.util.Scanner;
public class Pyramid
{
    public static void main(String[] args)
    {
        int i, j, row;
        try(Scanner obj = new Scanner(System.in))
        {
            System.out.print("Enter the number of the rows : ");
            row = obj.nextInt();
        }
        for(i=0;i<row;i++)
        {
            for(j=row-i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
