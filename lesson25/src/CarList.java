import java.io.Serializable;
import java.util.ArrayList;

public class CarList implements Serializable
{
  private ArrayList<Car> cars;

  public CarList()
  {
    cars = new ArrayList<Car>();
  }
  public int size(){
    return cars.size();
  }
  public int indexOfRegNumber(String reg){
    for(int i=0;i<cars.size();i++)
    {
      if(cars.get(i).getRegNumber().equals(reg)){
        return i;
      }
    }
    return -1;
  }
  public Car getCar(int index){
    return cars.get(index);
  }
  public Car getCar(String regNr){
    for(int i=0;i<cars.size();i++)
    {
      if(cars.get(i).getRegNumber().equals(regNr)){
        return cars.get(i);
      }
    }
    return null;
  }
  public void addCar(Car car){
    if(getCar(car.getRegNumber())==null)
    {
      cars.add(car);
    }
  }
  public void removeCar(int index)
  {
    cars.remove(index);
  }

  @Override public String toString()
  {
    String returned= "Cars:";
    for(int i=0;i<cars.size();i++){
      returned+="\n"+cars.get(i).toString();
    }
    return returned;
  }

}
