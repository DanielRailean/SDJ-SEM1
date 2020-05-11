import java.io.FileNotFoundException;
import java.io.IOException;

public class CarFileAdapter
{
  private String fileName;

  public CarFileAdapter(String fileName)
  {
    this.fileName = fileName;
  }

  public void saveCars(CarList obj){
    FileIO fileOut = new FileIO();
    try
    {
      fileOut.writeToFile(fileName, obj);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    catch (IOException e)
    {
      System.out.println("IO exception saving cars");
    }
  }
  public CarList getAllCars()
  {
    FileIO fileIn = new FileIO();
    Object obj = null;
    try
    {
      obj = fileIn.readObjectFromFile(fileName);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found getting");
    }
    catch (ClassNotFoundException e)
    {
      System.out.println("Class not found getting");
    }
    catch (IOException e)
    {
      System.out.println("IO exception getting cars");
    }
    return (CarList)obj;
  }
  public void addCar(Car obj){
    CarList cars = getAllCars();
    cars.addCar(obj);
    saveCars(cars);
  }
  public void addCars(CarList obj)
  {
    CarList cars = getAllCars();
    for(int i=0;i<obj.size();i++)
    {
      cars.addCar(obj.getCar(i));
    }
    saveCars(cars);
  }
  public void deleteCar(Car car)
  {
    CarList cars = getAllCars();
    for (int i = 0; i < cars.size(); i++)
    {
      if (cars.getCar(i).equals(car))
      {
        cars.removeCar(i);
      }
    }
    saveCars(cars);
  }
  public void deleteCarByRegNumber(String reg)
  {
    CarList cars = getAllCars();
    for (int i = 0; i < cars.size(); i++)
    {
      if (cars.getCar(i).getRegNumber().equals(reg))
      {
        cars.removeCar(i);
      }
    }
    saveCars(cars);
  }
  public void importCSV(String fileName)
  {
    String[] cars = null;
    CarList carList = new CarList();
    TextFileIO fileIn = new TextFileIO();
    try
    {
      cars = fileIn.readArrayFromFile(fileName);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
    }
    for(int i=0;i<cars.length;i++)
    {
      String temp = cars[i];
      String[] tempArray = temp.split(",");
      String reg = tempArray[0];
      String make = tempArray[1];
      String model = tempArray[2];
      int year = Integer.parseInt(tempArray[3].trim());
      Owner owner = new Owner(tempArray[4],tempArray[5]);
      carList.addCar(new Car(reg,make,model,year,owner));
    }
    saveCars(carList);
  }

  public static void main(String[] args)
  {
    CarFileAdapter cars = new CarFileAdapter("c:/users/dd/desktop/cars.bin");
    cars.importCSV("c:/users/dd/desktop/input.txt");
    System.out.println(cars.getAllCars());
  }
}
