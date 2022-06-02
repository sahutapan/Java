import java.util.*;

class Practical6
{
    public static String bin2Dec(String binary)
    {
        int dec;
        // converting into decimal 
       dec = Integer.parseInt(binary,2);
       return Integer.toString(dec);  
    }
    public static void main(String args[])
    {
        // object and variable declaration
        String bin,dec;
        Scanner scan= new Scanner(System.in);
        // taking input from user
        System.out.print("Enter Binary number::");
        bin=scan.nextLine();
        // calling binary to decimal method
        dec=bin2Dec(bin);
        // printing
        System.out.print("Decimal equivalent is "+dec);
    }
}