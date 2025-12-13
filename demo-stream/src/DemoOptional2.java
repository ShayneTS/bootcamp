// ! Wrong usages for Optional

import java.util.Optional;

public class DemoOptional2 {
  public static void main(String[] args) {
    // sum(null, null); // ! stil lhaving problem for passing null value
    int x = 23;
    int y = 40;
    sum(Optional.of(x), Optional.of(y)); // ! Method User construct Optional Object before using the method (not good)
  }

  // ! what if someone passes null as parameters to call this method?
  public static int sum(Optional<Integer> x, Optional<Integer> y){ // ! Only Primitive can avoid null checking
    // null check for Optional Object, any problem?
    if(x.isPresent() && y.isPresent()){
      return x.get() + y.get(); // ! what if x or y is null?
    }
    return 0;
  }

  // ! Correct Approach
  public static int sum2(Integer x, Integer y) {
    // null check -> throw (OK)
    if (x == null || y == null)
      throw new IllegalArgumentException("x and y should not be null.");
    return x + y;
  }
}
