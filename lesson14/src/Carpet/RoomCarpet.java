package Carpet;

public class RoomCarpet
{
  private RoomDimension room;
  private double pricePerSquareMeter;

  public RoomCarpet(RoomDimension room, double pricePerSquareMeter)
  {
    this.room = room;
    this.pricePerSquareMeter = pricePerSquareMeter;
  }

  public RoomDimension getRoom()
  {
    return room;
  }

  public void setRoom(RoomDimension room)
  {
    this.room = room;
  }

  public double getPricePerSquareMeter()
  {
    return pricePerSquareMeter;
  }

  public void setPricePerSquareMeter(double pricePerSquareMeter)
  {
    this.pricePerSquareMeter = pricePerSquareMeter;
  }

  public double getTotalCost(){
    return room.getArea()*pricePerSquareMeter;
  }

  @Override public String toString()
  {
    return  "Room area: "+room.getArea()+"\nTotal price: "+getTotalCost();
  }

  public static void main(String[] args)
  {
    RoomDimension room1 = new RoomDimension(32,231);
    RoomCarpet carpet1 = new RoomCarpet(room1,4231.12);
    System.out.println(carpet1);
  }
}
