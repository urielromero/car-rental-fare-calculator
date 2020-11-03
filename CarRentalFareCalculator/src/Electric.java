public class Electric extends Vehicle {

    int batteriesOnBoard;
    boolean isTesla;
    boolean limitableRule;

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
        System.out.println("\nManufacture Name: " + mfgName);
        System.out.println("Range: " + range);
        System.out.println("VIN: " + vin);
        System.out.println("Base Price: $" + basePrice);
        System.out.println("Color: " + color);
        System.out.println("Batteries: " + batteriesOnBoard);
        System.out.println("Is it a Tesla? " + isTesla);

    }

    @Override
    public void setRange(int range){

        while( range < 50 || range > 499){
            //out of range exception should occur
            System.out.println("Please enter a valid range from 50 to 499");
        }
        this.range = range;
    }




}
