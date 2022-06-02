import java.util.*;
// abstract class
abstract class Shape
{
    // override method
    public double getter()
    {
        return 0;
    }
    public void setter(double x){}
    public void setter(double x,double y){}
    public abstract double findArea();

    public String toString()
    {
        return "Shape is undefined.";
    }
}
// sub class
class Circle extends Shape
{
    double radius;
    // a method for for getting radius
    public double getter()
    {
        return this.radius;
    }
    // a method for init radius
    public void setter(double radius)
    {
        this.radius=radius;
    }
    // method for finding area of circle
    public double findArea()
    {
        return Math.PI * this.radius * this.radius;
    }
    // override method
    public String toString()
    {
        return "Circle of radius " + this.getter() + " units";
    }
}
class Rectangle extends Shape
{
    double height,breadth;
      // a method for for getting height
    public double getterHeight()
    {
        return this.height;
    }
      // a method for for getting Breadth
    public double getterBreadth()
    {
        return this.breadth;
    }
    // a method for init height and breadth
    public void setter(double height,double breadth)
    {
        this.height=height;
        this.breadth=breadth;
    }
// method for finding area of rectangle
    @Override
    public double findArea()
    {
        return this.height*this.breadth;
    }
    // override method
   public String toString()
    {
        return "Rectangle of length " + this.getterHeight() + " units and breadth " + this.getterBreadth() + "units";
    }
}
class Square extends Shape
{
    double len;
      // a method for for getting length
    public double getterLen()
    {
        return this.len;
    }
    // a method for init length
    public void setter(double len)
    {
        this.len = len;
    }
    // constructor to init length
    public Square(double length)
    {
        this.len=length;
    }
    // method for finding area of circle
    public double findArea()
    {
        return Math.pow(this.getterLen(),2);
    }
    // override method
    public String toString()
    {
        return "Square of length " + this.getterLen() + " units";
    }
}
class TestShapes
{
    public static void main(String args[])
    {
        // creating object
        Shape rect=new Rectangle();
        Shape circle=new Circle();
        Shape square=new Square(5);

        Scanner scan =  new Scanner(System.in);
        // declaring variable
        double radius,length,height,breadth;

        // taking input from user
        System.out.print("Enter a radius of circle:");
        radius=scan.nextDouble();

        System.out.print("Enter a length of Square::");
        length=scan.nextDouble();

        
        System.out.print("Enter a breadth of Rectangle::");
        breadth=scan.nextDouble();
        System.out.print("Enter a height of Rectangle::");
        height=scan.nextDouble();

        // setting breadth and height by calling setter method
        rect.setter(breadth,height);
        // init length by calling setter method
        square.setter(length);
        // init radius by calling setter method
        circle.setter(radius);

        // printing
        System.out.println(circle.toString() + " \nArea of circle is " + circle.findArea());
        System.out.println(rect.toString() + " \nArea of Rectangle is " + rect.findArea());
        System.out.println(square.toString() + " \nArea of Square is " + square.findArea());
    }
}