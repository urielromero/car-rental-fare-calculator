import java.util.Random;

public enum Boat {
    BARGE("Barge",500000,893,5000),
    CARGO("Cargo", 750000, 542, 8500),
    SPEED("Speed",35000, 123, 2200),
    YACHT("Yacht", 985000, 8047, 60000);

    private final String mfgName;
    private final int basePrice,vehicleCode, luxuryTax;
    private long vin;
    private float cost;
    private int range;

    
    //constructor
    Boat (String mfgName, int basePrice, int vehicleCode, int luxuryTax){
        this.mfgName = mfgName;
        this.basePrice = basePrice;
        this.vehicleCode = vehicleCode;
        this.luxuryTax = luxuryTax;

        this.setVin();
        this.vin= this.getVin();
        this.range = this.getRange();

        Vehicle.totalCost = Vehicle.totalCost + this.getCost();
    }

    public String getMfgName(){
        return this.mfgName;
    }

    public void displayInfo(){
        //“boatType with VIN vin is available to rent. This beauty has a range of range and only costs $cost”
        System.out.println(this.getMfgName() + " with VIN " + this.getVin() + " is available to rent. This beauty has a range of " +
                this.getRange() + " and only costs $" + this.getCost());
    }


    //long as it may contain 10 digits. set to 4 for now
    public long getVin() { return vin; }

    //generate random 4 digit VIN
    private void setVin(){
        //number of digits
        int n = 4;
        //multiplier
        int m = (int) Math.pow(10, n-1);
        vin = m + new Random().nextInt(9*m);

    }

    public int getRange(){
        return range;
    }

    public void setRange(int range){
        this.range = range * 7;
    }

    public float getCost( ){
        //𝑐𝑜𝑠𝑡 = [(𝑏𝑎𝑠𝑒𝑃𝑟𝑖𝑐𝑒 ∗ (𝑣𝑖𝑛/𝑣𝑒ℎ𝑖𝑐𝑙𝑒𝐶𝑜𝑑𝑒)) ÷ 𝑣𝑒ℎ𝑖𝑐𝑙𝑒𝑅𝑎𝑛𝑔𝑒] + 𝑙𝑢𝑥𝑢𝑟𝑦𝑇𝑎𝑥
       // cost = ((this.basePrice * (this.getVin()/this.vehicleCode)) / this.getRange()) + this.luxuryTax;
        cost = (this.basePrice * (this.getVin()/this.vehicleCode)) / this.range;
        return cost;
    }
}
