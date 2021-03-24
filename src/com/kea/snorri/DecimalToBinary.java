package com.kea.snorri;

//Singleton Pattern Class
public class DecimalToBinary {
    private static DecimalToBinary uniqueInstance;
    private DecimalToBinary(){}

    public static DecimalToBinary getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new DecimalToBinary();
        }
        return uniqueInstance;
    }
    public String decimalToBinary(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
                sb.append("0");
            }
            else {
                n = n / 2;
                sb.append("1");
            }
        }
        return reverseString(sb.toString());
    }
    // A method that turns Strings around
    public String reverseString(String input){
        char[] charArray = input.toCharArray();
        int begin = 0;
        int end = charArray.length-1;
        char temp;
        while(end > begin) {
            temp = charArray[begin];
            charArray[begin] = charArray[end];
            charArray[end] = temp;
            end--;
            begin++;
        }
        return new String(charArray);
    }
}
