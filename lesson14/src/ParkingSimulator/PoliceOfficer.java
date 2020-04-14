package ParkingSimulator;

public class PoliceOfficer
{
  private String name;
  private String badgeNumber;

  public String getName()
  {
    return name;
  }

  public PoliceOfficer(String name, String badgeNumber)
  {
    this.name = name;
    this.badgeNumber = badgeNumber;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getBadgeNumber()
  {
    return badgeNumber;
  }

  public void setBadgeNumber(String badgeNumber)
  {
    this.badgeNumber = badgeNumber;
  }

  @Override public String toString()
  {
    return "Officer Name:"+name+"\nBadgeNumber:"+badgeNumber;
  }
  public String getParkingTicket(ParkedCar car){
    return ParkingTicket.getParkingTicket(car,new PoliceOfficer(name,badgeNumber));
  }

  public static void main(String[] args)
  {
    ParkedCar car1 = new ParkedCar("Fiat","Grande punto","red","cxg2194",10,60);
    PoliceOfficer Olga = new PoliceOfficer("Oliuliuncic","BADPUI00");
    System.out.println(Olga.getParkingTicket(car1));
    car1.setMinutesParked(241);
    System.out.println(Olga.getParkingTicket(car1));

  }
}
