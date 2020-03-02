public class Employee
{
  private String name;
  private int idNumber;
  private String department;
  private String position;

  public void setName(String n){
    name = n;
  };
  public void setIdNumber(int nr){
    idNumber = nr;
  };
  public void setDepartment(String dep){
    department = dep;
  };
  public void setPosition(String pos){
    position = pos;
  };
  public String getName(){
    return name;
  }
  public int getIdNumber(){
    return idNumber;
  }
  public String getDepartment(){
    return department;
  }
  public String getPosition(){
    return position;
  }

}
