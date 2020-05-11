public class IllegalGradeException extends RuntimeException
{
  public IllegalGradeException()
  {
    super("Invalid grade");
  }

  public IllegalGradeException(String message)
  {
    super("Invalid grade: "+message);
  }
}
