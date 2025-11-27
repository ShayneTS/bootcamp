public class Box2 {
  private Animal animal;

  public Box2(Animal animal){
    this.animal = animal;
  }

  public void setAnimal(Animal animal){
    this.animal = animal;
  }

  public void askAnimalToEat(){
    this.animal.eat();
  }

  public static void main(String[] args) {
    // No Generic
    Box2 animalBox = new Box2(new Cat());
    animalBox.askAnimalToEat(); // I am a cat and eating...

    animalBox.setAnimal(new Dog());
    animalBox.askAnimalToEat(); //  I am a dog and eating...

    // Generic
    // Box<Animal> animalBox2 = new Box 

  }
}
