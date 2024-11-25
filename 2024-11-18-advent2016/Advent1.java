import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Advent1{
    public static void main(String[] args){
      blocks("Advent1input.txt");
      System.out.println(twice("Advent1input.txt"));


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
        public static int twice(String filename){
          int x = 0;
          int y = 0;
          int direction = 0;
          int[] xhis = new int [5000];
          int[] yhis = new int [5000];
          int size = 0;
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

              if(direction == 0){
                for(int i = 1; i <= dis; i++){
                    for(int j = 0; j < size; j++){
                        if(xhis[j] == x && yhis[j] == y + i) return (Math.abs(x) + Math.abs(y + i));
                    }
                    xhis[size] = x;
                    yhis[size] = y + i;
                    size++;
                    
                }
                y = y + dis;
              }

              if(direction == 1){
                for(int i = 1; i <= dis; i++){
                    for(int j = 0; j < size; j++){
                        if(xhis[j] == x + i && yhis[j] == y) return (Math.abs(x + i) + Math.abs(y));
                    }
                    xhis[size] = x + i;
                    yhis[size] = y;
                    size++;
                    
                }
                x = x + dis;
              } 

              if(direction == 2){
                for(int i = 1; i <= dis; i++){
                    for(int j = 0; j < size; j++){
                        if(xhis[j] == x && yhis[j] == y - i) return (Math.abs(x) + Math.abs(y - i));
                    }
                    xhis[size] = x;
                    yhis[size] = y - i;
                    size++;
                    
                }
                y = y - dis;
              }
              if(direction == 3){
                for(int i = 1; i <= dis; i++){
                    for(int j = 0; j < size; j++){
                        if(xhis[j] == x - i && yhis[j] == y) return (Math.abs(x - i) + Math.abs(y));
                    }
                    xhis[size] = x - i;
                    yhis[size] = y;
                    size++;
                    
                }
                x = x - dis;
              }
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
