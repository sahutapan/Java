import java.util.*;
class reverse
{
    // reverse method
   public static void rev(int []arr)
    {
        // declare variable and store the array length in len
        int len=arr.length;
        int i=0,temp;
        len--;

        while(i<len)
        {
        // swapping 
            temp=arr[i];
            arr[i]=arr[len];
            arr[len]=temp;

            i++;
            len--;
        }
    }
    public static void main(String []args)
    {
        // variable and object declare
        int arr[]= new int[10];
        Scanner scan = new Scanner(System.in);

        // taking 10 numbers from user
        System.out.print("Enter 10 number(each number separated by space)::");
        for(int i=0;i<10;i++)
            arr[i]=scan.nextInt();
        rev(arr);

        // print array elements
        System.out.print("Array elements::");
        for(int i=0;i<10;i++)
            System.out.print(arr[i]+" ");
    }
}