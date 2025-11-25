public class Dog {
  // a demo for LinkedList
  private String name;
  private Dog dog;

  public Dog(String name){
    this.name = name;
  }

  private void setNextDog(Dog newDog){ //what for?
    this.dog = newDog;
  }

  // ! challenge/homework
  // remove(int index) dog1 -> dog2 -> dog3
  // tip: for dog1, set the node to point to dog3 

  public void add(Dog newDog){
    // Find the last one (getDog -> null), then setDog(newDog)
    Dog currentDog = this;
    while ( currentDog != null ){
      if (currentDog.getNextDog() == null) { // the added part
        currentDog.setNextDog(newDog); // the added part
        break; // break while loop // the added part
      } // the added part
      currentDog = currentDog.getNextDog();
    }
  }

  public String getName(){
    return this.name;
  }

  public Dog getNextDog(){
    return this.dog;
  }

  public int size(){
    // loop linkedlist structure.
    Dog currentDog = this;
    int count = 0;
    while(currentDog != null){
      // do anything, this time is
      count++; 
      currentDog = currentDog.getNextDog();
      //System.out.println(currentDog.getName());
    }
    return count;
  }

  public static void main(String[] args) {
    Dog d1 = new Dog("John");
    d1.add(new Dog("Mary"));
    System.out.println(d1.getName());
    System.out.println(d1.getNextDog().getName()); //Mary
    System.out.println(d1.getNextDog().getNextDog()); //null
    System.out.println(d1.size()); // 2

    d1.add(new Dog("Tommy"));
    System.out.println(d1.size());
    System.out.println(d1.getNextDog().getNextDog().getName());
    
  }

}
