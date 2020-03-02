public class Payroll
{
 private String name;
 private double hourlyPayRate;
 private double workedHours;

 public Payroll(String name, double hourlyPayRate, double workedHours){
   this.name = name;
   this.hourlyPayRate = hourlyPayRate;
   this.workedHours = workedHours;
 }
 public Payroll(){
   this.name = "";
   this.hourlyPayRate = 0;
   this.workedHours = 0;
 }

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
 public String toString(){
   return "\nName: "+name+"\nPaycheck: "+grossPay();
 }
}
