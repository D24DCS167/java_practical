/**Also show use of Wrapper Class with an example.  */


public class P29_b {
    public static void main(String[] args) {
    
        Integer intObject = Integer.valueOf(10);  // Autoboxing: converting int to Integer
        int primitiveInt = intObject.intValue();  // Unboxing: converting Integer to int

        System.out.println("\nInteger object value: " + intObject);
        System.out.println("Primitive int value: " + primitiveInt+"\n");
        
        Double doubleObject = Double.valueOf(3.14);  // Autoboxing
        double primitiveDouble = doubleObject.doubleValue();  // Unboxing
        
        System.out.println("\nDouble object value: " + doubleObject);
        System.out.println("Primitive double value: " + primitiveDouble+"\n");
    }
}