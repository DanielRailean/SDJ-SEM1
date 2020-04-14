public class ex152
{
  public static void main(String[] args)
  {
    int[] source = {1, 2, 3, 4};
    int[] copy = Array.copyArray(source);
    int[] arr = Array.readArray(2);
    Array.printArray(source);
    Array.printArray(copy);
    Array.printArray(arr);
    System.out.println("\n"+Array.equals(source,copy));
    int[] sum = Array.sum(source,copy);
    Array.printArray(sum);
    System.out.println(Array.average(source));
  }
}
