public class Rainfall
{
  double[] months = new double[12];
  public double getTotal(){
    return Array.sum(months);
  }
  public double getAverage(){
    return Array.average(months);
  }
  public double getMostRain(){
    return Array.max(months);
  }
  public double getLeastRain(){
    return Array.min(months);
  }

  public Rainfall(double[] months)
  {
    this.months = months;
  }

  public double[] getMonths()
  {
    return months;
  }

  public void setMonths(double[] months)
  {
    this.months = months;
  }

  @Override public String toString()
  {
    return "Total rain:"+getTotal()+"\nAverage rain per month:"+getAverage()+"\nMost rain:"+getMostRain()+"\nLeast rain:"+getLeastRain();
  }

  public static void main(String[] args)
  {
    Rainfall year2020 = new Rainfall(new double[]{11,12,10,12,13,14,15,16,17,18,19,20});
    System.out.println(year2020);
  }
}
