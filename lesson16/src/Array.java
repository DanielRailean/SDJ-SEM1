import java.util.Scanner;

public class Array
{
  public static void printArray(int[] array){
    System.out.println();
    for(int i =0;i<array.length;i++){
      System.out.print(" "+array[i]);
    }
  }
  public static void printArray(double[] array){
    System.out.println();
    for(int i =0;i<array.length;i++){
      System.out.print(" "+array[i]);
    }
  }
  public static void printArray(String[] array){
    System.out.println();
    for(int i =0;i<array.length;i++){
      System.out.print(" "+array[i]);
    }
  }
  public static void printArray(boolean[] array){
    System.out.println();
    for(int i =0;i<array.length;i++){
      System.out.print(" "+array[i]);
    }
  }
  public static String arrayToString(boolean[] array){
  String arr = "\n";
  for(int i =0;i<array.length;i++){
    arr+=" "+array[i];
  }
  return arr;
}
  public static String arrayToString(int[] array){
    String arr = "\n";
    for(int i =0;i<array.length;i++){
      arr+=" "+array[i];
    }
    return arr;
  }
  public static String arrayToString(double[] array){
    String arr = "\n";
    for(int i =0;i<array.length;i++){
      arr+=" "+array[i];
    }
    return arr;
  }
  public static String arrayToString(String[] array){
    String arr = "\n";
    for(int i =0;i<array.length;i++){
      arr+=" "+array[i];
    }
    return arr;
  }
  public static String arrayToString(Object[] array){
    String arr = "\n";
    for(int i =0;i<array.length;i++){
      arr+=" "+array[i].toString();
    }
    return arr;
  }
  public static void readArray(int[] array){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Input data:");
    for(int i=0;i<array.length;i++){
      System.out.print("a["+i+"]=");
      array[i]=keyboard.nextInt();
    }
  }
  public static void readArray(double[] array){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Input data:");
    for(int i=0;i<array.length;i++){
      System.out.print("a["+i+"]=");
      array[i]=keyboard.nextDouble();
    }
  }
  public static void readArray(String[] array){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Input data:");
    for(int i=0;i<array.length;i++){
      System.out.print("a["+i+"]=");
      array[i]=keyboard.nextLine();
    }
  }
  public static int[] readArray(int len){
    Scanner keyboard = new Scanner(System.in);
    int[] arr = new int[len];
    System.out.println("Input data:");
    for(int i=0;i<len;i++){
      System.out.print("a["+i+"]=");
      arr[i]=keyboard.nextInt();
    }
    return arr;
  }
  public static double[] readArray(double size){
    Scanner keyboard = new Scanner(System.in);
    int len = (int)size;
    double[] arr = new double[len];
    System.out.println("Input data:");
    for(int i=0;i<len;i++){
      System.out.print("a["+i+"]=");
      arr[i]=keyboard.nextInt();
    }
    return arr;
  }
  public static String[] readArray(short len){
    Scanner keyboard = new Scanner(System.in);
    String[] arr = new String[len];
    System.out.println("Input data:");
    for(int i=0;i<len;i++){
      System.out.print("a["+i+"]=");
      arr[i]=keyboard.nextLine();
    }
    return arr;
  }
  public static int[] copyArray(int[] array)
  {
    int[] copy = new int[array.length];
    for (int i = 0; i < array.length; i++)
    {
      copy[i] = array[i];
    }
    return copy;
  }
  public static double[] copyArray(double[] array)
  {
    double[] copy = new double[array.length];
    for (int i = 0; i < array.length; i++)
    {
      copy[i] = array[i];
    }
    return copy;
  }
  public static String[] copyArray(String[] array)
  {
    String [] copy = new String[array.length];
    for (int i = 0; i < array.length; i++)
    {
      copy[i] = array[i];
    }
    return copy;
  }
  public static boolean equals(int[] arr1, int[] arr2){
    boolean isSame = true;
    if(arr1.length!=arr2.length) return false;
    for(int i=0;i<arr1.length;i++){
      if(arr1[i]!=arr2[i]){
        isSame=false;
      }
    }
    return isSame;
  }
  public static boolean equals(double[] arr1, double[] arr2){
    boolean isSame = true;
    if(arr1.length!=arr2.length) return false;
    for(int i=0;i<arr1.length;i++){
      if(arr1[i]!=arr2[i]){
        isSame=false;
      }
    }
    return isSame;
  }
  public static boolean equals(String[] arr1, String[] arr2){
    boolean isSame = true;
    if(arr1.length!=arr2.length) return false;
    for(int i=0;i<arr1.length;i++){
      if(arr1[i]!=arr2[i]){
        isSame=false;
      }
    }
    return isSame;
  }
  public static int[] sum(int[] arr1, int[] arr2){
    if(arr1.length!=arr2.length) return null;
    int[] sumArr = new int[arr1.length];
    for(int i=0;i<arr1.length;i++){
      sumArr[i]=arr1[i]+arr2[i];
    };
    return sumArr;
  }
  public static double average(int[] array){
    int sum = 0;
    int len = array.length;
    for(int i=0;i<len;i++){
      sum+=array[i];
    }
    return (double)sum/len;
  }
  public static double average(double[] array){
    double sum = 0;
    int len = array.length;
    for(int i=0;i<len;i++){
      sum+=array[i];
    }
    return sum/len;
  }
  public static int sum(int[] arr){
    int sum =0;
    int len = arr.length;
    for(int i=0;i<len;i++){
      sum+=arr[i];
    }
    return sum;
  }
  public static double sum(double[] arr){
    double sum =0;
    int len = arr.length;
    for(int i=0;i<len;i++){
      sum+=arr[i];
    }
    return sum;
  }
  public static int nrOfElement(int[] arr,int nr){
    int nrOfElements=0;
    for (int i=0;i<arr.length;i++)
    {
      if(arr[i]==nr){
        nrOfElements++;
      }
    }
    return nrOfElements;
  }
  public static int nrOfElement(double[] arr,double nr){
    int nrOfElements=0;
    for (int i=0;i<arr.length;i++)
    {
      if(arr[i]==nr){
        nrOfElements++;
      }
    }
    return nrOfElements;
  }
  public static double min(double[] arr){
    double min =arr[0];
    for (int i=0;i<arr.length;i++)
    {
      if(arr[i]<min){
        min=arr[i];
      }
    }
    return min;
  }
  public static int min(int[] arr){
    int min =arr[0];
    for (int i=0;i<arr.length;i++)
    {
      if(arr[i]<min){
        min=arr[i];
      }
    }
    return min;
  }
  public static double max(double[] arr){
    double max =arr[0];
    for (int i=0;i<arr.length;i++)
    {
      if(arr[i]>max){
        max=arr[i];
      }
    }
    return max;
  }
  public static int max(int[] arr){
    int max =arr[0];
    for (int i=0;i<arr.length;i++)
    {
      if(arr[i]>max){
        max=arr[i];
      }
    }
    return max;
  }
}
