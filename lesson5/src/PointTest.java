public class PointTest
{
  public static void main(String[] args){
    Point p1 = new Point(10,20);
    Point p2 = new Point(10,5);
    System.out.print("\nThe point one is:");
    System.out.print(p1);
    System.out.print("\nThe second point is:");
    System.out.print(p2);
    p1.move(5,5);
    System.out.print("\nThe point one is moved by 5,5 to :");
    System.out.print(p1);
    p2.moveTo(10,13);
    System.out.print("\nThe second point is moved to :");
    System.out.print(p2);
    System.out.print("\nThe distance between p1 and p2 is :"+Math.sqrt(Math.pow(p2.getX()-p1.getX(),2)+Math.pow(p2.getY()-p1.getY(),2)));
  }
}
