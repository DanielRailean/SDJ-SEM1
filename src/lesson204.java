import java.util.Scanner;
public class lesson204
{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String name;
    String adressUser;
    int age;
    System.out.print("Input your name please: \n");
    name = input.nextLine();
    System.out.print("Input your AGE please: \n");
    age = input.nextInt();
    System.out.print("Input your adress please: \n");
    input.nextLine();
    adressUser = input.nextLine();
    System.out.print("Hello "+ name+ "\n");
    System.out.print("I am also "+ age + " years!\n");
  System.out.print("I live next to the  "+ adressUser + " street\n");
  }
}
