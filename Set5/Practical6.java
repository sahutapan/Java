import java.util.*;
class Practical6<T>
{
    static <T extends Comparable<T>> void min(T arr[][],int n,int m)
    {
        T mini=arr[0][0];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mini.compareTo(arr[i][j])==1)
                mini=arr[i][j];
            }
        }

         System.out.print("Minimum is " + mini);;
    }
    public static void main(String args[])
    {
        int n,m;
        Scanner scan = new Scanner(System.in);
        Practical6<Integer> obj=new Practical6<Integer>();
        System.out.print("Enter row size:");
        n=scan.nextInt();
        System.out.print("Enter column size:");
        m=scan.nextInt();

        Integer arr[][]=new Integer[n][m];
        for(int i=0;i<n;i++)
        {
           
            for(int j=0;j<m;j++)
            {
                System.out.print("Enter value for arr["+i+"]["+j+"]:");
                arr[i][j]=scan.nextInt();
            }
        }
        
        min(arr,n,m);
    }
}