import java.util.Scanner;
public class Geometry
{
  public static double circleArea(double radius){
    return Math.PI*radius*radius;
  }
  public static double rectangleArea(double width, double length){
    return width*length;
  }
  public static double triangleArea(double base, double height){
    return base*height*0.5;
  }

  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("\nOperations:\n1.Circle area\n2.Rectangle area\n3.Triangle area\n4.Quit");
    int operation = keyboard.nextInt();
    while(operation!=4){
      if(operation==1){
        System.out.println("Input radius:");
        double radius = keyboard.nextDouble();
        System.out.println("Area of the circle with radius "+radius+"= "+circleArea(radius));
      }
      else if(operation==2){
        System.out.println("Input width and height:");
        double width = keyboard.nextDouble();
        double height = keyboard.nextDouble();
        System.out.println("Area of the rectangle is"+rectangleArea(width,height));
      }
      else if(operation==3){
        System.out.println("Input base and height:");
        double base = keyboard.nextDouble();
        double height = keyboard.nextDouble();
        System.out.println("Area of the rectangle is"+triangleArea(base,height));
      }else{
        System.out.println("\nWrong operation!\nTry again");
      }
      System.out.println("\nOperations:\n1.Circle area\n2.Rectangle area\n3.Triangle area\n4.Quit");
      operation = keyboard.nextInt();
    }
  }
}
