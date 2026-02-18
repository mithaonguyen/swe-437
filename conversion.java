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
import java.io.*;
import java.util.*;
import java.lang.*;

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

    private float convertF2C(String FAsStr) { // Convert farenheit to celsius
        float num1, num2; // temporary variables
        int n; // temporary variable
        // Round to 2 digits past decimal
        num1 = (Float.valueOf(FAsStr).floatValue());
        n = Math.round(num1 * (float) 100.0);
        num1 = (float) (n / (float) 100.0);
        // Convert
        num2 = (float) (((num1 - 32.0) * 5.0) / 9.0);
        // Back to 2 digits
        n = Math.round(num2 * (float) 100.0);
        num2 = (float) (n / (float) 100.0);
        return (num2);
    }

    private float convertC2F(String CAsStr) { // Convert celsius to fahrenheit
        float num1, num2; // temporary variables
        int n; // temporary variable
        // Round to 2 digits past decimal
        num1 = (Float.valueOf(CAsStr).floatValue());
        n = Math.round(num1 * (float) 100.0);
        num1 = (float) (n / (float) 100.0);
        // Convert
        num2 = (float) ((num1 * 9.0 / 5.0) + 32.0);
        // Back to 2 digits
        n = Math.round(num2 * (float) 100.0);
        num2 = (float) (n / (float) 100.0);
        return (num2);
    }

    // small distance
    private float convertIn2Cm(String inAsStr) { // Convert inches to centimeters
        float num1, num2; // temporary variables
        int n; // temporary variable
        // Round to 2 digits past decimal
        num1 = (Float.valueOf(inAsStr).floatValue());
        n = Math.round(num1 * (float) 100.0);
        num1 = (float) (n / (float) 100.0);
        // Convert
        num2 = (float) (num1 * 2.54);
        // Back to 2 digits
        n = Math.round(num2 * (float) 100.0);
        num2 = (float) (n / (float) 100.0);
        return (num2);
    }

    private float convertCm2In(String cmAsStr) { // Convert centimeters to inches
        float num1, num2; // temporary variables
        int n; // temporary variable
        // Round to 2 digits past decimal
        num1 = (Float.valueOf(cmAsStr).floatValue());
        n = Math.round(num1 * (float) 100.0);
        num1 = (float) (n / (float) 100.0);
        // Convert
        num2 = (float) (num1 * 0.3937);
        // Back to 2 digits
        n = Math.round(num2 * (float) 100.0);
        num2 = (float) (n / (float) 100.0);
        return (num2);
    }

    // medium distance
    private float convertF2M(String ftAsStr) { // Convert feet to meters
        float num1, num2; // temporary variables
        int n; // temporary variable
        // Round to 2 digits past decimal
        num1 = (Float.valueOf(ftAsStr).floatValue());
        n = Math.round(num1 * (float) 100.0);
        num1 = (float) (n / (float) 100.0);
        // Convert
        num2 = (float) (num1 * 0.3048);
        // Back to 2 digits
        n = Math.round(num2 * (float) 100.0);
        num2 = (float) (n / (float) 100.0);
        return (num2);
    }

    private float convertM2F(String mAsStr) { // Convert meters to feet
        float num1, num2; // temporary variables
        int n; // temporary variable
        // Round to 2 digits past decimal
        num1 = (Float.valueOf(mAsStr).floatValue());
        n = Math.round(num1 * (float) 100.0);
        num1 = (float) (n / (float) 100.0);
        // Convert
        num2 = (float) (num1 / 0.3048);
        // Back to 2 digits
        n = Math.round(num2 * (float) 100.0);
        num2 = (float) (n / (float) 100.0);
        return (num2);
    }

    // large distance
    private float convertM2K(String miAsStr) { // Convert miles to kilometers
        float num1, num2; // temporary variables
        int n; // temporary variable
        // Round to 2 digits past decimal
        num1 = (Float.valueOf(miAsStr).floatValue());
        n = Math.round(num1 * (float) 100.0);
        num1 = (float) (n / (float) 100.0);
        // Convert
        num2 = (float) (num1 * 1.609);
        // Back to 2 digits
        n = Math.round(num2 * (float) 100.0);
        num2 = (float) (n / (float) 100.0);
        return (num2);
    }

    private float convertK2M(String kmAsStr) { // Convert kilometers to miles
        float num1, num2; // temporary variables
        int n; // temporary variable
        // Round to 2 digits past decimal
        num1 = (Float.valueOf(kmAsStr).floatValue());
        n = Math.round(num1 * (float) 100.0);
        num1 = (float) (n / (float) 100.0);
        // Convert
        num2 = (float) (num1 * 0.6214);
        // Back to 2 digits
        n = Math.round(num2 * (float) 100.0);
        num2 = (float) (n / (float) 100.0);
        return (num2);
    }

    // volume
    private float convertG2L(String galAsStr) { // Convert gallons to liters
        float num1, num2; // temporary variables
        int n; // temporary variable
        // Round to 2 digits past decimal
        num1 = (Float.valueOf(galAsStr).floatValue());
        n = Math.round(num1 * (float) 100.0);
        num1 = (float) (n / (float) 100.0);
        // Convert
        num2 = (float) (num1 * 3.785);
        // Back to 2 digits
        n = Math.round(num2 * (float) 100.0);
        num2 = (float) (n / (float) 100.0);
        return (num2);
    }

    private float convertL2G(String LAsStr) { // Convert liters to gallons
        float num1, num2; // temporary variables
        int n; // temporary variable
        // Round to 2 digits past decimal
        num1 = (Float.valueOf(LAsStr).floatValue());
        n = Math.round(num1 * (float) 100.0);
        num1 = (float) (n / (float) 100.0);
        // Convert
        num2 = (float) (num1 / 3.785);
        // Back to 2 digits
        n = Math.round(num2 * (float) 100.0);
        num2 = (float) (n / (float) 100.0);
        return (num2);
    }

    // small weight
    private float convertOz2G(String ozAsStr) { // Convert ounces to grams
        float num1, num2; // temporary variables
        int n; // temporary variable
        // Round to 2 digits past decimal
        num1 = (Float.valueOf(ozAsStr).floatValue());
        n = Math.round(num1 * (float) 100.0);
        num1 = (float) (n / (float) 100.0);
        // Convert
        num2 = (float) (num1 * 28.35);
        // Back to 2 digits
        n = Math.round(num2 * (float) 100.0);
        num2 = (float) (n / (float) 100.0);
        return (num2);
    }

    private float convertG2Oz(String gAsStr) { // Convert grams to ounces
        float num1, num2; // temporary variables
        int n; // temporary variable
        // Round to 2 digits past decimal
        num1 = (Float.valueOf(gAsStr).floatValue());
        n = Math.round(num1 * (float) 100.0);
        num1 = (float) (n / (float) 100.0);
        // Convert
        num2 = (float) (num1 / 28.35);
        // Back to 2 digits
        n = Math.round(num2 * (float) 100.0);
        num2 = (float) (n / (float) 100.0);
        return (num2);
    }

    // medium weight
    private float convertLb2K(String lbAsStr) { // Convert pounds to kilograms
        float num1, num2; // temporary variables
        int n; // temporary variable
        // Round to 2 digits past decimal
        num1 = (Float.valueOf(lbAsStr).floatValue());
        n = Math.round(num1 * (float) 100.0);
        num1 = (float) (n / (float) 100.0);
        // Convert
        num2 = (float) (num1 * 0.4536);
        // Back to 2 digits
        n = Math.round(num2 * (float) 100.0);
        num2 = (float) (n / (float) 100.0);
        return (num2);
    }

    private float convertK2Lb(String kgAsStr) { // Convert kilograms to pounds
        float num1, num2; // temporary variables
        int n; // temporary variable
        // Round to 2 digits past decimal
        num1 = (Float.valueOf(kgAsStr).floatValue());
        n = Math.round(num1 * (float) 100.0);
        num1 = (float) (n / (float) 100.0);
        // Convert
        num2 = (float) (num1 * 2.205);
        // Back to 2 digits
        n = Math.round(num2 * (float) 100.0);
        num2 = (float) (n / (float) 100.0);
        return (num2);
    }

    public static void main(String[] args) {
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

            System.out.print("\nEnter a digit [1-14] or [0] to exit: ");

            if (!input.hasNextInt()) {
                System.out.println("\nInvalid input, try again.");
                input.nextLine();
                continue;
            }
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 0) {
                isRunning = false;
                System.out.println("\nExiting program...");
                System.out.println();
            } else {
                System.out.print("\nEnter value to convert: ");
                String value = input.nextLine();

                float num;
                try {
                    num = Float.parseFloat(value);
                } catch (NumberFormatException e) {
                    System.out.println("\nInvalid input, try again.");
                    continue;
                }

                conversion convert = new conversion();
                float result = 0;

                switch (choice) {
                    case 1:
                        result = convert.convertF2C(value);
                        System.out.printf("%.2f Fahrenheit = %.2f Celsius\n", num, result);
                        break;
                    case 2:
                        result = convert.convertC2F(value);
                        System.out.printf("%.2f Celsius = %.2f Fahrenheit\n", num, result);
                        break;
                    case 3:
                        result = convert.convertIn2Cm(value);
                        System.out.printf("%.2f Inches = %.2f Centimeters\n", num, result);
                        break;
                    case 4:
                        result = convert.convertCm2In(value);
                        System.out.printf("%.2f Centimeters = %.2f Inches\n", num, result);
                        break;
                    case 5:
                        result = convert.convertF2M(value);
                        System.out.printf("%.2f Feet = %.2f Meters\n", num, result);
                        break;
                    case 6:
                        result = convert.convertM2F(value);
                        System.out.printf("%.2f Meters = %.2f Feet\n", num, result);
                        break;
                    case 7:
                        result = convert.convertM2K(value);
                        System.out.printf("%.2f Miles = %.2f Kilometers\n", num, result);
                        break;
                    case 8:
                        result = convert.convertK2M(value);
                        System.out.printf("%.2f Kilometers = %.2f Miles\n", num, result);
                        break;
                    case 9:
                        result = convert.convertG2L(value);
                        System.out.printf("%.2f Gallons = %.2f Liters\n", num, result);
                        break;
                    case 10:
                        result = convert.convertL2G(value);
                        System.out.printf("%.2f Liters = %.2f Gallons\n", num, result);
                        break;
                    case 11:
                        result = convert.convertOz2G(value);
                        System.out.printf("%.2f Ounces = %.2f Grams\n", num, result);
                        break;
                    case 12:
                        result = convert.convertG2Oz(value);
                        System.out.printf("%.2f Grams = %.2f Ounces\n", num, result);
                        break;
                    case 13:
                        result = convert.convertLb2K(value);
                        System.out.printf("%.2f Pounds = %.2f Kilograms\n", num, result);
                        break;
                    case 14:
                        result = convert.convertK2Lb(value);
                        System.out.printf("%.2f Kilograms = %.2f Pounds\n", num, result);
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