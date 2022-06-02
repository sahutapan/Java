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
    // static variable to count number of object
    static int count;
    // static block to init count
    static
    {
        count=0;
    }
    public Student(){
        count++;
    }
    // argument constructor to init variable
    public Student(String status,int rollno,int marks)
    {
        this.status=status;
        this.rollno=rollno;
        this.marks=marks;
        count++;
    }
    public Student(int rollno,String name,String status,int age,int marks)
    {
        // calling super class constructor
        super(name,age);
        this.status=status;
        this.rollno=rollno;
        this.marks=marks;
        count++;
    }
    // override method to return student details
    public String toString()
    {
        return "Name:" + name + " Rollno:" + rollno + " Status:" + status + " Age:" + age + " Marks:" + marks;
    }
    // static method 
    public static int getCount()
    {
        return count;
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
class Practical8
{
    public static void main(String args[])
    {
        // declaring obj and calling constructor
        Date date = new Date();
        Student student=new Student(514,"Tapan","Senior",21,56);
        Student student2=new Student();
        Student student3=new Student();
        Student student4=new Student();
        Student student5=new Student();
        // print number of object 
        System.out.println("Number of object is "+student.getCount());
    }
}