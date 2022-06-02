package student;  
public class Student
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