import java.util.Date;
import java.util.Random;
// Stop Watch class
class StopWatch
{
    // date object
    private Date startTime,endTime;
//    constructor 
    public StopWatch()
    {
        startTime=new Date();   
    }

    // start method to set current time
    public void start()
    {
        Date currentDate=new Date();
        startTime=currentDate;
    }
    // stop method to set ending time
    public void stop()
    {
         Date currentDate=new Date();
        endTime=currentDate;
    }
    // method for lap
    public long getElapsedTime()
    {
         Date currentDate=new Date();
        return currentDate.getTime() - startTime.getTime();
    }
}
class Practical3
{
    public static void main(String args[])
    {
        //object declaration
        StopWatch stopWatch = new StopWatch();
        Random random = new Random();
        final int size=100000;
        int arr[]=new int[size];

        // setting array element with random object
        for(int i=0;i<size;i++)
            arr[i]=random.nextInt();
        int idxOfMini,temp;
        // start watch
        stopWatch.start();
        // sort
        for(int i=0;i<size-1;i++)
        {
            idxOfMini=i;
            for(int j=i+1;j<size;j++)
            {
                if(arr[idxOfMini]>arr[j])
                {
                    idxOfMini=j;
                }
            }
            temp=arr[idxOfMini];
            arr[idxOfMini]=arr[i];
            arr[i]=temp;
        }
        // print execution of sort
        System.out.println("Execution time:"+stopWatch.getElapsedTime()/1000.0+"s");
        stopWatch.stop(); //stop watch
    }
}