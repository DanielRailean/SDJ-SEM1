import java.util.Scanner;
public class decimalToRoman
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Input a number to be transformed to Roman numerals");
    int nr = keyboard.nextInt();
    String result = "";
    while(nr>=1000){
      result+="M";
      nr-=1000;
    }
    while(nr>=500){
      result+="D";
      nr-=500;
    }
    while(nr>=100){
      result+="C";
      nr-=100;
    }
    while(nr>=50){
      result+="L";
      nr-=50;
    }
    while(nr>=10){
      result+="X";
      nr-=10;
    }
    while(nr>=5){
      result+="V";
      nr-=5;
    }
    while(nr>=1){
      result+="I";
      nr-=1;
    }

    System.out.println(result);
  }
}
