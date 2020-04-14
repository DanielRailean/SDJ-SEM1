package Carpet;

public class RoomDimension
{
  public RoomDimension(double width, double length)
  {
    this.width = width;
    this.length = length;
  }

  private double width, length;

  public double getWidth()
  {
    return width;
  }

  public void setWidth(double width)
  {
    this.width = width;
  }

  public double getLength()
  {
    return length;
  }

  public void setLength(double length)
  {
    this.length = length;
  }
  public double getArea(){
    return length*width;
  }
}
