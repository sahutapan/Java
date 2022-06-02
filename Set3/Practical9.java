import java.util.*;
class Practical9
{
    public static void sort(ArrayList<Integer> list)
    {
        Collections.sort(list);
    }
    public static void main(String args[])
    {
        // creating object
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList(5);
        int x;
        // Taking input from user
        for(int i=1;i<=5;i++)
        {
            x=scan.nextInt();
            list.add(x);
        }
        // calling sort method
        sort(list);
        // printing elements
        System.out.print("Sorted Element in array list::");
         for (int i = 0; i < list.size(); i++) 
            System.out.print(list.get(i) + " "); 
    }
}