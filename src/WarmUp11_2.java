/*
 * Create a Rectangle Class that has double properties of height and width.
 * The class should have a default constructor and an argument constructor.
 * All Rectangle object should have a method named getArea which returns
 * the area of the rectangle. Now create a Square class that is a child
 * of the Rectangle class. It should also have a default constructor and
 * an argument constructor. It also should have a method named getArea
 * which returns the area of the Square.
 */
public class WarmUp11_2 {
    public static void main(String args[])
    {
        Rectangle r = new Rectangle(3.5,2.1);
        System.out.println(r.getArea());
     Square square = new Square(5);
        System.out.println(square.getArea());
    }
}
