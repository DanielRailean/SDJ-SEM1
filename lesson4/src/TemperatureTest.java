import java.security.Key;
import java.util.Scanner;

public class TemperatureTest
{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Input the temperature in fahrenheit:");
    Temperature temp1 = new Temperature(keyboard.nextDouble());
    System.out.print(temp1.getFahrenheit());
    System.out.print("\nCelsius: "+temp1.getCelsius()+"\nKelvin: "+temp1.getKelvin());

  }
}
