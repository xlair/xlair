package io.github.xlair;

import static org.junit.Assert.*;

import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class XlairPeriodTest extends XlairTestBase {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // warming up
        Xlair.isOverlap(new Line(1, 2), new Line(2, 3));
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        showAverage("Period");
    }

    @Test
    public void testIsOverlapPeriod01() {
        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 21, 0, 0, 0);
        Date time4 = date(2018, 12, 25, 0, 0, 0);

        Period p1 = new Period(time1, time2);
        Period p1r = new Period(time2, time1);
        Period p2 = new Period(time3, time4);
        Period p2r = new Period(time4, time3);

        assertFalse(isOverlapWrapper(p1, p2));
        assertFalse(isOverlapWrapper(p1r, p2));
        assertFalse(isOverlapWrapper(p1, p2r));
        assertFalse(isOverlapWrapper(p1r, p2r));

        assertFalse(isOverlapWrapper(p2, p1));
        assertFalse(isOverlapWrapper(p2, p1r));
        assertFalse(isOverlapWrapper(p2r, p1));
        assertFalse(isOverlapWrapper(p2r, p1r));
    }

    @Test
    public void testIsOverlapPeriod02() {
        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 18, 0, 0, 0);
        Date time4 = date(2018, 12, 23, 0, 0, 0);

        Period p1 = new Period(time1, time2);
        Period p1r = new Period(time2, time1);
        Period p2 = new Period(time3, time4);
        Period p2r = new Period(time4, time3);

        assertFalse(isOverlapWrapper(p1, p2));
        assertFalse(isOverlapWrapper(p1r, p2));
        assertFalse(isOverlapWrapper(p1, p2r));
        assertFalse(isOverlapWrapper(p1r, p2r));

        assertFalse(isOverlapWrapper(p2, p1));
        assertFalse(isOverlapWrapper(p2, p1r));
        assertFalse(isOverlapWrapper(p2r, p1));
        assertFalse(isOverlapWrapper(p2r, p1r));
    }

    @Test
    public void testIsOverlapPeriod03() {
        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 16, 0, 0, 0);
        Date time4 = date(2018, 12, 21, 0, 0, 0);

        Period p1 = new Period(time1, time2);
        Period p1r = new Period(time2, time1);
        Period p2 = new Period(time3, time4);
        Period p2r = new Period(time4, time3);

        assertTrue(isOverlapWrapper(p1, p2));
        assertTrue(isOverlapWrapper(p1r, p2));
        assertTrue(isOverlapWrapper(p1, p2r));
        assertTrue(isOverlapWrapper(p1r, p2r));

        assertTrue(isOverlapWrapper(p2, p1));
        assertTrue(isOverlapWrapper(p2, p1r));
        assertTrue(isOverlapWrapper(p2r, p1));
        assertTrue(isOverlapWrapper(p2r, p1r));
    }

    @Test
    public void testIsOverlapPeriod04() {
        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 8, 0, 0, 0);
        Date time4 = date(2018, 12, 20, 0, 0, 0);

        Period p1 = new Period(time1, time2);
        Period p1r = new Period(time2, time1);
        Period p2 = new Period(time3, time4);
        Period p2r = new Period(time4, time3);

        assertTrue(isOverlapWrapper(p1, p2));
        assertTrue(isOverlapWrapper(p1r, p2));
        assertTrue(isOverlapWrapper(p1, p2r));
        assertTrue(isOverlapWrapper(p1r, p2r));

        assertTrue(isOverlapWrapper(p2, p1));
        assertTrue(isOverlapWrapper(p2, p1r));
        assertTrue(isOverlapWrapper(p2r, p1));
        assertTrue(isOverlapWrapper(p2r, p1r));
    }

    @Test
    public void testIsOverlapPeriod05() {
        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 12, 0, 0, 0);
        Date time4 = date(2018, 12, 18, 0, 0, 0);

        Period p1 = new Period(time1, time2);
        Period p1r = new Period(time2, time1);
        Period p2 = new Period(time3, time4);
        Period p2r = new Period(time4, time3);

        assertTrue(isOverlapWrapper(p1, p2));
        assertTrue(isOverlapWrapper(p1r, p2));
        assertTrue(isOverlapWrapper(p1, p2r));
        assertTrue(isOverlapWrapper(p1r, p2r));

        assertTrue(isOverlapWrapper(p2, p1));
        assertTrue(isOverlapWrapper(p2, p1r));
        assertTrue(isOverlapWrapper(p2r, p1));
        assertTrue(isOverlapWrapper(p2r, p1r));
    }

    @Test
    public void testIsOverlapPeriod06() {
        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 10, 0, 0, 0);
        Date time4 = date(2018, 12, 16, 0, 0, 0);

        Period p1 = new Period(time1, time2);
        Period p1r = new Period(time2, time1);
        Period p2 = new Period(time3, time4);
        Period p2r = new Period(time4, time3);

        assertTrue(isOverlapWrapper(p1, p2));
        assertTrue(isOverlapWrapper(p1r, p2));
        assertTrue(isOverlapWrapper(p1, p2r));
        assertTrue(isOverlapWrapper(p1r, p2r));

        assertTrue(isOverlapWrapper(p2, p1));
        assertTrue(isOverlapWrapper(p2, p1r));
        assertTrue(isOverlapWrapper(p2r, p1));
        assertTrue(isOverlapWrapper(p2r, p1r));
    }

    @Test
    public void testIsOverlapPeriod07() {
        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 8, 0, 0, 0);
        Date time4 = date(2018, 12, 18, 0, 0, 0);

        Period p1 = new Period(time1, time2);
        Period p1r = new Period(time2, time1);
        Period p2 = new Period(time3, time4);
        Period p2r = new Period(time4, time3);

        assertTrue(isOverlapWrapper(p1, p2));
        assertTrue(isOverlapWrapper(p1r, p2));
        assertTrue(isOverlapWrapper(p1, p2r));
        assertTrue(isOverlapWrapper(p1r, p2r));

        assertTrue(isOverlapWrapper(p2, p1));
        assertTrue(isOverlapWrapper(p2, p1r));
        assertTrue(isOverlapWrapper(p2r, p1));
        assertTrue(isOverlapWrapper(p2r, p1r));
    }

    @Test
    public void testIsOverlapPeriod08() {
        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 3, 0, 0, 0);
        Date time4 = date(2018, 12, 20, 0, 0, 0);

        Period p1 = new Period(time1, time2);
        Period p1r = new Period(time2, time1);
        Period p2 = new Period(time3, time4);
        Period p2r = new Period(time4, time3);

        assertTrue(isOverlapWrapper(p1, p2));
        assertTrue(isOverlapWrapper(p1r, p2));
        assertTrue(isOverlapWrapper(p1, p2r));
        assertTrue(isOverlapWrapper(p1r, p2r));

        assertTrue(isOverlapWrapper(p2, p1));
        assertTrue(isOverlapWrapper(p2, p1r));
        assertTrue(isOverlapWrapper(p2r, p1));
        assertTrue(isOverlapWrapper(p2r, p1r));
    }

    @Test
    public void testIsOverlapPeriod09() {
        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 8, 0, 0, 0);
        Date time4 = date(2018, 12, 12, 0, 0, 0);

        Period p1 = new Period(time1, time2);
        Period p1r = new Period(time2, time1);
        Period p2 = new Period(time3, time4);
        Period p2r = new Period(time4, time3);

        assertTrue(isOverlapWrapper(p1, p2));
        assertTrue(isOverlapWrapper(p1r, p2));
        assertTrue(isOverlapWrapper(p1, p2r));
        assertTrue(isOverlapWrapper(p1r, p2r));

        assertTrue(isOverlapWrapper(p2, p1));
        assertTrue(isOverlapWrapper(p2, p1r));
        assertTrue(isOverlapWrapper(p2r, p1));
        assertTrue(isOverlapWrapper(p2r, p1r));
    }

    @Test
    public void testIsOverlapPeriod10() {
        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 5, 0, 0, 0);
        Date time4 = date(2018, 12, 18, 0, 0, 0);

        Period p1 = new Period(time1, time2);
        Period p1r = new Period(time2, time1);
        Period p2 = new Period(time3, time4);
        Period p2r = new Period(time4, time3);

        assertTrue(isOverlapWrapper(p1, p2));
        assertTrue(isOverlapWrapper(p1r, p2));
        assertTrue(isOverlapWrapper(p1, p2r));
        assertTrue(isOverlapWrapper(p1r, p2r));

        assertTrue(isOverlapWrapper(p2, p1));
        assertTrue(isOverlapWrapper(p2, p1r));
        assertTrue(isOverlapWrapper(p2r, p1));
        assertTrue(isOverlapWrapper(p2r, p1r));
    }

    @Test
    public void testIsOverlapPeriod11() {
        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 1, 0, 0, 0);
        Date time4 = date(2018, 12, 15, 0, 0, 0);

        Period p1 = new Period(time1, time2);
        Period p1r = new Period(time2, time1);
        Period p2 = new Period(time3, time4);
        Period p2r = new Period(time4, time3);

        assertTrue(isOverlapWrapper(p1, p2));
        assertTrue(isOverlapWrapper(p1r, p2));
        assertTrue(isOverlapWrapper(p1, p2r));
        assertTrue(isOverlapWrapper(p1r, p2r));

        assertTrue(isOverlapWrapper(p2, p1));
        assertTrue(isOverlapWrapper(p2, p1r));
        assertTrue(isOverlapWrapper(p2r, p1));
        assertTrue(isOverlapWrapper(p2r, p1r));
    }

    @Test
    public void testIsOverlapPeriod12() {
        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 3, 0, 0, 0);
        Date time4 = date(2018, 12, 8, 0, 0, 0);

        Period p1 = new Period(time1, time2);
        Period p1r = new Period(time2, time1);
        Period p2 = new Period(time3, time4);
        Period p2r = new Period(time4, time3);

        assertFalse(isOverlapWrapper(p1, p2));
        assertFalse(isOverlapWrapper(p1r, p2));
        assertFalse(isOverlapWrapper(p1, p2r));
        assertFalse(isOverlapWrapper(p1r, p2r));

        assertFalse(isOverlapWrapper(p2, p1));
        assertFalse(isOverlapWrapper(p2, p1r));
        assertFalse(isOverlapWrapper(p2r, p1));
        assertFalse(isOverlapWrapper(p2r, p1r));
    }

    @Test
    public void testIsOverlapPeriod13() {
        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 1, 0, 0, 0);
        Date time4 = date(2018, 12, 5, 0, 0, 0);

        Period p1 = new Period(time1, time2);
        Period p1r = new Period(time2, time1);
        Period p2 = new Period(time3, time4);
        Period p2r = new Period(time4, time3);

        assertFalse(isOverlapWrapper(p1, p2));
        assertFalse(isOverlapWrapper(p1r, p2));
        assertFalse(isOverlapWrapper(p1, p2r));
        assertFalse(isOverlapWrapper(p1r, p2r));

        assertFalse(isOverlapWrapper(p2, p1));
        assertFalse(isOverlapWrapper(p2, p1r));
        assertFalse(isOverlapWrapper(p2r, p1));
        assertFalse(isOverlapWrapper(p2r, p1r));
    }

    @Test
    public void testIsOverlapOrContactPeriod01() {
        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 21, 0, 0, 0);
        Date time4 = date(2018, 12, 25, 0, 0, 0);

        Period p1 = new Period(time1, time2);
        Period p1r = new Period(time2, time1);
        Period p2 = new Period(time3, time4);
        Period p2r = new Period(time4, time3);

        assertFalse(isOverlapOrContactWrapper(p1, p2));
        assertFalse(isOverlapOrContactWrapper(p1r, p2));
        assertFalse(isOverlapOrContactWrapper(p1, p2r));
        assertFalse(isOverlapOrContactWrapper(p1r, p2r));

        assertFalse(isOverlapOrContactWrapper(p2, p1));
        assertFalse(isOverlapOrContactWrapper(p2, p1r));
        assertFalse(isOverlapOrContactWrapper(p2r, p1));
        assertFalse(isOverlapOrContactWrapper(p2r, p1r));
    }

    @Test
    public void testIsOverlapOrContactPeriod02() {
        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 18, 0, 0, 0);
        Date time4 = date(2018, 12, 23, 0, 0, 0);

        Period p1 = new Period(time1, time2);
        Period p1r = new Period(time2, time1);
        Period p2 = new Period(time3, time4);
        Period p2r = new Period(time4, time3);

        assertTrue(isOverlapOrContactWrapper(p1, p2));
        assertTrue(isOverlapOrContactWrapper(p1r, p2));
        assertTrue(isOverlapOrContactWrapper(p1, p2r));
        assertTrue(isOverlapOrContactWrapper(p1r, p2r));

        assertTrue(isOverlapOrContactWrapper(p2, p1));
        assertTrue(isOverlapOrContactWrapper(p2, p1r));
        assertTrue(isOverlapOrContactWrapper(p2r, p1));
        assertTrue(isOverlapOrContactWrapper(p2r, p1r));
    }

    @Test
    public void testIsOverlapOrContactPeriod03() {
        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 16, 0, 0, 0);
        Date time4 = date(2018, 12, 21, 0, 0, 0);

        Period p1 = new Period(time1, time2);
        Period p1r = new Period(time2, time1);
        Period p2 = new Period(time3, time4);
        Period p2r = new Period(time4, time3);

        assertTrue(isOverlapOrContactWrapper(p1, p2));
        assertTrue(isOverlapOrContactWrapper(p1r, p2));
        assertTrue(isOverlapOrContactWrapper(p1, p2r));
        assertTrue(isOverlapOrContactWrapper(p1r, p2r));

        assertTrue(isOverlapOrContactWrapper(p2, p1));
        assertTrue(isOverlapOrContactWrapper(p2, p1r));
        assertTrue(isOverlapOrContactWrapper(p2r, p1));
        assertTrue(isOverlapOrContactWrapper(p2r, p1r));
    }

    @Test
    public void testIsOverlapOrContactPeriod04() {
        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 8, 0, 0, 0);
        Date time4 = date(2018, 12, 20, 0, 0, 0);

        Period p1 = new Period(time1, time2);
        Period p1r = new Period(time2, time1);
        Period p2 = new Period(time3, time4);
        Period p2r = new Period(time4, time3);

        assertTrue(isOverlapOrContactWrapper(p1, p2));
        assertTrue(isOverlapOrContactWrapper(p1r, p2));
        assertTrue(isOverlapOrContactWrapper(p1, p2r));
        assertTrue(isOverlapOrContactWrapper(p1r, p2r));

        assertTrue(isOverlapOrContactWrapper(p2, p1));
        assertTrue(isOverlapOrContactWrapper(p2, p1r));
        assertTrue(isOverlapOrContactWrapper(p2r, p1));
        assertTrue(isOverlapOrContactWrapper(p2r, p1r));
    }

    @Test
    public void testIsOverlapOrContactPeriod05() {
        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 12, 0, 0, 0);
        Date time4 = date(2018, 12, 18, 0, 0, 0);

        Period p1 = new Period(time1, time2);
        Period p1r = new Period(time2, time1);
        Period p2 = new Period(time3, time4);
        Period p2r = new Period(time4, time3);

        assertTrue(isOverlapOrContactWrapper(p1, p2));
        assertTrue(isOverlapOrContactWrapper(p1r, p2));
        assertTrue(isOverlapOrContactWrapper(p1, p2r));
        assertTrue(isOverlapOrContactWrapper(p1r, p2r));

        assertTrue(isOverlapOrContactWrapper(p2, p1));
        assertTrue(isOverlapOrContactWrapper(p2, p1r));
        assertTrue(isOverlapOrContactWrapper(p2r, p1));
        assertTrue(isOverlapOrContactWrapper(p2r, p1r));
    }

    @Test
    public void testIsOverlapOrContactPeriod06() {
        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 10, 0, 0, 0);
        Date time4 = date(2018, 12, 16, 0, 0, 0);

        Period p1 = new Period(time1, time2);
        Period p1r = new Period(time2, time1);
        Period p2 = new Period(time3, time4);
        Period p2r = new Period(time4, time3);

        assertTrue(isOverlapOrContactWrapper(p1, p2));
        assertTrue(isOverlapOrContactWrapper(p1r, p2));
        assertTrue(isOverlapOrContactWrapper(p1, p2r));
        assertTrue(isOverlapOrContactWrapper(p1r, p2r));

        assertTrue(isOverlapOrContactWrapper(p2, p1));
        assertTrue(isOverlapOrContactWrapper(p2, p1r));
        assertTrue(isOverlapOrContactWrapper(p2r, p1));
        assertTrue(isOverlapOrContactWrapper(p2r, p1r));
    }

    @Test
    public void testIsOverlapOrContactPeriod07() {
        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 8, 0, 0, 0);
        Date time4 = date(2018, 12, 18, 0, 0, 0);

        Period p1 = new Period(time1, time2);
        Period p1r = new Period(time2, time1);
        Period p2 = new Period(time3, time4);
        Period p2r = new Period(time4, time3);

        assertTrue(isOverlapOrContactWrapper(p1, p2));
        assertTrue(isOverlapOrContactWrapper(p1r, p2));
        assertTrue(isOverlapOrContactWrapper(p1, p2r));
        assertTrue(isOverlapOrContactWrapper(p1r, p2r));

        assertTrue(isOverlapOrContactWrapper(p2, p1));
        assertTrue(isOverlapOrContactWrapper(p2, p1r));
        assertTrue(isOverlapOrContactWrapper(p2r, p1));
        assertTrue(isOverlapOrContactWrapper(p2r, p1r));
    }

    @Test
    public void testIsOverlapOrContactPeriod08() {
        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 3, 0, 0, 0);
        Date time4 = date(2018, 12, 20, 0, 0, 0);

        Period p1 = new Period(time1, time2);
        Period p1r = new Period(time2, time1);
        Period p2 = new Period(time3, time4);
        Period p2r = new Period(time4, time3);

        assertTrue(isOverlapOrContactWrapper(p1, p2));
        assertTrue(isOverlapOrContactWrapper(p1r, p2));
        assertTrue(isOverlapOrContactWrapper(p1, p2r));
        assertTrue(isOverlapOrContactWrapper(p1r, p2r));

        assertTrue(isOverlapOrContactWrapper(p2, p1));
        assertTrue(isOverlapOrContactWrapper(p2, p1r));
        assertTrue(isOverlapOrContactWrapper(p2r, p1));
        assertTrue(isOverlapOrContactWrapper(p2r, p1r));
    }

    @Test
    public void testIsOverlapOrContactPeriod09() {
        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 8, 0, 0, 0);
        Date time4 = date(2018, 12, 12, 0, 0, 0);

        Period p1 = new Period(time1, time2);
        Period p1r = new Period(time2, time1);
        Period p2 = new Period(time3, time4);
        Period p2r = new Period(time4, time3);

        assertTrue(isOverlapOrContactWrapper(p1, p2));
        assertTrue(isOverlapOrContactWrapper(p1r, p2));
        assertTrue(isOverlapOrContactWrapper(p1, p2r));
        assertTrue(isOverlapOrContactWrapper(p1r, p2r));

        assertTrue(isOverlapOrContactWrapper(p2, p1));
        assertTrue(isOverlapOrContactWrapper(p2, p1r));
        assertTrue(isOverlapOrContactWrapper(p2r, p1));
        assertTrue(isOverlapOrContactWrapper(p2r, p1r));
    }

    @Test
    public void testIsOverlapOrContactPeriod10() {
        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 5, 0, 0, 0);
        Date time4 = date(2018, 12, 18, 0, 0, 0);

        Period p1 = new Period(time1, time2);
        Period p1r = new Period(time2, time1);
        Period p2 = new Period(time3, time4);
        Period p2r = new Period(time4, time3);

        assertTrue(isOverlapOrContactWrapper(p1, p2));
        assertTrue(isOverlapOrContactWrapper(p1r, p2));
        assertTrue(isOverlapOrContactWrapper(p1, p2r));
        assertTrue(isOverlapOrContactWrapper(p1r, p2r));

        assertTrue(isOverlapOrContactWrapper(p2, p1));
        assertTrue(isOverlapOrContactWrapper(p2, p1r));
        assertTrue(isOverlapOrContactWrapper(p2r, p1));
        assertTrue(isOverlapOrContactWrapper(p2r, p1r));
    }

    @Test
    public void testIsOverlapOrContactPeriod11() {
        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 1, 0, 0, 0);
        Date time4 = date(2018, 12, 15, 0, 0, 0);

        Period p1 = new Period(time1, time2);
        Period p1r = new Period(time2, time1);
        Period p2 = new Period(time3, time4);
        Period p2r = new Period(time4, time3);

        assertTrue(isOverlapOrContactWrapper(p1, p2));
        assertTrue(isOverlapOrContactWrapper(p1r, p2));
        assertTrue(isOverlapOrContactWrapper(p1, p2r));
        assertTrue(isOverlapOrContactWrapper(p1r, p2r));

        assertTrue(isOverlapOrContactWrapper(p2, p1));
        assertTrue(isOverlapOrContactWrapper(p2, p1r));
        assertTrue(isOverlapOrContactWrapper(p2r, p1));
        assertTrue(isOverlapOrContactWrapper(p2r, p1r));
    }

    @Test
    public void testIsOverlapOrContactPeriod12() {
        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 3, 0, 0, 0);
        Date time4 = date(2018, 12, 8, 0, 0, 0);

        Period p1 = new Period(time1, time2);
        Period p1r = new Period(time2, time1);
        Period p2 = new Period(time3, time4);
        Period p2r = new Period(time4, time3);

        assertTrue(isOverlapOrContactWrapper(p1, p2));
        assertTrue(isOverlapOrContactWrapper(p1r, p2));
        assertTrue(isOverlapOrContactWrapper(p1, p2r));
        assertTrue(isOverlapOrContactWrapper(p1r, p2r));

        assertTrue(isOverlapOrContactWrapper(p2, p1));
        assertTrue(isOverlapOrContactWrapper(p2, p1r));
        assertTrue(isOverlapOrContactWrapper(p2r, p1));
        assertTrue(isOverlapOrContactWrapper(p2r, p1r));
    }

    @Test
    public void testIsOverlapOrContactPeriod13() {
        Date time1 = date(2018, 12, 8, 0, 0, 0);
        Date time2 = date(2018, 12, 18, 0, 0, 0);
        Date time3 = date(2018, 12, 1, 0, 0, 0);
        Date time4 = date(2018, 12, 5, 0, 0, 0);

        Period p1 = new Period(time1, time2);
        Period p1r = new Period(time2, time1);
        Period p2 = new Period(time3, time4);
        Period p2r = new Period(time4, time3);

        assertFalse(isOverlapOrContactWrapper(p1, p2));
        assertFalse(isOverlapOrContactWrapper(p1r, p2));
        assertFalse(isOverlapOrContactWrapper(p1, p2r));
        assertFalse(isOverlapOrContactWrapper(p1r, p2r));

        assertFalse(isOverlapOrContactWrapper(p2, p1));
        assertFalse(isOverlapOrContactWrapper(p2, p1r));
        assertFalse(isOverlapOrContactWrapper(p2r, p1));
        assertFalse(isOverlapOrContactWrapper(p2r, p1r));
    }
}
