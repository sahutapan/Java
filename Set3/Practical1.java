class Rectangle
{
    // variable declare
    double width,height;
    // default constructor
    public Rectangle()
    {
        width=1;
        height=1;
    }
    // argument constructor
    public Rectangle(double width,double height)
    {
        this.width=width;
        this.height=height;
    }
    // area method
    public double getArea()
    {
        return width*height;
    }
    // perimeter method
    public double getPerimeter()
    {
        return 2*(width+height);
    } 
    public void display()
    {
        System.out.println("Width::"+width);
        System.out.println("Height::"+height);
        System.out.println("Area::"+getArea());
        System.out.println("Perimeter::"+getPerimeter());
    }
}
class Practical1
{
    public static void main(String args[])
    {
        // creating obj and calling arguments constructor
        Rectangle rect1=new Rectangle(4,40);
        Rectangle rect2=new Rectangle(3.5,35.9);

        // printing answer
        System.out.println("Rectangle1::");
        rect1.display();

        System.out.println("\nRectangle2::");
        rect2.display();

    } 
}