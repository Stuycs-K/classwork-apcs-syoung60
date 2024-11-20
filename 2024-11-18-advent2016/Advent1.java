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
          //String line = input.nextLine();
          //System.out.println(line);
          //cut out all commas
          while(input.hasNext()){
            String working = input.next();
            String dir = working.substring(0, 1);
            String dis = working.substring(1, working.length() - 1);
            System.out.println(dir + "-" + dis + "----");
            }
            
          }catch (FileNotFoundException ex) {
            System.out.println("File not found");
            }

            System.out.println("help me");
            return 0;


        }


        /*
        try{
            File file = new File(filename);
            Scanner input = new Scanner(file); //how to keep track of direction
            while(input.hasNext()){            // can sum up nesw and add together with vectorsin the end
                if(validTriangle(Integer.parseInt(input.next()),
                                 Integer.parseInt(input.next()),
                                 Integer.parseInt(input.next()))) sum = sum + 1;
                if(input.hasNextLine()) input.nextLine();
            }
            input.close();
        }catch(FileNotFoundException ex){
            System.out.println("File not found");
        }


        public static String[] parse(String file){
        Scanner inf = new Scanner(new File(file))
        String line = inf.nextLine();
        System.out.println
        return line.split(",");
        }catch (Exception e){
        System.exit(1)
        }
        }
        int solve(String[] data)
        main (STring[] args){
        String[] data = parse("input.txt")
        }

        System.out.println(sum);
        return sum;*/


}
