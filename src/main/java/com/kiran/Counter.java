package com.kiran;

public class Counter {

    public static String countString(int countUpto, boolean iAmRoss) {
        String returnValue = "";

        if(!iAmRoss) {
            for (int counter = 1; counter <= countUpto; counter++) {
                if (counter == 1) {
                    returnValue = returnValue + counter;
                } else {
                    returnValue = returnValue + " " + counter;
                }

            }
        } else {
            for (int counter = 1; counter <= countUpto; counter++) {
                if (counter == 1) {
                    returnValue = returnValue + counter + " mississipi";
                } else {
                    returnValue = returnValue + " " + counter + " mississipi";
                }

            }
        }
        return returnValue;
    }


}
