public class LargestElement
{
    public static void main(String[] args)
    {
        int arr[]={1,2,6,41,5};
        int i, lar;
        lar=arr[0];
        System.out.print("The array is : ");
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>lar)
            lar=arr[i];
        }
        System.out.println();
        System.out.print("The largest element in the array is : "+lar);
    }
}