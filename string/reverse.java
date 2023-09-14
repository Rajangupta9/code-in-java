public class reverse {
    public static void main(String[] args) {
        String str1="pwjava";
        String str2="";

        for(int i=str1.length()-1; i>-1; --i)
        str2=str2+str1.charAt(i);

        System.out.println("Before reversing: "+ str1);
        System.out.println("After Reversing "+ str2);

        String str3="pwskill java";
        String str4="";
        String sarr[]=str3.split(" ");

        for (int i=sarr.length-1; i>-1; --i){
            str4=str4+sarr[i] + " ";
        }
        System.out.println("Before reversing : " + str3);
        System.out.println("After reversing: "+ str4);
        
        String str5="pwskill java";
        String str6="";
        String arr[]=str3.split(" ");

       for(String element: arr)
       {
        for(int i= element.length()-1;i>-1; --i)
        str6=str6+element.charAt(i);

         str6=str6+"  ";

       }

        System.out.println("Before reversing : " + str5);
        System.out.println("After reversing: "+ str6);
    }
}
