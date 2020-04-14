public class Garage
{
  private Car car1, car2;

  public boolean isParkingAreaTaken(int position)
  {
    if (position == 1)
    {
      if (car1 == null)
      {
        return false;
      }
      else
        return true;
    }
    else if (position == 2)
    {
      if (car2 == null)
      {
        return false;
      }
      else
        return true;
    }
    else
      return true;
  }

  public void park(Car car, int position)
  {
    if (!isParkingAreaTaken(position))
    {
      if (position == 1)
      {
        car1 = car;
      }
      if (position == 2)
      {
        car2 = car;
      }
    }
  }

  public Car leaveGarage(int position)
  {
    if (isParkingAreaTaken(position))
    {
      if (position == 1)
      {
        Car local = car1.copy();
        car1 = null;
        return local;
      }
      if (position == 2)
      {
        Car local = car2.copy();
        car2 = null;
        return local;
      }
    }
    return null;
  }

  @Override public String toString()
  {
    String response = "\n";
    if (car1 != null)
    {
      response += "Spot1:\nCar info:" + car1.toString();
    }
    else
    {
      response += "Spot1 empty";
    }
    response+="\n";
    if (car2 != null)
    {
      response += "Spot2:\nCar info:" + car2.toString();
    }
    else
    {
      response += "Spot2 empty";
    }
    return response;
  }

  public boolean equals(Object object)
  {
    if (object instanceof Garage)
    {
      Garage obj = (Garage) object;
      if(car1!=null&&car2!=null&&obj.car1!=null&&obj.car2!=null){ return obj.car1.equals(car1) && obj.car2.equals(car2);
      }
      else{
        if(car1==null&&car2!=null){
          return obj.car1==null && car2.equals(obj.car2);
        }else if(car1!=null&&car2==null){
          return obj.car2==null && car1.equals(obj.car1);
        }
        else{
          return obj.car1==null && obj.car2==null;
        }

      }

    }
    else
      return false;
  }

  public static void main(String[] args)
  {
    Garage g1 = new Garage();
    Garage g2 = new Garage();
    Car lam = new Car("Lamb", "Galardo", "Yellow", "cxg311");
    Car ferr = new Car("Ferarri", "F11", "Red", "uak123");
    Car lam1 = lam.copy();
    Car ferr1 = ferr.copy();
    System.out.println(g1);
    System.out.println(g2);
    g1.park(lam, 1);
    g2.park(ferr, 2);
    System.out.println(g1);
    System.out.println(g2);
    g1.park(ferr1,2);
    g2.park(lam1,1);
    System.out.println(g1);
    System.out.println(g2);
    g1.leaveGarage(2);
    g2.leaveGarage(2);
    System.out.println(g1);
    System.out.println(g2);
    System.out.println(lam.equals(lam1));
    System.out.println(g2.equals(g1));
  }
}
