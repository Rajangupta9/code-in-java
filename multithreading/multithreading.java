import java.util.*;

class calc extends Thread
{
    public void run()
    {
        System.out.println("calculation Task Started");

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter first number");
        int num1=scan.nextInt();

        System.out.println("please enter second number");
        int num2=scan.nextInt();

        int res = num1 +num2;

        System.out.println(res);
        System.out.println("calculation task end");

        System.out.println("***************************************");

        
    }
    
}
class message extends Thread{
        public void run(){
            System.out.println("Displaying important massage task"); 
            
                try
                {
                    for(int i=0; i<3; i++){
                     System.out.println("focus is important to masater skills");
                     Thread.sleep(2000);
                    }
                }
                catch(Exception e)
                {
                    System.out.println("some problem" + e);
                }
               
            
            System.out.println("Displaying import message task ended");

        }
    }
public class multithreading {
    public static void main(String[] args) {
        System.out.println("main Thread started");
        calc t1=new calc();

        message m1 = new message();

        t1.start();

        m1.start();
    }
}
