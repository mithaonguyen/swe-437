/** *****************************************************************
    conversion.java
    Converts various measures from one unit to another

    @author Jeff Offutt & Ren Li
    @author 3.0 - Mimi Nguyen

        @version 1.0    October 2000
        @version 2.0    June 2015
        @version 2.1    January 2020
        @version 3.0    February 2026
********************************************************************* */

// Import Java Libraries
import java.util.*;

// conversion class
//
// CONSTRUCTOR: no constructor specified (default)
//
// ****************  PUBLIC OPERATIONS  **********************************
// void  doGet()      --> Uses PrintHead() and PrintForm() to print the screen
// void  PrintHead()  --> Generates the head of the web page
// void  PrintForm()  --> Generates the form of the web page
// void  doPost()     --> Handles the conversions
// float convertX2Y() --> One for each conversion pair
//*************************************************************************
//
// The possible IOException on the PrintWriter is thrown up.

public class conversion {

    /**
     * *****************************************************
     * Overrides HttpServlet's doPost().
     * Converts each entry in the form and prints the results
     * at the top of an HTML page.
     * The new values are printed in red (#FF0000).
     */

    private int precision = 2;

    public double round(double num) {
        double scale = Math.pow(10, precision);
        return Math.round(num * scale) / scale;
    }

    public double convertF2C(double f) { // Convert farenheit to celsius
        return round((f - 32.0) * (5.0 / 9.0));
    }

    public double convertC2F(double c) { // Convert celsius to fahrenheit
        return round((c * 9.0 / 5.0) + 32.0);
    }

    // small distance
    public double convertIn2Cm(double in) { // Convert inches to centimeters
        return round(in * 2.54);
    }

    public double convertCm2In(double cm) { // Convert centimeters to inches
        return round(cm * 0.3937);
    }

    // medium distance
    public double convertF2M(double ft) { // Convert feet to meters
        return round(ft * 0.3048);
    }

    public double convertM2F(double m) { // Convert meters to feet
        return round(m / 0.3048);
    }

    // large distance
    public double convertM2K(double mi) { // Convert miles to kilometers
        return round(mi * 1.609);
    }

    public double convertK2M(double km) { // Convert kilometers to miles
        return round(km * 0.6214);
    }

    // volume
    public double convertG2L(double gal) { // Convert gallons to liters
        return round(gal * 3.785);
    }

    public double convertL2G(double L) { // Convert liters to gallons
        return round(L / 3.785);
    }

    // small weight
    public double convertOz2G(double oz) { // Convert ounces to grams
        return round(oz * 28.3495);
    }

    public double convertG2Oz(double g) { // Convert grams to ounces
        return round(g / 28.3495);
    }

    // medium weight
    public double convertLb2K(double lb) { // Convert pounds to kilograms
        return round(lb * 0.4536);
    }

    public double convertK2Lb(double kg) { // Convert kilograms to pounds
        return round(kg / 0.4536);
    }

    public double convertH2S(double val) { // Convert hours to seconds
        return round(val * 3600.0);
    }

    public double convertS2H(double val) { // Convert seconds to hours
        return round(val / 3600.0);
    }

    public double convertMph2Kph(double mph) { // Convert miles per hour to kilometers per hour
        return round(mph * 1.609); //in conversion.java, green
    }

    public double convertKph2Mph(double kph) { // Convert kilometers per hour to miles per hour
        return round(kph / 1.609); //in conversion.java, green
    }

    public double convertC2K(double c) { // Convert Celsius to Kelvin
        return round(c + 273.15); //in conversion.java, green
    }

    public double convertK2C(double k) { // Convert Kelvin to Celsius
        return round(k - 273.15); //in conversion.java, green
    }

