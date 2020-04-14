package ParkingSimulator;

public class ParkedCar
{
  private String make, model, color, licenseNumber;
  private int minutesParked;
  private ParkingMeter minutesPurchased;

  public ParkedCar(String make, String model, String color,
      String licenseNumber, int minutesParked, int minutesPurchased)
  {
    this.make = make;
    this.model = model;
    this.color = color;
    this.licenseNumber = licenseNumber;
    this.minutesParked = minutesParked;
    this.minutesPurchased = new ParkingMeter(minutesPurchased);
  }

  public void setMake(String make)
  {
    this.make = make;
  }

  public void setModel(String model)
  {
    this.model = model;
  }

  public int getMinutesParked()
  {
    return minutesParked;
  }

  public void setMinutesParked(int minutesParked)
  {
    this.minutesParked = minutesParked;
  }

  public int getMinutesPurchased()
  {
    return minutesPurchased.getParkingMinutesPurchased();
  }

  public void setMinutesPurchased(ParkingMeter minutesPurchased)
  {
    this.minutesPurchased = minutesPurchased;
  }

  public String getMake()
  {
    return make;
  }

  public String getModel()
  {
    return model;
  }

  public String getColor()
  {
    return color;
  }

  public String getLicenseNumber()
  {
    return licenseNumber;
  }

  public void setColor(String color)
  {
    this.color = color;
  }

  public void setLicenseNumber(String licenseNumber)
  {
    this.licenseNumber = licenseNumber;
  }



  public String toString()
  {
    return "Make:" + make + "\nModel:" + model + "\nColor:" + color
        + "\nLicense number:" + licenseNumber + "\n";
  }

  public boolean equals(Object object)
  {
    if (object instanceof ParkedCar)
    {
      ParkedCar obj = (ParkedCar) object;
      return (obj.getMake().equals(make)) && (obj.getModel().equals(model))
          && (obj.getColor().equals(color)) && (obj.getLicenseNumber()
          .equals(licenseNumber));
    }
    else
    {
      return false;
    }
  }
}
