public class ColorDemo{
  public static void main(String[] args){
    for(int r = 0; r < 256; r+=32){
      for(int g = 0; g <= 32; g+=4){
        for(int b = 0; b <= 256; b+=32){
          System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
        }
      }
    }
    for(int rg = 100; rg < 180; rg+=2){
      for(int i = 0; i < 100; i++){
        System.out.print("\u001b[38;2;"+rg+";"+(rg + 60)+";"+250+";7m.");
      }
    }

  }
  

}


