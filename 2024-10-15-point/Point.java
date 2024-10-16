public class Point{
  private double x,y;

  public String toString(){
    return "(" + x + ", " + y + ")";
  }

  //Initialize this Point to have the same values as the other Point.
  public Point(Point other){
    x = other.x;
    y = other.y;
    //COMPLETE THIS SECOND
    //Then write test cases.
  }

  //Initialize this Point to have the provided values
  public Point(double x, double y){
    this.x=x;
    this.y=y;
    //this. refers to the private field/variable declared at the top of the class
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }

  /*
  Write this method FOURTH, go to the main and do that one first.
  */
  public double distanceTo(Point other){
    double d = Math.sqrt(
                        Math.pow((getX()-other.getX()), 2) + 
                        Math.pow((getY()-other.getY()), 2));
    return d;
  }

  /*
  Write this method last. Re-use (NOT COPY/PASTE) prior work and
  do not write redundant code.
  */
  public static double distance(Point a, Point b){
    return 0.0;
  }


}


/*  

    
    //Write this method FOURTH, go to the main and do that one first.
    
    public double distanceTo(Point other){
      return 0.0;
    }

    
    //Write this method last. Re-use (NOT COPY/PASTE) prior work and
    //do not write redundant code.
    
    public static double distance(Point a, Point b){
      return 0.0;
    }


  }*/