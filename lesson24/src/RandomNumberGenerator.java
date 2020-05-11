import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class RandomNumberGenerator
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    PrintWriter write = null;
    System.out.println("Input number of ints to generate");
    int numberOfInt = keyboard.nextInt();
    try
    {
      FileOutputStream fileIn = new FileOutputStream(
          "C:\\Users\\dd\\Desktop\\random.txt");
      write = new PrintWriter(fileIn);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("file not found");
      System.exit(1);
    }
    System.out.println("Writing data to file");
    for(int i=0;i<numberOfInt;i++){
      int randomNr = (int)(Math.random()*Integer.MAX_VALUE);
      write.println(randomNr);
    }
    write.close();
    System.out.println("File closed");
  }
}
