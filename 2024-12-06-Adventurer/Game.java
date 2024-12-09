import java.util.Scanner;
class Game {
  public static void main(String[] args) {
    Adventurer p1 = new CodeWarrior("Player", 20);
    Adventurer p2 = new CodeWarrior("Enemy", 20);

    while(p1.getHP() > 0 && p2.getHP() > 0){
      System.out.println(p1.getName()+": "+ p1.getHP() + "/" +p1.getmaxHP() +"HP, "
                       + p1.getSpecial()+"/" + p1.getSpecialMax() + p1.getSpecialName());
      System.out.println(p2.getName()+": "+ p2.getHP() + "/" +p2.getmaxHP() +"HP, "
                       + p2.getSpecial()+"/" + p2.getSpecialMax() + p2.getSpecialName());
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");

    }
  }
}
