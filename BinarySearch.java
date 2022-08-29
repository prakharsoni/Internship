public class BinarySearch
{
    public static int binarySearch(int arr[], int low, int high, int num)
    {
        if(high>=low)
        {
            int mid = low + (high - low) / 2;
            if(arr[mid]==num)
            {
                return mid;
            }
            if(arr[mid]>num)
            {
                return binarySearch(arr, low, mid-1, num);
            }
            else
            {
                return binarySearch(arr, mid+1, high, num);
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[] = {12,36,65,74,78,88};
        int num = 12;
        int high = arr.length-1;
        int result = binarySearch(arr, 0, high, num);
        if(result==-1)
        {
            System.out.print("The element is not found.");
        }
        else
        {
            System.out.println(num+" is found at index "+result);
        }
    }
}