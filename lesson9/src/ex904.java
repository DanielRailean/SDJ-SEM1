public class ex904
{
  public static void main(String[] args)
  {
    int last,curr,temp;
    last = 1;
    curr = 1;
    System.out.println("Fibonacci(1) = "+curr);
    System.out.println("Fibonacci(2) = "+curr);
    for(int i =0;i<19; i++){
      temp = last+curr;
      last = curr;
      curr = temp;
      System.out.println("Fibonacci("+(i+2)+") = "+curr);
    }
  }
}
