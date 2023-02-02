import java.util.Scanner;

public class sum_of_n_no{
    public static void main(String[] args){
        try (Scanner s = new Scanner (System.in)) {
            int n = s .nextInt();
            int a = 0;


            while(n>0){
               a=a+n;
               n=n-1;
               
            }
            System.out.println(a);
           
        }
    }
}