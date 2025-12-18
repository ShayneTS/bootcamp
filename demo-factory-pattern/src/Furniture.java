public interface Furniture {
  boolean hasLegs();

  public enum Style {
    MODERN, VICTORIAN,;
  }

  public static Furniture create(int type, FurnitureFactory factory){
    return switch(type) {
      case 1 -> factory.createChair();
      case 2 -> factory.createSofa();
      default -> null;
      
    };
  }
}
