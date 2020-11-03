public class Diesel extends Vehicle {

    int wheelsNumber;
    int cylinderNumber;
    boolean limitableRule;
    boolean semiTruck;

    //Default constructor
    public Diesel (){};

    //Constructor > added wheel and cylinder number with super word
    public Diesel (int range, int vin, int basePrice, String color, String mfgName, int wheelsNumber, int cylinderNumber, boolean semiTruck) {
        super(range, vin, basePrice, color, mfgName);
        this.wheelsNumber = wheelsNumber;
        this.cylinderNumber = cylinderNumber;
        this.semiTruck = semiTruck;
        limitableRule = semiTruck; // apply limitabble rule if we have a semi-truck


    }
    //Default color constructor
    public Diesel (int range, int vin, int basePrice, String mfgName, int wheelsNumber, int cylinderNumber, boolean semiTruck) {
        super(range, vin, basePrice, mfgName);
        this.wheelsNumber = wheelsNumber;
        this.cylinderNumber = cylinderNumber;
        this.semiTruck = semiTruck;
        limitableRule = semiTruck; // apply limitabble rule if we have a semi-truck
    }


    @Override
    public void displayInfo(){
        System.out.println("\nManufacture Name: " + mfgName);
        System.out.println("Range: " + range);
        System.out.println("VIN: " + vin);
        System.out.println("Base Price: $" + basePrice);
        System.out.println("Color: " + color);
        System.out.println("Number of Wheels: " + wheelsNumber);
        System.out.println("Number of Cylinders: " + cylinderNumber);
    }

    public void setRange(int range){

    // if not a semi-truck there is no limitation on range
        if(limitableRule == false) {
            System.out.println("false");
            while (range < 0) {
                //out of range exception should occur
                System.out.println("Please enter a range > 0");
            }
            this.range = range;
    // if there is a limitation, then range must be from 50 to 499
        }else
            if (limitableRule){
            while (range < 50 || range > 499) {
                //out of range exception should occur
                System.out.println("Please enter a valid range from 50 to 499");
            }
            this.range = range;
        }
    }


    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public int getCylinderNumber() {
        return cylinderNumber;
    }

    public void setCylinderNumber(int cylinderNumber) {
        this.cylinderNumber = cylinderNumber;
    }
}
