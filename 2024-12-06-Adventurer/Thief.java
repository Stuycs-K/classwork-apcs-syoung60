public class Thief extends Adventurer{
  private int money;

  public Thief(String name){
    super(name);
  }
  public Thief(String name, int hp){
    super(name, hp);
  }

  //Abstract methods are meant to be implemented in child classes.

  /*
    all adventurers must have a custom special
    consumable resource (mana/rage/money/witts etc)
  */
  //give it a short name (fewer than 13 characters)
  public static String getSpecialName(){
    return "money";
  }
  //accessor methods
  public int getSpecial(){
    return money;
  }
  public void setSpecial(int n){
    money = n;
  }
  public static int getSpecialMax(){
    return 1;
  }

  /*
    all adventurers must have a way to attack enemies and
    support their allys

  //hurt or hinder the target adventurer
  public abstract String attack(Adventurer other);

  //heall or buff the target adventurer
  public abstract String support(Adventurer other);

  //heall or buff self
  public abstract String support();

  //hurt or hinder the target adventurer, consume some special resource
  public abstract String specialAttack(Adventurer other);
  */

}
