public class PIValue
{
  public static void main(String[] args)
  {
    double pi, calcpi, multiplier=1;
    boolean sign = false;
    int iterations = 1000000000;
    int value=3;

    while(iterations>0){
      if(sign){
        multiplier+=(1.0/value);
        sign=false;
      }else{
        multiplier-=(1.0/value);
        sign=true;
      }
      value+=2;
      iterations--;
    }
    pi = 4*multiplier;
    System.out.println(pi);
  }
}
