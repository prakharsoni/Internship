public class SubtractMatrix
{
    public static void main(String[] args)
    {
        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][]={{1,2,3},{4,5,6},{7,8,9}};
        int i,j;
        int rows=arr1.length;
        int cols=arr1[0].length;
        int sub[][]=new int[rows][cols];
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
                sub[i][j]=arr1[i][j]-arr2[i][j];
            }
        }
        System.out.print("The Subtracted matrix is : ");
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
                System.out.print(sub[i][j]);
            }
        }
    }
}