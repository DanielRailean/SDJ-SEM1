import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class HTMLProcess
{
  public static void main(String[] args)
  {
    String title = "StudentList";
    String header = "Student List";
    String paragraph1 = "This is student list exemple";
    String tableHeader1 = "Name";
    String tableHeader2 = "Country";
    PrintWriter write = null;
    Scanner read = null;
    ArrayList<String> htmlArray = new ArrayList<String>(10);
    StudentList list = new StudentList();
    list.getArray().add(new Student("Daniel","Railean","Denmark"));
    list.getArray().add(new Student("Dimitrian","Cebotaru","Romania"));
    list.getArray().add(new Student("Olga","Sciuchin","Denmark"));
    list.getArray().add(new Student("Adina","Cojocaru","United Kingdom"));
    list.getArray().add(new Student("Victor","Samotil","Moldova"));
    try
    {
      FileInputStream fileIn = new FileInputStream("c:/Users/dd/Desktop/html/input.html");
      read = new Scanner(fileIn);
      while(read.hasNext()){
        htmlArray.add(read.nextLine());
      }
    }
    catch (FileNotFoundException e)
    {
      System.out.println("File not found");
      System.exit(1);
    }
    read.close();
    System.out.println("Done reading");
    for(int i=0;i<htmlArray.size();i++){
      if(htmlArray.get(i).contains("$title")){
        htmlArray.set(i,htmlArray.get(i).replace("$title",title));
      }
      if(htmlArray.get(i).contains("$header")){
        htmlArray.set(i,htmlArray.get(i).replace("$header",header));
      }
      if(htmlArray.get(i).contains("$paragraph1")){
      htmlArray.set(i,htmlArray.get(i).replace("$paragraph1",paragraph1));
      }
      if(htmlArray.get(i).contains("$tableHeader1")){
        htmlArray.set(i,htmlArray.get(i).replace("$tableHeader1",tableHeader1));
      }
      if(htmlArray.get(i).contains("$tableHeader2")){
        htmlArray.set(i,htmlArray.get(i).replace("$tableHeader2",tableHeader2));
      }
      if(htmlArray.get(i).contains("$tableData1")){
        int position = i;
        String output ="";
        for(int j=0;j<list.getArray().size();j++){
          output += htmlArray.get(position).replace("$tableData1",list.getArray().get(j).getFirstName()+" "+list.getArray().get(j).getLastName());
          output = output.replace("$tableData2",list.getArray().get(j).getCountry());
          output +="\n";
        }
        htmlArray.set(i,output);
        }
    }
    try
    {
      System.out.println("Start writing");
      FileOutputStream fileOut = new FileOutputStream("c:/users/dd/desktop/html/output.html");
      write = new PrintWriter(fileOut);
    }catch (FileNotFoundException e){
      System.out.println("Output file not found");
      System.exit(1);
    }
    for(int i=0;i<htmlArray.size();i++){
      write.println(htmlArray.get(i));
    }
    write.close();
    System.out.println("Done writing");
  }
}
