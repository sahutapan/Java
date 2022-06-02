import java.util.*;
class Practical5_1
{
    static int min(int arr[],int mini,int n,int i)
    {
        if(i<n)    
        {
        if(mini>arr[i])
          return min(arr,arr[i],n,(i+1));
        else
            return min(arr,mini,n,(i+1));
        }
        return mini;
      
    }
    public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter size of array:");
        n=scan.nextInt();
        int []arr = new int[n];
      

        System.out.print("Enter a elements of array::");
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();
        int mini=min(arr,arr[0],n,0);
        System.out.print("Minimum is " + mini);
    }
}