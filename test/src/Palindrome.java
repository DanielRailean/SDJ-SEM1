import java.util.Scanner;
public class Palindrome
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Input a word!");
    String word = keyboard.nextLine();
    boolean isPolindrome = true;
    for(int i=0; i<word.length()/2;i++)
    {
      if(word.charAt(i)!=word.charAt(word.length()-i-1)){
       isPolindrome=false;
      }
    }
    if(isPolindrome){
      System.out.println("Palindrome");
    }else{
      System.out.println("Not palindrome");
    }
  }
}
