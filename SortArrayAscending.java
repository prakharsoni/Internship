import java.util.Arrays;
public class SortArrayAscending
{
    public static void main(String[] args)
    {
        int arr[]={5,2,7,3,1,4};
        int i;
        System.out.print("The array is : ");
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
            Arrays.sort(arr);
        }
        System.out.println();
        System.out.print("The ascending order sorted array is : ");
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}