/**Create a class with a method that prints "This is parent 
class" and its subclass with another method that prints "This 
is child class". Now, create an object for each of the 
class and call 1 - method of parent class by object of parent  */

/** Example Inheritace */

class Parent{
    public void display()
    {
        System.out.println("This is Parent class.\n");
    }
}
class child extends Parent{
    public void show()
    {
        System.out.println("This is Child class.");
    }
}
public class P17{
    public static void main(String[] args) {

        System.out.println("\nSINGLE INHERITANCE\n");
        Parent p1 = new Parent();
        child c1 = new child();
        p1.display();

    }
}