public class Student
{
  private String name;
  private char gender;
  private int studentID;

  public Student(String name, char gender, int studentID){
    this.name = name;
    this.gender = gender;
    this.studentID = studentID;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setGender(char gender){
    this.gender = gender;
  }
  public void setStudentID(int studentID){
    this.studentID = studentID;
  }
  public String getName(){
    return name;
  }
  public char getGender(){
    return gender;
  }
  public int getStudentID(){
    return studentID;
  }
  public String toString(){
    return "\n"+name+","+"'"+gender+"',"+studentID;
  }
}
