import java.util.*;
class timeConverter
{
    // method to converter millisecond into Second
    static long milliToSec(long milli)
    {
        return milli/1000;
    }
    // method to converter Second ino min
   static long secToMin(long sec)
    {
        return sec/60;
    }
    // method to converter min into hour
    static long minToHour(long min)
    {
        return min/60;
    }
    // method for conversions.
    static String convertMillis(long millis)
    {
        // declaring answer 
        String ans;
        long sec=milliToSec(millis);
        long min=secToMin(sec);
        long hour=minToHour(min);
        // sec mod with 60 to calculate 
        sec%=60;
          // min mod with 60 to calculate 
        min%=60;
        
        // Concat all time
        ans=hour + ":" +min + ":" +sec;
        return ans;
    }
    public static void main(String args[])
    {
        // declare var
        long milli;
        // declare scan object
        Scanner scan=new Scanner(System.in);
        // taking i/p
        System.out.print("Enter millisecond:");
        milli=scan.nextLong();
        // calling the main function
        System.out.println("The time is "+convertMillis(milli));
    }
}