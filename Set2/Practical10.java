import java.util.*;
import java.lang.reflect.Array;
// Student class
class StudentInfo
{
    // variable
    String name;
    int score;

    // a setter method to set variable
    public void setter(String name,int score)
    {
        this.name=name;
        this.score=score;
    }
    // display student info
   public void display()
    {
        System.out.println(this.name + " "+this.score);
    }
    // sort details
    public void sort(StudentInfo obj[])
    {
        
        int len = Array.getLength(obj);
        
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                // swap object
                if(obj[i].score<obj[j].score)
                {
                    StudentInfo temp=obj[i];
                    obj[i]=obj[j];
                    obj[j]=temp;
                }
            }
        }
    }
}
class Practical10
{
    public static void main(String args[])
    {
        int n,score;
        String name;
        Scanner scan=new Scanner(System.in);
        // Taking inputs
        System.out.print("Enter a number of students:");
        n=scan.nextInt();

        StudentInfo obj[]=new StudentInfo[n];
        scan.nextLine();
        
        System.out.print("Enter a student name and score:");
        for(int i=0;i<n;i++)
        {
           name=scan.nextLine();
           score=scan.nextInt();
           scan.nextLine();
           obj[i]=new StudentInfo();
           obj[i].setter(name,score);
        }
        // sorting object
        obj[0].sort(obj);
        // printing info
        System.out.println("Student details::");
        for(int i=0;i<n;i++)
            obj[i].display();
    }
}