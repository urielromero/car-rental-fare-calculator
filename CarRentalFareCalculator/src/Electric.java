public class Electric extends Vehicle {

    int batteriesOnBoard;
    boolean isTesla;
    boolean limitableRule;
    int vehicleCode = 76;
    int luxuryTax = 153;

    //signifies eligibility for tax benefits
    boolean renewableRule = true;

    //Default constructor
    public Electric (){};

    //Constructor
    public Electric (int range, int vin, int basePrice, String color, String mfgName, int batteriesOnBoard, boolean isTesla){
        super(range, vin, basePrice, color, mfgName);
        this.batteriesOnBoard = batteriesOnBoard;
        this.isTesla= isTesla;
    };

    //Default color constructor
    public Electric (int range, int vin, int basePrice, String mfgName, int batteriesOnBoard, boolean isTesla){
        super(range, vin, basePrice, mfgName);
        this.batteriesOnBoard = batteriesOnBoard;
        this.isTesla= isTesla;
    };


    @Override
    public void displayInfo(){
        System.out.println("\nElectric vehicle by " +
                this.getMfgName() + " with VIN " + this.getVin() +
                " is available to rent in " + this.getColor() +
                ". This monster has a range of " + this.getRange() +
                " and only costs $" + this.getCost() + " unless range exceeded");
    }

    @Override
    public void setRange(int range){

        while( range < 50 || range > 499){
            //out of range exception should occur
            System.out.println("Please enter a valid range from 50 to 499");
        }
        super.setRange(range);
    }




}
