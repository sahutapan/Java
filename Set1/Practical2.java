import java.util.*;
class Pattern
{
    public static void main(String []args)
    {
        // Declare variable 
        int n;
        Scanner scan=new Scanner(System.in);

        // Taking input from user.
        System.out.print("Enter a value of n::");
        n=scan.nextInt();

        // outside loop for n time
        for(int i=0;i<n;i++)
        {
            // inside loop for i time
            for(int j=0;j<=i;j++)
            {
                // print *
                System.out.print("*");
            }
            // after finished inside loop change the line.
            System.out.println("");
        }
    }
}