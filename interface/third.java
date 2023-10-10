@FunctionalInterface
interface car
{
    void drive(int avg ,int ts);
}
// class wagnor implements car
// {
//     public void drive()
//     {
//         System.out.println("driving .. ");
//     }
// }
public class third {
    public static void main(String[] args) {
        car obj = (avg,ts) -> System.out.println("driving ..." + avg + " : " + ts);
        
        obj.drive(16 , 120);
    }
}
