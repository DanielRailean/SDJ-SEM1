public class ex157
{
  public static void main(String[] args)
  {
    int[] arr = { 3, 5, 1, 3, 3, 2, 4, 2, 3};
    System.out.println("Number of hits: "+Array.sum(arr));
    System.out.println("Average hits: "+Array.average(arr));
    System.out.println("One hits number: "+Array.nrOfElement(arr,1));
  }
}
