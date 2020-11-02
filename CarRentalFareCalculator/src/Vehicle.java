public class Vehicle {

    //characteristics of each vehicle
     int range;
     //using all numbers on vin for simplicity. A method can be implemented to turn char/string to numbers
     int vin;
     int basePrice;
     String color = "Black";
     protected String mfgName = "";

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

     // constructor for no Default Color
    public Vehicle(int range, int vin, int basePrice, String mfgName){

        this.range = range;
        this.vin = vin;
        this.basePrice = basePrice;
        this.mfgName = mfgName;
    }


    public void displayInfo(){

        System.out.println("\nManufacture Name: " + mfgName);
        System.out.println("Range: " + range);
        System.out.println("VIN: " + vin);
        System.out.println("Base Price: $" + basePrice);
        System.out.println("Color: " + color);

    }


    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMfgName() {
        return mfgName;
    }

//    public void setMfgName(String mfgName) {
//        this.mfgName = mfgName;
//    }
}
