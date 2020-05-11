import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileOutputStream;
public class StudentList
{
  ArrayList<Student> array= new ArrayList<Student>(5);

  public ArrayList<Student> getArray()
  {
    return array;
  }

  public void setArray(ArrayList<Student> array)
  {
    this.array = array;
  }
  public void generateXMLFile(){
    PrintWriter write = null;
    try
    {
      FileOutputStream fileOut = new FileOutputStream("C:\\Users\\dd\\Desktop\\student.xml");
      write = new PrintWriter(fileOut);
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
      System.exit(1);
    }
    String XMLdata = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<students>\n";
    for(int i=0;i<array.size();i++){
      XMLdata+= array.get(i).toXML();
    }
    System.out.println("Writing data to file");
    XMLdata +="</students>\n";
    write.print(XMLdata);
    write.close();
    System.out.println("Done writing");
  }

  public static void main(String[] args)
  {
    StudentList list = new StudentList();
    list.getArray().add(new Student("Daniel","RAILEAN","DENMARK"));
    list.getArray().add(new Student("Dimitrian","Cebotaru","DENMARK"));
    list.getArray().add(new Student("Daniel","Moscaliciuc","DENMARK"));
    list.generateXMLFile();
  }
}
