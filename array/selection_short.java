public class selection_short {

    public static void selectiosort(int[] input){
        for(int i=0 ; i<input.length-1; i++){//0 to lenght -2; 
         int min=input[i];
         int minIndex= i;
         for(int j=i+1; j<input.length; j++){
            if(input[j]< min){
                min = input[j];
                minIndex= j;
            }
         }
         if(minIndex != i){

         
         input[minIndex]=input[i];
         input[i]=min;

          }
         }
    }
    public static void main(String[] args) {
        int input[]= { 2,5,3,1,4};
        selectiosort(input);
        for(int i=0; i<input.length; i++){
            System.out.println(input[i] + "  ");
        }
    }
}
