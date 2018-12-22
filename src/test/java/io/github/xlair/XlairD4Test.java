package io.github.xlair;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class XlairD4Test extends XlairTestBase {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // warming up
        Xlair.isOverlap(new Line(1, 2), new Line(2, 3));
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        showAverage("D4");
    }

    @Test
    public void testIsOverlapD401() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(100L).depth(50L).build();
        Cube c2 = new Cube.Builder(0, 0, 0).width(200L).height(100L).depth(50L).build();

        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 21, 0, 0, 0);
        Date time4 = date(2018, 12, 25, 0, 0, 0);

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

        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 18, 0, 0, 0);
        Date time4 = date(2018, 12, 25, 0, 0, 0);

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

        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 12, 0, 0, 0);
        Date time4 = date(2018, 12, 25, 0, 0, 0);

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

        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 12, 0, 0, 0);
        Date time4 = date(2018, 12, 25, 0, 0, 0);

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

        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 12, 0, 0, 0);
        Date time4 = date(2018, 12, 25, 0, 0, 0);

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

        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 12, 0, 0, 0);
        Date time4 = date(2018, 12, 25, 0, 0, 0);

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

        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 21, 0, 0, 0);
        Date time4 = date(2018, 12, 25, 0, 0, 0);

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

        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 18, 0, 0, 0);
        Date time4 = date(2018, 12, 25, 0, 0, 0);

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

        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 12, 0, 0, 0);
        Date time4 = date(2018, 12, 25, 0, 0, 0);

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

        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 12, 0, 0, 0);
        Date time4 = date(2018, 12, 25, 0, 0, 0);

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

        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 12, 0, 0, 0);
        Date time4 = date(2018, 12, 25, 0, 0, 0);

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

        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 12, 0, 0, 0);
        Date time4 = date(2018, 12, 25, 0, 0, 0);

        Period p1 = new Period(time1, time2);
        Period p2 = new Period(time3, time4);

        D4 d1 = new D4(c1, p1);
        D4 d2 = new D4(c2, p2);

        assertFalse(isOverlapOrContactWrapper(d1, d2));
        assertFalse(isOverlapOrContactWrapper(d2, d1));
    }
}
