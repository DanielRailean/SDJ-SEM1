import java.io.*;

public class TestStudentRead
{
  public static void main(String[] args)
  {
    try
    {
      FileInputStream fileIn = new FileInputStream("C:\\Users\\dd\\Desktop\\Student_file.bin");
      ObjectInputStream read = new ObjectInputStream(fileIn);
      while(true){
        try
        {
          Student student =  (Student)read.readObject();
          System.out.println(student);
        }
        catch (EOFException e)
        {
          System.out.println("End of file");
          break;
        }
      }
      read.close();
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
      System.exit(1);
    }
    catch (IOException e){
      System.out.println("Cannot write to file");
      System.exit(1);
    }
    catch (ClassNotFoundException e){
      System.out.println("Class not found");
      System.exit(1);
    }
  }
}
