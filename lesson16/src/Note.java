public class Note
{
  private String message;
  private boolean highPriority;

  public Note(String message)
  {
    this.message = message;
  }

  public Note(String message, boolean highPriority)
  {
    this.message = message;
    this.highPriority = highPriority;
  }

  public String getMessage()
  {
    return message;
  }

  public void setMessage(String message)
  {
    this.message = message;
  }

  public boolean isHighPriority()
  {
    return highPriority;
  }

  public void setToHighPriority()
  {
    this.highPriority = true;
  }
  public void setToLowPriority()
  {
    this.highPriority = false;
  }
  public Note copy(){
    return new Note(this.message,this.highPriority);
  }

  @Override public String toString()
  {
    if(highPriority){
      return "! "+message;
    }else{
      return message;
    }
  }
}
