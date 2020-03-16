public class Area
{
  public static double getArea(double radius){
    return radius*radius*Math.PI;
  }
  public static double getArea(double width, float length){
    return width*length;
  }
  public static double getArea(double radius, double height){
    return Math.PI*radius*radius*height;
  }
}
