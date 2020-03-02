import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class testBinary
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("input a number!");
    int nr = keyboard.nextInt();
    String result = "";
    for (int i = 0; i< 31 ; i++){
      if ((nr&(1<<i))>0){     result+=" 1";
      } else {
        result+=" 0";

      }
    }
    StringBuilder input1 = new StringBuilder(result);
    input1.reverse();
    System.out.println(input1);
  }
}
