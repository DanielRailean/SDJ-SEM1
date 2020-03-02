public class MyDate
{
  private int day;
  private int month;
  private int year;
  private int dayn = 25;
  private int monthn = 2;
  private int yearn = 2020;

  public MyDate(int day, int month, int year){
    this.day = day;
    this.month = month;
    this.year = year;
  }
  public MyDate(){
    day = 0;
    month = 0;
    year = 0;
  }
  public String toString(){
    return "\n"+day+"/"+month+"/"+year;
  }
  public void setDay(int d){
    day = d;
  }
  public void setMonth(int m){
    month = m;
  }
  public void setYear(int y){
    year = y;
  }
  public int getDay(){
    return day;
  }
  public int getMonth(){
    return month;
  }
  public int getYear(){
    return year;
  }
  public String displayDate(){
    return "\n"+day+"/"+month+"/"+year;
  }
  public boolean isLeapYear(int year){
    return year%4==0 ? year%100==0 ? year%400==0? true:false:true:false;
  }
  public int daysInMonth(int month,int year){
    int daysM = 0;
    switch (month){
      case 1 :
      case 3 :
      case 5 :
      case 7:
      case 8:
      case 10:
      case 12: daysM= 31;}
      switch (month){
      case 4 :
      case 6 :
      case 9 :
      case 11 : daysM = 30;
    }
    switch (month){
      case 2 : return isLeapYear(year) ? 29 : 28;
    }
    return daysM;
  }
  public int getAgeInDays(){
    int days = 0;
    days+=daysInMonth(month,year) + dayn - day;
    for (int i = month+1;i<=12; i++){
      days+=daysInMonth(i,year);
    }
    for (int i =1; i<monthn; i++){
      days+=daysInMonth(i,yearn);
    }
    for(int i = year+1; i<yearn;i++){
      if(isLeapYear(i)){
        days+=366;
      }else{
        days+=365;
      }
    }
    return days;
  }
}
