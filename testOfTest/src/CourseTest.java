public class CourseTest
{
  public static void main(String[] args)
  {
    Course SDJ = new Course();
    Course RWD = new Course("RWD", 32,true);
    Course MSE = new Course("MSE", false);
    SDJ.setName("SDJ");
    SDJ.setNumberOfStudents(32);
    RWD.setElectiveCourse(false);
    System.out.println(SDJ);
    System.out.println(RWD);
    System.out.println(MSE);

  }
}
