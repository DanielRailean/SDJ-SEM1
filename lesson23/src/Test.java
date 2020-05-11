public class Test
{
  public static void main(String[] args)
  {
    try
    {
      Student den = new Student("Daniel", 10);
      System.out.println(den);
      den.setGrade(3);
    }catch (IllegalGradeException e)
    {
      System.out.println(e.getMessage());
    }
    try
    {
      MyDate bthd= new MyDate(1,12,2000);
      System.out.println(bthd);
    }
    catch (IllegalDateException e)
    {
      System.out.println(e.getMessage());
    }

  }
}
