import java.util.*;

class Practical7
{
    public static void main(String []args)
    {
        // Declare of object and variable
        String dec;
        Scanner scan = new Scanner(System.in);
        // taking input from user
        System.out.print("Enter a decimal number:");
        dec=scan.nextLine();
        // finding point in decimal no
        int idx=dec.indexOf('.');
        // if there is point in decimal number else printing msg no fraction
        if(idx!=-1)
        {
            // extracting fraction part
            String fraction=dec.substring(idx+1);
            // printing
            System.out.print("Fraction part of decimal number is "+fraction);
        }
        else
            System.out.print("No fraction part in decimal number.");
    }
}