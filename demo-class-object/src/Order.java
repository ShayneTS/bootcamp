import java.math.BigDecimal;

public class Order {
  private Item[] items;

  public Order() {
    this.items = new Item[0];
  }

  public int size() {
    return this.items.length;
  }

  public double getSubtotal (String itemName){
    for (Item item : this.items) {
      if (item.getName().equals(itemName)) {
        return item.subtotal();
      }
    }
    return 0.0;
  }

// for (double x : amounts) {
     // total = BigDecimal.valueOf(total).add(BigDecimal.valueOf(amounts)).doubleValue(); // ! why doesn't work?
      

  public void addItem(Item newItem) {
    Item[] newItems = new Item[this.items.length + 1];
    // copy the original items into the new array
    int idx = 0;
    for (Item x : this.items) {
      newItems[idx] = x;
      idx++;
    }
    newItems[idx] = newItem;
    this.items = newItems;
  }

  public double totalAmount() {
    BigDecimal total = BigDecimal.ZERO;
    for (Item item : this.items) {
      total = total.add(BigDecimal.valueOf(item.subtotal()));
    }
    return total.doubleValue();
  }
}