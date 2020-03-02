public class Clock
{
  private int hour;
  private int minute;
  private int second;
  private boolean timeFormat24 = true;

  public Clock(int hour, int minute, int second){
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }
  public Clock(int totalTimeInSeconds){
    hour = totalTimeInSeconds/3600;
    totalTimeInSeconds-=hour*3600;
    minute = totalTimeInSeconds/60;
    totalTimeInSeconds-=minute*60;
    second = totalTimeInSeconds;
  }
  public void set(int h, int m, int s)
  {
    hour = h;
    minute = m;
    second = s;
  }

  public int getHour()
  {
    return hour;
  }

  public int getMinute()
  {
    return minute;
  }

  public int getSecond()
  {
    return second;
  }
  public void tic()
  {
    second++;
    if(second>=60){
      minute ++;
      second-=60;
    }
    if(minute>=60)
    {
      hour++;
      minute -=60;
    }
    if(hour>=24){
      hour=0;
    }
  }
  public int convertToSeconds(){
    return (hour*3600)+(minute*60)+second;
  }
  public boolean isBeforeTime(Clock time)
  {
    return (hour<time.getHour())||
        ((hour==time.getHour())&&(minute<time.getMinute()))||
        ((hour==time.getHour())&&(minute==time.getMinute())&&(second<time.getSecond()));
  }
  public int timeInSecondsTo(Clock time){
    int timeInSecondsTarget = time.convertToSeconds();
    int timeInSecondsCurrent  = convertToSeconds();
    if(isBeforeTime(time)){
      return timeInSecondsTarget-timeInSecondsCurrent;
    }else{
      return (24*60*60)-timeInSecondsCurrent+timeInSecondsTarget;
    }
  }

  public Clock timeTo(Clock time){
    return new Clock(timeInSecondsTo(time));
  }

  public boolean isTimeFormat24()
  {
    return timeFormat24;
  }
  public void setTimeFormat(int hourFormat){
    if(hourFormat==24){
      timeFormat24 = true;
    }
    if(hourFormat==12){
      timeFormat24 = false;
    }
  }
  public String toString(){
  if((!timeFormat24)&&(hour>=12)){
    return (hour-12)+":"+minute+""+second;
  }else{
    return hour+":"+minute+":"+second;
  }
  }
}
