// ! HashTable (thread safe) vs HashMap (non-thread safe)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class DemoHashTable {
  public static void main(String[] args) {
    // put
    Map<Integer, Integer> map = new Hashtable<>();

    Runnable task = () -> {
      for (int i = 0; i < 100000; i++){
        map.put(i, i);
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
    System.out.println(map.size());
  }
}
