package sharpen.integration;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

@SuppressWarnings("ConstantConditions")
// Integration tests could be run by comman:
//  mvn integration-test -Pintegration -Dtest=**/integration/*
public class IntegrationTest {

    @Test
    public void isInstanceOf() {
        Object list = new ArrayList<>();
        assertTrue(list instanceof List);
        assertTrue(list instanceof ArrayList);
        assertTrue(list instanceof Object);
        assertFalse(list instanceof LinkedList);
        assertFalse(list instanceof HashSet);
        assertFalse(list instanceof Thread);
    }

    @Test
    public void isAssignableFrom() {
        Object list = new ArrayList<>();
        assertTrue(List.class.isAssignableFrom(list.getClass()));
        assertFalse(list.getClass().isAssignableFrom(List.class));
        assertTrue(ArrayList.class.isAssignableFrom(list.getClass()));
        assertTrue(list.getClass().isAssignableFrom(ArrayList.class));
        assertFalse(LinkedList.class.isAssignableFrom(list.getClass()));
    }

    @Test
    public void linkedList() {
        LinkedList<String> list = new LinkedList<>();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        assertEquals(Arrays.asList("1", "2", "3"), list);

        list.addFirst("0");
        assertEquals(Arrays.asList("0", "1", "2", "3"), list);

        assertEquals("0", list.removeFirst());
        assertEquals("3", list.removeLast());
        assertEquals(Arrays.asList("1", "2"), list);

        list.clear();
        try {
            list.removeFirst();
            fail();
        } catch (RuntimeException expected) {
        }
        try {
            list.removeLast();
            fail();
        } catch (RuntimeException expected) {
        }
    }

    @Test
    public void mathRound() {
        assertEquals(1, Math.round(1.4f));
        assertEquals(1, Math.round(1.4));
        assertEquals(2, Math.round(1.6f));
        assertEquals(2, Math.round(1.6));
        assertEquals(2, Math.round(1.5f));
        assertEquals(2, Math.round(1.5));
        assertEquals(3, Math.round(2.5f));
        assertEquals(3, Math.round(2.5));
        assertEquals(-1, Math.round(-1.4f));
        assertEquals(-1, Math.round(-1.4));
        assertEquals(-2, Math.round(-1.6f));
        assertEquals(-2, Math.round(-1.6));
        assertEquals(-1, Math.round(-1.5f));
        assertEquals(-1, Math.round(-1.5));
        assertEquals(-2, Math.round(-2.5f));
        assertEquals(-2, Math.round(-2.5));
    }

}
