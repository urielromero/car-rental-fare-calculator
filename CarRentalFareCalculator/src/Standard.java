public class Standard extends Vehicle {

    int emissionDate;
    int seatsNumber;
    String mfgName = "Ford";

    //Default Standard Type Values. Set by setter method not this variables.
    int vehicleCode = 12;
    int luxuryTax = 0;
    int basePrice = 3000;



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

    public Standard(int range, String color){
        super(range, color);
        this.setBasePrice(3000);
        this.setVehicleCode(12);
        this.setLuxuryTax(0);

        //keep track of total cost
        totalCost = totalCost + this.getCost();
    };

    @Override
    public void displayInfo(){
        //“carType by manufacturer with VIN vin is available to rent in color. This beast has a range of range and only costs $cost”
        System.out.println("\nStandard vehicle by " +
                this.getMfgName() + " with VIN " + this.getVin() +
                " is available to rent in " + this.getColor() +
                ". This beast has a range of " + this.getRange() +
                " and only costs $" + this.getCost());
    }

    @Override
    public void setRange(int range){
        while(range < 0){
            System.out.println("Please enter a range > 0");
        }
        super.setRange(range);
    }

    public String getMfgName(){
        return mfgName;
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
