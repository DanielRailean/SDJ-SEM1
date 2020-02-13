import java.util.Scanner;
public class lesson206
{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String name, age, city, college, profession, animal, petName ;
    System.out.print("Input your name:\n");
    name = input.nextLine();
    System.out.print("Input your age:\n");
    age = input.nextLine();
    System.out.print("Input your city:\n");
    city = input.nextLine();
    System.out.print("Input your college:\n");
    college = input.nextLine();
    System.out.print("Input your profession:\n");
    profession = input.nextLine();
    System.out.print("Input your pet type:\n");
    animal = input.nextLine();
    System.out.print("Input your pet name:\n");
    petName = input.nextLine();
    System.out.print("There once was a person named "+ name+
        " who lived in "+city+" . At the age of "+age+" , name went to college at "+college+". name gradulated and went to work as a "
        +profession+" . Then , "+name+
        ", adopted a(n) "+animal+" named "+petName+". They both lived happily ever after!");
}
}
