import java.util.concurrent.atomic.AtomicInteger;

public class DemoAtomic {
  public static void main(String[] args) {
    int x = 3;
    x++; // non-thread safe
    System.out.println(x); // 4

    // Atomic level
    AtomicInteger y = new AtomicInteger(3);
    y.getAndAdd(1); // = y++, but it is thread-safe
    System.out.println(y);
  }
}
