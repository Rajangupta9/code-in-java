public class chage {

    static void change(int A[], int index, int value)
    {
        A[index]=value;
    }
    

public static void main(String[] args)

{
    int a[]={3,5,62,4,6,7};
    change(a, 4 , 69);
    for(int x:a)
    {
        System.out.println(x);
    }

}
}
