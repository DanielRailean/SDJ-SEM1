public class Job
{
  private String jobTitle;
  private double monthlySalary;
  private Person employee;

  public Job(String jobTitle, double monthlySalary, Person employee){
   this.jobTitle = jobTitle;
   this.monthlySalary = monthlySalary;
   this.employee = new Person(employee.getName(), employee.getAge());

  }
  public Job(String jobTitle, double monthlySalary){
    this.jobTitle = jobTitle;
    this.monthlySalary = monthlySalary;
    this.employee = new Person("No one", 0);
  }
  public void setJobTitle(String jobTitle){
    this.jobTitle = jobTitle;
  }

  public void setEmployee(Person employee)
  {
    this.employee = employee;
  }

  public void setMonthlySalary(double monthlySalary)
  {
    this.monthlySalary = monthlySalary;
  }

  public double getMonthlySalary()
  {
    return monthlySalary;
  }

  public Person getEmployee()
  {
    return employee;
  }

  public String getJobTitle()
  {
    return jobTitle;
  }
  public void givePercentRaise(double percentage){
    monthlySalary+=monthlySalary*(percentage/100);
  }
  public String toString(){
    return "\nJob title: "+jobTitle+"\nMonthlySalary: "+monthlySalary+"\nEmploee name: "+employee.getName()+"\nEmploeeAge: "+employee.getAge();
  }
}
