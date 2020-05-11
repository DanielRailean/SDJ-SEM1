public class Van extends Car
{
  private int maxLoad;

  public Van(String owner, double price, String regNo, int maxLoad)
  {
    super(owner, price, regNo);
    this.maxLoad = maxLoad;
  }

  public int getMaxLoad()
  {
    return maxLoad;
  }

  @Override public String toString()
  {
    return super.toString()+" Max Load:"+maxLoad;
  }

  @Override public boolean equals(Object object)
  {
    if(object instanceof Van){
      Van obj = (Van) object;
      return obj.maxLoad==maxLoad&&obj.getOwner().equals(getOwner())&&obj.getPrice()==getPrice()&&obj.getRegistrationNumber().equals(getRegistrationNumber());
    } else return false;
  }
}
