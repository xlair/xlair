package io.github.xlair;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class XlairPeriodCollectionTest extends XlairTestBase {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // warming up
        Xlair.findPeriodOverlaps(null);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        showAverage("findPeriodOverlaps, findPeriodOverlapsOrContacts");
    }

    @Test
    public void testFindPeriodOverlaps01() {
        List<Pair<Period>> pairs = findPeriodOverlapsWrapper(null);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindPeriodOverlaps02() {
        List<Period> periods = new ArrayList<>();

        List<Pair<Period>> pairs = findPeriodOverlapsWrapper(periods);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindPeriodOverlaps03() {
        List<Period> periods = new ArrayList<>();
        Period p1 = new Period(date(2018, 12, 1, 9, 30, 0), date(2018, 12, 1, 10, 30, 0));
        periods.add(p1);
        Period p2 = new Period(date(2018, 12, 2, 12, 0, 0), date(2018, 12, 2, 15, 30, 0));
        periods.add(p2);
        Period p3 = new Period(date(2018, 12, 4, 10, 15, 0), date(2018, 12, 4, 12, 0, 0));
        periods.add(p3);
        Period p4 = new Period(date(2018, 12, 5, 8, 0, 0), date(2018, 12, 6, 15, 0, 0));
        periods.add(p4);
        Period p5 = new Period(date(2018, 12, 7, 10, 0, 0), date(2018, 12, 9, 18, 0, 0));
        periods.add(p5);

        List<Pair<Period>> pairs = findPeriodOverlapsWrapper(periods);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindPeriodOverlaps04() {
        List<Period> periods = new ArrayList<>();
        Period p1 = new Period(date(2018, 12, 1, 9, 30, 0), date(2018, 12, 2, 15, 30, 0));
        periods.add(p1);
        Period p2 = new Period(date(2018, 12, 2, 12, 0, 0), date(2018, 12, 2, 15, 30, 0));
        periods.add(p2);
        Period p3 = new Period(date(2018, 12, 4, 10, 15, 0), date(2018, 12, 4, 12, 0, 0));
        periods.add(p3);
        Period p4 = new Period(date(2018, 12, 5, 8, 0, 0), date(2018, 12, 8, 15, 0, 0));
        periods.add(p4);
        Period p5 = new Period(date(2018, 12, 7, 10, 0, 0), date(2018, 12, 9, 18, 0, 0));
        periods.add(p5);

        List<Pair<Period>> pairs = findPeriodOverlapsWrapper(periods);

        assertNotNull(pairs);
        assertEquals(2, pairs.size());
        Pair<Period> pair1 = pairs.get(0);
        assertEquals(p1, pair1.getO1());
        assertEquals(p2, pair1.getO2());
        Pair<Period> pair2 = pairs.get(1);
        assertEquals(p4, pair2.getO1());
        assertEquals(p5, pair2.getO2());
    }

    @Test
    public void testFindPeriodOverlaps05() {
        List<Period> periods = new ArrayList<>();
        Period p1 = new Period(date(2018, 12, 1, 9, 30, 0), date(2018, 12, 2, 15, 30, 0));
        periods.add(p1);
        Period p2 = new Period(date(2018, 12, 1, 9, 30, 0), date(2018, 12, 2, 15, 30, 0));
        periods.add(p2);
        Period p3 = new Period(date(2018, 12, 1, 9, 30, 0), date(2018, 12, 2, 15, 30, 0));
        periods.add(p3);

        List<Pair<Period>> pairs = findPeriodOverlapsWrapper(periods);

        assertNotNull(pairs);
        assertEquals(3, pairs.size());
        Pair<Period> pair1 = pairs.get(0);
        assertEquals(p1, pair1.getO1());
        assertEquals(p2, pair1.getO2());
        Pair<Period> pair2 = pairs.get(1);
        assertEquals(p1, pair2.getO1());
        assertEquals(p3, pair2.getO2());
        Pair<Period> pair3 = pairs.get(2);
        assertEquals(p2, pair3.getO1());
        assertEquals(p3, pair3.getO2());
    }

    @Test
    public void testFindPeriodOverlaps06() {
        List<Period> periods = new ArrayList<>();
        Period p1 = new Period(date(2018, 12, 1, 9, 30, 0), date(2018, 12, 2, 15, 30, 0));
        periods.add(p1);
        Period p2 = new Period(date(2018, 12, 2, 15, 30, 0), date(2018, 12, 4, 12, 0, 0));
        periods.add(p2);
        Period p3 = new Period(date(2018, 12, 4, 12, 0, 0), date(2018, 12, 7, 9, 30, 0));
        periods.add(p3);

        List<Pair<Period>> pairs = findPeriodOverlapsWrapper(periods);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindPeriodOverlapsOrContacts01() {
        List<Pair<Period>> pairs = findPeriodOverlapsOrContactsWrapper(null);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindPeriodOverlapsOrContacts02() {
        List<Period> periods = new ArrayList<>();

        List<Pair<Period>> pairs = findPeriodOverlapsOrContactsWrapper(periods);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindPeriodOverlapsOrContacts03() {
        List<Period> periods = new ArrayList<>();
        Period p1 = new Period(date(2018, 12, 1, 9, 30, 0), date(2018, 12, 1, 10, 30, 0));
        periods.add(p1);
        Period p2 = new Period(date(2018, 12, 2, 12, 0, 0), date(2018, 12, 2, 15, 30, 0));
        periods.add(p2);
        Period p3 = new Period(date(2018, 12, 4, 10, 15, 0), date(2018, 12, 4, 12, 0, 0));
        periods.add(p3);
        Period p4 = new Period(date(2018, 12, 5, 8, 0, 0), date(2018, 12, 6, 15, 0, 0));
        periods.add(p4);
        Period p5 = new Period(date(2018, 12, 7, 10, 0, 0), date(2018, 12, 9, 18, 0, 0));
        periods.add(p5);

        List<Pair<Period>> pairs = findPeriodOverlapsOrContactsWrapper(periods);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindPeriodOverlapsOrContacts04() {
        List<Period> periods = new ArrayList<>();
        Period p1 = new Period(date(2018, 12, 1, 9, 30, 0), date(2018, 12, 2, 15, 30, 0));
        periods.add(p1);
        Period p2 = new Period(date(2018, 12, 2, 12, 0, 0), date(2018, 12, 2, 15, 30, 0));
        periods.add(p2);
        Period p3 = new Period(date(2018, 12, 4, 10, 15, 0), date(2018, 12, 4, 12, 0, 0));
        periods.add(p3);
        Period p4 = new Period(date(2018, 12, 5, 8, 0, 0), date(2018, 12, 8, 15, 0, 0));
        periods.add(p4);
        Period p5 = new Period(date(2018, 12, 7, 10, 0, 0), date(2018, 12, 9, 18, 0, 0));
        periods.add(p5);

        List<Pair<Period>> pairs = findPeriodOverlapsOrContactsWrapper(periods);

        assertNotNull(pairs);
        assertEquals(2, pairs.size());
        Pair<Period> pair1 = pairs.get(0);
        assertEquals(p1, pair1.getO1());
        assertEquals(p2, pair1.getO2());
        Pair<Period> pair2 = pairs.get(1);
        assertEquals(p4, pair2.getO1());
        assertEquals(p5, pair2.getO2());
    }

    @Test
    public void testFindPeriodOverlapsOrContacts05() {
        List<Period> periods = new ArrayList<>();
        Period p1 = new Period(date(2018, 12, 1, 9, 30, 0), date(2018, 12, 2, 15, 30, 0));
        periods.add(p1);
        Period p2 = new Period(date(2018, 12, 1, 9, 30, 0), date(2018, 12, 2, 15, 30, 0));
        periods.add(p2);
        Period p3 = new Period(date(2018, 12, 1, 9, 30, 0), date(2018, 12, 2, 15, 30, 0));
        periods.add(p3);

        List<Pair<Period>> pairs = findPeriodOverlapsOrContactsWrapper(periods);

        assertNotNull(pairs);
        assertEquals(3, pairs.size());
        Pair<Period> pair1 = pairs.get(0);
        assertEquals(p1, pair1.getO1());
        assertEquals(p2, pair1.getO2());
        Pair<Period> pair2 = pairs.get(1);
        assertEquals(p1, pair2.getO1());
        assertEquals(p3, pair2.getO2());
        Pair<Period> pair3 = pairs.get(2);
        assertEquals(p2, pair3.getO1());
        assertEquals(p3, pair3.getO2());
    }

    @Test
    public void testFindPeriodOverlapsOrContacts06() {
        List<Period> periods = new ArrayList<>();
        Period p1 = new Period(date(2018, 12, 1, 9, 30, 0), date(2018, 12, 2, 15, 30, 0));
        periods.add(p1);
        Period p2 = new Period(date(2018, 12, 2, 15, 30, 0), date(2018, 12, 4, 12, 0, 0));
        periods.add(p2);
        Period p3 = new Period(date(2018, 12, 4, 12, 0, 0), date(2018, 12, 7, 9, 30, 0));
        periods.add(p3);

        List<Pair<Period>> pairs = findPeriodOverlapsOrContactsWrapper(periods);

        assertNotNull(pairs);
        assertEquals(2, pairs.size());
        Pair<Period> pair1 = pairs.get(0);
        assertEquals(p1, pair1.getO1());
        assertEquals(p2, pair1.getO2());
        Pair<Period> pair2 = pairs.get(1);
        assertEquals(p2, pair2.getO1());
        assertEquals(p3, pair2.getO2());
    }
}
