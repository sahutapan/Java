import java.util.*;
class pascal
{
    // method for factorial
      static int fact(int n)
    {
        int ans=1;
        for(int i=1;i<=n;i++)
            ans*=i;
        return ans;
    }
    // method for ncr
    static int ncr(int n,int r)
    {
        return fact(n)/(fact(n-r)*fact(r));
    }
    public static void main(String args[])
    {
        // declare var
    int row;
    Scanner sc=new Scanner(System.in);
    // taking input\
    System.out.print("Enter row:");
    row=sc.nextInt();
    // loop till n
    for(int i=0;i<row;i++)
    {
        // loop for printing n-1 space
        for(int j=0;j<=row-i;j++)
        {
            System.out.print(" ");
        }
        // loop for printing number
        for(int j=0;j<=i;j++)
        {
            System. out.print(ncr(i,j)+" ");
        }
        // shift to new line.
         System.out.println();
    }
   
    }
}