public class coplex1 {
    public static void main(String[] args) {
        
        int n= 19 ;

        for(int i=0; i<n; ++i){
            for(int j=0; j<n; ++j){
                if(i==j || i+j==n-1 || i==0 || i== n-1 || j== n-1|| j==0 || i+j==(n-2)/2){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
