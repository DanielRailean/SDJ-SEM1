import java.util.GregorianCalendar;

public class MyDate
{
  private int day;
  private int month;
  private int year;
  private int dayn = 25;
  private int monthn = 2;
  private int yearn = 2020;

  public MyDate(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public MyDate()
  {
    day = 0;
    month = 0;
    year = 0;
  }

  public MyDate(MyDate object)
  {
    this.day = object.getDay();
    this.month = object.getMonth();
    this.year = object.getYear();
  }

  public String toString()
  {
    return "\n" + day + "/" + month + "/" + year;
  }

  public void setDay(int d)
  {
    day = d;
  }

  public void setMonth(int m)
  {
    month = m;
  }

  public void setYear(int y)
  {
    year = y;
  }

  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }

  public String displayDate()
  {
    return "\n" + day + "/" + month + "/" + year;
  }

  public boolean isLeapYear(int year)
  {
    return year % 4 == 0 ?
        year % 100 == 0 ? year % 400 == 0 ? true : false : true :
        false;
  }

  public int daysInMonth(int month, int year)
  {
    int daysM = 0;
    switch (month)
    {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        daysM = 31;
    }
    switch (month)
    {
      case 4:
      case 6:
      case 9:
      case 11:
        daysM = 30;
    }
    switch (month)
    {
      case 2:
        return isLeapYear(year) ? 29 : 28;
    }
    return daysM;
  }

  public int getAgeInDays()
  {
    int days = 0;
    days += daysInMonth(month, year) + dayn - day;
    for (int i = month + 1; i <= 12; i++)
    {
      days += daysInMonth(i, year);
    }
    for (int i = 1; i < monthn; i++)
    {
      days += daysInMonth(i, yearn);
    }
    for (int i = year + 1; i < yearn; i++)
    {
      if (isLeapYear(i))
      {
        days += 366;
      }
      else
      {
        days += 365;
      }
    }
    return days;
  }

  public String getAstroSign()
  {
    if (month == 1)
    {
      if (day < 20)
      {
        return "Capricorn";
      }
      else
      {
        return "Aquarius";
      }
    }
    else if (month == 2)
    {
      if (day < 19)
      {
        return "Aquarius";
      }
      else
      {
        return "Pisces";
      }
    }
    else if (month == 3)
    {
      if (day < 21)
      {
        return "Pisces";
      }
      else
      {
        return "Aries";
      }
    }
    else if (month == 4)
    {
      if (day < 20)
      {
        return "Aries";
      }
      else
      {
        return "Taurus";
      }
    }
    else if (month == 5)
    {
      if (day < 21)
      {
        return "Taurus";
      }
      else
      {
        return "Gemini";
      }
    }
    else if (month == 6)
    {
      if (day < 21)
      {
        return "Gemini";
      }
      else
      {
        return "Cancer";
      }
    }
    else if (month == 7)
    {
      if (day < 23)
      {
        return "Cancer";
      }
      else
      {
        return "Leo";
      }
    }
    else if (month == 8)
    {
      if (day < 23)
      {
        return "Leo";
      }
      else
      {
        return "Virgo";
      }
    }
    else if (month == 9)
    {
      if (day < 23)
      {
        return "Virgo";
      }
      else
      {
        return "Libra";
      }
    }
    else if (month == 10)
    {
      if (day < 23)
      {
        return "Libra";
      }
      else
      {
        return "Scorpio";
      }
    }
    else if (month == 11)
    {
      if (day < 22)
      {
        return "Scorpio";
      }
      else
      {
        return "Sagittarius";
      }
    }
    else
    {
      if (day < 22)
      {
        return "Sagittarius";
      }
      else
      {
        return "Capricorn";
      }
    }
  }

  public String getDayOfWeek()
  {
    int dayOfWeek = -1;
    if ((month == 1) || (month == 2))
    {
      int localMonth = 12 + month;
      int secondTerm = (13 * (localMonth + 1)) / 5;
      int k = (year - 1) % 100;
      int j = (year - 1) / 100;
      dayOfWeek = (day + secondTerm + k + k / 4 + j / 4 + j * 5) % 7;
    }
    else
    {
      int secondTerm = (13 * (month + 1)) / 5;
      int k = (year) % 100;
      int j = (year) / 100;
      dayOfWeek = (day + secondTerm + k + k / 4 + j / 4 + j * 5) % 7;
    }
    switch (dayOfWeek)
    {
      case 0:
        return "Saturday";
      case 1:
        return "Sunday";
      case 2:
        return "Monday";
      case 3:
        return "Tuesday";
      case 4:
        return "Wednesday";
      case 5:
        return "Thursday";
      case 6:
        return "Friday";
    }
    return "Unknown day";
  }

  public String getMonthName()
  {
    switch (month)
    {
      case 1:
        return "January";
      case 2:
        return "February";
      case 3:
        return "March";
      case 4:
        return "April";
      case 5:
        return "May";
      case 6:
        return "June";
      case 7:
        return "July";
      case 8:
        return "August";
      case 9:
        return "September";
      case 10:
        return "October";
      case 11:
        return "November";
      case 12:
        return "December";
      default:
        return "Error in month!";
    }
  }

  public int leapYearsSinceIntroduced()
  {
    if (year < 1582)
    {
      return -1;
    }
    int yearsSince = 0;
    for (int i = 1582; i <= year; i++)
    {
      if (isLeapYear(i))
      {
        yearsSince++;
      }
    }
    return yearsSince;
  }

  public void nextDay()
  {
    day++;
    if (day > daysInMonth(month, year))
    {
      day = 1;
      month++;
    }
    if (month > 12)
    {
      month = 1;
      year++;
    }
  }

  public void nextDays(int days)
  {
    for (int i = 0; i < days; i++)
    {
      nextDay();
    }
  }

  public static MyDate today()
  {
    GregorianCalendar now = new GregorianCalendar();
    return new MyDate(now.get(GregorianCalendar.DATE),
        now.get(GregorianCalendar.MONTH) + 1, now.get(GregorianCalendar.YEAR));
  }

  public boolean isBefore(MyDate object)
  {
    return (year < object.getYear()) || ((month < object.getMonth()) && (year
        == object.getYear())) || ((day < object.getDay()) && (month == object
        .getMonth()) && (year == object.getYear()));
  }

  public void setDate(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public boolean equals(Object obj)
  {
    if (obj instanceof MyDate)
    {
      MyDate object = (MyDate) obj;
      return ((object.getDay() == day) && (object.getMonth() == month) && (
          object.getYear() == year));
    }
    else
    {
      return false;
    }
  }

  public MyDate copy()
  {
    return new MyDate(day, month, year);
  }

}
