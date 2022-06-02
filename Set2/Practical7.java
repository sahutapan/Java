import java.util.*;
class Factor
{
    // factor method
    public static int[] factor(int num)
    {
        // variable declare
        int arr[]=new int[num];
        int j=2,i=0;
        
        if(num==1)
        return (new int[]{1});
        // if num is not 1 then find 
        while(num>1)
        {
            // if num is divisible by j then store j and divide num with j
            if(num%j==0)
            {
                arr[i]=j;
                num/=j;
                i++;
            }
            // not divisible then increase j
            else
                j++;
        }
        return arr;
    }
    public static void main(String []args)
    {
        // variable and object Declare
        int num;
        Scanner scan= new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number:");
        num=scan.nextInt();
        // calling factor function and store in array
       int []arr=factor(num);
       // for each loop for printing each element in array but not 0's
       for(int x:arr)
       {
           if(x==0)
           break;
           System.out.print(x+" ");
       }
    }
}