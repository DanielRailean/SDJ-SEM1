public class ChessGame
{
  public static void main(String[] args)
  {
    int powNumber =0;
    int powSum = 0;
    double grainNumber = 1;
    double grainSum =0;
    for(int i=1; i<64; i++){
      grainNumber*=2;
      System.out.println("Grain number: "+grainNumber+" to the power of "+powNumber);
      if(grainNumber>10){
        grainNumber/=10;
        powNumber++;
      }
      grainSum = grainSum+grainNumber;
      if(grainSum>10){
        grainSum/=10;
        powSum++;
      }
    }
      System.out.println("Grain sum:    "+grainSum+" to the power of "+powSum);
  }
}
