import java.util.Random;

public class Vehicle {

    //characteristics of each vehicle
     private int range;
     //using all numbers on vin for simplicity. A method can be implemented to turn char/string to numbers
     private long vin;
     private int basePrice;
     private String color = "Black";
     private String mfgName;
     private int VehicleCode;
     private int luxuryTax;



     private long cost;
     static long totalCost;



     //default constructor
     public Vehicle(){};

     // constructor for no DEFAULT COLOR
     public Vehicle(int range, int vin, int basePrice, String mfgName){
        this.range = range;
        this.vin = vin;
        this.basePrice = basePrice;
        this.mfgName = mfgName;
     }

     // constructor for added color
     public Vehicle(int range, int vin, int basePrice, String color, String mfgName){
        this( range, vin, basePrice, mfgName);
        this.color = color;
     }

    public Vehicle(int range, String color){
        this.range = range;
        this.color = color;

        this.setVin();
        this.vin = this.getVin();

        //1 is placeholder only for int vehicle type code #.
        this.setVehicleCode(1);

        //total Cost
        totalCost = totalCost + this.getCost();
    }

     public void displayInfo(){
     }

    public long getCost( ){
         //𝑐𝑜𝑠𝑡 = [(𝑏𝑎𝑠𝑒𝑃𝑟𝑖𝑐𝑒 ∗ (𝑣𝑖𝑛/𝑣𝑒ℎ𝑖𝑐𝑙𝑒𝐶𝑜𝑑𝑒)) ÷ 𝑣𝑒ℎ𝑖𝑐𝑙𝑒𝑅𝑎𝑛𝑔𝑒] + 𝑙𝑢𝑥𝑢𝑟𝑦𝑇𝑎𝑥
        cost = ((this.getBasePrice() * (this.getVin()/this.getVehicleCode())) / this.getRange()) + this.getLuxuryTax();
        //cost = 3000*(this.getVin()/this.getVehicleCode());
    return cost;
    }

    public static long getTotalCost(){
         return totalCost;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public long getVin() { return vin; }

    //generate random 10 digit VIN
    private void setVin(){
         //number of digits
         int n = 4;
         //multiplier
         int m = (int) Math.pow(10, n-1);
         this.vin = m + new Random().nextInt(9*m);
      //  this.vin = 1456432343;
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

    //no setter for mfgName as it it unchangeable

    public int getVehicleCode() {
        return VehicleCode;
    }

    public void setVehicleCode( int vehicleCode){
         this.VehicleCode = vehicleCode;
    }

    public int getLuxuryTax() {
         return luxuryTax;
    }

    public void setLuxuryTax( int luxuryTax){
         this.luxuryTax = luxuryTax;
    }
}
