import java.util.*;
class BMI
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
        // convert weight pound into kg by multiply 0.45359237 with pound
        // convert height inch to meters by multiply 0.0254 with inch
        // BMI = weight / height * height
        double bmi=w*0.45359237/Math.pow(h*0.0254,2);

        // print bmi value 
        System.out.println("BMI is "+bmi);
    }
}