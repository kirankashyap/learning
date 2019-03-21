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
                    String text = " mississipi";
                    if(counter % 3 == 0){
                        if(counter % 5 == 0){
                            text = " fizz buzz";
                        } else {
                            text = " fizz";
                        }
                    } else {
                        if(counter % 5 == 0){
                            text = " buzz";
                        }
                    }
                    returnValue = returnValue + " " + counter + text;
                }

            }
        }
        return returnValue;
    }


}
