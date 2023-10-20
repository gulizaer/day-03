package day03;

public class CarInfo {
    public static void main(String[] args) {
       /*
        1. Create a class named CarInfo.java
        2. Declare the following variables:
           1. year
           2. make
           3. model
           4. miles
           5. color
           6. Price
           3. Use concatenation to print the full info of the car in the
              following format:
              Year Make Model, Miles, Color, Price.
              Ex:
              Car information is :
              2018 Toyota Camry, 50000 miles, Red, $19000
        */

       Short year = 2018;
       String make = "Toyota";
       String model = "Camry";
       Long miles = 50000L;
       String color = "Red";
       Short price = 19000;

        System.out.println("Year:" + year);
        System.out.println("Make:" + make);
        System.out.println("Model:" + model);
        System.out.println("Miles:" + miles + "miles");
        System.out.println("Color:" + color);
        System.out.println("Price:" + "$" + price);
    }
}
