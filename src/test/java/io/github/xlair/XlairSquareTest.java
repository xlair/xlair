package io.github.xlair;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class XlairSquareTest {

    private static List<Long> executedTimes = new ArrayList<>();

    private long start;
    private long end;
    private long elapsed;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // warming up
        Xlair.isOverlap(new Square(0, 0, 200L, 100L), new Square(0, 0, 200L, 100L));
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        Double reult = executedTimes.stream().collect(Collectors.averagingLong(Long::longValue));
        System.out.println("[AVERAGE] : " + reult + " (ns)");
    }

    @Test
    public void testIsOverlapSquare01() {
        Square s1 = new Square(0, 0, 200L, 100L);
        Square s2 = new Square(300L, 0, 200L, 100L);
        Square s1r = new Square(200L, 100L, -200L, -100L);
        Square s2r = new Square(500L, 100L, -200L, -100L);

        assertFalse(isOverlapWrapper(s1, s2));
        assertFalse(isOverlapWrapper(s2, s1));
        assertFalse(isOverlapWrapper(s1r, s2r));
        assertFalse(isOverlapWrapper(s2r, s1r));
    }

    @Test
    public void testIsOverlapSquare02() {
        Square s1 = new Square(0, 0, 200L, 100L);
        Square s2 = new Square(200L, 0, 200L, 100L);
        Square s1r = new Square(200L, 100L, -200L, -100L);
        Square s2r = new Square(400L, 100L, -200L, -100L);

        assertFalse(isOverlapWrapper(s1, s2));
        assertFalse(isOverlapWrapper(s2, s1));
        assertFalse(isOverlapWrapper(s1r, s2r));
        assertFalse(isOverlapWrapper(s2r, s1r));
    }

    @Test
    public void testIsOverlapSquare03() {
        Square s1 = new Square(0, 0, 200L, 100L);
        Square s2 = new Square(150L, 0, 200L, 100L);
        Square s1r = new Square(200L, 100L, -200L, -100L);
        Square s2r = new Square(350L, 100L, -200L, -100L);

        assertTrue(isOverlapWrapper(s1, s2));
        assertTrue(isOverlapWrapper(s2, s1));
        assertTrue(isOverlapWrapper(s1r, s2r));
        assertTrue(isOverlapWrapper(s2r, s1r));
    }

    @Test
    public void testIsOverlapSquare04() {
        Square s1 = new Square(0, 0, 200L, 100L);
        Square s2 = new Square(150L, 50L, 200L, 100L);
        Square s1r = new Square(200L, 100L, -200L, -100L);
        Square s2r = new Square(350L, 150L, -200L, -100L);

        assertTrue(isOverlapWrapper(s1, s2));
        assertTrue(isOverlapWrapper(s2, s1));
        assertTrue(isOverlapWrapper(s1r, s2r));
        assertTrue(isOverlapWrapper(s2r, s1r));
    }

    @Test
    public void testIsOverlapSquare05() {
        Square s1 = new Square(0, 0, 200L, 100L);
        Square s2 = new Square(150L, 100L, 200L, 100L);
        Square s1r = new Square(200L, 100L, -200L, -100L);
        Square s2r = new Square(350L, 200L, -200L, -100L);

        assertFalse(isOverlapWrapper(s1, s2));
        assertFalse(isOverlapWrapper(s2, s1));
        assertFalse(isOverlapWrapper(s1r, s2r));
        assertFalse(isOverlapWrapper(s2r, s1r));
    }

    @Test
    public void testIsOverlapSquare06() {
        Square s1 = new Square(0, 0, 200L, 100L);
        Square s2 = new Square(150L, 150L, 200L, 100L);
        Square s1r = new Square(200L, 100L, -200L, -100L);
        Square s2r = new Square(350L, 250L, -200L, -100L);

        assertFalse(isOverlapWrapper(s1, s2));
        assertFalse(isOverlapWrapper(s2, s1));
        assertFalse(isOverlapWrapper(s1r, s2r));
        assertFalse(isOverlapWrapper(s2r, s1r));
    }

    @Test
    public void testIsOverlapSquare07() {
        Square s1 = new Square(100L, 100L, 200L, 200L);
        Square s2 = new Square(50L, 50L, 300L, 300L);

        assertTrue(isOverlapWrapper(s1, s2));
        assertTrue(isOverlapWrapper(s2, s1));
    }

    @Test
    public void testIsOverlapOrContactSquare01() {
        Square s1 = new Square(0, 0, 200L, 100L);
        Square s2 = new Square(300L, 0, 200L, 100L);
        Square s1r = new Square(200L, 100L, -200L, -100L);
        Square s2r = new Square(500L, 100L, -200L, -100L);

        assertFalse(isOverlapOrContactWrapper(s1, s2));
        assertFalse(isOverlapOrContactWrapper(s2, s1));
        assertFalse(isOverlapOrContactWrapper(s1r, s2r));
        assertFalse(isOverlapOrContactWrapper(s2r, s1r));
    }

    @Test
    public void testIsOverlapOrContactSquare02() {
        Square s1 = new Square(0, 0, 200L, 100L);
        Square s2 = new Square(200L, 0, 200L, 100L);
        Square s1r = new Square(200L, 100L, -200L, -100L);
        Square s2r = new Square(400L, 100L, -200L, -100L);

        assertTrue(isOverlapOrContactWrapper(s1, s2));
        assertTrue(isOverlapOrContactWrapper(s2, s1));
        assertTrue(isOverlapOrContactWrapper(s1r, s2r));
        assertTrue(isOverlapOrContactWrapper(s2r, s1r));
    }

    @Test
    public void testIsOverlapOrContactSquare03() {
        Square s1 = new Square(0, 0, 200L, 100L);
        Square s2 = new Square(150L, 0, 200L, 100L);
        Square s1r = new Square(200L, 100L, -200L, -100L);
        Square s2r = new Square(350L, 100L, -200L, -100L);

        assertTrue(isOverlapOrContactWrapper(s1, s2));
        assertTrue(isOverlapOrContactWrapper(s2, s1));
        assertTrue(isOverlapOrContactWrapper(s1r, s2r));
        assertTrue(isOverlapOrContactWrapper(s2r, s1r));
    }

    @Test
    public void testIsOverlapOrContactSquare04() {
        Square s1 = new Square(0, 0, 200L, 100L);
        Square s2 = new Square(150L, 50L, 200L, 100L);
        Square s1r = new Square(200L, 100L, -200L, -100L);
        Square s2r = new Square(350L, 150L, -200L, -100L);

        assertTrue(isOverlapOrContactWrapper(s1, s2));
        assertTrue(isOverlapOrContactWrapper(s2, s1));
        assertTrue(isOverlapOrContactWrapper(s1r, s2r));
        assertTrue(isOverlapOrContactWrapper(s2r, s1r));
    }

    @Test
    public void testIsOverlapOrContactSquare05() {
        Square s1 = new Square(0, 0, 200L, 100L);
        Square s2 = new Square(150L, 100L, 200L, 100L);
        Square s1r = new Square(200L, 100L, -200L, -100L);
        Square s2r = new Square(350L, 200L, -200L, -100L);

        assertTrue(isOverlapOrContactWrapper(s1, s2));
        assertTrue(isOverlapOrContactWrapper(s2, s1));
        assertTrue(isOverlapOrContactWrapper(s1r, s2r));
        assertTrue(isOverlapOrContactWrapper(s2r, s1r));
    }

    @Test
    public void testIsOverlapOrContactSquare06() {
        Square s1 = new Square(0, 0, 200L, 100L);
        Square s2 = new Square(150L, 150L, 200L, 100L);
        Square s1r = new Square(200L, 100L, -200L, -100L);
        Square s2r = new Square(350L, 250L, -200L, -100L);

        assertFalse(isOverlapOrContactWrapper(s1, s2));
        assertFalse(isOverlapOrContactWrapper(s2, s1));
        assertFalse(isOverlapOrContactWrapper(s1r, s2r));
        assertFalse(isOverlapOrContactWrapper(s2r, s1r));
    }

    @Test
    public void testIsOverlapOrContactSquare07() {
        Square s1 = new Square(100L, 100L, 200L, 200L);
        Square s2 = new Square(50L, 50L, 300L, 300L);

        assertTrue(isOverlapWrapper(s1, s2));
        assertTrue(isOverlapWrapper(s2, s1));
    }

    private boolean isOverlapWrapper(Square s1, Square s2) {
        start = System.nanoTime();
        boolean result = Xlair.isOverlap(s1, s2);
        end = System.nanoTime();
        elapsed = end - start;
        executedTimes.add(elapsed);
        System.out.println("Square : " + elapsed);
        return result;
    }

    private boolean isOverlapOrContactWrapper(Square s1, Square s2) {
        start = System.nanoTime();
        boolean result = Xlair.isOverlapOrContact(s1, s2);
        end = System.nanoTime();
        elapsed = end - start;
        executedTimes.add(elapsed);
        System.out.println("Square : " + elapsed);
        return result;
    }
}
