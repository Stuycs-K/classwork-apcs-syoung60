public class Thief extends Adventurer{
  private int money;
  private int maxMoney = 1000000;

  public Thief(String name){
    super(name);
    this.money = 10;
  }
  public Thief(String name, int hp){
    super(name, hp);
    this.money = 10;
  }
  public Thief(String name, int hp, int coins){
    super(name, hp);
    this.money = coins;
  }



  public String getSpecialName(){
    return "money";
  }
  //accessor methods
  public int getSpecial(){
    return money;
  }
  public void setSpecial(int n){
    money = n;
  }
  public int getSpecialMax(){
    return maxMoney;
  }


  //hurt or hinder the target adventurer
  public String attack(Adventurer other){
    return "taser";
  }

  //heall or buff the target adventurer
  public String support(Adventurer other){
    return "feed";
  }

  //heall or buff self
  public String support(){
    return "eat";
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    return "steal";
  }
  

}
