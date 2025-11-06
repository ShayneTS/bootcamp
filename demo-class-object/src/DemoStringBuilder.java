import java.math.BigDecimal;

public class DemoStringBuilder {

  public static void main(String[] args) {
    String name = "John";
    String[] names = new String[] {"Peter", name, "Sally"};

    // "PeterJohnSally"
    String result = "";
    for (String x : names){
      //option A
      result = result.concat(x);
      //option B) +
      // result = result + names; (incorrect code for now)
    }
    System.out.println(result);

    // StringBuilder
    StringBuilder sb = new StringBuilder();
    sb.append("hello"); //no return new in .append, it amend itself
    sb.append("world");
    System.out.println(sb.toString()); //.toString is not needed, still same result

    BigDecimal bd = new BigDecimal ("3.5");
    bd = bd.add(BigDecimal.TEN); // ! must include bd = , why?
    System.out.println(bd);

    // ! Performance of String concat (StringBuilder wins!!!)
    long before = System.currentTimeMillis();
    result = "";
    for (int i = 0; i < 100_000; i++){
      result += "a";
    }
    long after = System.currentTimeMillis();
    System.out.println(after - before); // ! 1134ms

    before = System.currentTimeMillis();
    result = "";
    sb = new StringBuilder();
    for (int i = 0; i < 100_000; i++){
      sb.append(result);
    }
    after = System.currentTimeMillis();
    System.out.println(after - before); // ! 18ms

    // ! Real Use case, usually concat 2 strings, but not 100 thousands strings...
    String url = "https://www.apple.com";
    url += url + "/products";
    System.out.println(url); //https://www.apple.comhttps://www.apple.com/products

    // Literal Pool
    String s1 = "hello";
    String s2 = "hello"; // ! "hello" -> reuse original string object in string pool
    System.out.println(s1==s2); // true
    
    s1 = new String ("hello"); // ! Must creat a new String object (because of new)
    System.out.println(s1==s2); // false

    s1 = String.valueOf("hello"); // ! Firstly it search string pool
    System.out.println(s1==s2); // true

    String s3 = s1.replace('e', 'x');

    

  }
  
}
