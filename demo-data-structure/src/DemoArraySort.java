import java.util.Arrays;
import java.util.Comparator;

public class DemoArraySort {

  public static class SortByDesc implements Comparator<Integer>{
    @Override
    public int compare(Integer i1, Integer i2) {
      return i1 > i2 ? -1 : 1;
    }
  }
  public static void main(String[] args) {
    int[] arr = new int[] {4, 1, 9, -18};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    
    Integer[] integers = new Integer [] {4, 1, 9, -18};
    Arrays.sort(integers, new SortByDesc());
    System.out.println(Arrays.toString(integers));
  }
}
