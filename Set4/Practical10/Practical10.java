import java.util.*;
import java.io.*;
class Practical10
{
    public static void main(String args[]) throws Exception
    {
        // Declare variable and object
        Random random = new Random();
        int ch;
        String s="";
        File file = new File("Exercise4_10.txt");
        // Creating file if not exists
        if(!file.exists())
            file.createNewFile();
        FileInputStream in = new FileInputStream(file);
        FileOutputStream out = new FileOutputStream(file,false);
        // generating 100 number and write into file
        for(int i=1;i<=100;i++)
        {
            int x=random.nextInt();
            s=Integer.toString(x);
            s+=" ";
        // converting string to byte
        byte[] array = s.getBytes();
        // writing in file
        out.write(array);
        }

         ArrayList<String> list=new ArrayList<String>();
        // reading data from file
        while((ch=in.read()) != -1)
        {
             
          if((char)ch == ' ')
          {
            // adding word in list 
            list.add(s);
            s="";
          }
          else
          {
            s+=(char)ch;
          }
        }
            // sort
         Collections.sort(list); 
        //  printing
         System.out.println("100 Sorted Random number:"); 
          for (int i=0;i<list.size();i++)
            {
            System.out.printf(list.get(i)+"\n");
        }


    }
}