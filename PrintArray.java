import java.util.Scanner;
public class PrintArray
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int i, num;
        System.out.print("Enter the number of elements in the array : ");
        num=obj.nextInt();
        int arr[]=new int[num];
        System.out.print("Enter the elements of array : ");
        for(i=0;i<num;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.print("The Elements are : ");
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}