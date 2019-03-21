package com.kiran;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class CounterTest {

    @Test
    public void dummyTest(){
        assertTrue(true);
    }

    @Test
    public void testForFour(){
        assertEquals("1 2 3 4 5 6", Counter.countString(6,false));
    }


}
