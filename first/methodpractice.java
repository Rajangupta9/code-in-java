package first;

public class methodpractice
{
     static int max(int x, int y)
    {
        if(x>y)
        return x;
        else
        return y;
    }

    public static void main(String args[])
    {
        int a=7, b=5, c;
         c=max(a,b);
          System.out.println(c);
        // methodpractice mp= new methodpractice();
        // System.out.println(mp.max(a,b));
    }
}