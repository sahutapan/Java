// reads marks of student and then display the grades.
import java.util.*;
class pr6
{
    public static void main(String args[])
    {
        // Declaring variable n object
        int os;
        Scanner scan = new Scanner(System.in);
        // Taking subject input.
        System.out.print("Enter a marks::");
        os=scan.nextInt();
       
        // Calculate total avg marks
        int totalMarks=os;
        // print grade
        // if marks is between 85 to 100 print AA
        if(totalMarks>=85 && totalMarks<=100)
            System.out.print("Your grade is AA");
            // if marks is between 75 to 84 print AB
        else if(totalMarks>=75 && totalMarks<=84)
            System.out.print("Your grade is AB");
        // if marks is between 65 to 74 print BB
        else if(totalMarks>=65 && totalMarks<=74)
            System.out.print("Your grade is BB");
        // if marks is between 55 to 64 print BC
        else if(totalMarks>=55 && totalMarks<=64)
            System.out.print("Your grade is BC");
        // if marks is between 45 to 54 print CC
        else if(totalMarks>=45 && totalMarks<=54)
            System.out.print("Your grade is CC");
        // if marks is between 40 to 44 print CD
       else if(totalMarks>=40 && totalMarks<=44)
            System.out.print("Your grade is CD");
        // if marks is between 35 to 39 print DD
        else if(totalMarks>=35 && totalMarks<=39)
            System.out.print("Your grade is DD");
            // if marks is less than 35 print FF
        else if(totalMarks<35 && totalMarks>=0)
            System.out.print("Your grade is FF");
        // else print marks is wrong
        else
            System.out.print("Entered marks is wrong..");
    }
}