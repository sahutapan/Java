import java.util.*;
import static java.lang.Integer.parseInt;

public class score{
    public static void main(String[] args){

        // variable and object declare
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[100];
        double[] doubleArray = new double[100];
        String str;
        int len=0,len2=0;
        
        // taking input from user till negative number
        System.out.println("Enter score(Enter negative number for exit)::");
        do{

            str = scanner.nextLine();
		    // if number is negative then break the loop
            if(str.charAt(0)=='-')
            break;
                // if string have '.' then it is double type
                // store it in double array and increase len 
				if(str.indexOf('.')!=-1){
					doubleArray[len2]=Double.valueOf(str);
                    len2++;
				}
                // else string is int then store it to int type array
				else{
					intArray[len]= parseInt(str);
                    len++;
                 }
        }while(true);
		
        // calling average function
        double avg=average(intArray,len);
        double avg2=average(doubleArray,len2);

        int above_Equal=0,below=0;

    //  Integer
        for(int i=0;i<len;i++)
        {
            if(intArray[i]>=avg)
                above_Equal++;
            else
                below++;
        }
        // print 
        System.out.println("No of integer above or equal to average is "+ above_Equal);
        System.out.println("No of integer below to average is "+ below);

        above_Equal=0;
        below=0;

//      Double
        for(int i=0;i<len2;i++)
        {
            if(doubleArray[i]>=avg2)
                above_Equal++;
            else
                below++;
        }
        // print
        System.out.println("No of double above or equal to average is "+ above_Equal);
        System.out.println("No of double below to average is "+ below);

        // Both
        above_Equal=0;
        below=0;
        // checking double array is empty or not 
        if(len2>0)
        avg2=(avg+avg2)/2;
        else if(len2==0)
        avg2=avg;
        // counting above or below than avg 
     for(int i=0;i<len;i++)
        {
            if(intArray[i]>=avg2)
                above_Equal++;
            else
                below++;

        }
        for(int i=0;i<len2;i++)
        {

            if(doubleArray[i]>=avg2)
                above_Equal++;
            else
                below++;
        }
        // print answer
        System.out.println("No of above or equal to average in both is "+ above_Equal);
        System.out.println("No of below to average in both is "+ below);

        
    }
			
    public static int average(int[] array,int len){
        int sum = 0;
        
        for (int x : array) {
            sum += x;
        }
        try{
        return sum / len;
        }
        catch(Exception e){}
        return 0;
    }
    public static double average(double[] array,int len){
        double sum = 0;
        
           for (double x : array) {
            sum += x;
        }

        try{
        return sum / len;
        }
        catch(Exception e){}
        return 0;
    }
}
