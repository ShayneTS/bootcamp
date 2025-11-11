public final class Heros {
  private static final int[][] PA = new int[3][10];
  private static final int[][] PD = new int[3][10];
  private static final int[][] MAX_HP = new int[3][10];
  public static final int WARRIOR = 0; //referred in line9 in Warrior
  public static final int ARCHER = 1;
  public static final int MAGE = 2;

  // ! static block
  // execute static block once when there is a static variable
  static {
    // ! dictionary
    PA[0] = new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    PA[1] = new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    PA[2] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    PD[0] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    PD[1] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    PD[2] = new int[] {0, 0, 1, 1, 2, 2, 3, 3, 4, 4};

    MAX_HP[0] = new int[] {20, 40, 60, 80, 100, 120, 140, 160, 180, 200};
    MAX_HP[1] = new int[] {20, 40, 60, 80, 100, 120, 140, 160, 180, 200};
    MAX_HP[2] = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
  }

  public static int getPA(int role, int level) {
    // Role = 0 (Warrior), Role = 1 (Archer), Role = 2 (Mage)
    return PA[role][level - 1];
  }

  public static int getPD(int role, int level) {
    // Role = 0 (Warrior), Role = 1 (Archer), Role = 2 (Mage)
    return PD[role][level - 1];
  }

  public static int getMaxHp(int role, int level) {
    return MAX_HP[role][level - 1];
  }
}