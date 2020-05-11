import java.io.Serializable;

public class Car implements Serializable
{
  private String regNumber;
  private String make;
  private String model;
  private int year;
  private Owner owner;

  public Car(String regNumber, String make, String model, int year, Owner owner)
  {
    this.regNumber = regNumber;
    this.make = make;
    this.model = model;
    this.year = year;
    this.owner = owner;
  }

  public String getRegNumber()
  {
    return regNumber;
  }

  public String getMake()
  {
    return make;
  }

  public String getModel()
  {
    return model;
  }

  public int getYear()
  {
    return year;
  }

  public Owner getOwner()
  {
    return owner;
  }

  public void setRegNumber(String regNumber)
  {
    this.regNumber = regNumber;
  }

  public void setOwner(Owner owner)
  {
    this.owner = owner;
  }

  @Override public String toString()
  {
    return "Car: "+make+" "+model+" "+year+" RegNr: "+regNumber+" Owner "+owner.toString();
  }

  @Override public boolean equals(Object obj)
  {
    if (!(obj instanceof Car))
    {
      return false;
    }
    Car other = (Car)obj;
    return regNumber.equals(other.getRegNumber())&&make.equals(other.getMake())&&model.equals(other.getModel())&&year==other.getYear()&&owner.equals(other.getOwner());
  }
}
