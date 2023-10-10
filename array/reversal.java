//time complexity: O(n)
//space complexity: O(1)
public class reversal {
   public static void main(String[] args) {
    int arr []={1,2,5,8,10};
    int n = arr.length;

    for(int i=0; i<n/2; i++){
        int temp = arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=arr[i];
    }
    System.out.println("reversal of an array is : ");
    for(int i=0; i<n; i++){
        System.out.println(arr[i]+" ");
    }
    System.out.println();
   }    
}
