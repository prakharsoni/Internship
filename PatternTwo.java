public class PatternTwo
{
    public static void main(String[] args)
    {
        int i, j, count=5;
        for(i=1;i<=count;i++)
        {
            for(j=5;j>0;j--)
            {
                if(i==j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(j);

                }
            }
            System.out.println();
        }
    }
}