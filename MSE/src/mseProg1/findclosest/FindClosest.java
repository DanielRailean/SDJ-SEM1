package mseProg1.findclosest;

public class FindClosest
{
  public int findClosest(int[] input) {
    // TODO implement method
    int diff= Math.abs(input[0]-input[1]);
//    int diff = Math.abs(input[0]-input[1]);
//    for(int i = 1; i<input.length;i++){
//      if(Math.abs(input[i-1]-input[i])<diff){
//        diff= Math.abs(input[i-1]-input[i]);
//      }
//    }
    for(int i=0;i<input.length;i++){
      for(int j=0;j<input.length;j++){
        if(i!=j){
          if(Math.abs(input[i]-input[j])<diff){
            diff= Math.abs(input[i]-input[j]);
          }
        }
      }
    }
    return diff;
  }
}