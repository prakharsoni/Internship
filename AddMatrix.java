public class AddMatrix
{
    public static void main(String[] args)
    {
        int arr1[][]={{1,2,3},{4,5,4},{3,2,1}};
        int arr2[][]={{1,2,3},{4,5,4},{3,2,1}};
        int rows=arr1.length;
        int cols=arr1[0].length;
        int i, j;
        int sum[][] = new int[rows][cols];
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("The sum of the array is : ");
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
                System.out.print(sum[i][j]+ " ");
            }
            System.out.println();
        }
    }
}