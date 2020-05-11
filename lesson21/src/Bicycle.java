public class Bicycle extends Vehicle
{
  private int gears;

  public Bicycle(String owner, double price, int gears)
  {
    super(owner, price);
    this.gears = gears;
  }

  public int getGears()
  {
    return gears;
  }

  public void setGears(int gears)
  {
    this.gears = gears;
  }

  @Override public String toString()
  {
    return super.toString()+" Max gears:"+gears;

  }

  @Override public boolean equals(Object object)
  {
    if(object instanceof Bicycle ){
      Bicycle obj = (Bicycle)object;
      return obj.getGears()==gears&&obj.getOwner().equals(getOwner())&&obj.getPrice()==getPrice();
    } else return false;
  }
}
