public class Element
{
  private String content;
  private String name;
  private String attribute;

  public String getContent()
  {
    return content;
  }

  public void setContent(String content)
  {
    this.content = content;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public Element(String content, String name, String attribute)
  {
    this.content = content;
    this.name = name;
    this.attribute = attribute;
  }

  public Element(String content, String name)
  {
    this.content = content;
    this.name = name;
  }

  public String getAttribute()
  {
    return attribute;
  }

  public void setAttribute(String attribute)
  {
    this.attribute = attribute;
  }
  public String text(){
    return "<"+name+">"+content+"</"+name+">\n";
  }
}
