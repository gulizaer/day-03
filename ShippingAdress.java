package day03;

public class ShippingAdress {

    public static void main(String[] args) {


  /*
  1. Create a class named ShippingAddress.java
  2. Declare the following variables:
     1. name
     2. buildingNumber
     3. streetName
     4. city
     5. state
     6. zipCode
     3. Use concatenation to print the full shipping address
        Ex:
           Your Shipping address is:
           Aaron Kissinger
           13621A Legacy Circle
            Fairfax, VA 2203
   */
   String name = "Aaron Kissinger";
   Short buildingNumber = 13621;
   String streetName = "Legacy Circle";
   String city = "Fairfax";
   Short zipCode = 2203;
        System.out.println("Your Shipping address is:" + "\n\t" + name
        + "\n\t" +buildingNumber + "A" + "\t" + streetName
        +"\n\t" +city +",\t" + "VA " + zipCode);
}


}
