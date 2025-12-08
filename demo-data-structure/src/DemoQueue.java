import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoQueue {
  public static void main(String[] args) {
    Queue<Integer> q1 = new LinkedList<>();
    q1.add(10);
    q1.add(3);
    q1.add(250);
    System.out.println(q1.size());
    //q1.get(1);
    System.out.println(q1.poll()); // get and remove head
    System.out.println(q1.size());

    System.out.println(q1.contains(250));
    System.out.println(q1.peek()); //3, get head
    System.out.println(q1.size()); //2
    // no remove index! no remove concept in queue


    // common usage
    while (!q1.isEmpty()){
      System.out.println(q1.poll());
    }

    List<Integer> l1 = new LinkedList<>();
    l1.add(10);
    l1.add(3);
    l1.add(250);
    System.out.println(l1.get(1));
    l1.addFirst(50);
    System.out.println(l1.get(0));


    Queue<String> q2 = new ArrayDeque<>();
    q2.add("John");
    q2.add("Tommy");
    q2.add("Steven");
    System.out.println(q2.size());
    System.out.println(q2.poll()); // John
    System.out.println(q2.poll()); // Tommy
    System.out.println(q2.size()); // 1

    Deque<String> names = new LinkedList<>();
    names.add("John");
    names.addFirst("Vincent");
    names.addLast("Mary");
    System.out.println(names.pollFirst()); // Vincent
    System.out.println(names.pollLast()); // Mary

    // LIFO - Undo-Redo
    

  }
}
