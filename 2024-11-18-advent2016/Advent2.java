import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Advent2{
    public static void main(String[] args){
        System.out.println(bathroom("Advent2input.txt"));
        System.out.println(bathTwo("Advent2input.txt"));
    }
    public static int bathroom(String filename){
        int ans = 0;
        int num = 5;
        try{
          File file = new File(filename);
          Scanner input = new Scanner(file);
          while(input.hasNext()){
            String line = input.next();
            String[] lineArr = line.split("");
            for(int i = 0; i < lineArr.length; i++){
                if(lineArr[i].equals("U")){
                    if(num == 1||num == 2||num == 3){
                        num = num;
                    } 
                    else{num = num - 3;}
                }
                if(lineArr[i].equals("D")){
                    if(num == 7||num == 8||num == 9){
                        num = num;
                    } 
                    else{num = num + 3;}
                }
                if(lineArr[i].equals("L")){
                    if(num == 1||num == 4||num == 7){
                        num = num;
                    }
                    else{num = num - 1;} 
                }
                if(lineArr[i].equals("R")){
                    if(num == 3||num == 6||num == 9){
                        num = num;
                    } 
                    else{num = num + 1;}
                }
            }
            ans = ans * 10 + num;
          }
        }catch(FileNotFoundException ex) {
              System.out.println("File not found");
              }
        return ans;
    }

    public static String bathTwo(String filename){
        String ans = "";
        int num = 5;
        String num2 = "";
        try{
          File file = new File(filename);
          Scanner input = new Scanner(file);
          while(input.hasNext()){
            String line = input.next();
            String[] lineArr = line.split("");
            for(int i = 0; i < lineArr.length; i++){
                if(lineArr[i].equals("U")){
                    if(num == 5||num == 2||num == 1||num == 4||num == 9) num = num;
                    else if(num == 6||num == 7||num == 8||num == 10||num == 11||num == 12) num = num - 4;
                    else{num = num - 2;}//(num == 13 || num == 3) 
                }
                if(lineArr[i].equals("D")){
                    if(num == 5||num == 10||num == 13||num == 12||num == 9) num = num; 
                    else if(num == 6||num == 7||num == 8||num == 2||num == 3||num == 4) num = num + 4;
                    else{num = num + 2;}//(num == 1 || num == 11)
                }
                if(lineArr[i].equals("L")){
                    if(num == 1||num == 2||num == 5||num == 10||num == 13) num = num;
                    else{num = num - 1;}
                }
                if(lineArr[i].equals("R")){
                    if(num == 1||num == 4||num == 9||num == 12||num == 13) num = num;
                    else{num = num + 1;}
                }
            }
            if(num < 10) num2 = "" + num;
            if(num == 10) num2 = "A";
            if(num == 11) num2 = "B";
            if(num == 12) num2 = "C";
            if(num == 13) num2 = "D";
            ans = ans + num2;
          }
        }catch(FileNotFoundException ex) {
              System.out.println("File not found");
              }
        return ans;
    }
  
}

