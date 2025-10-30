public class Item {
  private double price;
  private int quantity;
  private String name; //underlined because not used, not get

  public Item(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }
  public double totalAmount() {
    return this.price*this.quantity;
  }

  public String getName() {
    return this.name;
  }
}
