import java.util.*;

class QuadraticEquation
{
    private double a,b,c;
    public QuadraticEquation(double a,double b,double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getterA()
    {
        return this.a;
    }
    
    public double getterB()
    {
        return this.b;
    }
    
    public double getterC()
    {
        return this.c;
    }

    public double getDiscriminant()
    {
        return b*b-(4*a*c);
    }
    public double getRoot1()
    {
        return ((-1*b)+Math.sqrt(getDiscriminant()))/(2*a);
    }
    public double getRoot2()
    {
        return ((-1*b)-Math.sqrt(getDiscriminant()))/(2*a);
    }
}
class Practical2
{
    public static void main(String args[])
    {
        double a,b,c;
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter a value of a, b and c::");
        a=scan.nextDouble();
        b=scan.nextDouble();
        c=scan.nextDouble();

        QuadraticEquation obj=new QuadraticEquation(a,b,c);

        if(obj.getDiscriminant()>0)
        {
            System.out.println("Root 1 is "+obj.getRoot1());
            System.out.println("Root 2 is "+obj.getRoot2());
        }
        else if(obj.getDiscriminant()==0)
            System.out.println("Root 1 is "+obj.getRoot1());
        else
            System.out.println("The equation has no roots");
    }
}