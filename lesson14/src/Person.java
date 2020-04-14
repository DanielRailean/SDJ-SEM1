
public class Person
{
  private String name;
  private Address address;
  private MyDate birthday;
  private Brain brain = new Brain(3);

  public Person(String name, Address address, MyDate birthday)
  {
    this.name = name;
    this.address = address;
    this.birthday = birthday;
  }

  public Person(MyDate birthday)
  {
    this.birthday = birthday;
  }

  public Person(String name, MyDate birthday)
  {
    this.name = name;
    this.birthday = birthday;
  }

  public String getName()
  {
    return name;
  }

  public Address getAddress()
  {
    return address;
  }

  public MyDate getBirthday()
  {
    return birthday;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setAddress(Address address)
  {
    this.address = address;
  }

  public int getAge()
  {
    int age = MyDate.today().getYear() - birthday.getYear();
    if (birthday.getMonth() > MyDate.today().getMonth() || (
        birthday.getMonth() == MyDate.today().getMonth()
            && birthday.getDay() > MyDate.today().getDay()))
    {
      return age - 1;
    }
    else
    {
      return age;
    }
  }

  @Override public String toString()
  {
    return "Name:" + name + "\nAge:" + getAge() + "\nAddress:\n" + address
        + "\nIQ:" + getIQ() +"\n"+ brain.toString();
  }

  public boolean equals(Object object)
  {
    if (object instanceof Person)
    {
      Person obj = (Person) object;
      return obj.getName().equals(name) && obj.getAddress().equals(address)
          && obj.getBirthday().equals(birthday);
    }
    else
    {
      return false;
    }
  }

  public int getIQ()
  {
    return brain.getIQ();
  }

  public boolean isBrainDamaged()
  {
    return brain.isBrainDamaged();
  }

  public boolean doYouRemember(String topic)
  {
    return brain.recall(topic);
  }

  public void rememberThis(String topic)
  {
    if (brain.recall(topic))
    {
      brain.refreshMemory(topic);
    }
    else
    {
      brain.remember(topic);
    }
  }

  public String whatAreYouThinkingAbout()
  {
    return brain.recall();
  }
  public String getShortAddress(){
    return "Street: "+address.getStreet()+" "+address.getNumber();
  }
  public static void main(String[] args)
  {
    Address adr1 = new Address("Strandgade","22","8700", "Horsens","DK");
    Person p1 = new Person("Daniel", adr1, new MyDate(27,9, 2000));

    System.out.println(p1.doYouRemember("Olga"));
    p1.rememberThis("Olga");
    System.out.println(p1.doYouRemember("Olga"));
    System.out.println(p1.isBrainDamaged());
    p1.rememberThis("Den");
    p1.rememberThis("CS");
    System.out.println(p1.doYouRemember("Olga"));
    System.out.println(p1);
    p1.rememberThis("Olga");
    System.out.println(p1.whatAreYouThinkingAbout());
    System.out.println(p1);

  }

}
