public class Standard extends Vehicle {

    int emissionDate;
    int seatsNumber;


    //Default Constructor
    public Standard(){};

    //Constructor
    public Standard(int range, int vin, int basePrice, String color, String mfgName, int emissionDate, int seatsNumber){
        super(range, vin,basePrice, color, mfgName);
        this.emissionDate = emissionDate;
        this.seatsNumber = seatsNumber;
    };

    //Default Color Constructor
    public Standard(int range, int vin, int basePrice, String mfgName, int emissionDate, int seatsNumber){
        super(range, vin,basePrice, mfgName);
        this.emissionDate = emissionDate;
        this.seatsNumber = seatsNumber;
    };

    @Override
    public void displayInfo(){
        System.out.println("\nManufacture Name: " + mfgName);
        System.out.println("Range: " + range);
        System.out.println("VIN: " + vin);
        System.out.println("Base Price: $" + basePrice);
        System.out.println("Color: " + color);
        System.out.println("Emissions Test Date: " + emissionDate);
        System.out.println("Number of Seats: " + seatsNumber);
    }

    @Override
    public void setRange(int range){

        while(range < 0){
            System.out.println("Please enter a range > 0");
        }
        this.range = range;
    }

    public int getEmissionDate() {
        return emissionDate;
    }

    public void setEmissionDate(int emissionDate) {
        this.emissionDate = emissionDate;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }
}
