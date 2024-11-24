import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Advent2{
    public static void main(String[] args){
        System.out.println(bathroom("Advent2input.txt"));
    }
    public static int bathroom(String filename){
        int ans = 5;
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

    public static int bathTwo(String filename){
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
            ans = ans + num2;
          }
        }catch(FileNotFoundException ex) {
              System.out.println("File not found");
              }
        return ans;
    }

                
           


        /*
        make string by adding input and space? 
        line.split("") makes a String array where the string is cut by the given string
        this would reurn each character ""
        in a grid, up is -3, down is +3, r and l are -1 and +1 except for edge nummbers
        try{
            File file = new File(filename);
            Scanner input = new Scanner(file); 
            while(input.hasNextLine()){
                while(input.hasNext()){
                String line = input.next();
                if(next().equals.(""))} //directions are characters, but not separated tokens
                //and turn line to string and evaluate each char
                
                ) sum = sum + 1;
                if(input.hasNextLine()) input.nextLine();
            }
            input.close();
        }catch(FileNotFoundException ex){
            System.out.println("File not found");
        }

        System.out.println(sum);
        return sum;*/
    
  
}

