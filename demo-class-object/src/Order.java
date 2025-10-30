import java.math.BigDecimal;

public class Order {
  private Item[] items;

  public Order() {
    this.items = new Item[0];
  }

  public int size() {
    return this.items.length;
  }

  public void addItem(Item newItem) {
    Item[] newItems = new Item[this.items.length+1];
    // copy the original items into the new array
    int idx = 0;
    for (Item item : this.items) {
      newItems[idx] = item;
      idx++;
    }
    newItems[idx] = newItem;
    this.items = newItems; //! very important
  }

  public double totalAmount() { //a presentation only, didn't change anything
    BigDecimal total = BigDecimal.ZERO;
    for (Item item : this.items) { //check meaning of : with AI
      total = total.add(BigDecimal.valueOf(item.totalAmount()));
    }
    return total.doubleValue();
  }
  public static void main(String[] args) {
    
  }
}
