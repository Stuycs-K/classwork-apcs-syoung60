public class words{
  public static void main(String[] args){
    makeWords(2, "", "abc"); 

  }
  public static void makeWords(int remainingLetters, String result, String alphabet){
    System.out.println("*********" + remainingLetters + " " + result + " " + alphabet);
    if(remainingLetters == 0){
      System.out.println(result);
    }
    else{
      for(int i = 0; i < alphabet.length(); i++){
        String thing = result + alphabet.substring(i, i + 1);
        //System.out.println
        makeWords(remainingLetters - 1, thing, alphabet);
      }
    }
  }
}

