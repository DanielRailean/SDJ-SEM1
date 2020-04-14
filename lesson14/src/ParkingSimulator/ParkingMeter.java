package ParkingSimulator;

public class ParkingMeter
{
  private int parkingMinutesPurchased;

  public int getParkingMinutesPurchased()
  {
    return parkingMinutesPurchased;
  }

  public void setParkingMinutesPurchased(int parkingMinutesPurchased)
  {
    this.parkingMinutesPurchased = parkingMinutesPurchased;
  }

  public ParkingMeter(int parkingMinutesPurchased)
  {
    this.parkingMinutesPurchased = parkingMinutesPurchased;
  }
}
