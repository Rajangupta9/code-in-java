class MyThread extends Thread{
        public void run()
        {
            System.out.println("child thread");
        }
    }


public class createthread {
    public static void main(String[] args) {
        System.out.println("main thread");

        MyThread f=new MyThread();
        f.start();
    }
    


}
