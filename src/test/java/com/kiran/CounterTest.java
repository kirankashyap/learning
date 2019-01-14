package com.kiran;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CounterTest {

    @Test
    public void dummyTest(){
        assertTrue(true);
    }

    @Test
    public void testForFour(){
        assertEquals("1 missisippi 2 missisippi 3 missisippi 4 missisippi", Counter.countString(4));
    }


}
