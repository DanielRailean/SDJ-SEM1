public class Circle extends TwoDimensionalShape
{
  private double radius;

  public Circle(double x, double y, double radius)
  {
    super(x, y);
    this.radius = radius;
  }

  public double getRadius()
  {
    return radius;
  }

  public void setRadius(double radius)
  {
    this.radius = radius;
  }

  public double getArea()
  {
    return radius * radius * Math.PI;
  }

  @Override public String toString()
  {
    return "Circle-CenterX:"+getX()+" CenterY:"+getY()+" Area:"+getArea();
  }
}