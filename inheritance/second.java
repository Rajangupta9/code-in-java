class aeroplane
{
    public void takeoff(){
        System.out.println("Aeroplane is taking off");
    }
    public void fly()
    {
        System.out.println("aeroplane is flying");

    }
}
class cargoplane extends aeroplane
{
    public void fly()
    {
        System.out.println("Cargoplane flies at lower hight");
    }

}
class passenger extends aeroplane
{
   public void fly()
    {
        System.out.println("passenger planes flies at lower hight");
    }
}

public class second {
    public static void main(String[] args) {
        cargoplane cargo= new cargoplane();
        cargo.takeoff();
        cargo.fly();

        passenger pass= new passenger();

        pass.takeoff();
        pass.fly();
    }
}
