import javax.lang.model.util.ElementScanner14;

public class PatternFour
{
    public static void main(String[] args)
    {
        int i, j, lines=8;
        for(i=1;i<lines;i++)
        {
            for(j=1;j<=lines/2;j++)
            {
                if(i==j)
                {
                    System.out.print(j);
                }
                else if(i>4&&j==lines-i)
                {
                    System.out.print(j);
                }
                else
                {
                    System.out.print(" ");
                }
            }  
            j=j-2;
            while(j>0)
            {
                if(i==j)
                {
                    System.out.print(j);
                }
                else if(i>4&&j==lines-i)
                {
                    System.out.print(j);
                }
                else
                {
                    System.out.print(" ");
                }
                j--;
            }
            System.out.println(" ");
        }
    }
}