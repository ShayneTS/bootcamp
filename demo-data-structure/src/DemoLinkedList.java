import java.util.LinkedList;

public class DemoLinkedList {
  public static void main(String[] args) {
    //  ! LinkedList vs ArrayList
    //  1. add() (add to tail): LinkedList has slight advantage
    //  2. size(), should store current size -> similar
    //  3. get(), i.e. find the 10th element in the list. (ArrayList must be faster)
    //  4. contains(), loops -> similar 
    //  5. remove(), e.g. remove "John" -> similar

    LinkedList<Cat> cats = new LinkedList<>();
    // add()
    cats.add(new Cat("John", 2));
    cats.add(new Cat("Mary", 3));
    cats.remove(new Cat("John",2));
    System.out.println(cats);
    System.out.println(cats.size());

    System.out.println(cats.contains(new Cat("Mary", 3))); // true
    System.out.println(cats.contains(new Cat("John", 2))); // false
    // ! for now ignore the age part as it was not covered in class
    // remove()
    //cats.remove("Mary");
    //System.out.println(cats);
    
  }
}
