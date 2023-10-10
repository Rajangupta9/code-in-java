interface computer{
    void compilecode();
}
class desktop implements computer
{
    public void compilecode()
    {
        System.out.println("you got 5 error, faster");
    }
}
class Laptop implements computer
{
    public void compilecode()
    {
        System.out.println("you got 5 error");
    }
}
class Developer 
{
    public void buildapp(computer obj)
    {
        System.out.println("building app");
        obj.compilecode();
    }
}
public class second {
    public static void main(String[] args) {
        computer obj = new desktop();
        Developer dev = new Developer();
        dev.buildapp(obj);
    }
}
