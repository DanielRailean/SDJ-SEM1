public class SportsCar extends Car
{
  private int maxVelocity;

  public SportsCar(String owner, double price, String regNo, int maxVelocity)
  {
    super(owner, price, regNo);
    this.maxVelocity = maxVelocity;
  }

  public int getMaxVelocity()
  {
    return maxVelocity;
  }

  @Override public String toString()
  {
    return super.toString()+" Max velocity:"+maxVelocity;
  }
  @Override public boolean equals(Object object)
  {
    if(object instanceof SportsCar){
      SportsCar obj = (SportsCar) object;
      return obj.maxVelocity==maxVelocity&&obj.getOwner().equals(getOwner())&&obj.getPrice()==getPrice()&&obj.getRegistrationNumber().equals(getRegistrationNumber());
    } else return false;
  }
}
