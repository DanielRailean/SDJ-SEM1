package mseProg1.dectobin;
import java.util.Scanner;
public class DecToBin
{
  public static String decToBinary(int n)

  {
    // We initialise an output as a string
    String binaryNum = "";
    int repeat =0;
    while(n>=Math.pow(2,repeat)){
      repeat++;
    }
    // We throw an exception if there is an illegal input
    if(n<0) throw new IllegalArgumentException();

    for(int i = repeat-1; i>=0;i--){
      if((n&(1<<i))>0){
        binaryNum+="1";
      }else{
        binaryNum+="0";
      }
    }
    return binaryNum;
  }
  public static void main(String[] args)
  {
    while (true)
    {
      System.out.println("Type input:");
      Scanner in = new Scanner(System.in);
      int read = in.nextInt();
      System.out.println(decToBinary(read));
      System.out.println();
    }
  }
}

