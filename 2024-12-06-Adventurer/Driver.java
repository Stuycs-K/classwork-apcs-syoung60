public class Driver{
  public static void main(String[] args){
    Adventurer p1 = new Thief("Parker", 10);
    Adventurer p2 = new Thief("Archie", 10, 100);

    System.out.println(p1.getName());
    System.out.println(p1.getSpecialName());
    System.out.println(p1.getSpecial());
    System.out.println(p1.getHP());
    System.out.println(p1.getSpecialMax());

    System.out.println(p1.attack(p2));
    System.out.println(p1.support(p2));
    System.out.println(p1.support());
    System.out.println(p1.specialAttack(p2));


  }


}
