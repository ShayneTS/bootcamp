public enum Direction {
  // EAST, WEST, SOUTH, NORTH
 
  EAST('E', 1),
  WEST('W', -1),
  SOUTH('S', 2),
  NORTH('N', -2)
  ;
  // E, W, S, N
  private char value;
  private int label;

  private Direction(char value, int label){
    this.value = value;
    this.label = label;
  }

  public char getValue(){
    return this.value;
  }

  public int getLabel(){
    return this.label;
  }

  // ! Instance Method
  public Direction opposite() {
    for (Direction d : Direction.values()){
      if (d.getLabel() * -1 == this.label) {
        return d;
      }
    }
    return null; // impossible
  }

  // ! Static method (check two direction value)
  public static boolean isOpposite(Direction d1, Direction d2){
    return d1.getLabel() * -1 == d2.getLabel();
  }

  public static void main(String[] args) {
    System.out.println(Direction.EAST.opposite()); // should be WEST

    System.out.println(Direction.SOUTH.opposite()); //instance method
    System.out.println(Direction.isOpposite(WEST, EAST)); //static method
  }

}