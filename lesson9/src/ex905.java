import java.util.Scanner;
public class ex905
{
  public static void main(String[] args)
  {
    Scanner keybooard = new Scanner(System.in);
    System.out.println("Input a word/phrase and i will reverse it");
    String input = keybooard.nextLine();
    while(!input.equals("quit")){
      System.out.println("Reversed:");
      for(int i = input.length()-1;i>=0;i--){
        System.out.print(input.charAt(i));
      }
      System.out.println();
      System.out.println("Another word? Type \"quit\" to quit");
      input = keybooard.nextLine();
    }

  }
}
