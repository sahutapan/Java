import java.util.Date;
import java.util.*;

class Person
{
    protected String name;
    int age;
    public Person()
    {}
    // argument constructor to init variable
    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
}
class Student extends Person
{
    String status;
    int rollno,marks;
    public Student(){}
    // argument constructor to init variable
    public Student(String status,int rollno,int marks)
    {
        this.status=status;
        this.rollno=rollno;
        this.marks=marks;
    }
    public Student(int rollno,String name,String status,int age,int marks)
    {
        // calling super class constructor
        super(name,age);
        this.status=status;
        this.rollno=rollno;
        this.marks=marks;
        
    }
    // override method to return student details
    public String toString()
    {
        return "Name:" + name + " Rollno:" + rollno + " Status:" + status + " Age:" + age + " Marks:" + marks;
    }
}
class Employee extends Person
{
    String office;
    int salary;
    Date date;
    // argument constructor to init variable
    public Employee(String office,int salary,Date date)
    {
        this.office=office;
        this.salary=salary;
        this.date=date;
    }
    public Employee(String name,int age,String office,int salary,Date date)
    {
        // calling super class constructor
        super(name,age);
        this.office=office;
        this.salary=salary;
        this.date=date;
    
    }

}
class Faculty extends Employee
{
    int hour,rank;
    // argument constructor to init variable
    public Faculty(String name,int age,String office,int salary,Date date,int hour,int rank)
    {
        // calling super class constructor
        super(name,age,office,salary,date);
        this.hour=hour;
        this.rank=rank;
        
    }
   // override method to return faculty details
    public String toString()
    {
        return "Name:" + name + " Age:" + age + " Office:" + office + " Salary:" + salary + " Date:" + date + " Hour:" + hour + " Rank:"+rank;
    }
}
class Staff extends Employee
{
    String title;
    // argument constructor to init variable
    public Staff(String name,int age,String office,int salary,Date date,String title)
    {
        // calling super class constructor
        super(name,age,office,salary,date);
        this.title=title;
        
    }
    // override method to return staff details
    public String toString()
    {
        return "Name:" + name + " Age:" + age + " Office:" + office + " Salary:" + salary + " Date:" + date + " Title:" + title;
    }

}
class Practical7
{
    public static void main(String args[])
    {
        // declaring obj and calling constructor
        Date date = new Date();
        Student student=new Student(514,"Tapan","Senior",21,56);
        Staff staff=new Staff("Sagar",25,"Surat",150000,date,"HR");
        Faculty faculty=new Faculty("Pradip",22,"Pune",120000,date,7,2);

        // print details of persons
        System.out.println("Student Details:\n"+student.toString());
        System.out.println("\nStaff Details:\n"+staff.toString());
        System.out.println("\nFaculty Details:\n"+faculty.toString());
    }
}