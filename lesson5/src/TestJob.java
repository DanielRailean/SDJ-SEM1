public class TestJob
{
  public static void main(String[] args){
    Person p1 = new Person("Daniel", 21);
    Person noOne = new Person ("No one", 0);
    Job SE = new Job("Software engineer", 50000, p1 );
    Job A = new Job("Architect", 100000);
    System.out.print(SE);
    System.out.print(A);
    SE.setMonthlySalary(50040);
    System.out.print("\nSalary changed!");
    A.setMonthlySalary(13145);
    System.out.print("\nSalary changed!");
    A.setEmployee(p1);
    System.out.print("\nEmployee changed!");
    SE.setEmployee(noOne);
    System.out.print("\nEmployee changed!");
    System.out.print(SE);
    System.out.print(A);
    SE.givePercentRaise(40);
    System.out.print("\nSalary for "+SE.getJobTitle()+" has changed");
    A.givePercentRaise(20);
    System.out.print("\nSalary for "+A.getJobTitle()+" has changed");
    System.out.print(SE);
    System.out.print(A);
  }
}
