import java.util.Scanner;
public class lesson606
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Input your a , b and c, where ax^2 + bx + c = 0");
    int a = keyboard.nextInt();
    int b = keyboard.nextInt();
    int c = keyboard.nextInt();
    int det = b*b-(4*a*c);
    double res1,res2;
    if(det>0){
      res1 = ((b*-1)+Math.sqrt(det))/(2*a);
      res2 = ((b*-1)-Math.sqrt(det))/(2*a);
      System.out.println("The responses are :"+res1+" , " +res2);
    }else if(det ==0){
      res1 = (b*-1)/(2*a);
      System.out.println("The response is :"+res1);
    }
    else{
      System.out.println("No real answers!");
    }
  }
}
