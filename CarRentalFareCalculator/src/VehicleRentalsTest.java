
import java.util.Scanner;

public class VehicleRentalsTest {

    public static void main (String args []) {

        System.out.println("\nWELCOME TO CASPERS CAR RENTAL!");
        System.out.println("Total: $" + Vehicle.getTotalCost());

        //loop runs until exited by user
        while (true){

            //Vehicle type selection message
            System.out.println("\n Select Vehicle Type to Rent! " +
                    "\n1. Standard" +
                    "\n2. Electric" +
                    "\n3. Diesel" +
                    "\n4. EXIT");

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
                        //enter exception here for negative number input
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
                        int inputColor = scan.nextInt();
                        //assign color selected as an Int
                        int colorSelectedInt = inputColor;

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

                case "2":
                    //Electric Vehicle
                    System.out.println("\nElectric vehicle selected\n Enter desired range from 50-499: ");
                    inputRange = scan.nextInt();
                    while (inputRange < 50 || inputRange >= 500){
                        //enter exception here for negative number input
                        System.out.println(" Enter a valid range from 50-499:");
                        inputRange = scan.nextInt();
                    }
                    rangeSelected = inputRange;


                    System.out.println(" Do you have a color preference?");
                    preferenceInput = scan.next();
                    if (preferenceInput.equalsIgnoreCase("Y")){
                        System.out.println(" Enter desired color: \n1. Blue" +
                                "\n2. Red" +
                                "\n3. Silver" +
                                "\n4. White");
                        int inputColor = scan.nextInt();
                        int colorSelectedInt = inputColor;

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
                    if(teslaDesired.equalsIgnoreCase("Y")){
                        isTesla = true;
                    }else{
                        isTesla = false;
                    }

                    //create new Electric vehicle obj with user selection
                    Electric electric = new Electric(rangeSelected,colorSelected, isTesla);
                    //display vehicle information
                    electric.displayInfo();
                    //show grand total for vehicle(s) rented
                    System.out.println("Total: $" + Vehicle.getTotalCost());
                    break;

                case "3":
                    //Diesel Vehicle Case
                    System.out.println("Diesel vehicle selected" +
                            "\n Would you like a Semi-truck? Y/N");
                    String semiDesired = scan.next();
                    boolean isSemi;

                    if(semiDesired.equalsIgnoreCase("Y")){
                        //semi truck selected
                       isSemi= true;
                        System.out.println(" Enter desired range from 50-499:");

                        inputRange = scan.nextInt();
                        while (inputRange < 50 || inputRange >= 500){
                            //enter exception here for negative number input
                            System.out.println(" Enter a valid range from 50-499:");
                            inputRange = scan.nextInt();
                        }
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
                        int inputColor = scan.nextInt();
                        int colorSelectedInt = inputColor;

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

                case "4":
                    //Exit out of while loop
                    System.out.println("Thank you...Now Exiting");
                    System.exit(0);
                    break;
            }
        }
    }
}
