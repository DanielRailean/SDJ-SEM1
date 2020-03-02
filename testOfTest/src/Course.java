public class Course
{
  private String name;
  private boolean electiveCourse;
  private int numberOfStudents;

  public Course(){
    name = "Use \"setName()\" method to set the name of the course";
  }
  public Course(String name, int numberOfStudents, boolean electiveCourse){
    this.name = name;
    this.numberOfStudents = numberOfStudents;
    this.electiveCourse = electiveCourse;
  }
  public Course(String name, boolean electiveCourse){
    this.name = name;
    this.electiveCourse = electiveCourse;
  }

  public int getNumberOfStudents()
  {
    return numberOfStudents;
  }

  public String getName()
  {
    return name;
  }
  public boolean isElectiveCourse(){
    return electiveCourse;
  }

  public void setElectiveCourse(boolean electiveCourse)
  {
    this.electiveCourse = electiveCourse;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setNumberOfStudents(int numberOfStudents)
  {
    this.numberOfStudents = numberOfStudents;
  }

  @Override public String toString()
  {
    return "Course name: "+name+"\nNumber of students: "+numberOfStudents+"\nIs Elective course: " + electiveCourse ;
  }
}
