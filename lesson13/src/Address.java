public class Address
{
  private String street, number,postalCode,city, country;

  public Address(String street, String number, String postalCode, String city,
      String country)
  {
    this.street = street;
    this.number = number;
    this.postalCode = postalCode;
    this.city = city;
    this.country = country;
  }
  public void setAddress(String street, String number, String postalCode, String city,
      String country)
  {
    this.street = street;
    this.number = number;
    this.postalCode = postalCode;
    this.city = city;
    this.country = country;
  }

  public String getStreet()
  {
    return street;
  }

  public void setStreet(String street)
  {
    this.street = street;
  }

  public String getNumber()
  {
    return number;
  }

  public void setNumber(String number)
  {
    this.number = number;
  }

  public String getPostalCode()
  {
    return postalCode;
  }

  public void setPostalCode(String postalCode)
  {
    this.postalCode = postalCode;
  }

  public String getCity()
  {
    return city;
  }

  public void setCity(String city)
  {
    this.city = city;
  }

  public String getCountry()
  {
    return country;
  }

  public void setCountry(String country)
  {
    this.country = country;
  }

  @Override public String toString()
  {
    return "Street:"+street+"nr "+number+"\nPostal code:"+postalCode+" City:" +city+"\nCountry"+country;
  }
  public boolean equals(Object object){
    if(object instanceof Address){
      Address obj = (Address)object;
      return obj.street.equals(street)&&obj.number.equals(number)&&obj.postalCode.equals(postalCode)&&obj.city.equals(city)&&obj.country.equals(country);
    }else{
      return false;
    }
  }
}
