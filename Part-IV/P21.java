

/**Create a class 'Degree' having a method 'getDegree' that 
prints "I got a degree". It has two subclasses namely 
'Undergraduate' and 'Postgraduate' each having a method 
with the same name that prints "I am an Undergraduate" 
and "I am a Postgraduate" respectively. Call the method 
   by creating an object of each of the three classes.  */
class Degree
{
    public void getDegree()
    {
        System.out.println("I got a degree");
    }
}
class Undergraduate extends Degree
{
    public void UG_PG()
    {
        System.out.println("I am an Undergraduate");
    }
}
class Postgraduate extends Degree
{
public void UG_PG()
    {
        System.out.println("I am an Postgraduate");
    }
}

public class P21{
    public static void main(String[] args) 
    {
        Degree dg = new Degree();
        Undergraduate ug = new Undergraduate();
        Postgraduate pg = new Postgraduate();

        dg.getDegree();
        ug.UG_PG();
        pg.UG_PG();
    }
} 