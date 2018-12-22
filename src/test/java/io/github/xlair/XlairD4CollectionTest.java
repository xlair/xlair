package io.github.xlair;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class XlairD4CollectionTest extends XlairTestBase {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // warming up
        Xlair.findD4Overlaps(null);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        showAverage("findD4Overlaps, findD4OverlapsOrContacts");
    }

    @Test
    public void testFindD4Overlaps01() {
        List<Pair<D4>> pairs = findD4OverlapsWrapper(null);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindD4Overlaps02() {
        List<D4> d4s = new ArrayList<>();

        List<Pair<D4>> pairs = findD4OverlapsWrapper(d4s);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindD4Overlaps03() {
        List<D4> d4s = new ArrayList<>();
        Cube c1 = new Cube(0L, 0L, 0L, 30L, 30L, 30L);
        Period p1 = new Period(date(2018, 4, 1, 0, 0, 0), date(2018, 4, 3, 0, 0, 0));
        D4 d41 = new D4(c1, p1);
        d4s.add(d41);
        Cube c2 = new Cube(0L, 0L, 0L, 30L, 30L, 30L);
        Period p2 = new Period(date(2018, 4, 4, 0, 0, 0), date(2018, 4, 7, 0, 0, 0));
        D4 d42 = new D4(c2, p2);
        d4s.add(d42);
        Cube c3 = new Cube(50L, 0L, 0L, 50L, 100L, 300L);
        Period p3 = new Period(date(2018, 4, 2, 0, 0, 0), date(2018, 4, 6, 0, 0, 0));
        D4 d43 = new D4(c3, p3);
        d4s.add(d43);
        Cube c4 = new Cube(300L, 300L, 300L, 300L, 300L, 300L);
        Period p4 = new Period(date(2018, 4, 1, 0, 0, 0), date(2018, 4, 30, 0, 0, 0));
        D4 d44 = new D4(c4, p4);
        d4s.add(d44);

        List<Pair<D4>> pairs = findD4OverlapsWrapper(d4s);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindD4Overlaps04() {
        List<D4> d4s = new ArrayList<>();
        Cube c1 = new Cube(0L, 0L, 0L, 30L, 30L, 30L);
        Period p1 = new Period(date(2018, 4, 1, 0, 0, 0), date(2018, 4, 3, 0, 0, 0));
        D4 d41 = new D4(c1, p1);
        d4s.add(d41);
        Cube c2 = new Cube(0L, 0L, 0L, 30L, 30L, 30L);
        Period p2 = new Period(date(2018, 4, 4, 0, 0, 0), date(2018, 4, 7, 0, 0, 0));
        D4 d42 = new D4(c2, p2);
        d4s.add(d42);
        Cube c3 = new Cube(50L, 0L, 0L, 50L, 100L, 300L);
        Period p3 = new Period(date(2018, 4, 2, 0, 0, 0), date(2018, 4, 6, 0, 0, 0));
        D4 d43 = new D4(c3, p3);
        d4s.add(d43);
        Cube c4 = new Cube(0L, 0L, 0L, 300L, 300L, 300L);
        Period p4 = new Period(date(2018, 4, 1, 0, 0, 0), date(2018, 4, 30, 0, 0, 0));
        D4 d44 = new D4(c4, p4);
        d4s.add(d44);

        List<Pair<D4>> pairs = findD4OverlapsWrapper(d4s);

        assertNotNull(pairs);
        assertEquals(3, pairs.size());
        Pair<D4> pair1 = pairs.get(0);
        assertEquals(d41, pair1.getO1());
        assertEquals(d44, pair1.getO2());
        Pair<D4> pair2 = pairs.get(1);
        assertEquals(d42, pair2.getO1());
        assertEquals(d44, pair2.getO2());
        Pair<D4> pair3 = pairs.get(2);
        assertEquals(d43, pair3.getO1());
        assertEquals(d44, pair3.getO2());
    }

    @Test
    public void testFindD4Overlaps05() {
        List<D4> d4s = new ArrayList<>();
        Cube c1 = new Cube(0L, 0L, 0L, 30L, 30L, 30L);
        Period p1 = new Period(date(2018, 4, 1, 0, 0, 0), date(2018, 4, 3, 0, 0, 0));
        D4 d41 = new D4(c1, p1);
        d4s.add(d41);
        Cube c2 = new Cube(0L, 0L, 0L, 30L, 30L, 30L);
        Period p2 = new Period(date(2018, 4, 1, 0, 0, 0), date(2018, 4, 3, 0, 0, 0));
        D4 d42 = new D4(c2, p2);
        d4s.add(d42);
        Cube c3 = new Cube(0L, 0L, 0L, 30L, 30L, 30L);
        Period p3 = new Period(date(2018, 4, 1, 0, 0, 0), date(2018, 4, 3, 0, 0, 0));
        D4 d43 = new D4(c3, p3);
        d4s.add(d43);

        List<Pair<D4>> pairs = findD4OverlapsWrapper(d4s);

        assertNotNull(pairs);
        assertEquals(3, pairs.size());
        Pair<D4> pair1 = pairs.get(0);
        assertEquals(d41, pair1.getO1());
        assertEquals(d42, pair1.getO2());
        Pair<D4> pair2 = pairs.get(1);
        assertEquals(d41, pair2.getO1());
        assertEquals(d43, pair2.getO2());
        Pair<D4> pair3 = pairs.get(2);
        assertEquals(d42, pair3.getO1());
        assertEquals(d43, pair3.getO2());
    }

    @Test
    public void testFindD4Overlaps06() {
        List<D4> d4s = new ArrayList<>();
        Cube c1 = new Cube(0L, 0L, 0L, 30L, 30L, 30L);
        Period p1 = new Period(date(2018, 4, 1, 0, 0, 0), date(2018, 4, 3, 0, 0, 0));
        D4 d41 = new D4(c1, p1);
        d4s.add(d41);
        Cube c2 = new Cube(30L, 0L, 0L, 30L, 30L, 30L);
        Period p2 = new Period(date(2018, 4, 1, 0, 0, 0), date(2018, 4, 3, 0, 0, 0));
        D4 d42 = new D4(c2, p2);
        d4s.add(d42);
        Cube c3 = new Cube(0L, 0L, 0L, 30L, 30L, 30L);
        Period p3 = new Period(date(2018, 4, 3, 0, 0, 0), date(2018, 4, 7, 0, 0, 0));
        D4 d43 = new D4(c3, p3);
        d4s.add(d43);

        List<Pair<D4>> pairs = findD4OverlapsWrapper(d4s);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }
    
    @Test
    public void testFindD4OverlapsOrContacts01() {
        List<Pair<D4>> pairs = findD4OverlapsOrContactsWrapper(null);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindD4OverlapsOrContacts02() {
        List<D4> d4s = new ArrayList<>();

        List<Pair<D4>> pairs = findD4OverlapsOrContactsWrapper(d4s);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindD4OverlapsOrContacts03() {
        List<D4> d4s = new ArrayList<>();
        Cube c1 = new Cube(0L, 0L, 0L, 30L, 30L, 30L);
        Period p1 = new Period(date(2018, 4, 1, 0, 0, 0), date(2018, 4, 3, 0, 0, 0));
        D4 d41 = new D4(c1, p1);
        d4s.add(d41);
        Cube c2 = new Cube(0L, 0L, 0L, 30L, 30L, 30L);
        Period p2 = new Period(date(2018, 4, 4, 0, 0, 0), date(2018, 4, 7, 0, 0, 0));
        D4 d42 = new D4(c2, p2);
        d4s.add(d42);
        Cube c3 = new Cube(50L, 0L, 0L, 50L, 100L, 300L);
        Period p3 = new Period(date(2018, 4, 2, 0, 0, 0), date(2018, 4, 6, 0, 0, 0));
        D4 d43 = new D4(c3, p3);
        d4s.add(d43);
        Cube c4 = new Cube(300L, 300L, 300L, 300L, 300L, 300L);
        Period p4 = new Period(date(2018, 4, 1, 0, 0, 0), date(2018, 4, 30, 0, 0, 0));
        D4 d44 = new D4(c4, p4);
        d4s.add(d44);

        List<Pair<D4>> pairs = findD4OverlapsOrContactsWrapper(d4s);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindD4OverlapsOrContacts04() {
        List<D4> d4s = new ArrayList<>();
        Cube c1 = new Cube(0L, 0L, 0L, 30L, 30L, 30L);
        Period p1 = new Period(date(2018, 4, 1, 0, 0, 0), date(2018, 4, 3, 0, 0, 0));
        D4 d41 = new D4(c1, p1);
        d4s.add(d41);
        Cube c2 = new Cube(0L, 0L, 0L, 30L, 30L, 30L);
        Period p2 = new Period(date(2018, 4, 4, 0, 0, 0), date(2018, 4, 7, 0, 0, 0));
        D4 d42 = new D4(c2, p2);
        d4s.add(d42);
        Cube c3 = new Cube(50L, 0L, 0L, 50L, 100L, 300L);
        Period p3 = new Period(date(2018, 4, 2, 0, 0, 0), date(2018, 4, 6, 0, 0, 0));
        D4 d43 = new D4(c3, p3);
        d4s.add(d43);
        Cube c4 = new Cube(0L, 0L, 0L, 300L, 300L, 300L);
        Period p4 = new Period(date(2018, 4, 1, 0, 0, 0), date(2018, 4, 30, 0, 0, 0));
        D4 d44 = new D4(c4, p4);
        d4s.add(d44);

        List<Pair<D4>> pairs = findD4OverlapsOrContactsWrapper(d4s);

        assertNotNull(pairs);
        assertEquals(3, pairs.size());
        Pair<D4> pair1 = pairs.get(0);
        assertEquals(d41, pair1.getO1());
        assertEquals(d44, pair1.getO2());
        Pair<D4> pair2 = pairs.get(1);
        assertEquals(d42, pair2.getO1());
        assertEquals(d44, pair2.getO2());
        Pair<D4> pair3 = pairs.get(2);
        assertEquals(d43, pair3.getO1());
        assertEquals(d44, pair3.getO2());
    }

    @Test
    public void testFindD4OverlapsOrContacts05() {
        List<D4> d4s = new ArrayList<>();
        Cube c1 = new Cube(0L, 0L, 0L, 30L, 30L, 30L);
        Period p1 = new Period(date(2018, 4, 1, 0, 0, 0), date(2018, 4, 3, 0, 0, 0));
        D4 d41 = new D4(c1, p1);
        d4s.add(d41);
        Cube c2 = new Cube(0L, 0L, 0L, 30L, 30L, 30L);
        Period p2 = new Period(date(2018, 4, 1, 0, 0, 0), date(2018, 4, 3, 0, 0, 0));
        D4 d42 = new D4(c2, p2);
        d4s.add(d42);
        Cube c3 = new Cube(0L, 0L, 0L, 30L, 30L, 30L);
        Period p3 = new Period(date(2018, 4, 1, 0, 0, 0), date(2018, 4, 3, 0, 0, 0));
        D4 d43 = new D4(c3, p3);
        d4s.add(d43);

        List<Pair<D4>> pairs = findD4OverlapsOrContactsWrapper(d4s);

        assertNotNull(pairs);
        assertEquals(3, pairs.size());
        Pair<D4> pair1 = pairs.get(0);
        assertEquals(d41, pair1.getO1());
        assertEquals(d42, pair1.getO2());
        Pair<D4> pair2 = pairs.get(1);
        assertEquals(d41, pair2.getO1());
        assertEquals(d43, pair2.getO2());
        Pair<D4> pair3 = pairs.get(2);
        assertEquals(d42, pair3.getO1());
        assertEquals(d43, pair3.getO2());
    }

    @Test
    public void testFindD4OverlapsOrContacts06() {
        List<D4> d4s = new ArrayList<>();
        Cube c1 = new Cube(0L, 0L, 0L, 30L, 30L, 30L);
        Period p1 = new Period(date(2018, 4, 1, 0, 0, 0), date(2018, 4, 3, 0, 0, 0));
        D4 d41 = new D4(c1, p1);
        d4s.add(d41);
        Cube c2 = new Cube(30L, 0L, 0L, 30L, 30L, 30L);
        Period p2 = new Period(date(2018, 4, 1, 0, 0, 0), date(2018, 4, 3, 0, 0, 0));
        D4 d42 = new D4(c2, p2);
        d4s.add(d42);
        Cube c3 = new Cube(0L, 0L, 0L, 30L, 30L, 30L);
        Period p3 = new Period(date(2018, 4, 3, 0, 0, 0), date(2018, 4, 7, 0, 0, 0));
        D4 d43 = new D4(c3, p3);
        d4s.add(d43);

        List<Pair<D4>> pairs = findD4OverlapsOrContactsWrapper(d4s);

        assertNotNull(pairs);
        assertEquals(3, pairs.size());
        Pair<D4> pair1 = pairs.get(0);
        assertEquals(d41, pair1.getO1());
        assertEquals(d42, pair1.getO2());
        Pair<D4> pair2 = pairs.get(1);
        assertEquals(d41, pair2.getO1());
        assertEquals(d43, pair2.getO2());
        Pair<D4> pair3 = pairs.get(2);
        assertEquals(d42, pair3.getO1());
        assertEquals(d43, pair3.getO2());
    }
}
