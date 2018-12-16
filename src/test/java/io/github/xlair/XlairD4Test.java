package io.github.xlair;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class XlairD4Test {

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
    public void testIsOverlapD401() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(100L).depth(50L).build();
        Cube c2 = new Cube.Builder(0, 0, 0).width(200L).height(100L).depth(50L).build();

        Date time1 = Date.from(LocalDateTime.of(2018, 12, 8, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time2 = Date.from(LocalDateTime.of(2018, 12, 18, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time3 = Date.from(LocalDateTime.of(2018, 12, 21, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time4 = Date.from(LocalDateTime.of(2018, 12, 25, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));

        Period p1 = new Period(time1, time2);
        Period p2 = new Period(time3, time4);

        D4 d1 = new D4(c1, p1);
        D4 d2 = new D4(c2, p2);

        assertFalse(isOverlapWrapper(d1, d2));
        assertFalse(isOverlapWrapper(d2, d1));
    }

    @Test
    public void testIsOverlapD402() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(100L).depth(50L).build();
        Cube c2 = new Cube.Builder(0, 0, 0).width(200L).height(100L).depth(50L).build();

        Date time1 = Date.from(LocalDateTime.of(2018, 12, 8, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time2 = Date.from(LocalDateTime.of(2018, 12, 18, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time3 = Date.from(LocalDateTime.of(2018, 12, 18, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time4 = Date.from(LocalDateTime.of(2018, 12, 25, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));

        Period p1 = new Period(time1, time2);
        Period p2 = new Period(time3, time4);

        D4 d1 = new D4(c1, p1);
        D4 d2 = new D4(c2, p2);

        assertFalse(isOverlapWrapper(d1, d2));
        assertFalse(isOverlapWrapper(d2, d1));
    }

    @Test
    public void testIsOverlapD403() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(100L).depth(50L).build();
        Cube c2 = new Cube.Builder(0, 0, 0).width(200L).height(100L).depth(50L).build();

        Date time1 = Date.from(LocalDateTime.of(2018, 12, 8, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time2 = Date.from(LocalDateTime.of(2018, 12, 18, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time3 = Date.from(LocalDateTime.of(2018, 12, 12, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time4 = Date.from(LocalDateTime.of(2018, 12, 25, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));

        Period p1 = new Period(time1, time2);
        Period p2 = new Period(time3, time4);

        D4 d1 = new D4(c1, p1);
        D4 d2 = new D4(c2, p2);

        assertTrue(isOverlapWrapper(d1, d2));
        assertTrue(isOverlapWrapper(d2, d1));
    }

    @Test
    public void testIsOverlapD404() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(100L).depth(50L).build();
        Cube c2 = new Cube.Builder(0, 0, 100L).width(200L).height(100L).depth(50L).build();

        Date time1 = Date.from(LocalDateTime.of(2018, 12, 8, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time2 = Date.from(LocalDateTime.of(2018, 12, 18, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time3 = Date.from(LocalDateTime.of(2018, 12, 12, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time4 = Date.from(LocalDateTime.of(2018, 12, 25, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));

        Period p1 = new Period(time1, time2);
        Period p2 = new Period(time3, time4);

        D4 d1 = new D4(c1, p1);
        D4 d2 = new D4(c2, p2);

        assertFalse(isOverlapWrapper(d1, d2));
        assertFalse(isOverlapWrapper(d2, d1));
    }

    @Test
    public void testIsOverlapD405() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(100L).depth(50L).build();
        Cube c2 = new Cube.Builder(0, 200L, 0).width(200L).height(100L).depth(50L).build();

        Date time1 = Date.from(LocalDateTime.of(2018, 12, 8, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time2 = Date.from(LocalDateTime.of(2018, 12, 18, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time3 = Date.from(LocalDateTime.of(2018, 12, 12, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time4 = Date.from(LocalDateTime.of(2018, 12, 25, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));

        Period p1 = new Period(time1, time2);
        Period p2 = new Period(time3, time4);

        D4 d1 = new D4(c1, p1);
        D4 d2 = new D4(c2, p2);

        assertFalse(isOverlapWrapper(d1, d2));
        assertFalse(isOverlapWrapper(d2, d1));
    }

    @Test
    public void testIsOverlapD406() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(100L).depth(50L).build();
        Cube c2 = new Cube.Builder(300L, 0, 0).width(200L).height(100L).depth(50L).build();

        Date time1 = Date.from(LocalDateTime.of(2018, 12, 8, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time2 = Date.from(LocalDateTime.of(2018, 12, 18, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time3 = Date.from(LocalDateTime.of(2018, 12, 12, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time4 = Date.from(LocalDateTime.of(2018, 12, 25, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));

        Period p1 = new Period(time1, time2);
        Period p2 = new Period(time3, time4);

        D4 d1 = new D4(c1, p1);
        D4 d2 = new D4(c2, p2);

        assertFalse(isOverlapWrapper(d1, d2));
        assertFalse(isOverlapWrapper(d2, d1));
    }

    @Test
    public void testIsOverlapOrContactD401() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(100L).depth(50L).build();
        Cube c2 = new Cube.Builder(0, 0, 0).width(200L).height(100L).depth(50L).build();

        Date time1 = Date.from(LocalDateTime.of(2018, 12, 8, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time2 = Date.from(LocalDateTime.of(2018, 12, 18, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time3 = Date.from(LocalDateTime.of(2018, 12, 21, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time4 = Date.from(LocalDateTime.of(2018, 12, 25, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));

        Period p1 = new Period(time1, time2);
        Period p2 = new Period(time3, time4);

        D4 d1 = new D4(c1, p1);
        D4 d2 = new D4(c2, p2);

        assertFalse(isOverlapOrContactWrapper(d1, d2));
        assertFalse(isOverlapOrContactWrapper(d2, d1));
    }

    @Test
    public void testIsOverlapOrContactD402() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(100L).depth(50L).build();
        Cube c2 = new Cube.Builder(0, 0, 0).width(200L).height(100L).depth(50L).build();

        Date time1 = Date.from(LocalDateTime.of(2018, 12, 8, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time2 = Date.from(LocalDateTime.of(2018, 12, 18, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time3 = Date.from(LocalDateTime.of(2018, 12, 18, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time4 = Date.from(LocalDateTime.of(2018, 12, 25, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));

        Period p1 = new Period(time1, time2);
        Period p2 = new Period(time3, time4);

        D4 d1 = new D4(c1, p1);
        D4 d2 = new D4(c2, p2);

        assertTrue(isOverlapOrContactWrapper(d1, d2));
        assertTrue(isOverlapOrContactWrapper(d2, d1));
    }

    @Test
    public void testIsOverlapOrContactD403() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(100L).depth(50L).build();
        Cube c2 = new Cube.Builder(0, 0, 0).width(200L).height(100L).depth(50L).build();

        Date time1 = Date.from(LocalDateTime.of(2018, 12, 8, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time2 = Date.from(LocalDateTime.of(2018, 12, 18, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time3 = Date.from(LocalDateTime.of(2018, 12, 12, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time4 = Date.from(LocalDateTime.of(2018, 12, 25, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));

        Period p1 = new Period(time1, time2);
        Period p2 = new Period(time3, time4);

        D4 d1 = new D4(c1, p1);
        D4 d2 = new D4(c2, p2);

        assertTrue(isOverlapOrContactWrapper(d1, d2));
        assertTrue(isOverlapOrContactWrapper(d2, d1));
    }

    @Test
    public void testIsOverlapOrContactD404() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(100L).depth(50L).build();
        Cube c2 = new Cube.Builder(0, 0, 100L).width(200L).height(100L).depth(50L).build();

        Date time1 = Date.from(LocalDateTime.of(2018, 12, 8, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time2 = Date.from(LocalDateTime.of(2018, 12, 18, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time3 = Date.from(LocalDateTime.of(2018, 12, 12, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time4 = Date.from(LocalDateTime.of(2018, 12, 25, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));

        Period p1 = new Period(time1, time2);
        Period p2 = new Period(time3, time4);

        D4 d1 = new D4(c1, p1);
        D4 d2 = new D4(c2, p2);

        assertFalse(isOverlapOrContactWrapper(d1, d2));
        assertFalse(isOverlapOrContactWrapper(d2, d1));
    }

    @Test
    public void testIsOverlapOrContactD405() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(100L).depth(50L).build();
        Cube c2 = new Cube.Builder(0, 200L, 0).width(200L).height(100L).depth(50L).build();

        Date time1 = Date.from(LocalDateTime.of(2018, 12, 8, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time2 = Date.from(LocalDateTime.of(2018, 12, 18, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time3 = Date.from(LocalDateTime.of(2018, 12, 12, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time4 = Date.from(LocalDateTime.of(2018, 12, 25, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));

        Period p1 = new Period(time1, time2);
        Period p2 = new Period(time3, time4);

        D4 d1 = new D4(c1, p1);
        D4 d2 = new D4(c2, p2);

        assertFalse(isOverlapOrContactWrapper(d1, d2));
        assertFalse(isOverlapOrContactWrapper(d2, d1));
    }

    @Test
    public void testIsOverlapOrContactD406() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(100L).depth(50L).build();
        Cube c2 = new Cube.Builder(300L, 0, 0).width(200L).height(100L).depth(50L).build();

        Date time1 = Date.from(LocalDateTime.of(2018, 12, 8, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time2 = Date.from(LocalDateTime.of(2018, 12, 18, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time3 = Date.from(LocalDateTime.of(2018, 12, 12, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));
        Date time4 = Date.from(LocalDateTime.of(2018, 12, 25, 0, 0, 0).toInstant(ZoneOffset.ofHours(9)));

        Period p1 = new Period(time1, time2);
        Period p2 = new Period(time3, time4);

        D4 d1 = new D4(c1, p1);
        D4 d2 = new D4(c2, p2);

        assertFalse(isOverlapOrContactWrapper(d1, d2));
        assertFalse(isOverlapOrContactWrapper(d2, d1));
    }

    private boolean isOverlapWrapper(D4 d1, D4 d2) {
        start = System.nanoTime();
        boolean result = Xlair.isOverlap(d1, d2);
        end = System.nanoTime();
        elapsed = end - start;
        executedTimes.add(elapsed);
        System.out.println("d4 : " + elapsed);
        return result;
    }

    private boolean isOverlapOrContactWrapper(D4 d1, D4 d2) {
        start = System.nanoTime();
        boolean result = Xlair.isOverlapOrContact(d1, d2);
        end = System.nanoTime();
        elapsed = end - start;
        executedTimes.add(elapsed);
        System.out.println("d4 : " + elapsed);
        return result;
    }
}
