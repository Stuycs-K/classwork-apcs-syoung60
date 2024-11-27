import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Advent6{
    public static void main(String[] args){
        repeat("Advent6input.txt");
        
    }

    public static int repeat(String filename){
        //count char in firt line and make an array with the length
        //or make a double array
        try{
          File file = new File(filename);
          Scanner input = new Scanner(file);
          int[][] arr = new int[8][26];
          int j = 0;
          //while(input.hasNextLine()){
            String line = input.next();
            String[] lineArr = line.split("");
            char c = lineArr[0];
            int g = c;
            System.out.println(g);
            
            
          
        }catch(FileNotFoundException ex) {
              System.out.println("File not found");
              }
        return 0;
    }


}