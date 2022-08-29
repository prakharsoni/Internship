public class PatternOne
{
    public static void main(String[] args)
    {
        int j, i, count=6;
        for(i=1;i<count;i++)
        {
            for(j=1;j<count;j++)
            {
                if(j==i)
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