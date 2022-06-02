import java.util.*;
class Practical8
{
    public static void main(String args[])
    {
         LinkedList<String> ll = new LinkedList<String>();
         Scanner scan=new Scanner(System.in);
         String s;
         System.out.print("Enter 5 Students name::");
         for(int i=0;i<5;i++)
         {
            s=scan.nextLine();
            ll.add(s);
         }          
         Collections.sort(ll);
         System.out.println("Sorted Name:"+ll);
   }
}