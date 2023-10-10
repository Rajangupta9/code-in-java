// import java.util.Scanner;

// public class rotation_matrix {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         long i= scan.nextInt();

//         long result=1;
        
//         for(int j=2; j<=i; j++ ){
//             result=(result *j)%1000000007;

//         }
//         System.out.println(result);


//     }
    
// }
import java.math.BigInteger;

public class factorial {
    public static void main(String[] args) {
        int n = 100;
        BigInteger result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }

    public static BigInteger factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }

        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        return fact;
    }
}
