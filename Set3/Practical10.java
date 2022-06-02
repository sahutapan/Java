import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
class Practical10
{
    public static void main(String []args)
    {
        // creating object and declaring variable
        ArrayList<Integer> loan=new ArrayList<Integer>(); 
        ArrayList<Date> date=new ArrayList<Date>(); 
        ArrayList<String> name=new ArrayList<String>(); 
        ArrayList<String> circle=new ArrayList<String>(); 
        Scanner scan=new Scanner(System.in);
        int n,loanNo;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String loanDate,loanName,loanCircle;
        // taking input from user of n
        System.out.print("Enter number of n:");
        n=scan.nextInt();
        scan.nextLine();
        // taking loan details input from user and adding into array list object
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter loan no:");
            loanNo=scan.nextInt();
            scan.nextLine();
            System.out.print("Enter Loan Date(DD-MM-YYYY):");
            loanDate=scan.nextLine();
            System.out.print("Enter Name:");
            loanName=scan.nextLine();
            System.out.print("Enter circle:");
            loanCircle=scan.nextLine();
            loan.add(loanNo);
            // parsing the string into date
            try{
            date.add(dateFormat.parse(loanDate));
            }
            catch(Exception e)
            {

            }
            name.add(loanName);
            circle.add(loanCircle);
        }
        // Printing loan details one by one
        System.out.println("Loan Details::");
        for(int i=0;i<loan.size();i++)
        {
            System.out.println("Loan:"+ loan.get(i).toString() + " Date:" + date.get(i).toString() + " Name:" + name.get(i) + " Circle:" + circle.get(i));
        }
    }
}