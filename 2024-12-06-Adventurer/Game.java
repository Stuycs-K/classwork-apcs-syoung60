import java.util.Scanner;
class Game {
  public static void main(String[] args) {
    Adventurer p1 = new CodeWarrior("Player", 20);
    Adventurer p2 = new CodeWarrior("Enemy", 20);
    Scanner userInput = new Scanner(System.in);


    while(p1.getHP() > 0 && p2.getHP() > 0){
      System.out.println(p1.getName()+": "+ p1.getHP() + "/" +p1.getmaxHP() +"HP, "
                       + p1.getSpecial()+"/" + p1.getSpecialMax() + p1.getSpecialName());
      System.out.println(p2.getName()+": "+ p2.getHP() + "/" +p2.getmaxHP() +"HP, "
                       + p2.getSpecial()+"/" + p2.getSpecialMax() + p2.getSpecialName());
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String move = userInput.nextLine(); 
      while(!move.equals("a") || !move.equals("attack") ||
            !move.equals("sp") || !move.equals("special")||
            !move.equals("su") || !move.equals("support")||
            !move.equals("quit")){
              String move = userInput.nextLine();
            }
      if(move.equals("a") || move.equals("attack")){
        p1.attack(p2);
        System.out.println(p1.getName() + " attacked " + p2.getName());}
      else if(move.equals("sp") || move.equals("special")){
        p1.specialAttack(p2);
        System.out.println(p1.getName() + " specialAttacked " + p2.getName());}
      else if(move.equals("su") || move.equals("support")) p1.support();
      else if(move.equals("quit")) return;
      else {System.out.println("ERROR")}

    


    }
  }
}
