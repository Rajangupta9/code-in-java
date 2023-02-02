import java.util.Scanner;

public class inputofarray {

    public static int large(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
      return max;
    }

    public static void printArray(int[] arr){
        int n= arr.length;
        for(int i=0; i<n ; i++){
            System.out.println(arr[i]);
        }

    }

    public static int[] takeinput(){
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                System.out.println("enter elemet at" +i + "th index");
                arr[i] = s.nextInt();

            }
      return arr;
        } 
    }
    
    public static void main(String[] args){
     
       int[] arr = takeinput();
       printArray(arr);
       int lar=large(arr);
       System.out.println(lar);

    }
}