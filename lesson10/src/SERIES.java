public class SERIES
{
  public static void main(String[] args)
  {
    int i=1;
    int j=30;
    double total=0;
    while(j>0){
      total+=(i*1.0/j);
      System.out.println(total);
      i++;
      j--;
    }
    System.out.println(total);
  }
}
