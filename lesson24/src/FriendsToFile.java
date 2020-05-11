import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.PrintWriter;
public class FriendsToFile
{
  public static void main(String[] args)
  {
    PrintWriter write = null;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Input file Name");
    String filename = keyboard.nextLine();
    try
    {
      FileOutputStream fileIn = new FileOutputStream("C:\\Users\\dd\\Desktop\\"+filename);
      write = new PrintWriter(fileIn);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
      System.exit(1);
    }
  System.out.println("Writing data to file");
    boolean isFinished = false;
    while(!isFinished){
      String name = keyboard.nextLine();
      if(name.equals("DONE")){
        isFinished = true;
        write.close();
        System.out.println("Done writing");
      }else{
        write.println(name);
      }
    }
  }
}
