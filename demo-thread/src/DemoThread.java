public class DemoThread {
  private int x = 0;

  public void increment(){
    this.x++;
  }

  public int getX(){
    return this.x;
  }
  public static void main(String[] args) {
    // ! main Thread
    int x = 3;
    x++;
    System.out.println(x); // 4
    x++;
    System.out.println(x); // 5

    DemoThread d1 = new DemoThread();
    // Lambda
    // Runnable is a funcitonal interface, no input, no output
    Runnable task = () -> {
      for (int i = 0; i< 100000; i++){
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

    // ! Main Thread comes here after releasing t1 and t2
    System.out.println(d1.getX()); // not 200_000


    // ! two problems:
    // 1. t1 and t2 doing the same task, which is x++. They change value of the same memory slot.
    // 2. Main Thread continue to execute the rest of the code after release the two threads
  }
}
