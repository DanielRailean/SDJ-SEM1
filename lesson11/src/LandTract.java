public class LandTract
{
  private double width;
  private double height;
  public double getArea(){
    return height*width;
  }
  public boolean equals(LandTract object){
    return getArea() == object.getArea();
  }

  public double getWidth()
  {
    return width;
  }

  public void setWidth(double width)
  {
    this.width = width;
  }

  public double getHeight()
  {
    return height;
  }

  public void setHeight(double height)
  {
    this.height = height;
  }

  public LandTract(double width, double height)
  {
    this.width = width;
    this.height = height;
  }

  @Override public String toString()
  {
    return "Area: "+getArea();
  }
}
