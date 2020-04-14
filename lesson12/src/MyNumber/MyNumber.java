package MyNumber;

public class MyNumber
{
  private int number;
  public MyNumber(int number){
    this.number = number;
  }

  public int getNumber()
  {
    return number;
  }
  public int getLastDigit(){
    return number%10;
  }
  public int getFirstDigit(){
    int local = number;
    while(local >100){
      local/=10;
    }
    return local/10;
  }
  public boolean isDivisibleBy(int anotherInt){
    return number%anotherInt==0;
  }
  public int numberOfProperDivisors(){
    if(number<0){
      return 0;
    }
    int nr=0;
    for(int i =1 ; i<number;i++){
      if(isDivisibleBy(i)){
        nr++;
      }
    }
    return nr;
  }
  public boolean isPrime(){
    return numberOfProperDivisors()==1;
  }
  public String toString(){
    if(isPrime()){
      return number+" (prime)";
    }else{
      return number+"";
    }
  }
  public MyNumber plus(MyNumber anotherNumber){
    if(anotherNumber==null){
      return new MyNumber(number);
    }else {
      return new MyNumber(number+anotherNumber.getNumber());
    }
  }
  public boolean isPerfectNumber(){
    int divSum=0;//divisiors sum
    for(int i =1; i<number;i++){
      if(isDivisibleBy(i)){
        divSum+=i;
      }
    }
    return divSum==number;
  };
  public static void main(String[] args)
  {
    MyNumber nr1 = new MyNumber(28);
    System.out.println(nr1.getLastDigit());
    System.out.println(nr1.getFirstDigit());
    System.out.println(nr1.numberOfProperDivisors());
    System.out.println(nr1.isPrime());
    System.out.println(nr1);
    System.out.println(nr1.isPerfectNumber());
  }

}
