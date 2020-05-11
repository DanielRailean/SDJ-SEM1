public class SupraElement
{
  private String root;
  private Element[] elements = new Element[3];

  public SupraElement(String root)
  {
    this.root = root;
  }

  public SupraElement(String root, Element[] elements)
  {
    this.root = root;
    this.elements = elements;
  }

  public String getRoot()
  {
    return root;
  }

  public void setRoot(String root)
  {
    this.root = root;
  }

  public void addElement(Element element){
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
    returnedValue +="</"+root+">\n";
    return returnedValue;
  }
  public Element getElement(int index){
    return elements[index];
  }
  public SupraElement copy(){
    return new SupraElement(root,elements);
  }
}
