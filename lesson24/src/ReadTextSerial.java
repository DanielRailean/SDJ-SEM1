import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadTextSerial
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    Scanner read = null;
    System.out.println("Input file name to read:");
    String filename = keyboard.nextLine();
    try
    {
      FileInputStream fileIn = new FileInputStream("C:\\Users\\dd\\Desktop\\" + filename);
      read = new Scanner(fileIn);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found!");
      System.exit(1);
    }
    System.out.println("Text in file:");
    while(read.hasNext()){
      System.out.println(read.nextLine());
    }
    read.close();
  }
}
