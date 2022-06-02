import java.util.Random;
class Practical5
{
    public static void main(String []args)
    {
        // variable and object declaration
        String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random=new Random();

        String numberPlate="";
        // generating 4 random letter
        for(int i=1;i<=4;i++)
            numberPlate+=alpha.charAt(random.nextInt(25));
        // generating 4 random number which is b/w 0 to 9
        for(int i=1;i<=4;i++)
            numberPlate+=(random.nextInt(9));
        
        // printing 
        System.out.print("Number plate:"+numberPlate);
    }
}