public class Mage extends Hero{

  public Mage(){
    super();
  }

  public int getPD() {
    return Heros.getPD(Heros.MAGE, super.getLevel());
  }

  public void attack(Hero hero) {
    int myAttack = Heros.getPA(Heros.MAGE, super.getLevel());
    int hpTobeDeducted = myAttack - hero.getPD();
    hero.deductHp(hpTobeDeducted);
  }

  @Override
  public void levelUp(){
    super.levelUp();
    int maxHp = Heros.getMaxHp(Heros.MAGE, super.getLevel());
    super.setHp(maxHp);
  }

  public static void main(String[] args) {
    Mage mage1 = new Mage();
    System.out.println("created mage1 level = ");
    System.out.println(mage1.getLevel());
    int bornHp = Heros.getMaxHp(Heros.MAGE, mage1.getLevel());
    mage1.setHp(bornHp);
    //mage1.setHp(Heros.MAGE, mage1.getLevel());
    System.out.println("HP = " + mage1.getHp());

    mage1.levelUp();
    System.out.println("HP = " + mage1.getHp());
  }
  
}
