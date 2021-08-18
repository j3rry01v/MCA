import java.util.*;

class Shapes
{

    void area(float radius)
    {
        System.out.println("Area of the Circle is : "+ (3.14*radius));
    }

    void area(float length, float breadth)
    {
        System.out.println("Area of the Rectangle is : "+ (breadth*length));
    }
    void area(float length, float breadth, float height)
    {
        System.out.println("Area of the Box is : "+ ((2*length*breadth)+(2*length*height)+(2*height*breadth)));
    }

}


public class AreaOfShapesOverLoading
 {
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);

        float radius,length,breadth,lengthOf_box,breadthOf_box,heightOf_box;

        Shapes s=new Shapes();

        System.out.print("\nEnter the Radius of the circle:");

        radius=read.nextFloat();

        s.area(radius);

        System.out.print("\nEnter the Length of Rectangle: ");

        length=read.nextFloat();

        System.out.print("\nEnter the Breadth of Rectangle : ");

        breadth=read.nextFloat();

        s.area(length,breadth);

        System.out.print("\nEnter the Length of the BOX : ");

        lengthOf_box=read.nextFloat();

        System.out.print("Enter the Breadth of the BOX : ");

        breadthOf_box=read.nextFloat();

        System.out.print("Enter the Height of the BOX : ");

        heightOf_box=read.nextFloat();

        s.area(lengthOf_box,breadthOf_box,heightOf_box);

    }
}