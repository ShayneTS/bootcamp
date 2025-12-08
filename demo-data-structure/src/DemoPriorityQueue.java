import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
  public static void main(String[] args) {
    Queue<String> pq = new PriorityQueue<>();
    pq.add("Steve");
    pq.add("Alex");
    pq.add("Cathy");

    // Priority Queue has no ordering during add process
    System.out.println(pq);

    System.err.println(pq.poll()); // Alex
    pq.add("Ben");
    System.out.println(pq.poll()); // Ben
    System.err.println(pq.poll()); // Cathy
    System.err.println(pq.poll()); // Steven

    // Example 2
    Queue<Integer> integers = new PriorityQueue<>(new SortByDesc());
    integers.add(100);
    integers.add(120);
    integers.add(50);
    System.out.println(integers.poll()); // 120
    integers.add(80);
    System.out.println(integers.poll()); // 100
    System.out.println(integers.poll()); // 80
    System.out.println(integers.poll()); // 50
  }
  
  public static class SortByDesc implements Comparator<Integer>{
    @Override
    public int compare(Integer i1, Integer i2) {
      return i1 > i2 ? -1 : 1;
    }
  }
}
