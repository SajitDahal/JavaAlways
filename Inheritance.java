class one1
{
    public void first()
    {
        System.out.println("It");
    }
}
class two1 extends one1
{
    public void second()
    {
        System.out.println("for");
    }
}
class three extends two1
{
    public void third()
    {
        System.out.println("It");
    }
}
// Drived class
public class Inheritance
{
    public static void main(String[] args)
    {
        three g = new three();
        g.first();
        g.second();
        g.third();  } }
