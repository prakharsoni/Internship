import java.util.Scanner;
public class InvertPyramid
{
    public static void main(String[] args)
    {
        int i, j, row, k;
        try(Scanner obj = new Scanner(System.in))
        {
            System.out.print("Enter the number of rows : ");
            row = obj.nextInt();
        }
        for (i=0;i<row;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(k=0;k<row-i;k++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    
}