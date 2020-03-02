public class Person
{
    private String name;
    private int age;

    public Person(String name, int age){
      this.name = name;
      this.age = age;
      }
      public Person(){
      this.name = "";
      this.age = 0;
      }

      public void setName(String n){
      name =n;
    }
    public void setAge(int a){
      age = a;
    }
    public int getAge(){
      return age;
    }
    public String getName(){
        return name;
    }
    public String toString(){
      return "\nName: "+name+"\nAge: "+age;
    }

}
