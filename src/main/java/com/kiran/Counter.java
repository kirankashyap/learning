package com.kiran;

public class Counter {

    public static String countString(int countUpto) {
        String returnValue = "";
        for (int counter = 1; counter <= countUpto; counter++) {
            if (counter == 1) {
                returnValue = returnValue + counter ;
            } else {
                returnValue = returnValue + " " + counter;
            }

        }
        return returnValue;
    }


}
