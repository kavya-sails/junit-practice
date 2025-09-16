package com.learnings.junit.mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class ListMockTest {

    @Test
    public void mockListSize() {
        List list = mock(List.class);
        Mockito.when(list.size()).thenReturn(10);
        assertEquals(10, list.size());
    }

    @Test
    public void mockListSizeWithMultipleReturnValues() {
        List list = mock(List.class);
        Mockito.when(list.size()).thenReturn(10).thenReturn(20);
        assertEquals(10, list.size());
        assertEquals(20, list.size());
    }

    @Test
    public void mockListGet() {
        List<String> list = mock(List.class);
        Mockito.when(list.get(0)).thenReturn("kavya");
        assertEquals("kavya", list.get(0));
        assertNull(list.get(1));
    }

    @Test
    public void mockListGetWithAny() {
        List<String> list = mock(List.class);
        Mockito.when(list.get(Mockito.anyInt())).thenReturn("kavya");
        assertEquals("kavya", list.get(0));
        assertEquals("kavya", list.get(1));
    }

}
