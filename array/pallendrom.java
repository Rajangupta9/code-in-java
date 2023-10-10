//time complexity : O(n)
//space complexity : O(1)
public class pallendrom {
    public static void main(String[] args) {
        
        int [] array={1,2,3,2,14};
        int n = array.length;
        int flag = 0;

        for(int i=0 ; i < n/2 ; ++i)
        {
            if(array[i]!=array[n-i-1]){
             flag=1;
             System.out.println("not a palindromic array");
             break;

            }
            
        }
        if(flag==0){
            System.out.println("palindromic array");
        }
    }
}