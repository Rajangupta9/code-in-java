import java.util.Arrays;
public static rotatedMatrix(int arr[][]){
    //step 1 transpose the 2D array
    int m=arr.length;
    int n=arr[0].length;

    for(int i=0; i<m; i++){
        for(int j=i; j<n; j++){
            int temp = arr[i][j];
            int [i][j]=arr[j][i];
            int [j][i]=temp;
        }
    }
}

public class rotation_matrix {
    public static void main(String[] args) {
        int [][] arr ={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        rotatedMatrix(arr);
        for(var mat:arr){
            System.out.println(Arrays.toString(arr));
        }
    }
}
