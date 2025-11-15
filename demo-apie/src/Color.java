// ! enum is a more powerful class
// 1. You CANNOT create enum by yourself
// 2. All enum values exists in memory without object reference
public enum Color {
  RED('R'), // calling constructor
  YELLOW('Y'), // calling constructor
  WHITE('W') // calling constructor
  ;

  private char initial;


  // ! constructor (private for enum constructor)
   private Color(char initial){
    this.initial = initial;
   }

   public char getInitial(){
    return this.initial;
   }

   // search enum value by attribute (char)
   // ! Color.values() implicitly exists in enum.class
   public static Color valueOf(char initial) {
    for (Color color : Color.values()) {
      if (color.getInitial() == initial) {
        return color;
      }
    }
    // throw error
    return null;
   }



   // ! Enum Examples in real world:
   // 1. Monday, Tuesday ...
   // 2. North, West ...
   // 3. Diamond, Club ...
   // 4. Mr., Mrs. ... (drop down list)
   // 5. Occupation ... (drop down list)
   // 6. New Territories, Kowloon, Hongkong Island

   // ! Deinition of Enum:
   // 1. Has to be with finite values.
   // 2. Not add/remove often.
}
