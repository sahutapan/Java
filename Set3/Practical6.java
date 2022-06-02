import java.util.*;
class Practical6
{
    // method return operator from string
    public static String getOperator(String expr)
    {
        if(expr.indexOf('+')!=-1)
            return "+";
            
        else if(expr.indexOf('-')!=-1)
            return "-";

        else if(expr.indexOf('*')!=-1)
            return "*";
         
        else if(expr.indexOf('/')!=-1)
            return "/"; 
            // if above condition false then it return %
        return "%";  
    }
    public static double solve(String expr)
    {
        // operator
        String operator=getOperator(expr);
        // operands
        double x=Double.valueOf(expr.substring(0,expr.indexOf(operator)));
        double y=Double.valueOf(expr.substring(expr.indexOf(operator)+1,expr.length()));
        // operation performed and return answer 
        if(operator=="+")
        return x+y;
        else if(operator=="-")
        return x-y;
        else if(operator=="*")
        return x*y;
        else if(operator=="/")
        return x/y;
          // if above condition false then below line will execute and return 
        return x%y;
    } 
    public static void main(String args[])
    {
        // variable and object declaration
        String expr;
        Scanner scan=new Scanner(System.in);
        // taking input from user 
        System.out.print("Enter Expression:");
        expr=scan.nextLine();
        // calling method and printing answer
        System.out.print(expr+"="+solve(expr));
    }

}