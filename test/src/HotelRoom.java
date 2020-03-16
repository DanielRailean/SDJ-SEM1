public class HotelRoom
{
  private int roomNumber ;
  private double rent;
  private Guest guest;

  public HotelRoom(int roomNumber, double rent)
  {
    this.roomNumber = roomNumber;
    this.rent = rent;
    this.guest = null;
  }

  public int getRoomNumber()
  {
    return roomNumber;
  }

  public double getRent()
  {
    return rent;
  }

  public Guest getGuest()
  {
    return guest;
  }

  public void setRent(double rent)
  {
    this.rent = rent;
  }
  public boolean isAvailable()
  {
    if (guest ==null){
      return true;
    }else{
      return false;
    }
  }
  public void checkIn(Guest guest){
    if(isAvailable()){
      this.guest = guest;
    }
  }
  public void checkOut(){
    this.guest = null;
  }

  @Override public String toString()
  {
    if(isAvailable()){
      return "Room nr :"+roomNumber+"\nRent: "+rent;
    }else{
      return "Room nr :"+roomNumber+"\nRent: "+rent+"\nGuest name: "+guest.getName();
    }
  }

}
