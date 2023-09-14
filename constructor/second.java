class demo {
    private int a;
    private int b;

    public demo()
    {
        System.out.println("zero peremetrized constructor by program");
    }

    public demo(int a, int b)
    {
        this.a= a;
        this.b= b;
    }

    void disp(){
        System.out.println(a);
        System.out.println(b);

    }
}

public class second {
    public static void main(String[] args) {
    demo d= new demo(5 ,7);
    d.disp();
    demo d2=new demo();
    d2.disp();
    }
    

}
