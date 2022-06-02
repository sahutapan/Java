import java.util.*;
// parent class Student
class Student
{
    // declaration variable
    int rollNumber;
    // setter method
    public void setter(int rollNumber)
    {
        this.rollNumber=rollNumber;
    }
    // method for display roll no
    public void display()
    {
        System.out.print("Roll no:"+rollNumber);
    }
}
// child class of student named test
class Test extends Student
{
    // Declaration of variable
    int externalMark,internalMark;
    // setter method 
     public void setter(int rollNumber,int externalMark,int internalMark)
    {
        // calling parent class setter method
        super.setter(rollNumber);
        this.externalMark=externalMark;
        this.internalMark=internalMark;
    }
    // display method
    public void display()
    {
        // calling parent class display method
        super.display();
        System.out.print("Internal Mark:" +internalMark+" External Mark:" + externalMark);
    }
}
// interface
interface Sports
{
    int SportWt=6;
    public int getter();
}
// multiple inheritance class
class Result extends Test implements Sports 
{
    // variable declaration
      int total;
    //   getter method for interface
     public int getter()
    {
        return this.SportWt;
    }
    // setter method
    public void setter(int rollNumber,int externalMark,int internalMark)
    {
        super.setter(rollNumber,externalMark,internalMark);
        total=externalMark+internalMark+getter();
    }
    // display method
   public void display()
    {
        super.display();
        System.out.println(" Total marks:" + total);
    }
   
}
class Practical2
{
    public static void main(String args[])
    {
        // object and variable declaration
        Scanner scan= new Scanner(System.in);
        int rollNumber,internalMark,externalMark;

        // taking input from user
        System.out.print("Enter Roll number::");
        rollNumber=scan.nextInt();

        System.out.print("Enter External marks:");
        externalMark=scan.nextInt();

        System.out.print("Enter Internal marks:");
        internalMark=scan.nextInt();

        Result result = new Result();
        // calling setter method for init variable
        result.setter(rollNumber,externalMark,internalMark);
        // calling display
        result.display();
    }
}