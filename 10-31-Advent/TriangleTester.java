import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//Q how many triangles are valid?
public class TriangleTester{
    
    public static void main(String[] args) {
        System.out.println("1, 2, 1: " + validTriangle("1", "2", "1"));
        System.out.println("3, 2, 3: " + validTriangle("3", "2", "3"));
        countTrianglesA("inputTri.txt");
    }

    public static boolean validTriangle(String x, String y, String z){
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        int c = Integer.parseInt(z);
        if(a + b > c &&
           b + c > a &&
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
                if(validTriangle(input.next(), input.next(), input.next())) sum = sum + 1;
                if(input.hasNextLine()) input.nextLine();
            }
            input.close();
        }catch(FileNotFoundException ex){
            System.out.println("File not found");
        }

        System.out.println(sum);
        return sum;
    }

    public static int countTrianglesB(String filename){
        //m
        return 0;
    }

    
}