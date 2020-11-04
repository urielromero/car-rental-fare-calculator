public class VehicleRentalsTest {


    public static void main (String args []) {


        //Vehicle audi = new Vehicle(200, 332324343, 45000, "Blue", "Audi");

        Standard versa = new Standard(800, 453453546, 19000, "PINK", "Nissan", 2020, 5);
        Diesel semi = new Diesel(250, 23454673, 6500, "Red", "Volvo",20,16, true);
        Electric model3 = new Electric(200, 4566567, 45000, "Tesla", 4, true);
        Diesel truck = new Diesel(1000, 454432467, 50000, "Blue", "Ford", 4, 8, false);
//
//        versa.displayInfo();
//        model3.displayInfo();
//        truck.displayInfo();
//        versa.setRange(5);
        versa.displayInfo();

        model3.displayInfo();
        truck.displayInfo();
        semi.displayInfo();


    }
}
