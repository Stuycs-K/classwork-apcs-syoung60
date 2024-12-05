public class Driver{
    public static void main(String[] args){
        System.out.println(Text.RESET);
        border(200, ".");
        thing(200);
        border(200, ";");
        sky(200, 26);
        border(200, ".");

    }

    public static void border(int i, String c){
       
        for(int j = 0; j < 80; j++){
            System.out.print("\u001b[38;2;"+i+";"+i+";"+i+";7m" + c);
        }
        System.out.println(Text.RESET);
        //System.out.print("\033[0m"+"\033[?25h");
    }

    public static void thing(int i){
        int[] num = new int[3];
        num[0] = (int)(Math.random() * 100);
        num[1] = (int)(Math.random() * 100);
        num[2] = (int)(Math.random() * 100);
        System.out.print("\u001b[38;2;"+i+";"+i+";"+i+";7m." + Text.RESET+"                  ");
        for(int c = 0; c < 3; c++){
            if(num[c] < 25){
                System.out.print("\u001b[31m" + num[c] + "                  ");
            }
            else if(num[c] > 75){
                System.out.print("\u001b[32m" + num[c] + "                  ");
            }
            else{
                System.out.print(Text.RESET + num[c] + "                   ");
            }
        }
        System.out.print("\u001b[38;2;"+i+";"+i+";"+i+";7m." + "\n" + Text.RESET);
    }

    public static void sky(int i, int rows){
        for(int f = 0; f <3*rows; f+=3){
            System.out.print("\u001b[38;2;"+i+";"+i+";"+i+";7m.");
            for(int j = 0; j < 78; j++){
                if((f % 4 == 0 && j % 9 == 0)|| (f % 8 == 0 && j % 6 == 0)){
                    System.out.print("\u001b[38;2;"+200+";"+200+";"+100+";7m.");
                }
                else{
                    System.out.print("\u001b[38;2;"+(f+10)+";"+(f + 10)+";"+120+";7m.");
                }
                
                //System.out.println()
            }
            System.out.print("\u001b[38;2;"+i+";"+i+";"+i+";7m." + "\n");
        }
    }
}