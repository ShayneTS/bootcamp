// level, role -> mapHp, maxMp, pa, pd, ma, md, ag, cc, cd
public class Warrior extends Hero {

// Constructor
  public Warrior() {
    super(); //calling parent's attributes

  }

public static void main(String[] args) {
  // 1D array
  int[] warriorPa = new int[] {2,4,6,8,10,12,14,16,18,20};
  int[] archerPa = new int[] {2,4,6,8,10,12,14,16,18,20};
  int[] magePa = new int[] {2,4,6,8,10,12,14,16,18,20};

  //2D array
  int[][] pa = new int[3][10];
  pa[0] = new int[] {2,4,6,8,10,12,14,16,18,20};
  pa[1] = new int[] {2,4,6,8,10,12,14,16,18,20};
  pa[2] = new int[] {2,4,6,8,10,12,14,16,18,20};

  // Archer level 8 pa?
  System.out.println(pa[1][7]); //16
  System.out.println(Hero.WARRIOR);
  System.out.println(Hero.getPA(Hero.WARRIOR, 8));
}

}
