public class Student
{
  private String name;
  private int grade;

  public Student(String name, int grade)
  {
    this.name = name;
    if(grade!=-3&&grade!=0&&grade!=2&&grade!=4&&grade!=7&&grade!=10&&grade!=12)
    {
      throw new IllegalGradeException("Not in range");
    }
    this.grade = grade;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public int getGrade()
  {
    return grade;
  }

  public void setGrade(int grade)
  {
    if(grade!=-3&&grade!=0&&grade!=2&&grade!=4&&grade!=7&&grade!=10&&grade!=12)

    {
      throw new IllegalGradeException("Not in range");
    }
    this.grade = grade;
  }

  @Override public String toString()
  {
    return "Name:"+name+" Grade:"+grade;
  }

}
