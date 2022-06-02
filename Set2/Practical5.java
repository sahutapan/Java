import java.util.*;
class Volume
{
    // overloaded method
    // method for cube
    public static int volume(int len)
    {
        return (int)Math.pow(len,3);
    }
    // method for cylinder
    public static double volume(int radius,int height)
    {
        return Math.PI*Math.pow(radius,2)*height;
    }
    // method for rectangular
    public static int volume(int len,int width,int height)
      {
        return len*width*height;
      }
    public static void main(String args[])
    {
        // variable and object declare
        int len,width,height,radius,volumeOfCube,volumeOfRect;
        float volumeOfCylinder;
        Scanner scan=new Scanner(System.in);

        // taking input for cube
        System.out.print("Enter length of cube::");
        len=scan.nextInt();
        volumeOfCube=volume(len);
        // taking input for cylinder
        System.out.print("Enter radius of cylinder::");
        radius=scan.nextInt();
        System.out.print("Enter height of cylinder::");
        height=scan.nextInt();
        volumeOfCylinder=(float)volume(radius,height);
        // taking input for rectangular
        System.out.print("Enter length of rectangular::");
        len=scan.nextInt();
        System.out.print("Enter width of rectangular::");
        width=scan.nextInt();
        System.out.print("Enter height of rectangular::");
        height=scan.nextInt();
        volumeOfRect=volume(len,width,height);
        // print volume of cube, rectangular and cylinder 
        System.out.println("Volume of cube is "+volumeOfCube);
        System.out.println("Volume of cylinder is "+volumeOfCylinder);
        System.out.println("Volume of rectangular is "+volumeOfRect);
    }
}