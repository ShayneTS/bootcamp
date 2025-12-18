public interface FurnitureFactory {
  Chair createChair();

  Sofa createSofa();


  public static FurnitureFactory create(Furniture.Style style) {
    FurnitureFactory factory =  switch(style){
      case MODERN -> new ModernFurnitureFactory();
      case VICTORIAN -> new VictorianFurnitureFactory();
    };
    return factory;
  }


}
