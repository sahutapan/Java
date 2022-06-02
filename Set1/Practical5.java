//read input from user investment amount, annual interest rate, no of years
//  and display future investment amount.
import java.util.*;
class pr5
{
    public static void main(String args[])
    {
        // Declare variable
        int invtAmt,noOfYears;
        double annualIR;
        // creating obj
        Scanner scan = new Scanner(System.in);
        //taking input from user for investment amount, annual interest rate n no of years 
        System.out.print("Enter a investment amount:");
        invtAmt=scan.nextInt();
        
        System.out.print("Enter a annual interest rate:");
        annualIR=scan.nextDouble();
        
        System.out.print("Enter a number of years:");
        noOfYears=scan.nextInt();
        // convert annual interest rate to monthly n remove percentage
        // then add one in monthly IR
        // calculate power of monthly to no of years *12
        // then multiply with investment amount
        // print ans 

        System.out.print("Future investment amount:"+invtAmt*Math.pow(((1+(annualIR/100)/12)),(noOfYears*12)));

    }
}