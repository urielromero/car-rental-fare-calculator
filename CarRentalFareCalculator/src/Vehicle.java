public class Vehicle {


    //characteristics of each vehicle
     int range;
     //using all numbers on vin for simplicity. A method can be implemented to turn char/string to numbers
     int vin;
     int basePrice;
     String color = "Black";
     String mfgName;

     //default constructor
     public Vehicle(){};

     //constructor
     public Vehicle(int range, int vin, int basePrice, String color, String mfgName){

         this.range = range;
         this.vin = vin;
         this.basePrice = basePrice;
         this.color = color;
         this.mfgName = mfgName;

     }

}
