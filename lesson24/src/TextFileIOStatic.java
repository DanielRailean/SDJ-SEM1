import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class TextFileIOStatic
{
  public static void writeToFile(String fileName, String data){
    try
    {
      FileOutputStream fileOut = new FileOutputStream(fileName);
      PrintWriter write = new PrintWriter(fileOut);
      write.println(data);
      write.close();
      System.out.println("Done writing to file "+fileName);
    }catch (FileNotFoundException e)
    {
      System.out.println("File "+fileName+" not found");
      System.exit(1);
    }

  }
  public static void appendToFile(String fileName, String data){
    try
    {
      FileOutputStream fileOut = new FileOutputStream(fileName, true);
      PrintWriter write = new PrintWriter(fileOut);
      write.println(data);
      write.close();
      System.out.println("Done appending text to file "+fileName);
    }catch (FileNotFoundException e)
    {
      System.out.println("File "+fileName+" not found");
      System.exit(1);
    }

  }
  public static void writeToFile(String fileName,String[] strings){
    try
    {
      FileOutputStream fileOut = new FileOutputStream(fileName);
      PrintWriter write = new PrintWriter(fileOut);
      for(int i=0;i<strings.length;i++){
        if(strings[i]!=null){
          write.println(strings[i]);
        }
      };
      write.close();
      System.out.println("Done appending text array to file "+fileName);
    }catch (FileNotFoundException e)
    {
      System.out.println("File "+fileName+" not found");
      System.exit(1);
    }

  }
  public static void appendToFile(String fileName,String[] strings){
    try
    {
      FileOutputStream fileOut = new FileOutputStream(fileName,true);
      PrintWriter write = new PrintWriter(fileOut);
      for(int i=0;i<strings.length;i++){
        if(strings[i]!=null){
          write.println(strings[i]);
        }
      };
      write.close();
      System.out.println("Done appending text array to file "+fileName);
    }catch (FileNotFoundException e)
    {
      System.out.println("File "+fileName+" not found");
      System.exit(1);
    }

  }
  public static String readStringFromFile(String filename){
    Scanner read = null;
    String response = "";
    try
    {
      FileInputStream fileIn = new FileInputStream(filename);
      read = new Scanner(fileIn);
      while (read.hasNext())
      {
        response += read.nextLine()+"\n";
      }
      read.close();
      System.out.println("Done reading file " + filename + " to string");
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
      System.exit(1);
    }
    return response;
  };
  public static String[] readArrayFromFile(String filename){
    Scanner read = null;
    String arr[] = new String[getNumberOfLines(filename)];
    try
    {
      FileInputStream fileIn = new FileInputStream(filename);
      read = new Scanner(fileIn);
      int pos =0;
      while (read.hasNext())
      {
        arr[pos] = read.nextLine();
        pos ++;
      }
      read.close();
      System.out.println("Done reading file " + filename + " to string");
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
      System.exit(1);
    }
    return arr;
  };
  public static int getNumberOfLines(String filename){
    int numberOfLines =0;
    try
    {
      FileInputStream fileIn = new FileInputStream(filename);
      Scanner read = new Scanner(fileIn);
      while(read.hasNext()){
        read.nextLine();
        numberOfLines++;
      }
      read.close();
    }catch (FileNotFoundException e)
    {
      System.out.println("File "+filename+" not found");
      System.exit(1);
    }
    return numberOfLines;
  };
}
