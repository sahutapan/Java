import java.util.*;
import java.io.*;
class MYPriorityQueue<E> extends PriorityQueue<E> implements Cloneable
{
     @Override
    protected Object clone()
        throws CloneNotSupportedException
    {
        MYPriorityQueue<E> pqClone = new MYPriorityQueue<>();
           pqClone.addAll((MYPriorityQueue<E>) super.clone());
        //  pqClone=this.forEach(pqClone:pq);
         return pqClone;
    }
}
class Practical9
{
    public static void main(String args[]) throws CloneNotSupportedException
    {
        MYPriorityQueue<Integer> pq = new MYPriorityQueue<Integer>();
        MYPriorityQueue<Integer> pqClone = new MYPriorityQueue<Integer>();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);
        pqClone = (MYPriorityQueue<Integer>)(pq.clone());
        System.out.print("Elements in queue:");
        while(pq.size()>0)
            System.out.print(pq.remove() + " ");
        System.out.print("\nElement peeked from cloned queue:");
        System.out.println(pqClone.peek());
    }
}