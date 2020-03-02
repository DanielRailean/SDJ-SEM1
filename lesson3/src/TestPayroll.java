import java.util.Scanner;
public class TestPayroll
{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Payroll Dimitrian = new Payroll();
    System.out.print("Input name\n");
    Dimitrian.setName(input.nextLine());
    System.out.print("Input Hourly pay rate\n");
    Dimitrian.setHourlyPayRate(input.nextDouble());
    System.out.print("Input worked hours\n");
    Dimitrian.setWorkedHours(input.nextDouble());
    System.out.print("Name: "+Dimitrian.getName()+
        "\nGross paycheck: "+ Dimitrian.grossPay());
    Payroll emp1 = new Payroll("Daniel Railean",142,7.4);
    System.out.print(emp1);
  }
}
