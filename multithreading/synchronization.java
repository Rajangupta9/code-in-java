class car implements Runnable
{
     public void run()
    {
        try
        {
            System.out.println(Thread.currentThread().getName() + " has entered parking lot");
            Thread.sleep(1000);
            synchronized(this)
            {
             System.out.println(Thread.currentThread().getName() + " got into car to drive");
            Thread.sleep(1000);
             System.out.println(Thread.currentThread().getName() + "started to drive the car");
            Thread.sleep(1000);
             System.out.println(Thread.currentThread().getName() + " came back and parked the car ");
            Thread.sleep(1000);
            }

        }
        catch(Exception e)
        {
            System.out.println("some problem");
        }
    }
}



public class synchronization {
    public static void main(String[] args) {
        
        car c=new car();
        Thread t1= new Thread(c);
        Thread t2= new Thread(c);
        Thread t3= new Thread(c);

        t1.setName("son-1");
        t2.setName("son-2");
        t3.setName("son-3");

        t1.start();
        t2.start();
        t3.start();
    }
    
}
