import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
public class FileIOStatic
{
  public static void writeToFile(String filename,Object obj){
    try
    {
      FileOutputStream fileIn = new FileOutputStream(filename);
      ObjectOutputStream write = new ObjectOutputStream(fileIn);
      write.writeObject(obj);
      write.close();
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File "+filename+" not found");
      System.exit(1);
    }
    catch (IOException e){
      System.out.println("Cannot write object to file "+ filename);
      System.exit(1);
    }
    System.out.println("Done writing object to " + filename);
  }
  public static void writeToFile(String filename,Object[] obj){
    try
    {
      FileOutputStream fileIn = new FileOutputStream(filename);
      ObjectOutputStream write = new ObjectOutputStream(fileIn);
      for(int i=0;i<obj.length;i++){
        write.writeObject(obj[i]);
      }
      write.close();
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File "+filename+" not found");
      System.exit(1);
    }
    catch (IOException e){
      System.out.println("Cannot write array of objects to file "+ filename);
      System.exit(1);
    }
    System.out.println("Done writing objects array to " + filename);
  }
  public static Object readObjectFromFile(String filename){
    Object returned =null;
    try
    {
      FileInputStream fileIn = new FileInputStream(filename);
      ObjectInputStream read = new ObjectInputStream(fileIn);
      while(true){
        try
        {
          returned = read.readObject();
        }catch (EOFException e)
        {
          System.out.println("End of file"+ filename);
          break;
        }
      }
      read.close();
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File "+filename +" not found");
      System.exit(1);
    }
    catch (IOException e){
      System.out.println("Cannot write to "+ filename);
      System.exit(1);
    }
    catch (ClassNotFoundException e){
      System.out.println("Class not found");
      System.exit(1);
    }
    return returned;
  }
  public static int getNumberOfObjects(String filename){
    int objectsNr=0;
    try
    {
      FileInputStream fileIn = new FileInputStream(filename);
      ObjectInputStream read = new ObjectInputStream(fileIn);
      while(true){
        try
        {
          read.readObject();
          objectsNr++;
        }catch (EOFException e)
        {
          break;
        }
      }
      read.close();
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File "+filename +" not found");
      System.exit(1);
    }
    catch (IOException e){
      System.out.println("Cannot write to "+ filename);
      System.exit(1);
    }
    catch (ClassNotFoundException e){
      System.out.println("Class not found");
      System.exit(1);
    }
    return objectsNr;
  };
  public static Object[] readArrayFromFile(String filename){
    Object[] returned =new Object[getNumberOfObjects(filename)];
    try
    {
      FileInputStream fileIn = new FileInputStream(filename);
      ObjectInputStream read = new ObjectInputStream(fileIn);
      int position =0;
      while(true){
        try
        {
          returned[position] = read.readObject();
          position++;
        }catch (EOFException e)
        {
          System.out.println("End of file "+ filename);
          break;
        }
      }
      read.close();
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File "+filename +" not found");
      System.exit(1);
    }
    catch (IOException e){
      System.out.println("Cannot write to "+ filename);
      System.exit(1);
    }
    catch (ClassNotFoundException e){
      System.out.println("Class not found");
      System.exit(1);
    }
    return returned;
  }
}