    public static void main(String[] args) {
        conversion convert = new conversion();
        boolean isRunning = true;
        Scanner input = new Scanner(System.in);

        while (isRunning) {
            System.out.println("\nUnit Conversion Program");

            System.out.println("\n[0] Exit");
            System.out.println("[1] Fahrenheit to Celsius");
            System.out.println("[2] Celsius to Fahrenheit");
            System.out.println("[3] Inches to Centimeters");
            System.out.println("[4] Centimeters to Inches");
            System.out.println("[5] Feet to Meters");
            System.out.println("[6] Meters to Feet");
            System.out.println("[7] Miles to Kilometers");
            System.out.println("[8] Kilometers to Miles");
            System.out.println("[9] Gallons to Liters");
            System.out.println("[10] Liters to Gallons");
            System.out.println("[11] Ounces to Grams");
            System.out.println("[12] Grams to Ounces");
            System.out.println("[13] Pounds to Kilograms");
            System.out.println("[14] Kilograms to Pounds");
            System.out.println("[15] Hours to Seconds");
            System.out.println("[16] Seconds to Hours");
            System.out.println("[17] Miles per Hour to Kilometers per Hour");
            System.out.println("[18] Kilometers per Hour to Miles per Hour");
            System.out.println("[19] Celsius to Kelvin");
            System.out.println("[20] Kelvin to Celsius");

            System.out.print("\nEnter a digit [1-20] or [0] to exit: ");

            if (!input.hasNextInt()) {
                System.out.println("\nInvalid input, try again.");
                input.nextLine();
                continue;
            }
            int choice = input.nextInt();
            input.nextLine();

            if (choice < 0 || choice > 20) {
                System.out.println("\nInvalid input, try again.");
                continue;
            }

            if (choice == 0) {
                isRunning = false;
                System.out.println("\nExiting program...");
                System.out.println();
            } else {
                System.out.print("Enter decimal precision [0-4]: ");

                if (!input.hasNextInt()) {
                    System.out.println("\nInvalid input, try again.");
                    input.nextLine();
                    continue;
                }

                int newprec = input.nextInt();
                input.nextLine();
                if (newprec >= 0 && newprec <= 4) {
                    convert.precision = newprec;
                } else {
                    System.out.println("\nInvalid input, try again.");
                    continue;
                }

                System.out.print("Enter value to convert: ");
                String value = input.nextLine();

                double num;
                try {
                    num = Double.parseDouble(value);
                } catch (NumberFormatException e) {
                    System.out.println("\nInvalid input, try again.");
                    continue;
                }

                double result = 0;
                switch (choice) {
                    case 1:
                        result = convert.convertF2C(num);
                        System.out.println("\n"+ num +" Fahrenheit = "+ result +" Celsius");
                        break;
                    case 2:
                        result = convert.convertC2F(num);
                        System.out.println("\n"+ num +" Celsius = "+ result +" Fahrenheit");
                        break;
                    case 3:
                        result = convert.convertIn2Cm(num);
                        System.out.println("\n"+ num +" Inches = "+ result +" Centimeters");
                        break;
                    case 4:
                        result = convert.convertCm2In(num);
                        System.out.println("\n"+ num +" Centimeters = "+ result +" Inches");
                        break;
                    case 5:
                        result = convert.convertF2M(num);
                        System.out.println("\n"+ num +" Feet = "+ result +" Meters");
                        break;
                    case 6:
                        result = convert.convertM2F(num);
                        System.out.println("\n"+ num +" Meters = "+ result +" Feet");
                        break;
                    case 7:
                        result = convert.convertM2K(num);
                        System.out.println("\n"+ num +" Miles = "+ result +" Kilometers");
                        break;
                    case 8:
                        result = convert.convertK2M(num);
                        System.out.println("\n"+ num +" Kilometers = "+ result +" Miles");
                        break;
                    case 9:
                        result = convert.convertG2L(num);
                        System.out.println("\n"+ num +" Gallons = "+ result +" Liters");
                        break;
                    case 10:
                        result = convert.convertL2G(num);
                        System.out.println("\n"+ num +" Liters = "+ result +" Gallons");
                        break;
                    case 11:
                        result = convert.convertOz2G(num);
                        System.out.println("\n"+ num +" Ounces = "+ result +" Grams");
                        break;
                    case 12:
                        result = convert.convertG2Oz(num);
                        System.out.println("\n"+ num +" Grams = "+ result +" Ounces");
                        break;
                    case 13:
                        result = convert.convertLb2K(num);
                        System.out.println("\n"+ num +" Pounds = "+ result +" Kilograms");
                        break;
                    case 14:
                        result = convert.convertK2Lb(num);
                        System.out.println("\n"+ num +" Kilograms = "+ result +" Pounds");
                        break;
                    case 15:
                        result = convert.convertH2S(num);
                        System.out.println("\n"+ num +" Hours = "+ result +" Seconds");
                        break;
                    case 16:
                        result = convert.convertS2H(num);
                        System.out.println("\n"+ num +" Seconds = "+ result +" Hours");
                        break;
                    case 17:
                        result = convert.convertMph2Kph(num);
                        System.out.println("\n"+ num +" Miles per Hour = "+ result +" Kilometers per Hour");
                        break;
                    case 18:
                        result = convert.convertKph2Mph(num);
                        System.out.println("\n"+ num +" Kilometers per Hour = "+ result +" Miles per Hour");
                        break;
                    case 19:
                        result = convert.convertC2K(num);
                        System.out.println("\n"+ num +" Celsius = "+ result +" Kelvin");
                        break;
                    case 20:
                        result = convert.convertK2C(num);
                        System.out.println("\n"+ num +" Kelvin = "+ result +" Celsius");
                        break;
                    default:
                        System.out.println("\nInvalid input, try again.");
                        continue;
                }
            }
        }
        input.close();
    }
}