import java.util.Scanner;

public class even_odd {
    public static void main (String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            int a = scan .nextInt();
            // int rem =a%2;
            // boolean result = rem == 0;
            // if (result == true)
            if(a%2==0){
                System.out.println(a + " is even" );

            }
            else{
                System.out.println(a +" is odd " );
            }
        }
    }

}
