public class Superwoman implements Flyable {
  @Override
  public void fly(){
    System.out.println("Superwoman is flying ...");
  }
}

// ! Superwoman can enjoy the default method of drink
// ! but Superman won't be impacted (if not default then must be implemented)

// Parent class vs Interface? 
// Attributes! Interface is an action, verb, no attributes
