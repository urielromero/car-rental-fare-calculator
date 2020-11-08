import javax.swing.*;
import java.util.Scanner;

public class VehicleRentalsTest {


    public static void main (String args []) {


        System.out.println("\nWELCOME TO CASPERS CAR RENTAL!");

//        Standard versa = new Standard(800, "PINK");
//        //versa.displayInfo();
//        System.out.println(versa.getCost());

        while (true){

            System.out.println("\n Select Vehicle Type to Rent! " +
                    "\n1. Standard" +
                    "\n2. Electric" +
                    "\n3. Diesel");


            //Take input from user
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();

            switch (s){
                case "1":
                    System.out.println("\nStandard vehicle selected\n Enter desired range: ");
                    int inputRange = scan.nextInt();
                    while (inputRange < 0){
                        //enter exception here for negative number input
                        System.out.println("Enter desired range:");
                        inputRange = scan.nextInt();
                    }
                    int rangeSelected = inputRange;

                    System.out.println("Do you have a color preference?");

                    String preferenceInput = scan.next();

                    String colorSelected ="";
                    if (preferenceInput.equalsIgnoreCase("Y")){
                        System.out.println("Enter desired color: \n1. Blue" +
                                "\n2. Red" +
                                "\n3. Silver" +
                                "\n4. White");
                        int inputColor = scan.nextInt();
                        int colorSelectedInt = inputColor;

                        switch (colorSelectedInt){
                            case 1: colorSelected ="Blue";
                            case 2: colorSelected = "Red";
                            case 3: colorSelected = "Silver";
                            case 4: colorSelected = "White";
                            default:
                                System.out.println("Default color selected");
                        }
                    }else{
                        colorSelected = "Black";
                    }
                    Standard standard = new Standard(rangeSelected,colorSelected);
                    standard.displayInfo();
                    break;


                case "2":
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

                    Electric electric = new Electric(rangeSelected,colorSelected, isTesla);
                    electric.displayInfo();
                    break;

                case "3":
                    System.out.println("Diesel vehicle selected" +
                            "\n Would you like a Semi-truck? Y/N");
                    String semiDesired = scan.next();
                    boolean isSemi;

                    if(semiDesired.equalsIgnoreCase("Y")){
                       isSemi= true;
                        System.out.println(" Enter desired range from 50-499:");

                        inputRange = scan.nextInt();
                        while (inputRange < 50 || inputRange >= 500){
                            //enter exception here for negative number input
                            System.out.println(" Enter a valid range from 50-499:");
                            inputRange = scan.nextInt();
                        }
                        //rangeSelected = inputRange;
                    }else{
                        isSemi = false;
                        System.out.println(" Enter desired range:");
                        inputRange = scan.nextInt();
                        while (inputRange < 0){
                            //enter exception here for negative number input
                            System.out.println(" Enter desired range:");
                            inputRange = scan.nextInt();
                        }
                        //rangeSelected = inputRange;
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
                                System.out.println(" Default color selected");
                                colorSelected = "Black";
                        }
                    }else{
                        colorSelected = "Black";
                    }

                if(isSemi){
                    Diesel semiTruck = new Diesel(rangeSelected, colorSelected, true);
                    semiTruck.displayInfo();
                }else{
                    Diesel truck = new Diesel(rangeSelected, colorSelected, false);
                    truck.displayInfo();
                }
                break;

            }




        }


    }
}
