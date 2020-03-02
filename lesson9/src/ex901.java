import java.util.Scanner;
public class ex901
{
  public static void main(String[] args)
  {
    Scanner keybooard = new Scanner(System.in);
    System.out.println("Input an int and i will count to it");
    int max = keybooard.nextInt();
    System.out.print("n=");
    for(int i = 1; i<=max; i++){
      if(i==1){ System.out.print(i);
      }else{
      System.out.print(","+i);}
    }
    System.out.println();
    System.out.print("n*2=");
    for(int i = 1; i<=max; i++){
      if(i==1){ System.out.print(i*2);
      }else{
      System.out.print(","+(i*2));}
    }
    System.out.println();
    System.out.print("n^2=");
    for(int i = 1; i<=max; i++){
      if(i==1){ System.out.print(i*i);
      }else{
        System.out.print(","+(i*i));}
    }
  }
}
