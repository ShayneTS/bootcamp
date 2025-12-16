public interface FurnitureFactory {
  Chair createChair();
  Sofa createSofa();


  public static FurnitureFactory create(Furniture.Style style) {
    return switch(style){
      case MODERN -> new ModernFurnitureFactory();
      case VICTORIAN -> new VictorianFurnitureFactory();
    };
    return factory;
  }


}
