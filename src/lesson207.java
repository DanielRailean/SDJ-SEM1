import java.util.Scanner;
public class lesson207
{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double priceStockBought,commisionBoughtStock, priceStockSold, commisionSoldStock, salesProfit;
    System.out.print("Input number of stock you bought, price per each stock and broker commision:\n");
    System.out.print("Number of stock purchaised:\n");
    int nB = input.nextInt();
    System.out.print("Price per stock purchaised:\n");
    double pB= input.nextDouble();
    System.out.print("Broker commision buy in % \n");
    int cB = input.nextInt();
    System.out.print("Number of stock sold:\n");
    int nS = input.nextInt();
    System.out.print("Price per stock sold:\n");
    double pS = input.nextDouble();
    System.out.print("Broker commision sale in % \n");
    int cS = input.nextInt();
    salesProfit = ((pS*nS)*(100-cS)/100)-((pB*nB)*(100+cB)/100);
    if (salesProfit<0){
      System.out.print("John lost " + salesProfit +"  money");
    }else {
      System.out.print("John gained " + salesProfit +"money");
    }
  }
}
