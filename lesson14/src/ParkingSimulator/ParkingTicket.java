package ParkingSimulator;

public class ParkingTicket
{
  public static String getIllegallyParkedCar(ParkedCar car)
  {
    return car.toString();
  }

  public static String getOfficerInfo(PoliceOfficer officer)
  {
    return officer.toString();
  }

  public static int getFineAmount(ParkedCar car)
  {
    int overtime = car.getMinutesParked() - car.getMinutesPurchased();
    if (overtime <= 0)
    {
      return 0;
    }
    else if(overtime <= 60)
    {
      return 25;
    }
    else
    {
      return 25 + ((overtime-1) / 60 ) * 10;

    }
  }

  public static String getParkingTicket(ParkedCar car, PoliceOfficer officer)
  {
    return getIllegallyParkedCar(car) + "\nFine Amount:" + getFineAmount(car)
        + "\n" + getOfficerInfo(officer);

  }
}