public class Main{
  import java.util.Scanner;
  import java.io.File;
  import java.io.FileNotFoundException;
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
    public class ReadFile {

  public static void main(String[] args) {
    //2 Opening a file requires a try/catch
    try {
      File file = new File("PUT_FILENAME_HERE");//1
      Scanner input = new Scanner(file);
      //CODE THAT SCANS THE FILE.
      input.close();//releases the file from your program

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return; //you can return from a void function just don't put a value.
    }
  }
}
}
