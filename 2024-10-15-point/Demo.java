public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return 0.0;
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    System.out.println( p3);
    System.out.println( distance(p1,p2));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));
  }
}

/*
    //Write this method third. Test it then move on
    //to the others.
    
    public static double distance(Point a, Point b){
      double d = Math.sqrt(Math.pow((a.getX-b.getX), 2) + Math.pow((a.getY-b.getY), 2));
      return d;
    }


    public static void main(String[]args){
      Point p1 = new Point(1,1);
      Point p2 = new Point(-1,-1);
      Point p3 = new Point(3,4);
      System.out.println( p3);
      System.out.println( distance(p1,p2));
      System.out.println( Point.distance(p1,p2));
      System.out.println( p1.distanceTo(p2));

      // Test Point to get same values
      Point p4 = new Point(p2);
      System.out.println(p4);
    }
  }*/