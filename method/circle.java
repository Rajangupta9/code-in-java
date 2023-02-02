class circle1
{
    public double radius;
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;    
    }
    public double circumference()
    {
        return perimeter();
    }
}

public class circle {
    public static void main(String[] args)
    {
        circle1 a1=new circle1();
        circle1 a2=new circle1();
        a2.radius=8;

        a1.radius=6;
        System.out.println("area:"+a1.area());
        System.out.println("perimeter"+a1.perimeter());
        System.out.println("circumference"+a1.circumference());

        System.out.println("area:"+a2.area());
        System.out.println("perimeter"+a2.perimeter());
        System.out.println("circumference"+a2.circumference());


    }
    
}
