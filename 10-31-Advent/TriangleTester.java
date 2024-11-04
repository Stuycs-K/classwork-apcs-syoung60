import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester{
    
    public static void main(String[] args) {
        System.out.println(validTriangle("3", "2", "3"));
        countTrianglesA("inputTri.txt");
    }

    public static boolean validTriangle(String x, String y, String z){
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        int c = Integer.parseInt(z);
        if(a + b > c ||
           b + c > a ||
           c + a > b) return true;
        return false;
    }

    //Part A
    public static int countTrianglesA(String filename){
        int sum = 0;
        try{
            File file = new File(filename);
            Scanner input = new Scanner(file); 
            while(input.hasNextLine()){
                //sum++;
                if(validTriangle(input.next(), input.next(), input.next())) sum = sum++; 
                /*System.out.println(input.next());
                System.out.println(input.next());
                System.out.println(input.next());*/
                if(input.hasNextLine()) input.nextLine();
            }
            input.close();
        }catch(FileNotFoundException ex){
            System.out.println("File not found");
        }

        System.out.println(sum);
        return sum;
    }

    
}