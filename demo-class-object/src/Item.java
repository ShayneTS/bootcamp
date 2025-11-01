public class Item {
  private double price;
  private int quantity;
  private String name;

  public Item(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  // ! Presentation
  public double subtotal() {
    return this.price * this.quantity;
  }

  public String getName() {
    return this.name;
  }


}