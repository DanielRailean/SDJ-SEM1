public class Car extends Vehicle
{
  private String registrationNumber;

  public Car(String owner, double price, String regNo)
  {
    super(owner, price);
    this.registrationNumber = regNo;
  }

  public String getRegistrationNumber()
  {
    return registrationNumber;
  }

  public void setRegistrationNumber(String registrationNumber)
  {
    this.registrationNumber = registrationNumber;
  }

  @Override public String toString()
  {
    return super.toString()+" Registration number:"+registrationNumber;
  }

  @Override public boolean equals(Object object)
  {
    if(object instanceof Car ){
      Car obj = (Car)object;
      return obj.getRegistrationNumber().equals(registrationNumber)&&obj.getOwner().equals(getOwner())&&obj.getPrice()==getPrice();
    } else return false;
  }

}
