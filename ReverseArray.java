public class ReverseArray
{
    public static void main(String[] args)
    {
        int i, arr[] = new int[]{1,2,3,4,5,6};
        System.out.print("The array is : ");
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("The reversed array is : ");
        for(i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}