public class SmallestElement
{
    public static void main(String[] args)
    {
        int arr[]={10,6,63,4,2};
        int i, small;
        small=arr[0];
        System.out.print("The array is : ");
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]<small)
            small=arr[i];
        }
        System.out.println();
        System.out.print("The smallest element in the array is : "+small);
    }
}