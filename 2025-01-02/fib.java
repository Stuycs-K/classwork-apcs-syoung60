public class fib{
  public static void main(String[] args){
    fib(40);
  }

  public static int fib(int n){
    if(n > 1){
      return (fib(n - 1) + fib(n - 2));
    }
    else{return n;}
  }
}
