public enum Boat {
    BARGE("Barge",500000,893,5000),
    CARGO("Cargo", 750000, 542, 8500),
    SPEED("Speed",35000, 123, 2200),
    YACHT("Yacht", 985000, 8047, 60000);

    private final String mfgName;
    private final int basePrice,vehicleCode, luxuryTax;
    
    //constructor
    Boat (String mfgName, int basePrice, int vehicleCode, int luxuryTax){
        this.mfgName = mfgName;
        this.basePrice = basePrice;
        this.vehicleCode = vehicleCode;
        this.luxuryTax = luxuryTax;
    }

    public String getMfgName(){
        return this.mfgName;
    }
}
