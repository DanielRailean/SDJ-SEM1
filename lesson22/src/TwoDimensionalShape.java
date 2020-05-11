public abstract class TwoDimensionalShape
{
  private double x;
  private double y;

  public TwoDimensionalShape(double x, double y)
  {
    this.x = x;
    this.y = y;
  }

  public double getX()
  {
    return x;
  }

  public double getY()
  {
    return y;
  }

  public void moveTo(double x, double y)
  {
    this.x = x;
    this.y = y;
  }

  public abstract double getArea();
  public  abstract String toString();

  public static void main(String[] args)
  {
    TwoDimensionalShape arr[] = new TwoDimensionalShape[10];
    arr[0] = new Circle(1,1,20);
    arr[1] = new Rectangle(1,1,10,4);
    for(int i=0;i<arr.length;i++){
      if(arr[i]!=null){
        System.out.println(arr[i]);
      }
    }
  }
}