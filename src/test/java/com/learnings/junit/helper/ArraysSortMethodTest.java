package com.learnings.junit.helper;


import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysSortMethodTest {

    @Test
    public void testArraySort_RandomArray() {
        int[] numbers = { 24, 3, 4, 1 };
        int[] expected = { 1, 3, 4, 24 };
//        assertArrayEquals(expected, numbers);
        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }

    @Test(expected=NullPointerException.class)
    public void testArraySort_NullArray() {
        int[] numbers = null;
        Arrays.sort(numbers);
    }

    // milliseconds
//    @Test(timeout=10)
    @Test(timeout = 100)
    public void testSort_Performance(){
        int array[] = {1,2,3,4,5,6,12,2,12,2,1,3,1,4,134,12,2352};
        for(int i=1;i<=1000000;i++)
        {
            array[0] = i;
            Arrays.sort(array);
        }
    }

}
