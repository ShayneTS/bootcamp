import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoBigO {
  public static void main(String[] args) {
    // O(n2 + n) -> O(n2)
    int n = 10;
    for (int i = 0; i < n; i++){
      for (int j = 0; j < n; j++){
        // if else
      }
    }
    for (int i = 0; i < n; i++){

    }

    // DSA
    List<String> names = new ArrayList<>();
    // List<String> names = new LinkedList<>();
    names.add("Mary"); // O(n) for ArrayList, O(1) for Linked List
    names.add("Tommy");
    names.add("Jenny");
    System.out.println(names.get(2)); // O(1) for ArrayList, O(n) for LinkedList

    Queue<String> nickNames = new LinkedList<>();
    // Queue<String> nickNames = new ArrayDequeue<>();
    nickNames.add("Leo"); // O(n) for ArrayList, O(1) for LinkedList
    nickNames.add("Oscar");
    nickNames.add("Johnny");
    nickNames.poll(); // For Queue, most of the time LinkList is ok
  }
}
