// level, role -> maxHp, maxMp, pa, pd, ma, md, ag, cc, cd
public class Warrior extends Hero {

  public Warrior() {
    super();
  }

  public int getPD() {
    return Heros.getPD(Heros.WARRIOR, super.getLevel());
  }

  public void attack(Hero hero) {
    int myAttack = Heros.getPA(Heros.WARRIOR, super.getLevel());
    int hpTobeDeducted = myAttack - hero.getPD();
    hero.deductHp(hpTobeDeducted);
  }

  @Override
  public void levelUp() {
    super.levelUp();
    int maxHp = Heros.getMaxHp(Heros.WARRIOR, super.getLevel());
    super.setHp(maxHp);
    // System.out.println("test " + super.getLevel() +" " + maxHp);
  }

  public static void main(String[] args) {
    // 1D array example
    //int[] warriorPa = new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    //int[] archerPa = new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    //int[] magePa = new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

    // 2D array example
    //int[][] pa = new int[3][10];
    //pa[0] = new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    //pa[1] = new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    //pa[2] = new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

    // Warrior level 8 PA
    //System.out.println(pa[1][7]); // 16

    System.out.println(Heros.WARRIOR); // 0
    System.out.println("level 8 warrior PA =");
    System.out.println(Heros.getPA(Heros.WARRIOR, 8));

    // Testing
    Warrior warrior1 = new Warrior();
    warrior1.levelUp(); // 40
    System.out.println("created warrior1 level = ");
    System.out.println(warrior1.getLevel());

    Warrior warrior2 = new Warrior();
    warrior2.levelUp();
    warrior2.levelUp(); // 60
    System.out.println("created warrior2 level =");
    System.out.println(warrior2.getLevel());

    System.out.println("warrior1 hp = " + warrior1.getHp()); // 40
    warrior2.attack(warrior1);
    System.out.println("warrior2 attacked warrior1!");

    System.out.println("warrior1 hp = " + warrior1.getHp()); // 36
  }
}