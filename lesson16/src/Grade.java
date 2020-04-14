public class Grade
{
  private String courseName;
  private int grade;

  public String getCourseName()
  {
    return courseName;
  }

  public void setCourseName(String courseName)
  {
    this.courseName = courseName;
  }

  public int getGrade()
  {
    return grade;
  }

  public void setGrade(int grade)
  {
    this.grade = grade;
  }

  public Grade(String courseName, int grade)
  {
    this.courseName = courseName;
    this.grade = grade;
  }

  @Override public String toString()
  {
    return "Course Name: "+courseName+" Grade: "+grade;
  }
  public boolean equals(Object object){
    if(object instanceof Grade){
      Grade obj = (Grade)object;
      return obj.getGrade()==grade&&obj.getCourseName().equals(courseName);
    }else return false;
  }
}
