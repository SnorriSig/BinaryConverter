package com.kea.snorri;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcController {
    public static void run() {
        boolean sentinel = true;
        do {
            printMenu();
            try {
                Scanner console = new Scanner(System.in);
                ChooseEnum input = ChooseEnum.valueOf(console.next().toLowerCase());
                switch (input) {
                    case b -> {
                        System.out.print("Enter binary: ");
                        int binary = console.nextInt();
                        System.out.println("Decimal number is: " + BinaryToDecimal.getInstance().binaryToDecimal(String.valueOf(binary)));
                    }
                    case d -> {
                        System.out.print("Enter decimal: ");
                        int decimal = console.nextInt();
                        System.out.println("Binary number is: " + DecimalToBinary.getInstance().decimalToBinary(decimal));
                    }
                    case n -> {
                        System.out.print("Enter a negative decimal: ");
                        int negativeDecimal = console.nextInt();
                        System.out.println("2' Component negative binary is: " + NegativeDecimalToBinary.getInstance().negativeDecimalToBinary(negativeDecimal));
                    }
                    case q -> {
                        sentinel = false;
                        System.out.println("** Program is terminating **");
                    }
                }
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException");
                System.out.println("** Not valid input **");
                System.out.println("Please try again... ");
            } catch (InputMismatchException e) {
                System.out.println("InputMissMatchException");
                System.out.println("** Not valid input **");
                System.out.println("\"Please enter an decimal between -65535 <= 2 147 483 647\"");
                System.out.println("\"or binary 0 < 10b-bit\"");
                System.out.println("Please try again... ");
            } catch (Exception e) {
                System.out.println("** Unexpected Error **");
            }
        } while (sentinel);
    }
    public static void printMenu() {
        System.out.println();
        System.out.println("     ***************************************************************");
        System.out.println("     *                                                             *");
        System.out.println("     *                      -BINARY CONVERTER-                     *");
        System.out.println("     *  This is a binary to decimal / decimal to binary converter  *");
        System.out.println("     *                                                             *");
        System.out.println("     *           To convert binary to decimal press |B|            *");
        System.out.println("     *           To convert decimal to binary press |D|            *");
        System.out.println("     *  To convert negative decimal to 16-bit 2's complement |N|   *");
        System.out.println("     *                     To quit press |Q|                       *");
        System.out.println("     *                                                             *");
        System.out.println("     ***************************************************************");
        System.out.print(": ");
    }
}