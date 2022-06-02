import java.util.Random;
class Practical4
{
    public static void main(String args[])
    {
        // random object declaration
        Random random = new Random(1000);
        // printing first 100 numbers
        System.out.print("First 100 random number::")
        for(int i=1;i<=100;i++)
        {
            System.out.println(random.nextInt(49));
        }
    }
}