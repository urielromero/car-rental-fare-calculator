public class Vehicle {

    //characteristics of each vehicle
     private int range;
     //using all numbers on vin for simplicity. A method can be implemented to turn char/string to numbers
     private int vin;
     private int basePrice;
     private String color = "Black";
     private String mfgName;
     private int VehicleCode;
     private int luxuryTax;



    private double cost;



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
    }

     public void displayInfo(){

     }

    public double getCost( ){
         //𝑐𝑜𝑠𝑡 = [(𝑏𝑎𝑠𝑒𝑃𝑟𝑖𝑐𝑒 ∗ (𝑣𝑖𝑛/𝑣𝑒ℎ𝑖𝑐𝑙𝑒𝐶𝑜𝑑𝑒)) ÷ 𝑣𝑒ℎ𝑖𝑐𝑙𝑒𝑅𝑎𝑛𝑔𝑒] + 𝑙𝑢𝑥𝑢𝑟𝑦𝑇𝑎𝑥
        //cost = ((this.getBasePrice() * (this.getVin()/this.getVehicleCode())) / this.getRange()) + luxuryTax;
        cost = this.getVehicleCode();
    return cost;
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

    public int getVehicleCode() {
        return VehicleCode;
}
}
