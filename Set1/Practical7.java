// read input BMI n calculate BMI n print status.
import java.util.*;
class Bmi
{
    public static void main(String args[])
    {
        // Declare variable and object
        double w,h;
        Scanner scan=new Scanner(System.in);
        // take height n weight from user
        System.out.print("Enter Weight:");
        w=scan.nextDouble();
        System.out.print("Enter height:");
        h=scan.nextDouble();
        // calculate bmi
        double bmi=w*0.45359237/Math.pow(h*0.0254,2);
        // if bmi is less than 18.5 print underweight.
        if(bmi<18.5)
            System.out.print("Underweight");
           // if bmi is between 18.5 to 25 print Normal. 
        else if(bmi>=18.5 && bmi<25)
            System.out.print("Normal");
            // if bmi is between 30 to 25 print overweight.
        else if(bmi<30 && bmi>=25)
            System.out.print("OverWeight");
            // if bmi is greater than 30 print obese
    else if(bmi>=30)
            System.out.print("Obese");
    
     }
}