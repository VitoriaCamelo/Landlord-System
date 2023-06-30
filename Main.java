import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    
    Occupiable myApartment = new Apartment("Rua beatriz", "23", "jp", "pb", "58012-564", 500.00, "Clara", "9998-7665");
    Occupiable myHouse = new House("Rua django", "jp", "pb", "58012-533", 600.00, "Ana", "9997-5443");
    // class - subclass

    /*
    System.out.println(myApartment);
    System.out.printf("R$%,.2f\n", myApartment.firstPayment());
    System.out.println("\n" + myHouse);
    System.out.printf("R$%,.2f\n", myHouse.firstPayment());
    */

    ArrayList<Occupiable> occupants = new ArrayList<>();
    occupants.add(myApartment);
    occupants.add(myHouse);

    for(Occupiable occupant : occupants){
      if(occupant instanceof Apartment){
        System.out.println("- Apartment:");
      }
      else if(occupant instanceof House){
        System.out.println("- House:");
      }
      System.out.println(occupant);
      System.out.println(occupant.getContactInformation());
      /**
      * System.out.printf("R$%,.2f\n", occupant.firstPayment());
      * to use this line, change the type Occupiable -> Residence
      * fistPayment is allowed to Residence objects 
      * if you do this, getContactInformation will be lost
      */
      System.out.println();
    }
  }
}