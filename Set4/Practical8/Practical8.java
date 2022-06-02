import java.util.*;
import java.io.*;

class Student
{
  // method for inserting in file
    public static void insert(File file) throws Exception
    {
      // variable and object declaration
        FileOutputStream out = new FileOutputStream(file,true);
        Scanner scan=new Scanner(System.in);
        String name,enroll;
        // taking input from user
        System.out.print("Enter enrollment no:");
        enroll=scan.nextLine();
        System.out.print("Enter name:");
        name=scan.nextLine();
        // concat string 
        String s=enroll + " " + name  + "\n";
        // converting string to byte
        byte[] array = s.getBytes();
        // writing in file
        out.write(array);
        // printing msg
        System.out.println("Inserted...");
    }
    // method for update into file
    public static void update(File file) throws Exception
    {
      // object and variable declaration
        FileInputStream in = new FileInputStream(file);
        Scanner scan=new Scanner(System.in);
        String name,enroll;
        // taking input from user
        System.out.print("Enter enrollment no where want to update name:");
        enroll=scan.nextLine();
        System.out.print("Enter update name:");
        name=scan.nextLine();
        int ch;
        String s="",key,value;
        HashMap<String, String> map = new HashMap<>();
        // reading data from file
        while((ch=in.read()) != -1)
        {
          // file char change the line and enroll number(key) and name(value) in hash map
          // and set string to empty
          if((char)ch == '\n')
          {
            key=s.substring(0,s.indexOf(' '));
            value=s.substring(s.indexOf(' ')+1);
            map.put(key,value);
            s="";
          }
          // concat each char till \n
          else
          {
            s+=(char)ch;
          }
        }
        // if enroll present in hash map then update(value of name in hash map) else print msg
        if(map.containsKey(enroll))
        {
          map.put(enroll,name);
          System.out.println("Updated...");
        }
        else
          System.out.println("Entered enrollment number is not found.");

        FileOutputStream out = new FileOutputStream(file,false);
        // write all data present in hash map to file
        for (Map.Entry<String, String> e : map.entrySet())
        {
          s=(e.getKey() + " " + e.getValue() + "\n");
          byte[] array = s.getBytes();
          out.write(array);
        } 
    }
    // delete into file method
        public static void delete(File file) throws Exception
    {
      // declaration of variable and object 
        FileInputStream in = new FileInputStream(file);
        Scanner scan=new Scanner(System.in);
        String name,enroll;
        // taking input from user
        System.out.print("Enter enrollment no where want to delete record:");
        enroll=scan.nextLine();
        int ch;
        String s="",key,value;
        HashMap<String, String> map = new HashMap<>();
        // reading data from file
        while((ch=in.read()) != -1)
        {
          // file char change the line and enroll number(key) and name(value) in hash map
          // and set string to empty
          if((char)ch == '\n')
          {
            key=s.substring(0,s.indexOf(' '));
            value=s.substring(s.indexOf(' ')+1);
            map.put(key,value);
            s="";
          }
          // concat each char
          else
          {
            s+=(char)ch;
          }
        }
        // if hash map present key then delete the key and value else print msg
        if(map.containsKey(enroll))
        {
          map.remove(enroll);
          System.out.println("deleted...");
        }
        else
          System.out.println("Entered enrollment number is not found.");
        // writing in file 
        FileOutputStream out = new FileOutputStream(file,false);
        for (Map.Entry<String, String> e : map.entrySet())
        {
          s=(e.getKey() + " " + e.getValue() + "\n");
          byte[] array = s.getBytes();
          out.write(array);
        } 
    }
    // method for dispaly data from file
    public static void display(File file) throws Exception
    {
      // declaration of object and variable
      FileInputStream in = new FileInputStream(file);
          int ch;
        String s="",key,value;
        HashMap<String, String> map = new HashMap<>();
        // raeding data from file
        while((ch=in.read()) != -1)
        {
             // file char change the line and enroll number(key) and name(value) in hash map
          // and set string to empty
          if((char)ch == '\n')
          {
            key=s.substring(0,s.indexOf(' '));
            value=s.substring(s.indexOf(' ')+1);
            map.put(key,value);
            s="";
          }
          else
          {
            s+=(char)ch;
          }
        }
        // if hash map is not empty then print each data else print msg
          if(map.size()>0)
          {
          System.out.println("Enroll   Name");
          for (Map.Entry<String, String> e : map.entrySet())
        {
          //  s=(e.getKey() + " " + "%7.s",e.getValue() + "\n");
            System.out.printf("%s %10s\n",e.getKey(),e.getValue());
        }
          }
          else
            System.out.println("File is empty.");
    }
    // main method
    public static void main(String []args) throws Exception
    {
        // object declare
        File myFile=new File("student.txt");
        Scanner scan = new Scanner(System.in);
      try { 
        // creating file
        myFile.createNewFile();
      }
      catch(Exception e)
      {}
      int choice;
      do
      {
        // printing menu
        System.out.println("\n1 for insert\n2 for update\n3 for delete\n4 for display\n5 for exit");
        // taking input from user
        System.out.print("Enter a choice:");
        choice = scan.nextInt();

        switch(choice)
        {
          case 1:
           insert(myFile);
           break;
          case 2:
            update(myFile);
            break;
          case 3:
            delete(myFile);
            break;
          case 4:
            display(myFile);


        }
      }while(choice !=5);
    }
}