import java.util.*;
public class arraydeque {
    public static void main(String[] args) {
        ArrayDeque ad1= new ArrayDeque(); // it used double ended que
        ad1.add(100);
        ad1.add(200);
        System.out.println(ad1);
        ad1.addFirst(10);
        ad1.addLast(20);
        ad1.add(20);
        System.out.println(ad1);
        ad1.add("Rajan");
        System.out.println(ad1);
        ad1.offer(500);
        ad1.offerLast(1);
        ad1.offerFirst(27);
        System.out.println(ad1);
    }
}
