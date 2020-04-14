public class Person
{
  private String name, address;
  private MyDate birthday;

  public Person(String name, String address, MyDate birthday)
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

  public String getAddress()
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

  public void setAddress(String address)
  {
    this.address = address;
  }
  public int getAge(){
    int age = MyDate.today().getYear()-birthday.getYear();
    if(birthday.getMonth()>MyDate.today().getMonth()||(birthday.getMonth()==MyDate.today().getMonth()&&birthday.getDay()>MyDate.today().getDay())){
      return age-1;
    }else{
      return age;
    }
  }

  @Override public String toString()
  {
    return "Name:"+name+"\nAge:"+getAge()+"\nAddress:"+address;
  }
  public boolean equals(Object object){
    if (object instanceof Person){
      Person obj = (Person)object;
      return obj.getName().equals(name)&&obj.getAddress().equals(address)&&obj.getBirthday().equals(birthday);
    }else{
      return false;
    }
  }

  public static void main(String[] args)
  {
    Person p1 = new Person("Daniel","Strandgade",new MyDate(17,3,2000));
    System.out.println(p1);
  }
}
