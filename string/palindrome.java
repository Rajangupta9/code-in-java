public class palindrome {
    public static void main(String[] args) {
        String str1="madam";
        String str2="";
    for (int i=str1.length()-1; i>-1; --i){
        str2=str2+str1.charAt(i);

    }
    if(str1.equals(str2))
    {
        System.out.println("given string is palindrome");

    }
    else
    System.out.println("given string is not palindrome");

    }
}
