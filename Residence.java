/*  firstPayment() is a abstract method
  * an object Residence can not be created now
  * other option is to implement Rentable
  */
public abstract class Residence{
  private String address;
  private String city;
  private String state;
  private String zipCode;
  private double monthlyRent;
  private String contactName;
  private String contactPhone;
  protected final double APPLICATION_FEE = 50.00; 
  // or private and making use of getter

  public Residence(String address, String city, String state, String zipCode, double monthlyRent, String contactName, String contactPhone){
    this.address = address;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;
    this.monthlyRent = monthlyRent;
    this.contactName = contactName;
    this.contactPhone = contactPhone;
  }

  /** get methods */
  public String getAddress(){
    return address;
  }
  public String getCity(){
    return city;
  }
  public String getState(){
    return state;
  }
  public String getZipCode(){
    return zipCode;
  }
  public double getMonthlyRent(){
    return monthlyRent;
  }
  public String getContactName(){
    return contactName;
  }
  public String getContactPhone(){
    return contactPhone;
  }
  
  /** set methods */
  public void setAddress(String address){
    this.address = address;
  }
  public void setCity(String city){
    this.city = city;
  }
  public void setState(String state){
    this.state = state;
  }
  public void setZipCode(String zipCode){
    this.zipCode = zipCode;
  }
  public void setMonthlyRent(double monthlyRent){
    this.monthlyRent = monthlyRent;
  }
  public void setContactName(String contactName){
    this.contactName = contactName;
  }
  public void setContactPhone(String contactPhone){
    this.contactPhone = contactPhone;
  }

  /* other methods */
  public abstract double firstPayment();
  @Override
  public String toString(){
    return address + "\n"
      + city + ", "
      + state + " "
      + zipCode;
  }
}