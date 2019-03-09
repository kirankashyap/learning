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
        assertEquals("1 missisippi 2 missisippi  missisippi 4 missisippi 5 missisippi 6 missisippi 7 missisippi", Counter.countString(7));
    }


}
