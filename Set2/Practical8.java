import java.util.*;
class EliminateDuplicates
{
    // method for eliminate duplicates
    public static int[] eliminateDuplicates(int arr[])
    {
        // a hash map to store distinct element(key)
        HashMap<Integer, Integer> map = new HashMap<>();
        // for each loop and each element put in map place of key.
        for(int x:arr)
            map.put(x,1);
        // array for storing distinct elements 
        int distinctArr[]=new int[map.size()];
        int i=0;
        // for each loop for hash map 
         for (Map.Entry<Integer, Integer> e : map.entrySet())
            {
                // store key in array
                distinctArr[i]=e.getKey();
                i++;
            }
            return distinctArr;
    }
    public static void main(String args[])
    {
        // variable and object declare
        int []arr=new int[10];
        Scanner scan = new Scanner(System.in);

        // taking input from user.
        System.out.print("Enter 10 number:");
        for(int i=0;i<10;i++)
        {
            arr[i]=scan.nextInt();
        }
        // calling and result store in array
        int distinctArr[]=eliminateDuplicates(arr);
        // printing distinct elements 
        System.out.print("The distinct numbers are:");
        for(int x:distinctArr)
            System.out.print(x+" ");
    }
}