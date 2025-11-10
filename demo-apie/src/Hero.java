public abstract class Hero {
  private static final int[][] PA = new int[3][10];
  public static final int WARRIOR = 0;
  public static final int ARCHER = 1;
  public static final int MAGE = 2;

  // ! static block
  // execute static block once when there is a static variable
  static {
    // ! dictionary
    PA[0] = new int[] {2,4,6,8,10,12,14,16,18,20};
    PA[1] = new int[] {2,4,6,8,10,12,14,16,18,20};
    PA[2] = new int[] {2,4,6,8,10,12,14,16,18,20};
  }


  public static int getPA(int role, int level) {
    // Role = 0 (Warrior), Role = 1 (Archer), Role = 2 (Mage)
      return PA[0][level -1];


  }


  private int level;
  private int hp;
  private int mp;

  public Hero(){
    this.level = 1;
  }

  public void levelUp(){
    this.level++;
    // reset hp
    // reset mp
  }

  public void deductHp(int hp){
    this.hp -= hp;
  }


  // Hero (Shape)
  public void attack(Hero hero){
    myRole = xxx;
    int hpTobeDeducted = Hero.getPA(myrole. this.level-1) - hero.getPd();
    this.pa - hero.getPd(); //pa needs to read dictionary
    hero.deductHp();
  }


}
