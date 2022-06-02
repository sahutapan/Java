import java.util.*;
class SolvingEquation
{
    public static void main(String []args)
    {
        // Declare variable
        float a,b,c,d,f,e,x,y;
        Scanner scan=new Scanner(System.in);

        // Taking input from user.
        System.out.println("Equation 1) ax + by=e");
        System.out.print("Enter a value of a::");
        a=scan.nextFloat();
        
        System.out.print("Enter a value of b::");
        b=scan.nextFloat();

        System.out.print("Enter a value of e::");
        e=scan.nextFloat();

        System.out.println("Equation 2) cx + dy=f");
        System.out.print("Enter a value of c::");
        c=scan.nextFloat();
        
        System.out.print("Enter a value of d::");
        d=scan.nextFloat();

        System.out.print("Enter a value of f::");
        f=scan.nextFloat();
            
        // finding the value of x
        x=(e*d-b*f)/(a*d-b*c);
        // putting the value of x in eq 1.
        y=(f-x*c)/d;

        System.out.print("The value of x is "+ x + " and y is "+ y);
    }
}