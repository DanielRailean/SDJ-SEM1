public class EmployeeTest
{
  public static void main(String[] args){
    Employee emp1 = new Employee();
    Employee emp2 = new Employee();
    Employee emp3 = new Employee();
    emp1.setName("Allan");
    emp1.setDepartment("SE");
    emp1.setIdNumber(29131);
    emp1.setPosition("SDJ PROFESSOR");
    emp2.setName("IOOD");
    emp2.setDepartment("SE");
    emp2.setIdNumber(21331);
    emp2.setPosition("MSE PROFESSOR");
    emp3.setName("Lina");
    emp3.setDepartment("SE");
    emp3.setIdNumber(22311);
    emp3.setPosition("RWD PROFESSOR");
    System.out.print("Name     ID Number     Department     Position\n----------------------------------------------\n");
    System.out.print(emp1.getName()+"     "+emp1.getIdNumber()+"        "+emp1.getDepartment()+"          "+emp1.getPosition()+"\n");
    System.out.print(emp2.getName()+"      "+emp2.getIdNumber()+"        "+emp2.getDepartment()+"          "+emp2.getPosition()+"\n");
    System.out.print(emp3.getName()+"      "+emp3.getIdNumber()+"        "+emp3.getDepartment()+"          "+emp3.getPosition()+"\n");

  }
}
