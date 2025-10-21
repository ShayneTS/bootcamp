public class DemoWrapperClassII {
  public static void main(String[] args){
    // ! Don't use == for Wrapper Class
    
    // ! -128 to 127 -> cache
    Integer i10 = Integer.valueOf(127); //127 is upper limit of byte
    Integer i11 = Integer.valueOf(127); //Java by the default
    System.out.println(i10 == i11); // true
    System.out.println(i10.equals(i11)); // true

    Integer i12 = Integer.valueOf(128);
    Integer i13 = Integer.valueOf(128);
    System.out.println(i12 == i13); // false
    System.out.println(i12.equals(i13)); // true
    //the == is not checking the value, is checking the "address"

    // Short, Byte, Long
    System.out.println("Long");
    Long l10 = Long.valueOf(128); 
    Long l11 = Long.valueOf(128);
    System.out.println(l10==l11); // incorrect demo
    System.out.println(l10.equals(l11));

    System.out.println("Boolean");
    Boolean b10 = true; // atuo-box
    Boolean b11 = new Boolean(true);
    Boolean b12 = Boolean.valueOf(true);
    Boolean b13 = Boolean.valueOf(true);
    // incorrect demo
    System.out.println(b12 == b11); // false
    System.out.println(b12 == b13); // true

    // Character (homework)

  }
}
