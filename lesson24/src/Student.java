import java.io.Serializable;

public class Student implements Serializable
{
  private String firstName;
  private String lastName;
  private String country;

  public Student(String firstName, String lastName, String country)
  {
    this.firstName = firstName;
    this.lastName = lastName;
    this.country = country;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }

  public String getCountry()
  {
    return country;
  }

  public void setCountry(String country)
  {
    this.country = country;
  }

  @Override public String toString()
  {
    return "Name:"+firstName+" "+lastName+" Country:"+country;
  }

  @Override public boolean equals(Object object)
  {
    if (object instanceof Student){
      Student obj = (Student)object;
      return obj.getCountry().equals(country)&&obj.getFirstName().equals(firstName)&&obj.getLastName().equals(lastName);
    } else return false;
  }
  public String toXML(){
    String studentXML = "  <student>\n    <firstname>";
    studentXML +=firstName+"</firstname>\n    <lastname>";
    studentXML +=lastName+"</lastname>\n    <country>";
    studentXML +=country+"</country>\n  </student>\n";
    return  studentXML;
  }

  public static void main(String[] args)
  {
    Student dan = new Student("Daniel", "Railean","Moldova");
    System.out.println(dan.toXML());
  }
}
