public class missing {
    public static void main(String[] args) {
        int []arr= {1,2,4,7,6,5};
        int n = arr.length;
        // sum of natural no in array
        int sum_natura_no= ((n+1)*(n+2))/2;
        int sum =0;
        //sum of current element present in an array.
        for(int i=0; i<n; i++){
            sum +=arr[i];
        }
        int missing_elem=0;
        missing_elem = sum_natura_no -sum;
        System.out.println("missing element in an array is: "+missing_elem);

    }
    
}
//time complexity: O(n)
//space complexity: O(1)
