package mseProg1.findmax2;

public class FindMax2
{
  public int findMax2(int[] input) {
    // TODO implement method
    int max = input[0];
    for(int i = 0; i<input.length;i++){
      if(input[i]>max){
        max = input[i];
      }
    }
    return max;
  }
}
