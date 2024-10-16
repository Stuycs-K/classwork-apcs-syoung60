public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    double d = Math.sqrt(
                        Math.pow((a.getX()-b.getX()), 2) + 
                        Math.pow((a.getY()-b.getY()), 2));
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
    System.out.println( distance(p1,p1));
    System.out.println( Point.distance(p3,p2));
    System.out.println( p2.distanceTo(p3));

    //Point tests
    Point p4 = new Point(p3);
    System.out.println(p4);
    Point p5 = new Point(p4);
    System.out.println(p5);

    //Triangle
    Point T1 = new Point(0, 0);
    Point T2 = new Point(1, 0);
    Point T3 = new Point(0.5, (0.5 * Math.sqrt(3)));
    System.out.println( distance(T1,T2));
    System.out.println( Point.distance(T1,T3));
    System.out.println( T1.distanceTo(T3));
  }
}
