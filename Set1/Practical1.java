import java.util.*;
class GreatestOfThree
{
    public static void main(String args[])
    {
        // Declare variable
        int num1,num2,num3,maxi;
        Scanner scan = new Scanner(System.in);
        
        // Taking input from user.
        System.out.print("Enter a number 1::");
        num1=scan.nextInt();
        System.out.print("Enter a number 2::");
        num2=scan.nextInt();
        System.out.print("Enter a number 3::");
        num3=scan.nextInt();


        // checking maximum number and store the value in maxi variable.
        // num1 is great or equal to num2 and also greater than num3 
        // then store num1 value in maxi.

        if(num1>=num2 && num1>num3)
            maxi=num1;
        // num2 is great or equal to num3 and also greater than num1
        // then store num3 value in maxi.
        else if(num2>num1 && num2>=num3)
            maxi=num2;
        // If above two condition not satisfy then store num3 value in maxi.  
        else
            maxi=num3;
            // print maximum value
        System.out.print("Greatest number is "+maxi);
    }
}