import java.util.*;
class Practical5
{
    public static void main(String args[])
    {
        // declaration of variable and object
        Stack<Integer> stack = new Stack<Integer>();
        Scanner scan = new Scanner(System.in);
        int size,choice,curr_size=0,x;
        // taking input size of stack
        System.out.print("Enter a size of stack::");
        size=scan.nextInt();
        // loop 
        do
        {
            // printing menu
            System.out.println("1 for push.\n2 for pop.\n3 for exit.");
            // taking choice input from user 
            System.out.print("Enter a choice:");
            choice=scan.nextInt();
            // switch case
            switch(choice)
            {
                // for push
                case 1:
                // if stack is full throw exception else store in stack
                if(size==curr_size)
                {
                   throw new java.lang.RuntimeException("Stack is full.");
                }
                else
                {
                    System.out.print("Enter a number:");
                    x=scan.nextInt();
                    stack.push(x);
                    curr_size++;
                }
                break;
                // case pop operation
                case 2:
                // if stack is empty throw exception else pop element from stack
                if(curr_size==0)
                {
                    throw new java.lang.RuntimeException("Stack is empty.");
                }
                else
                {
                    x=(int)stack.pop();
                    System.out.println("Popped element is "+x);
                    curr_size--;
                }
                break;
                case 3:
                break;
            }

        }while(choice!=3);
    }
}