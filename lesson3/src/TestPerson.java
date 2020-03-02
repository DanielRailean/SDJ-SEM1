public class TestPerson
{
  public static void main(String[] args){
    Person Dimitrian = new Person();
    Dimitrian.setAge(21);
    Dimitrian.setName("Dimitrian Cebotaru");
    System.out.print("Name:"+Dimitrian.getName()+ "\n"+"Age:"+Dimitrian.getAge());

    Person person1 = new Person("Daniel Railean", 21);
    System.out.print(person1);

  }
}
