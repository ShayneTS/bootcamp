public abstract class Hero {
  private int level;
  private int hp;
  private int mp;

  public Hero() {
    this.level = 1;

  }

  public void deductHp(int hp) {
    this.hp -= hp;
  }

  public void levelUp() {
    this.level++;
  }

  public int getHp() {
    return this.hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public int getLevel() {
    return this.level;
  }

  public abstract int getPD();

  public abstract void attack(Hero hero);
}