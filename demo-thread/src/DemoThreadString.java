public class DemoThreadString {
  private String s = "";

  // ! Fix
  // but will slow down the program
  public synchronized void add(String str){
    this.s += str;
  } 

  public String getS(){
    return this.s;
  }

  public static void main(String[] args) {
    // task
    // add "a" 100_000

    // 2 thread
    // 200_000 "a" s.lengh() -> 200,000

    DemoThreadString s1 = new DemoThreadString();
    Runnable task = () -> {
      for (int i = 0; i< 100_000; i++){
        s1.add("a");
      }
    };
    Thread t1 = new Thread(task);

    Thread t2 = new Thread(task);

    t1.start();
    t2.start();

    try{
      t1.join();
      t2.join();
    } catch (InterruptedException e) {

    }
    //System.out.println(s1.getS());
    System.out.println(s1.getS().length());


  }
}
