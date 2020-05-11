import java.io.*;

public class TestStudentWrite
{
  public static void main(String[] args)
  {
    Student std = new Student("Daniel","Railean","Moldova");
    try
    {
      FileOutputStream fileOut = new FileOutputStream(
          "C:\\Users\\dd\\Desktop\\Student_file.bin");
      ObjectOutputStream write = new ObjectOutputStream(fileOut);
      write.writeObject(std);
      write.writeObject(new Student("Dimitrian", "Cebotaru","Moldova"));
      write.close();
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found!");
      System.exit(1);
    }
    catch (IOException e){
      System.out.println("Cannot write to file");
      System.exit(1);
    }
    System.out.println("Done writing");

  }
}
