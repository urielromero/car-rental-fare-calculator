
import java.util.Scanner;


public class VehicleRentalsTest {

    public static void main (String[] args) throws InterruptedException {

        System.out.println("\nWELCOME TO CASPER'S CAR RENTAL!");
        System.out.println("Total: $" + Vehicle.getTotalCost());

        //loop runs until exited by user
        while (true){

//Day.valueOf(str);
            //Vehicle type selection message
            System.out.println("\n Select Vehicle Type to Rent! " +
                    "\n1. Standard" +
                    "\n2. Electric" +
                    "\n3. Diesel" +
                    "\n4. Boats" +
                    "\n5. EXIT");

            //Scan input from user
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();

            //switch case selected by user input
            switch (s){

                //Standard Vehicle
                case "1":
                    System.out.println("\nStandard vehicle selected\n Enter desired range: ");
                    int inputRange = scan.nextInt();
                    while (inputRange < 0){
                       System.out.println("Enter desired range:");
                       inputRange = scan.nextInt();
                    }
                    //assign range to variable
                    int rangeSelected = inputRange;

                    System.out.println("Do you have a color preference Y/N?");
                    String preferenceInput = scan.next();
                    String colorSelected ="";
                    if (preferenceInput.equalsIgnoreCase("Y")){
                        System.out.println("Enter desired color: \n1. Blue" +
                                "\n2. Red" +
                                "\n3. Silver" +
                                "\n4. White");
                        //assign color selected as an Int
                        int colorSelectedInt = scan.nextInt();

                        //assign color selected as a string
                        switch (colorSelectedInt){
                            case 1: colorSelected ="Blue";
                                break;
                            case 2: colorSelected = "Red";
                                break;
                            case 3: colorSelected = "Silver";
                                break;
                            case 4: colorSelected = "White";
                                break;
                            default:
                                System.out.println("Default color selected");
                        }
                    }else{
                        //default color
                        colorSelected = "Black";
                    }
                    //create new object with user selections
                    Standard standard = new Standard(rangeSelected,colorSelected);
                    //display vehicle information in given format
                    standard.displayInfo();
                    //show grand total for vehicle(s) rented
                    System.out.println("Total: $" + Vehicle.getTotalCost());
                    break;

                //Electric Vehicle
                case "2":

                    System.out.println("\nElectric vehicle selected\n Enter desired range from 50-499: ");
                    inputRange = scan.nextInt();

                    //enter exception here for negative number input
                    if(inputRange < 50 || inputRange >= 500) {
                        throw new OutOfRangeException("");
                    }

                    //run this look instead of exception
//                    while (inputRange < 50 || inputRange >= 500){
//                        System.out.println(" Enter a valid range from 50-499:");
//                        inputRange = scan.nextInt();
//                    }
                    rangeSelected = inputRange;

                    System.out.println(" Do you have a color preference Y/N?");
                    preferenceInput = scan.next();
                    if (preferenceInput.equalsIgnoreCase("Y")){
                        System.out.println(" Enter desired color: \n1. Blue" +
                                "\n2. Red" +
                                "\n3. Silver" +
                                "\n4. White");
                        int inputColor = scan.nextInt();

                        switch (inputColor){
                            case 1: colorSelected = "Blue";
                                break;
                            case 2: colorSelected = "Red";
                                break;
                            case 3: colorSelected = "Silver";
                                break;
                            case 4: colorSelected = "White";
                                break;
                            default:
                                System.out.println("Default color selected");
                                colorSelected = "Black";
                        }
                    }else{
                        //default color
                        colorSelected = "Black";
                    }

                    System.out.println("Would you like a Tesla Y/N?");
                    String teslaDesired = scan.next();
                    boolean isTesla;

                    isTesla = teslaDesired.equalsIgnoreCase("Y");

                    //create new Electric vehicle obj with user selection
                    Electric electric = new Electric(rangeSelected,colorSelected, isTesla);
                    //display vehicle information
                    electric.displayInfo();
                    //show grand total for vehicle(s) rented
                    System.out.println("Total: $" + Vehicle.getTotalCost());
                    break;

                //Diesel Vehicle Case
                case "3":
                    System.out.println("Diesel vehicle selected" +
                            "\n Would you like a Semi-truck? Y/N");
                    String semiDesired = scan.next();
                    boolean isSemi;

                    if(semiDesired.equalsIgnoreCase("Y")){
                        //semi truck selected
                       isSemi= true;
                        System.out.println(" Enter desired range from 50-499:");

                        inputRange = scan.nextInt();

                        //requested out of range exception
                        if(inputRange < 50 || inputRange >= 500) {
                            throw new OutOfRangeException("");
                        }

                        //use while loop instead of exception
//                        while (inputRange < 50 || inputRange >= 500){
//                            //enter exception here for negative number input
//                            System.out.println(" Enter a valid range from 50-499:");
//                            inputRange = scan.nextInt();
//                        }
                    }else{
                        //semi truck not selected
                        isSemi = false;
                        System.out.println(" Enter desired range:");
                        inputRange = scan.nextInt();
                        while (inputRange < 0){
                            //enter EXCEPTION here for negative number input
                            System.out.println(" Enter desired range:");
                            inputRange = scan.nextInt();
                        }
                    }
                    //assign input to variable from user input
                    rangeSelected = inputRange;


                    //getting color selection
                    System.out.println(" Do you have a color preference?");
                    preferenceInput = scan.next();

                    if (preferenceInput.equalsIgnoreCase("Y")){
                        System.out.println(" Enter desired color: \n1. Blue" +
                                "\n2. Red" +
                                "\n3. Silver" +
                                "\n4. White");
                        int colorSelectedInt = scan.nextInt();

                        switch (colorSelectedInt){
                            case 1: colorSelected = "Blue";
                                break;
                            case 2: colorSelected = "Red";
                                break;
                            case 3: colorSelected = "Silver";
                                break;
                            case 4: colorSelected = "White";
                                break;
                            default:
                                //added default in case user does not select 1-4
                                System.out.println(" Default color selected");
                                colorSelected = "Black";
                        }
                    }else{
                        //default option
                        colorSelected = "Black";
                    }
                //create new diesel type obj from user input selections
                if(isSemi){
                    Diesel semiTruck = new Diesel(rangeSelected, colorSelected, true);
                    semiTruck.displayInfo();

                    //show grand total for vehicle(s) rented
                    System.out.println("Total: $" + Vehicle.getTotalCost());
                }else{
                    Diesel truck = new Diesel(rangeSelected, colorSelected, false);
                    truck.displayInfo();
                    System.out.println("Total: $" + Vehicle.getTotalCost());
                }
                    break;

                //Boats Enums
                case "4":
                    System.out.println(" Select Boat Type" +
                            "\n1. Barge" +
                            "\n2. Cargo" +
                            "\n3. Speed" +
                            "\n4. Yacht");
                    String b = scan.next();
                        switch (b){
                            case "1":
                                System.out.println("Barge Selected\n");
                                System.out.println(" Enter desired range: ");
                                int boatRange = scan.nextInt();

                                Boat.BARGE.setRange(boatRange);

                                System.out.println("Given range" + boatRange);
                                //Boat.BARGE.displayInfo();
                                break;
                            case "2":
                                System.out.println("Cargo Selected\n");
                                System.out.println(" Enter desired range: ");
                                boatRange = scan.nextInt();
                                Boat.BARGE.setRange(boatRange);
                               // Boat.BARGE.displayInfo();
                                break;
                            case "3":
                                System.out.println("Speed Selected\n");

                                System.out.println(" Enter desired range: ");
                                boatRange = scan.nextInt();
                                Boat.BARGE.setRange(boatRange);
                                //Boat.BARGE.displayInfo();
                                break;
                            case "4":
                                System.out.println("Yacht Selected\n");
                                System.out.println(" Enter desired range: ");
                                boatRange = scan.nextInt();
                                Boat.BARGE.setRange(boatRange);
                               // Boat.BARGE.displayInfo();
                                break;
                            default:
                                System.out.println("Invalid Selection");

                        }
                    break;

                    //Exit out of while loop
                case "5":
                    System.out.println("Thank you...Now Exiting");
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nInvalid selection\nSelect a number");

            }
        }
    }
}
