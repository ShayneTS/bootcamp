import java.util.concurrent.atomic.AtomicInteger;

public class DemoThread4 {
  private AtomicInteger x = new AtomicInteger(0);

  // ! solve with AtomicInteger
  public void increment(){
    this.x.getAndAdd(1);
  }

  public int getX(){
    return this.x.intValue();
  }
  public static void main(String[] args) {
    // ! main Thread
    int x = 3;
    x++;
    System.out.println(x); // 4
    x++;
    System.out.println(x); // 5

    DemoThread4 d1 = new DemoThread4();
    // Lambda
    // Runnable is a funcitonal interface, no input, no output
    Runnable task = () -> {
      for (int i = 0; i< 100_000; i++){
        d1.increment();
      }
    };

    // ! t1 is second thread
    Thread t1 = new Thread(task); // assign task to the thread only
    // ! t2 is third thread
    Thread t2 = new Thread(task); // assign task to the thread only

    // ! Main Thread relase thread t1
    t1.start(); // The Thread t1 starts to execute task
    // ! Main Thread relase thread t2
    t2.start(); // The Thread t2 starts to execute task

    // ! Main Thread stand here to wait for both t1 and t2 to finish their tasks
    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {

      }

    // ! Main Thread comes here after releasing t1 and t2
    System.out.println(d1.getX()); // 200_000


  }
}
