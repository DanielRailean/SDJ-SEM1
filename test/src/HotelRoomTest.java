public class HotelRoomTest
{
  public static void main(String[] args)
  {
    HotelRoom room1 = new HotelRoom(1,1900.3);
    HotelRoom room2 = new HotelRoom(2,2901.3);
    HotelRoom room3 = new HotelRoom(3,3902.3);
    room1.setRent(9831.1);
    Guest guest1 = new Guest("Daniel");
    Guest guest2 = new Guest("Allan");
    room1.checkIn(guest1);
    room2.checkIn(guest2);
    System.out.println(room1.toString()+"\n"+room2.toString()+"\n"+room3.toString());
  }
}
