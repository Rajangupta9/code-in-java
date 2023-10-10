/*why collection 
 * collection hierarchy
 * arraylist
 * linkedlist
 * arrayDeque
 * priorityQueue
 * TreeSet
 * HashSet
 * LinkedHashSet
 * iterator, list Iterator
 */

 //itrerable
 // collection hieararchy
 // list , queue , set

 /*why we need colletion frame work
  * set of interface and class => store the data and add
  delete , retrive and manipulate the data info.

  homogenius and hetrogenius (mixed) data can be stored
  dynamic in size.
  */
import java.util.*;

public class first {

  public static void main(String[] args) {

    ArrayList al1 = new ArrayList(); // this array dyanamic in nature. 

    al1.add(100);
    al1.add(200);
    al1.add(300);

    System.out.println(al1);
    System.out.println(al1.contains(200));
    System.out.println(al1.indexOf(300));
    System.out.println(al1.size());
    al1.ensureCapacity(10);
    al1.trimToSize();
    al1.clear();
    System.out.println(al1);

    List a1=new ArrayList(); 

    // ArrayList al2 = new ArrayList (); // in array list we store homogenius and hetrogenious as well as

    // al2.add("pw skills");
    // al2.add(1);
    // al2.add('j');
    // al2.add(1.1);
    // System.out.println(al2);
    // al2.add(2,"rajan"); // add data in arraylist is possible but this is not good paractice. 
    // System.out.println(al2);
    
  }
    
}
