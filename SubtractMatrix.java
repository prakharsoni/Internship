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
        System.out.println("The first array is : ");
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The Second array is : ");
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
                sub[i][j]=arr1[i][j]-arr2[i][j];
            }
        }
        System.out.println();
        System.out.println("The Subtracted matrix is : ");
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
                System.out.print(sub[i][j]+" ");
            }
            System.out.println();
        }
    }
}