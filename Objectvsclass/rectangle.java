package Objectvsclass;

class rectangelone
{
    public int length;
    public int breadth;

public double area()
{
    return length*breadth;

}
public double perimeter()
{
    return 2*(length*breadth);
}
}

public class rectangle {

    public static void main(String[] args)
    {
        rectangelone a1 = new rectangelone();

        a1.length=8;
        a1.breadth=7;

        System.out.println("area"+a1.area());
        System.out.println("perimenter"+a1.perimeter());
        

    }

    
}
