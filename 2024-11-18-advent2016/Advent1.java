import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Advent1{
    public static void main(String[] args){
      blocks("Advent1input.txt");


    }
    public static int blocks(String filename){
        int x = 0;
        int y = 0;
        int direction = 0;
        try{
          File file = new File(filename);
          Scanner input = new Scanner(file);
          while(input.hasNext()){
            String working = input.next();
            String dir = working.substring(0, 1);
            int dis = 0;
            if(input.hasNext()) dis = Integer.parseInt(working.substring(1, working.length() - 1));
            else {dis = Integer.parseInt(working.substring(1));}
            if(dir.equals("R")) direction++;
            if(dir.equals("L")) direction--;
            if(direction == 4) direction = 0;
            if(direction == -1) direction = 3;

            if(direction == 0) y = y + dis;
            if(direction == 1) x = x + dis;
            if(direction == 2) y = y - dis;
            if(direction == 3) x = x - dis;
            //System.out.println(x + "," + y);
            //System.out.println(dir + "-" + dis + "----");
            }
            
          }catch (FileNotFoundException ex) {
            System.out.println("File not found");
            }

            System.out.println(x + " in the x \n" + y + " in the y");
            System.out.println(Math.abs(x) + Math.abs(y));
            return Math.abs(x) + Math.abs(y);


        }


}
