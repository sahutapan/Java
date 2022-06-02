import java.util.*;
class Practical4
{
    public static void main(String args[])
    {
        // Declaring object and variable
        int num;
        Scanner scan=new Scanner(System.in);
        // taking a number input
        System.out.print("Enter a number:");
        num=scan.nextInt();
        // if num is even then raised exception else print no exception
        if(num%2==0)
        {
            throw new java.lang.ArithmeticException("The number should not be even.");
        }
        else
        {
            System.out.println("No exception raised.");
        }
    }
}