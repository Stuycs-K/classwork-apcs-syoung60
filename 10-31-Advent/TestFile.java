public class Main{
  import java.util.Scanner;
  Scanner sc = new Scanner("Some String (or File) Here");

  public static void main(String[] args) {
      String text = "This is a sample\nOf how to read\ntext!";

      // creates a Scanner object to read throug the String
      Scanner input = new Scanner(text);

      //you don't want a for loop here unless you know the size of the data set

      while(input.hasNext()){
        System.out.println(input.next());
      }
      canner sc1 = new Scanner("This is a bunch of words");
    }
}
