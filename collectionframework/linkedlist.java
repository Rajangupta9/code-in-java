import java.util.*;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList ll1= new LinkedList();
        ll1.add(100);
        ll1.add(200);
        ll1.add(300);

        System.out.println(ll1);
        
        LinkedList ll2= new LinkedList(); // iis follow double linked list. 

        ll2.add("pw skills");
        ll2.add("1");
        ll2.add('j');
        System.out.println(ll2);
    }
}
