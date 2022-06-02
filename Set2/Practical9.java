class Pattern
{
    public static void main(String args[])
    {
        // outside loop
        for(int i=1;i<=6;i++)
        {
            // inside loop 
            for(int j=1;j<=6;j++)
            {
                // if i+j is odd then print 1 else 0
                if((i+j)%2==1)
                System.out.print(1+" ");
                else
                System.out.print(0+" ");
            }
            // change to new line
            System.out.println();
        }
    }
}