import java.util.*;
import java.io.*;
public class prifix_sum {
    public static int findSumMatrix(int arr[][], int r1, int c1, int r2 , int c2){
        int sum=0;
        for(int i=r1; i<=r2; i++){
            for(int j=c1; j<=c2; j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }
    public static void prefixSumMatrix(int arr[][]){
        int m= arr.length;
        int n= arr[0].length;
        //traversed the array row-wise to calculate the row wise prefix sum
        for(int i=0; i<m; i++){
            for(int j=1; j<n; j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
        // traverse the array column-wise to calculate the column - wise prefix sum
        for(int j=0; j<n; j++){
            for(int i=1; i<m; i++){
               arr[i][j] += arr[i-1][j];
            }
        }
    }
    public static int SumRegion(int arr[][], int r1, int c1 , int r2, int c2){
         int sum =0, up =0, left = 0, repeated_reagin =0, result=0;
         sum = arr[r2][c2];
         up= arr[r1-1][c2];
         left=arr[r2][c1-1];
         repeated_reagin=arr[r1-1][c1-1];
         result= sum-up -left + repeated_reagin;
         return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter number of rows");
        int m= scan.nextInt();
        System.out.println("Enter number of columns");
        int n = scan.nextInt();

        int arr[][]= new int [m][n];
        System.out.println("Enter the matrix");

        for(int i=0; i<m ;i++){
            for(int j=0; j<n; j++){
                arr[i][j]=scan.nextInt();

            }
        }
        System.out.println("Enter the value of r1 coordinate");
        int r1 = scan.nextInt();
        System.out.println("Enter the value of c1 coordinate");
        int c1 = scan.nextInt();
        System.out.println("Enter the value of r2 coordinate");
        int r2 = scan.nextInt();
        System.out.println("Enter the value of c2 coordinate");
        int c2 = scan.nextInt();
        
        //int result= findSumMatrix(arr,r1,c1,r2,c2);
        prefixSumMatrix(arr);
        int result = SumRegion(arr, r1,c1 , r2, c2);
        System.out.println("sum of elements of given rectangele is "+result);

        

    }

    
}
