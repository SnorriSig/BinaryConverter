package com.kea.snorri;

//Singleton Pattern Class
public class BinaryToDecimal {
    private static BinaryToDecimal uniqueInstance;
    private BinaryToDecimal() {}

    public static BinaryToDecimal getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new BinaryToDecimal();
        }
        return uniqueInstance;
    }
    public int binaryToDecimal(String binary) {
        char[] arrChar = binary.toCharArray();
        int[] arrInt = new int[arrChar.length];
        int decimal = 0;
        for (int i = 0; i < arrChar.length; i++) {
            arrInt[i] = (int) Math.pow(2, i);
        }
        reverse(arrInt);
        for (int j = 0; j < arrChar.length; j++) {
            if (arrChar[j] == '0') {
                arrInt[j] = 0;
            }
            decimal += arrInt[j];
        }
        return decimal;
    }
    // public static String negativeDecimalToBinary()
    // A pair of methods that turns array around
    public void reverse(int[] list) {
        for (int i = 0; i < list.length / 2; i++) {
            int j = list.length -i -1;
            swap(list, i, j);
        }
    }
    public void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }


}
