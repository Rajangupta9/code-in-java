//package pattern;
import java.util.Scanner;
public class third {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
          
        // code of printing symbol H

        // for(int i= 0 ; i<n; ++i){
        //     for(int j=0; j<n;++j){
        //      if(j==0 ||j==n-1 || i==(n-1)/2)
        //         System.out.print("*");
        //     else
        //     System.out.print(" ");
        // }
        // System.out.println();
        // }

        //code of print symbol I;

    // for(int i= 0 ; i<n; ++i){
    //         for(int j=0; j<n;++j){
    //          if(i==0 ||i==n-1 || j==(n-1)/2)
    //             System.out.print("*");
    //         else
    //         System.out.print(" ");
    //     }
    //     System.out.println();
    // }

    // code of print symbol E; 

    // for(int i= 0 ; i<n; ++i){
    //         for(int j=0; j<n;++j){
    //          if(j==0 ||i==0||i==n-1 || i==(n-1)/2)
    //             System.out.print("*");
    //         else
    //         System.out.print(" ");
    //     }
    //     System.out.println();
    // } 

    // code of printing symbol F;

    for(int i= 0 ; i<n; ++i){
            for(int j=0; j<n;++j){
             if(j==0 ||i==0 || i==(n-1)/2)
                System.out.print("*");
            else
            System.out.print(" ");
        }
        System.out.println();
    }
    
}
}
