/**Create a class named 'Rectangle' with two data members 
'length' and 'breadth' and two methods to print the area and 
perimeter of the rectangle respectively. Its constructor 
having parameters for length and breadth is used to 
initialize length and breadth of the rectangle. Let class 
'Square' inherit the 'Rectangle' class with its constructor 
having a parameter for its side (suppose s) calling the
constructor of its parent class as 'super(s,s)'. Print the area 
and perimeter of a rectangle and a square. Also use array 
of objects. */

class Rectangle {

    protected int length;
    protected int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void printArea() {
        int area = length * breadth;
        System.out.println("Area of the rectangle: " + area);
    }

    public void printPerimeter() {
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}

class Square extends Rectangle
{

    public Square(int side) {
        super(side, side); // Calling the parent class constructor
    }

    @Override
    public void printArea() {
        System.out.println("Area of the square: " + (length * length));
    }

    @Override
    public void printPerimeter() {
        System.out.println("Perimeter of the square: " + (4 * length));
    }
}

public class P19 {
    public static void main(String[] args) {

        Rectangle[] shapes = new Rectangle[2];

        shapes[0] = new Rectangle(10, 5); 
        shapes[1] = new Square(7);        

        for (Rectangle shape : shapes) {
            shape.printArea();
            shape.printPerimeter();
            System.out.println();
        }
    }
}
