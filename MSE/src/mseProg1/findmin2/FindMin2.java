package mseProg1.findmin2;

public class FindMin2
{
  public int findMin2(int[] input) {
    // TODO implement method
    int min = input[0];
    for(int i = 0; i<input.length;i++){
      if(input[i]<min){
        min= input[i];
      }
    }
    return min;
  }
}
