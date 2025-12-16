public class ModernChair implements Chair{
  @Override
  public boolean hasLegs(){
    System.out.println("I am Modern Chair, hasLegs().");
    return false;
  }
  
  @Override
  public boolean sitOn(){
    return false;
  }

}
