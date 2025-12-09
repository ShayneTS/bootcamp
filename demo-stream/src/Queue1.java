import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Queue1 {
  private Queue<String> hkids;

  private Queue1(Queue<String> hkids) {
    this.hkids = hkids;
  }

  public static Queue1 ofArray() {
    return new Queue1(new ArrayDeque<>());
  }

  public static Queue1 ofLinkedList() {
    return new Queue1(new LinkedList<>());
  }

  public boolean add(String hkid){
    return this.hkids.add(hkid);
  }

  public static void main(String[] args) {
    Queue1 q1 = Queue1.ofArray();
    q1.add("abcd4321");
    Queue1 q2 = Queue1.ofLinkedList();
    q2.add("abcd1234");
  }

}
