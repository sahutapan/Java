//Make a quiz program generate 2 number n take ans from user n print no of correct ans.
import java.util.*;
class pr8
{
    public static void main(String []args)
    {
        //Declare variable
        int x,y;
        char []op={'+','-','*','/'};
        Random rand=new Random(); //creating rand object
        int score=0; //declare n inti with 0 for correct ans.
        Scanner scan =new Scanner(System.in); //creating object of scanner class
        int ans; //ans variable
        //loop for 10 times repeating the ques
        for(int i=0;i<10;i++)
        {        
            //generating 2 random integer
        x=rand.nextInt(99);
        y=rand.nextInt(99);
        //generating random index for operation
        char c=op[rand.nextInt(3)];
        //switch case for checking which operations
        switch(c)
        {
            //case for add
            case '+':
            System.out.print(x+" + "+y+"=");
             ans=scan.nextInt(); //taking ans from user
            if(x+y==ans) //matching ans with x & y if ans match then increase score
                score++; 
                break;
            //case for sub
            case '-':
            System.out.print(x+" - "+y+"=");
            ans=scan.nextInt();
            if(x-y==ans) //matching ans with x & y if ans match then increase score
                score++;
                break;
                // case for multiplication
            case '*':
            System.out.print(x+" * "+y+"=");
            ans=scan.nextInt();
            if(x*y==ans)//matching ans with x & y if ans match then increase score
                score++;
                break;
                // case for div
            case '/':
            System.out.print(x+" / "+y+"=");
            ans=scan.nextInt();
            if(x/y==ans)//matching ans with x & y if ans match then increase score
                score++;
                break;
        }
        }
        // Printing correct ans.
        System.out.print("Correct answer is "+score);
    }
}