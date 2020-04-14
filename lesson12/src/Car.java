public class Car
{
  private String make,model,color,licenseNumber;
  public Car(String make,String model, String color, String licenseNumber){
    this.make = make;
    this.model = model;
    this.color = color;
    this.licenseNumber = licenseNumber;
  }
  public Car(String make, String model, String color){
    this.make = make;
    this.model = model;
    this.color = color;
  }
  public String getMake(){
    return make;
  }

  public String getModel()
  {
    return model;
  }

  public String getColor()
  {
    return color;
  }

  public String getLicenseNumber()
  {
    return licenseNumber;
  }

  public void setColor(String color)
  {
    this.color = color;
  }

  public void setLicenseNumber(String licenseNumber)
  {
    this.licenseNumber = licenseNumber;
  }
  public Car copy(){
    return new Car(make,model,color,licenseNumber);
  }
  public String toString(){
    return "\nMake:"+make+"\nModel:"+model+"\nColor:"+color+"\nLicense number:"+licenseNumber;
  }
  public boolean equals(Object object){
    if(object instanceof Car){
      Car obj = (Car)object;
      return (obj.getMake().equals(make))&&(obj.getModel().equals(model))&&(obj.getColor().equals(color))&&(obj.getLicenseNumber().equals(licenseNumber));
    }else{
      return false;
    }
  }
}
