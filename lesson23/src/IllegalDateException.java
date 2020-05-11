public class IllegalDateException extends RuntimeException
{
  public IllegalDateException()
  {
    super("Illegal date");
  }

  public IllegalDateException(String message)
  {
    super("Illegal date "+ message);
  }
}
