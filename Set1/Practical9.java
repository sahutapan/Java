import java.util.*;
import java.math.*;
class sin 
{
    // Factorial method
    static long fact(int n)
    {
        
        long ans=1;
   
        for(int i=1;i<=n;i++)
            ans*=i;
        return ans; 
    }
    // user defined sin method
    static double _sin(double radian)
    {
        
        double ans=radian;
        
        
        for(int i=3;i<19;i++)
        {
           
            ans=ans-Math.pow(radian,i)/fact(i)+Math.pow(radian,i+1)/fact(i+1);
         
        }
        return ans;
    }
    // main() method
    public static void main(String args[])
    {
        // Declare variable and object
        double degree;
        Scanner scan=new Scanner(System.in);

        // taking input from user.
        System.out.print("Enter a value of Degree::");
        degree=scan.nextDouble();
        
        // convert degree into radian
        double radian=degree*(Math.PI/180);
        // calling user defined method _sin(x)
        // and print 6 decimal places
        System.out.println("(User Defined)_sin("+radian+")="+(Math.round(_sin(radian) * 1000000) / 1000000.0));
        //calling builtin function method
        System.out.println("(Builtin)sin("+radian+")="+Math.sin(radian));
       
    }
}

