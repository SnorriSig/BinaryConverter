package com.kea.snorri;

public class NegativeDecimalToBinary {
    //Singleton Pattern Class
    private static NegativeDecimalToBinary uniqueInstance;
    private NegativeDecimalToBinary(){}

    public static NegativeDecimalToBinary getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new NegativeDecimalToBinary();
        }
        return uniqueInstance;
    }
    public String negativeDecimalToBinary(int n) {
        if (n>0) {
            System.out.println("** Please insert a negative number **");
            return null;
        }
        if (n > -131072 && n < 0) {
            n += 131072;
        }
        if (n < -65536) {
            System.out.println("Smallest decimal input is -65535");
            System.out.println("Try again...");
        }

        return DecimalToBinary.getInstance().decimalToBinary(n);
    }
}


/*
        8-bit
        if (n > -256 && n < 0) {
            n += 256;
        }
        if (n < -128) {
            System.out.println("Smallest decimal input is -127");
            System.out.println("Try again...");
        }
 */
//http://string-functions.com/decimal-binary.aspx