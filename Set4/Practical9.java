import java.util.*;
import java.io.*;

class Practical9
{
    public static void main(String args[]) throws Exception
    {
         // declaration of object and variable
      FileInputStream in = new FileInputStream(args[0]);
          int ch;
        String s="";
        HashMap<String, Integer> map = new HashMap<>();
         ArrayList<String> list=new ArrayList<String>();
        // raeding data from file
        while((ch=in.read()) != -1)
        {
             // file char change the line and enroll number(key) and name(value) in hash map
          // and set string to empty
          if((char)ch == ' ' || (char)ch == '\n')
          {
            // adding word in list
            if(!map.containsKey(s))
            list.add(s);
            map.put(s,1);
            s="";
          }
          else
          {
            s+=(char)ch;
          }
        }
        // for last word
         if(!map.containsKey(s))
            list.add(s);
            map.put(s,1);
        // if hash map is not empty then print each data else print msg
          if(!list.isEmpty())
          {
            // sort
            Collections.sort(list, Collections.reverseOrder());  
            System.out.println("Sorted and unique words:");
          for (int i=0;i<list.size();i++)
            {
            System.out.printf(list.get(i)+" ");
        }
          }
          else
            System.out.println("No such a words...");
    }
}