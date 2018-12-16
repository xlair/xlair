package io.github.xlair;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class XlairLineTest {

    private static List<Long> executedTimes = new ArrayList<>();

    private long start;
    private long end;
    private long elapsed;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // warming up
        Xlair.isOverlap(new Line(1, 2), new Line(2, 3));
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        Double reult = executedTimes.stream().collect(Collectors.averagingLong(Long::longValue));
        System.out.println("[AVERAGE] : " + reult + " (ns)");
    }

    @Test
    public void testIsOverlapLine01() {
        Line l1 = new Line(8, 10);
        Line l1r = new Line(18, -10);
        Line l2 = new Line(21, 4);
        Line l2r = new Line(25, -4);

        assertFalse(isOverlapWrapper(l1, l2));
        assertFalse(isOverlapWrapper(l1r, l2));
        assertFalse(isOverlapWrapper(l1, l2r));
        assertFalse(isOverlapWrapper(l1r, l2r));

        assertFalse(isOverlapWrapper(l2, l1));
        assertFalse(isOverlapWrapper(l2, l1r));
        assertFalse(isOverlapWrapper(l2r, l1));
        assertFalse(isOverlapWrapper(l2r, l1r));
    }

    @Test
    public void testIsOverlapLine02() {
        Line l1 = new Line(8, 10);
        Line l1r = new Line(18, -10);
        Line l2 = new Line(18, 5);
        Line l2r = new Line(23, -5);

        assertFalse(isOverlapWrapper(l1, l2));
        assertFalse(isOverlapWrapper(l1r, l2));
        assertFalse(isOverlapWrapper(l1, l2r));
        assertFalse(isOverlapWrapper(l1r, l2r));

        assertFalse(isOverlapWrapper(l2, l1));
        assertFalse(isOverlapWrapper(l2, l1r));
        assertFalse(isOverlapWrapper(l2r, l1));
        assertFalse(isOverlapWrapper(l2r, l1r));
    }

    @Test
    public void testIsOverlapLine03() {
        Line l1 = new Line(8, 10);
        Line l1r = new Line(18, -10);
        Line l2 = new Line(16, 5);
        Line l2r = new Line(21, -5);

        assertTrue(isOverlapWrapper(l1, l2));
        assertTrue(isOverlapWrapper(l1r, l2));
        assertTrue(isOverlapWrapper(l1, l2r));
        assertTrue(isOverlapWrapper(l1r, l2r));

        assertTrue(isOverlapWrapper(l2, l1));
        assertTrue(isOverlapWrapper(l2, l1r));
        assertTrue(isOverlapWrapper(l2r, l1));
        assertTrue(isOverlapWrapper(l2r, l1r));
    }

    @Test
    public void testIsOverlapLine04() {
        Line l1 = new Line(8, 10);
        Line l1r = new Line(18, -10);
        Line l2 = new Line(8, 12);
        Line l2r = new Line(20, -12);

        assertTrue(isOverlapWrapper(l1, l2));
        assertTrue(isOverlapWrapper(l1r, l2));
        assertTrue(isOverlapWrapper(l1, l2r));
        assertTrue(isOverlapWrapper(l1r, l2r));

        assertTrue(isOverlapWrapper(l2, l1));
        assertTrue(isOverlapWrapper(l2, l1r));
        assertTrue(isOverlapWrapper(l2r, l1));
        assertTrue(isOverlapWrapper(l2r, l1r));
    }

    @Test
    public void testIsOverlapLine05() {
        Line l1 = new Line(8, 10);
        Line l1r = new Line(18, -10);
        Line l2 = new Line(12, 6);
        Line l2r = new Line(18, -6);

        assertTrue(isOverlapWrapper(l1, l2));
        assertTrue(isOverlapWrapper(l1r, l2));
        assertTrue(isOverlapWrapper(l1, l2r));
        assertTrue(isOverlapWrapper(l1r, l2r));

        assertTrue(isOverlapWrapper(l2, l1));
        assertTrue(isOverlapWrapper(l2, l1r));
        assertTrue(isOverlapWrapper(l2r, l1));
        assertTrue(isOverlapWrapper(l2r, l1r));
    }

    @Test
    public void testIsOverlapLine06() {
        Line l1 = new Line(8, 10);
        Line l1r = new Line(18, -10);
        Line l2 = new Line(10, 6);
        Line l2r = new Line(16, -6);

        assertTrue(isOverlapWrapper(l1, l2));
        assertTrue(isOverlapWrapper(l1r, l2));
        assertTrue(isOverlapWrapper(l1, l2r));
        assertTrue(isOverlapWrapper(l1r, l2r));

        assertTrue(isOverlapWrapper(l2, l1));
        assertTrue(isOverlapWrapper(l2, l1r));
        assertTrue(isOverlapWrapper(l2r, l1));
        assertTrue(isOverlapWrapper(l2r, l1r));
    }

    @Test
    public void testIsOverlapLine07() {
        Line l1 = new Line(8, 10);
        Line l1r = new Line(18, -10);
        Line l2 = new Line(8, 10);
        Line l2r = new Line(18, -10);

        assertTrue(isOverlapWrapper(l1, l2));
        assertTrue(isOverlapWrapper(l1r, l2));
        assertTrue(isOverlapWrapper(l1, l2r));
        assertTrue(isOverlapWrapper(l1r, l2r));

        assertTrue(isOverlapWrapper(l2, l1));
        assertTrue(isOverlapWrapper(l2, l1r));
        assertTrue(isOverlapWrapper(l2r, l1));
        assertTrue(isOverlapWrapper(l2r, l1r));
    }

    @Test
    public void testIsOverlapLine08() {
        Line l1 = new Line(8, 10);
        Line l1r = new Line(18, -10);
        Line l2 = new Line(3, 17);
        Line l2r = new Line(20, -17);

        assertTrue(isOverlapWrapper(l1, l2));
        assertTrue(isOverlapWrapper(l1r, l2));
        assertTrue(isOverlapWrapper(l1, l2r));
        assertTrue(isOverlapWrapper(l1r, l2r));

        assertTrue(isOverlapWrapper(l2, l1));
        assertTrue(isOverlapWrapper(l2, l1r));
        assertTrue(isOverlapWrapper(l2r, l1));
        assertTrue(isOverlapWrapper(l2r, l1r));
    }

    @Test
    public void testIsOverlapLine09() {
        Line l1 = new Line(8, 10);
        Line l1r = new Line(18, -10);
        Line l2 = new Line(8, 4);
        Line l2r = new Line(12, -4);

        assertTrue(isOverlapWrapper(l1, l2));
        assertTrue(isOverlapWrapper(l1r, l2));
        assertTrue(isOverlapWrapper(l1, l2r));
        assertTrue(isOverlapWrapper(l1r, l2r));

        assertTrue(isOverlapWrapper(l2, l1));
        assertTrue(isOverlapWrapper(l2, l1r));
        assertTrue(isOverlapWrapper(l2r, l1));
        assertTrue(isOverlapWrapper(l2r, l1r));
    }

    @Test
    public void testIsOverlapLine10() {
        Line l1 = new Line(8, 10);
        Line l1r = new Line(18, -10);
        Line l2 = new Line(5, 13);
        Line l2r = new Line(18, -13);

        assertTrue(isOverlapWrapper(l1, l2));
        assertTrue(isOverlapWrapper(l1r, l2));
        assertTrue(isOverlapWrapper(l1, l2r));
        assertTrue(isOverlapWrapper(l1r, l2r));

        assertTrue(isOverlapWrapper(l2, l1));
        assertTrue(isOverlapWrapper(l2, l1r));
        assertTrue(isOverlapWrapper(l2r, l1));
        assertTrue(isOverlapWrapper(l2r, l1r));
    }

    @Test
    public void testIsOverlapLine11() {
        Line l1 = new Line(8, 10);
        Line l1r = new Line(18, -10);
        Line l2 = new Line(1, 14);
        Line l2r = new Line(15, -14);

        assertTrue(isOverlapWrapper(l1, l2));
        assertTrue(isOverlapWrapper(l1r, l2));
        assertTrue(isOverlapWrapper(l1, l2r));
        assertTrue(isOverlapWrapper(l1r, l2r));

        assertTrue(isOverlapWrapper(l2, l1));
        assertTrue(isOverlapWrapper(l2, l1r));
        assertTrue(isOverlapWrapper(l2r, l1));
        assertTrue(isOverlapWrapper(l2r, l1r));
    }

    @Test
    public void testIsOverlapLine12() {
        Line l1 = new Line(8, 10);
        Line l1r = new Line(18, -10);
        Line l2 = new Line(3, 5);
        Line l2r = new Line(8, -5);

        assertFalse(isOverlapWrapper(l1, l2));
        assertFalse(isOverlapWrapper(l1r, l2));
        assertFalse(isOverlapWrapper(l1, l2r));
        assertFalse(isOverlapWrapper(l1r, l2r));

        assertFalse(isOverlapWrapper(l2, l1));
        assertFalse(isOverlapWrapper(l2, l1r));
        assertFalse(isOverlapWrapper(l2r, l1));
        assertFalse(isOverlapWrapper(l2r, l1r));
    }

    @Test
    public void testIsOverlapLine13() {
        Line l1 = new Line(8, 10);
        Line l1r = new Line(18, -10);
        Line l2 = new Line(0, 4);
        Line l2r = new Line(4, -4);

        assertFalse(isOverlapWrapper(l1, l2));
        assertFalse(isOverlapWrapper(l1r, l2));
        assertFalse(isOverlapWrapper(l1, l2r));
        assertFalse(isOverlapWrapper(l1r, l2r));

        assertFalse(isOverlapWrapper(l2, l1));
        assertFalse(isOverlapWrapper(l2, l1r));
        assertFalse(isOverlapWrapper(l2r, l1));
        assertFalse(isOverlapWrapper(l2r, l1r));
    }

    @Test
    public void testIsOverlapOrContactLine01() {
        Line l1 = new Line(8, 10);
        Line l1r = new Line(18, -10);
        Line l2 = new Line(21, 4);
        Line l2r = new Line(25, -4);

        assertFalse(isOverlapOrContactWrapper(l1, l2));
        assertFalse(isOverlapOrContactWrapper(l1r, l2));
        assertFalse(isOverlapOrContactWrapper(l1, l2r));
        assertFalse(isOverlapOrContactWrapper(l1r, l2r));

        assertFalse(isOverlapOrContactWrapper(l2, l1));
        assertFalse(isOverlapOrContactWrapper(l2, l1r));
        assertFalse(isOverlapOrContactWrapper(l2r, l1));
        assertFalse(isOverlapOrContactWrapper(l2r, l1r));
    }

    @Test
    public void testIsOverlapOrContactLine02() {
        Line l1 = new Line(8, 10);
        Line l1r = new Line(18, -10);
        Line l2 = new Line(18, 5);
        Line l2r = new Line(23, -5);

        assertTrue(isOverlapOrContactWrapper(l1, l2));
        assertTrue(isOverlapOrContactWrapper(l1r, l2));
        assertTrue(isOverlapOrContactWrapper(l1, l2r));
        assertTrue(isOverlapOrContactWrapper(l1r, l2r));

        assertTrue(isOverlapOrContactWrapper(l2, l1));
        assertTrue(isOverlapOrContactWrapper(l2, l1r));
        assertTrue(isOverlapOrContactWrapper(l2r, l1));
        assertTrue(isOverlapOrContactWrapper(l2r, l1r));
    }

    @Test
    public void testIsOverlapOrContactLine03() {
        Line l1 = new Line(8, 10);
        Line l1r = new Line(18, -10);
        Line l2 = new Line(16, 5);
        Line l2r = new Line(21, -5);

        assertTrue(isOverlapOrContactWrapper(l1, l2));
        assertTrue(isOverlapOrContactWrapper(l1r, l2));
        assertTrue(isOverlapOrContactWrapper(l1, l2r));
        assertTrue(isOverlapOrContactWrapper(l1r, l2r));

        assertTrue(isOverlapOrContactWrapper(l2, l1));
        assertTrue(isOverlapOrContactWrapper(l2, l1r));
        assertTrue(isOverlapOrContactWrapper(l2r, l1));
        assertTrue(isOverlapOrContactWrapper(l2r, l1r));
    }

    @Test
    public void testIsOverlapOrContactLine04() {
        Line l1 = new Line(8, 10);
        Line l1r = new Line(18, -10);
        Line l2 = new Line(8, 12);
        Line l2r = new Line(20, -12);

        assertTrue(isOverlapOrContactWrapper(l1, l2));
        assertTrue(isOverlapOrContactWrapper(l1r, l2));
        assertTrue(isOverlapOrContactWrapper(l1, l2r));
        assertTrue(isOverlapOrContactWrapper(l1r, l2r));

        assertTrue(isOverlapOrContactWrapper(l2, l1));
        assertTrue(isOverlapOrContactWrapper(l2, l1r));
        assertTrue(isOverlapOrContactWrapper(l2r, l1));
        assertTrue(isOverlapOrContactWrapper(l2r, l1r));
    }

    @Test
    public void testIsOverlapOrContactLine05() {
        Line l1 = new Line(8, 10);
        Line l1r = new Line(18, -10);
        Line l2 = new Line(12, 6);
        Line l2r = new Line(18, -6);

        assertTrue(isOverlapOrContactWrapper(l1, l2));
        assertTrue(isOverlapOrContactWrapper(l1r, l2));
        assertTrue(isOverlapOrContactWrapper(l1, l2r));
        assertTrue(isOverlapOrContactWrapper(l1r, l2r));

        assertTrue(isOverlapOrContactWrapper(l2, l1));
        assertTrue(isOverlapOrContactWrapper(l2, l1r));
        assertTrue(isOverlapOrContactWrapper(l2r, l1));
        assertTrue(isOverlapOrContactWrapper(l2r, l1r));
    }

    @Test
    public void testIsOverlapOrContactLine06() {
        Line l1 = new Line(8, 10);
        Line l1r = new Line(18, -10);
        Line l2 = new Line(10, 6);
        Line l2r = new Line(16, -6);

        assertTrue(isOverlapOrContactWrapper(l1, l2));
        assertTrue(isOverlapOrContactWrapper(l1r, l2));
        assertTrue(isOverlapOrContactWrapper(l1, l2r));
        assertTrue(isOverlapOrContactWrapper(l1r, l2r));

        assertTrue(isOverlapOrContactWrapper(l2, l1));
        assertTrue(isOverlapOrContactWrapper(l2, l1r));
        assertTrue(isOverlapOrContactWrapper(l2r, l1));
        assertTrue(isOverlapOrContactWrapper(l2r, l1r));
    }

    @Test
    public void testIsOverlapOrContactLine07() {
        Line l1 = new Line(8, 10);
        Line l1r = new Line(18, -10);
        Line l2 = new Line(8, 10);
        Line l2r = new Line(18, -10);

        assertTrue(isOverlapOrContactWrapper(l1, l2));
        assertTrue(isOverlapOrContactWrapper(l1r, l2));
        assertTrue(isOverlapOrContactWrapper(l1, l2r));
        assertTrue(isOverlapOrContactWrapper(l1r, l2r));

        assertTrue(isOverlapOrContactWrapper(l2, l1));
        assertTrue(isOverlapOrContactWrapper(l2, l1r));
        assertTrue(isOverlapOrContactWrapper(l2r, l1));
        assertTrue(isOverlapOrContactWrapper(l2r, l1r));
    }

    @Test
    public void testIsOverlapOrContactLine08() {
        Line l1 = new Line(8, 10);
        Line l1r = new Line(18, -10);
        Line l2 = new Line(3, 17);
        Line l2r = new Line(20, -17);

        assertTrue(isOverlapOrContactWrapper(l1, l2));
        assertTrue(isOverlapOrContactWrapper(l1r, l2));
        assertTrue(isOverlapOrContactWrapper(l1, l2r));
        assertTrue(isOverlapOrContactWrapper(l1r, l2r));

        assertTrue(isOverlapOrContactWrapper(l2, l1));
        assertTrue(isOverlapOrContactWrapper(l2, l1r));
        assertTrue(isOverlapOrContactWrapper(l2r, l1));
        assertTrue(isOverlapOrContactWrapper(l2r, l1r));
    }

    @Test
    public void testIsOverlapOrContactLine09() {
        Line l1 = new Line(8, 10);
        Line l1r = new Line(18, -10);
        Line l2 = new Line(8, 4);
        Line l2r = new Line(12, -4);

        assertTrue(isOverlapOrContactWrapper(l1, l2));
        assertTrue(isOverlapOrContactWrapper(l1r, l2));
        assertTrue(isOverlapOrContactWrapper(l1, l2r));
        assertTrue(isOverlapOrContactWrapper(l1r, l2r));

        assertTrue(isOverlapOrContactWrapper(l2, l1));
        assertTrue(isOverlapOrContactWrapper(l2, l1r));
        assertTrue(isOverlapOrContactWrapper(l2r, l1));
        assertTrue(isOverlapOrContactWrapper(l2r, l1r));
    }

    @Test
    public void testIsOverlapOrContactLine10() {
        Line l1 = new Line(8, 10);
        Line l1r = new Line(18, -10);
        Line l2 = new Line(5, 13);
        Line l2r = new Line(18, -13);

        assertTrue(isOverlapOrContactWrapper(l1, l2));
        assertTrue(isOverlapOrContactWrapper(l1r, l2));
        assertTrue(isOverlapOrContactWrapper(l1, l2r));
        assertTrue(isOverlapOrContactWrapper(l1r, l2r));

        assertTrue(isOverlapOrContactWrapper(l2, l1));
        assertTrue(isOverlapOrContactWrapper(l2, l1r));
        assertTrue(isOverlapOrContactWrapper(l2r, l1));
        assertTrue(isOverlapOrContactWrapper(l2r, l1r));
    }

    @Test
    public void testIsOverlapOrContactLine11() {
        Line l1 = new Line(8, 10);
        Line l1r = new Line(18, -10);
        Line l2 = new Line(1, 14);
        Line l2r = new Line(15, -14);

        assertTrue(isOverlapOrContactWrapper(l1, l2));
        assertTrue(isOverlapOrContactWrapper(l1r, l2));
        assertTrue(isOverlapOrContactWrapper(l1, l2r));
        assertTrue(isOverlapOrContactWrapper(l1r, l2r));

        assertTrue(isOverlapOrContactWrapper(l2, l1));
        assertTrue(isOverlapOrContactWrapper(l2, l1r));
        assertTrue(isOverlapOrContactWrapper(l2r, l1));
        assertTrue(isOverlapOrContactWrapper(l2r, l1r));
    }

    @Test
    public void testIsOverlapOrContactLine12() {
        Line l1 = new Line(8, 10);
        Line l1r = new Line(18, -10);
        Line l2 = new Line(3, 5);
        Line l2r = new Line(8, -5);

        assertTrue(isOverlapOrContactWrapper(l1, l2));
        assertTrue(isOverlapOrContactWrapper(l1r, l2));
        assertTrue(isOverlapOrContactWrapper(l1, l2r));
        assertTrue(isOverlapOrContactWrapper(l1r, l2r));

        assertTrue(isOverlapOrContactWrapper(l2, l1));
        assertTrue(isOverlapOrContactWrapper(l2, l1r));
        assertTrue(isOverlapOrContactWrapper(l2r, l1));
        assertTrue(isOverlapOrContactWrapper(l2r, l1r));
    }

    @Test
    public void testIsOverlapOrContactLine13() {
        Line l1 = new Line(8, 10);
        Line l1r = new Line(18, -10);
        Line l2 = new Line(0, 4);
        Line l2r = new Line(4, -4);

        assertFalse(isOverlapOrContactWrapper(l1, l2));
        assertFalse(isOverlapOrContactWrapper(l1r, l2));
        assertFalse(isOverlapOrContactWrapper(l1, l2r));
        assertFalse(isOverlapOrContactWrapper(l1r, l2r));

        assertFalse(isOverlapOrContactWrapper(l2, l1));
        assertFalse(isOverlapOrContactWrapper(l2, l1r));
        assertFalse(isOverlapOrContactWrapper(l2r, l1));
        assertFalse(isOverlapOrContactWrapper(l2r, l1r));
    }

    private boolean isOverlapWrapper(Line l1, Line l2) {
        start = System.nanoTime();
        boolean result = Xlair.isOverlap(l1, l2);
        end = System.nanoTime();
        elapsed = end - start;
        executedTimes.add(elapsed);
        System.out.println("line : " + elapsed);
        return result;
    }

    private boolean isOverlapOrContactWrapper(Line l1, Line l2) {
        start = System.nanoTime();
        boolean result = Xlair.isOverlapOrContact(l1, l2);
        end = System.nanoTime();
        elapsed = end - start;
        executedTimes.add(elapsed);
        System.out.println("line : " + elapsed);
        return result;
    }

}
