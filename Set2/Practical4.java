class emirp
{
    // palindromic method
    public static boolean isPali(int num)
    {
        if(reverse(num)==num)
            return true;
        return false;
    }
    // prime method
    public static boolean isPrime(int num)
    {
        // checking each num is prime or not 
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
    // reverse the num
    public static int reverse(int num)
    {
        int rev=0,rem;
        while(num>0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }

        return rev;
    }
    public static void main(String arg[])
    {
        int rev;
        // printing 100 emirp
        System.out.print("first 100 emirp:\n");
        for(int i=1,j=11;i<=100;j++)
        {
            // checking num is prime or not palindromic
            if(!isPali(j) && isPrime(j))
            {
                // reverse the num
                rev=reverse(j);
                // checking rev num is prime
                if(isPrime(rev))
                {
                    // print emirp
                    System.out.print(j+" ");
                    // after 10 change line
                    if(i%10==0)
                    System.out.println();
                    i++;
                }

            }
        }
    }    
}