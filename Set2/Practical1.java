import java.util.*;
class vowel
{
    // method for checking vowel
    static boolean isVowel(char c)
    {
        // if c is {a,e,u,i,o} then return true
        if(c=='a' || c=='e' || c=='u' || c=='i' || c=='o' )
        return true;
        // else return false.
        return false;
    }
    public static void main(String args[])
    {
        // declare var
        char c;
        Scanner scan=new Scanner(System.in);
        // taking input
        System.out.print("Enter character:");

        c=scan.next().toLowerCase().charAt(0);
        // print answer
        if(isVowel(c))
        System.out.print(c+" is vowel.");
        else
        System.out.print(c+" is consonant.");
    }
}