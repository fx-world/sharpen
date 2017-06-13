package sharpen.behaviour;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@SuppressWarnings("ConstantConditions")
public class BehaviourTest {

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

}
