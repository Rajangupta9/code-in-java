import java.util.Scanner;

public class stringDemo{

    public static void printChar(String str){
        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }

    public static void main (String[] arg){
        Scanner s= new Scanner(System.in);
        String str= s.nextLine();
        printChar(str);


    }
}