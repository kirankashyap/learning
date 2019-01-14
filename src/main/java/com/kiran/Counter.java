package com.kiran;

public class Counter {

    public static String countString(int countUpto) {
        String returnValue = "";
        for (int counter = 1; counter <= countUpto; counter++) {
            if (counter == 1) {
                returnValue = returnValue + counter + " missisippi";
            } else {
                returnValue = returnValue + " " + counter + " missisippi";
            }

        }
        return returnValue;
    }


}
