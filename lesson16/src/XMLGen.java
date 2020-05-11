public class XMLGen
{
  private String version="1.0";
  private String encoding="UTF-8";
  private String root;
  private SupraElement[] elements;

  public XMLGen(String root)
  {
    this.root = root;
    elements = new SupraElement[20];
  }


  public String getVersion()
  {
    return version;
  }

  public void setVersion(String version)
  {
    this.version = version;
  }

  public String getEncoding()
  {
    return encoding;
  }

  public void setEncoding(String encoding)
  {
    this.encoding = encoding;
  }

  public String getRoot()
  {
    return root;
  }

  public void setRoot(String root)
  {
    this.root = root;
  }
  public void addElement(SupraElement element){
    int currentPosition =0;
    while(elements[currentPosition]!=null){
      currentPosition++;
    }
    elements[currentPosition]=element;
  }
  public String text(){
    String returnedValue="";
    returnedValue+= "<"+root+">\n";
    for(int i=0;i<elements.length;i++){
      if(elements[i]!=null){
        returnedValue+=elements[i].text();
      }
    }
    returnedValue +="</"+root+">";
    return returnedValue;
  }

  public static void main(String[] args)
  {
    XMLGen harry = new XMLGen("harrybook");
    Element author = new Element("J. K. Rowling","author");
    Element title = new Element("The Philosopher's Stone","title");
    Element year = new Element("1997","year");
    SupraElement book = new SupraElement("book");
    book.addElement(author);
    book.addElement(title);
    book.addElement(year);
    harry.addElement(book);
    harry.addElement(book);
    harry.addElement(book);
    harry.addElement(book);
    harry.addElement(book);
    harry.addElement(book);
    harry.addElement(book);
    harry.addElement(book);
    System.out.println(harry.text());
  }
}
