public class Diesel extends Vehicle {

    int wheelsNumber;
    int cylinderNumber;

    //Default constructor
    public Diesel (){};

    //Constructor > added wheel and cylinder number with super word
    public Diesel (int range, int vin, int basePrice, String color, String mfgName, int wheelsNumber, int cylinderNumber) {
        super(range, vin, basePrice, color, mfgName);
        this.wheelsNumber = wheelsNumber;
        this.cylinderNumber = cylinderNumber;
    }
    //Default color constructor
    public Diesel (int range, int vin, int basePrice, String mfgName, int wheelsNumber, int cylinderNumber) {
        super(range, vin, basePrice, mfgName);
        this.wheelsNumber = wheelsNumber;
        this.cylinderNumber = cylinderNumber;
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
