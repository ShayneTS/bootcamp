import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

// ! Vector (thread-safe) vs ArrayList (non-thread safe)
public class DemoVector {
  public static void main(String[] args) {
    // C++
    // sync ArrayList
    List<String> names = new Vector<>(); // LinkedList() / ArrayList()
    //names.add("Jenny");
    //names.add("Leo");
    //names.add("Oscar");

    Runnable task = () -> {
      for (int i = 0; i < 100000; i++){
        names.add("Leo");
      }
    };
    long before = System.currentTimeMillis();
    Thread t1 = new Thread(task); // assign task to the thread only
    Thread t2 = new Thread(task); // assign task to the thread only
    t1.start(); // The Thread t1 starts to execute task
    t2.start(); // The Thread t2 starts to execute task
    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {

    }
    long after = System.currentTimeMillis();
    long timeUsed = after - before;
    System.out.println("time used = " + timeUsed);
    System.out.println(names.size());
  }
}
