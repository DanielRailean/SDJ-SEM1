import java.util.Scanner;
public class lesson205
{
  public static void main(String[] args){
    int arrStri[] = new int[3];
    double avg =0;
    Scanner input = new Scanner(System.in);
    System.out.print("Input three numbers:\n");
    for (int i = 0; i<3 ; i++){
      System.out.print("NR"+(i+1) +"=");
      arrStri[i] = input.nextInt();
      avg = avg +arrStri[i];
    }
    avg = avg / 3;
    System.out.print("Average is:"+avg+"\n");
    for (int i = 0; i<3 ; i++){
      System.out.print("NR"+(i+1) +":");
      System.out.print(arrStri[i]+" ");
    }
  }
}
