package labReferencesGIVE_TO_STUDENTS;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleClassTest {

    @Test
    public void constructor() {
        SimpleClass s = new SimpleClass(2);
        assertEquals(2, s.getValue());
    }

    @Test
    public void testToString() {
        SimpleClass s = new SimpleClass(2);
        assertEquals(2, s.getValue());
    }

    @Test
    public void incr() {
        SimpleClass s = new SimpleClass(2);
        for (int i = 0; i < 100; i++)
            s.incr();
        assertEquals(101, s.getValue());
    }

    @Test
    public void getValue() {
        SimpleClass s = new SimpleClass(20);
        assertEquals(20, s.getValue());
    }

    @Test
    public void setValue() {
        SimpleClass s = new SimpleClass(20);
        s.setValue(10);
        assertEquals(10, s.getValue());
    }

    @Test
    public void staticTest () {
        // your code goes here
    }
}