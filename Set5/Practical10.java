import java.util.*;
class ProducerConsumer
{
     Queue<Integer> queue = new LinkedList<>();
     int item,size;
    ProducerConsumer(int size)
    {
        item=0;
        this.size=size;
    }
    void consume()
    {   
        try{
        synchronized(this)
        {
          if(queue.isEmpty())
           {
               System.out.println("Consumer is sleeping");
               notifyAll();
           }
           else
           {
                System.out.println("Item " + queue.poll() + " consumed");
           }
           }
        }
        catch(Exception e)
            {}
    }
    void produce()
    {
        synchronized(this)
        {
            try
            {
            if(queue.size()<size)
            {
                queue.add(item);
                System.out.println("Item " + item + " produced");
                item++;
            }
            else
            {
                System.out.println("Producer is sleeping");
                wait();
            }
            }
            catch(Exception e)
            {}
        }
    }
}
class Practical10
{
    static int item=0,itemConsumed=0;
    public static void main(String args[])
    {
        int size,noOfItems;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a size of queue::");
        size=scan.nextInt();
        System.out.print("Enter total number of items::");
        noOfItems = scan.nextInt();
        ProducerConsumer producerConsumer = new ProducerConsumer(size);

        Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                    while(item<=noOfItems)
                    {
                    producerConsumer.produce();
                    item++;
                    }
                
            }
        });
        Thread t2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                    try{
                    Thread.sleep(1000);
                    }
                    catch(Exception e){}
                    while(itemConsumed<=noOfItems)
                    {
                    producerConsumer.consume();
                    itemConsumed++;
                    }
            }
        });
        t1.start();
        t2.start();
    }
} 