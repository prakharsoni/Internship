import java.util.Scanner;
public class LinearSearch
{
    public static void main(String[] args)
    {
        int num, i, num2;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of the elements : ");
        num = obj.nextInt();
        int arr[]=new int[num];
        System.out.println();
        System.out.print("Enter the elements of the array : ");
        for(i=0;i<num;i++)
        {
            arr[i] = obj.nextInt();
        }
        System.out.print("Which element you want to search for : ");
        num2 = obj.nextInt();
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==num2)
            {
                break;
            }
        }        
        System.out.print(num2+" is found at "+(i+1));
    }
}