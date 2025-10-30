public class Eye {
  private Eye color;
    
    // constructor, getter, setter
    public Eye(){

    }

    public Eye(String color) {
      this.color = color;
    }

    public void setColor(Eye color) { //why can't same style of method? because different name (but constructor can't change name)
    this.color = color;
  }

    public char[] getColor() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'getColor'");
    }
}
