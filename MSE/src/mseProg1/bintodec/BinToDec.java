package mseProg1.bintodec;

import java.util.Scanner;

public class BinToDec
{
  public static int binToDecimal(int[] input)
  {
    // We initialise an output as an integer
    int result = 0;

    if(input.length==0){
      return 0;
    }else{
      int len = input.length-1;
      for(int i=0; i<len;i++){
        if(input[i]==1){
          result+=Math.pow(2,len-i);
        }
      }
      if(input[input.length-1]==1){
        result+=1;
      }
    }
    return result;
  }
  public static void main(String[] args)
  {

      while (true)
      {
        System.out.println("Type input:");
        Scanner in = new Scanner(System.in);
        String read = in.nextLine();

        int[] input = new int[read.length()];
        for (int i = 0; i < read.length(); i++)
        {
          input[i] = Integer.parseInt(""+ read.charAt(i));
        }

        System.out.println(binToDecimal(input));
        System.out.println();
      }

  }
}
