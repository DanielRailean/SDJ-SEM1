public class Vehicle
{
  private String owner;
  private double price;

  public Vehicle(String owner, double price)
  {
    this.owner = owner;
    this.price = price;
  }

  public String getOwner()
  {
    return owner;
  }

  public void setOwner(String owner)
  {
    this.owner = owner;
  }

  public double getPrice()
  {
    return price;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  @Override public String toString()
  {
    return "Owner:"+owner+" Price:"+price;
  }

  @Override public boolean equals(Object obj)
  {
    if(obj instanceof Vehicle){
      Vehicle object = (Vehicle)obj;
      return object.getOwner().equals(owner)&&object.getPrice()==price;
    } else return false;
  }
}
