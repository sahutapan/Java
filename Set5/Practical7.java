import java.util.*;
class Calculator<T extends Number>
{
    public double add(T x,T y)
    {
        return x.doubleValue() + y.doubleValue();
    }
    public double sub(T x,T y)
    {
        return x.doubleValue() - y.doubleValue();
    }
    public double mul(T x,T y)
    {
        return x.doubleValue() * y.doubleValue();
    }
    public double div(T x,T y)
    {
        return x.doubleValue() / y.doubleValue();
    }
}
class TestCalculator
{
    public static void main(String args[])
    {
        Calculator<Integer> calc = new Calculator<Integer>();
        Scanner scan = new Scanner(System.in);

        Integer x,y;
        System.out.print("Enter a value of x:");
        x=scan.nextInt();
        
        System.out.print("Enter a value of y:");
        y=scan.nextInt();

        System.out.println("Add:"+calc.add(x,y));
        System.out.println("Sub:"+calc.sub(x,y));
        System.out.println("Multiply:"+calc.mul(x,y));
        System.out.println("Divide:"+calc.div(x,y));
        Calculator<Double> calc1 = new Calculator<Double>();
        Double a,b;
        System.out.print("Enter a value of a:");
        a=scan.nextDouble();
        
        System.out.print("Enter a value of b:");
        b=scan.nextDouble();

        System.out.println("Add:"+calc1.add(a,b));
        System.out.println("Sub:"+calc1.sub(a,b));
        System.out.println("Multiply:"+calc1.mul(a,b));
        System.out.println("Divide:"+calc1.div(a,b));
    }
}
