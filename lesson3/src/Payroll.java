public class Payroll
{
 private String name;
 private double hourlyPayRate;
 private double workedHours;

 public void setName(String n){
   name = n;
 }
 public void setHourlyPayRate(double pay){
   hourlyPayRate = pay;
 }
 public void setWorkedHours(double hours){
   workedHours = hours;
 }
 public String getName(){
   return name;
 }
 public double getHourlyPayRate(){
   return hourlyPayRate;
 }
 public double getWorkedHours(){
   return workedHours;
 }
 public double grossPay(){
   return hourlyPayRate*workedHours;
 }
}
