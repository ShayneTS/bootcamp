public class DemoFurnitureSystem {
  // ! Advantages of Factory Pattern:
  // 1. When you have a new type of furniture, you DON'T need to revise existing class
  // (open-close coding pattern) // ! what is open-close?
  // 2. main logic can be isolated (de-coupling)
  // 3. Attribute -> Class
  public static void main(String[] args) {
    // ! Parameters (Modern Chair)
    Furniture.Style style = Furniture.Style.MODERN;
    int furnitureType = 1; // 1 -> chair, 2 -> sofa

    FurnitureFactory factory = FurnitureFactory.create(style); // Modern Factory
    Furniture furniture = Furniture.create(furnitureType, factory);

    System.out.println(furniture.hasLegs());

  }
}
