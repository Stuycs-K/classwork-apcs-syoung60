public class AdventDay2{
    public static void main(String[] args){
        lkk;
    }
    public static int bathroom(String filename){
        String ans = "5";
        int num = 5;
        try{
          File file = new File(filename);
          Scanner input = new Scanner(file);
          while(input.hasNext()){
            String line = input.next();
            String[] lineArr = line.split("");
            for(int i = 0; i < lineArr.length; i++){
                if(lineArr[i].equals("U")){
                    if(!=(num == 1||num == 2||num == 3)){
                        num = num - 3;
                    } 
                }
                //repeat if statement for each d, l, r, with exceptions

           


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
  
}

