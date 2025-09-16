package com.learnings.junit.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SpyTest {

    @Test
    public void creatingASpyOnArrayList() {
        List<String> listSpy = spy(ArrayList.class);
        listSpy.add("kavya");
        listSpy.add("fun");

        verify(listSpy).add("kavya");
        verify(listSpy).add("fun");

        assertEquals(2, listSpy.size());
        assertEquals("kavya", listSpy.get(0));
    }

}