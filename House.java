public class House extends Residence implements Occupiable{
  private final double SECURITY_DEPOSIT = 1000.00;

  public House(String address, String city, String state, String zipCode, double monthlyRent, String contactName, String contactPhone){
    super(address, city, state, zipCode, monthlyRent, contactName, contactPhone);
  }

  public String getContactInformation(){
    return "House Contact Information:\nName: " + getContactName() + "\nPhone: " + getContactPhone();
    // "House" just to differentiate from Apartment's method
  }
  public double firstPayment(){
    return getMonthlyRent() + APPLICATION_FEE + SECURITY_DEPOSIT;
  }
}