package io.github.xlair;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class XlairLineCollectionTest extends XlairTestBase {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // warming up
        Xlair.findLineOverlaps(null);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        showAverage("findLineOverlaps, findLineOverlapsOrContacts");
    }

    @Test
    public void testFindLineOverlaps01() {
        List<Pair<Line>> pairs = findLineOverlapsWrapper(null);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindLineOverlaps02() {
        List<Line> lines = new ArrayList<>();

        List<Pair<Line>> pairs = findLineOverlapsWrapper(lines);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindLineOverlaps03() {
        List<Line> lines = new ArrayList<>();
        Line l1 = new Line(0L, 10L);
        lines.add(l1);
        Line l2 = new Line(20L, 10L);
        lines.add(l2);
        Line l3 = new Line(40L, 10L);
        lines.add(l3);
        Line l4 = new Line(60L, 10L);
        lines.add(l4);
        Line l5 = new Line(80L, 10L);
        lines.add(l5);
        Line l6 = new Line(100L, 10L);
        lines.add(l6);

        List<Pair<Line>> pairs = findLineOverlapsWrapper(lines);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindLineOverlaps04() {
        List<Line> lines = new ArrayList<>();
        Line l1 = new Line(0L, 40L);
        lines.add(l1);
        Line l2 = new Line(20L, 10L);
        lines.add(l2);
        Line l3 = new Line(40L, 10L);
        lines.add(l3);
        Line l4 = new Line(60L, 40L);
        lines.add(l4);
        Line l5 = new Line(80L, 10L);
        lines.add(l5);
        Line l6 = new Line(100L, 10L);
        lines.add(l6);

        List<Pair<Line>> pairs = findLineOverlapsWrapper(lines);

        assertNotNull(pairs);
        assertEquals(2, pairs.size());
        Pair<Line> pair1 = pairs.get(0);
        assertEquals(l1, pair1.getO1());
        assertEquals(l2, pair1.getO2());
        Pair<Line> pair2 = pairs.get(1);
        assertEquals(l4, pair2.getO1());
        assertEquals(l5, pair2.getO2());
    }

    @Test
    public void testFindLineOverlaps05() {
        List<Line> lines = new ArrayList<>();
        Line l1 = new Line(0L, 50L);
        lines.add(l1);
        Line l2 = new Line(0L, 50L);
        lines.add(l2);
        Line l3 = new Line(0L, 50L);
        lines.add(l3);

        List<Pair<Line>> pairs = findLineOverlapsWrapper(lines);

        assertNotNull(pairs);
        assertEquals(3, pairs.size());
        Pair<Line> pair1 = pairs.get(0);
        assertEquals(l1, pair1.getO1());
        assertEquals(l2, pair1.getO2());
        Pair<Line> pair2 = pairs.get(1);
        assertEquals(l1, pair2.getO1());
        assertEquals(l3, pair2.getO2());
        Pair<Line> pair3 = pairs.get(2);
        assertEquals(l2, pair3.getO1());
        assertEquals(l3, pair3.getO2());
    }

    @Test
    public void testFindLineOverlapsOrContacts01() {
        List<Pair<Line>> pairs = findLineOverlapsOrContactsWrapper(null);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindLineOverlapsOrContacts02() {
        List<Line> lines = new ArrayList<>();

        List<Pair<Line>> pairs = findLineOverlapsOrContactsWrapper(lines);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindLineOverlapsOrContacts03() {
        List<Line> lines = new ArrayList<>();
        Line l1 = new Line(0L, 10L);
        lines.add(l1);
        Line l2 = new Line(20L, 10L);
        lines.add(l2);
        Line l3 = new Line(40L, 10L);
        lines.add(l3);
        Line l4 = new Line(60L, 10L);
        lines.add(l4);
        Line l5 = new Line(80L, 10L);
        lines.add(l5);
        Line l6 = new Line(100L, 10L);
        lines.add(l6);

        List<Pair<Line>> pairs = findLineOverlapsOrContactsWrapper(lines);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindLineOverlapsOrContacts04() {
        List<Line> lines = new ArrayList<>();
        Line l1 = new Line(0L, 40L);
        lines.add(l1);
        Line l2 = new Line(20L, 10L);
        lines.add(l2);
        Line l3 = new Line(40L, 10L);
        lines.add(l3);
        Line l4 = new Line(60L, 40L);
        lines.add(l4);
        Line l5 = new Line(80L, 10L);
        lines.add(l5);
        Line l6 = new Line(100L, 10L);
        lines.add(l6);

        List<Pair<Line>> pairs = findLineOverlapsOrContactsWrapper(lines);

        assertNotNull(pairs);
        assertEquals(4, pairs.size());
        Pair<Line> pair1 = pairs.get(0);
        assertEquals(l1, pair1.getO1());
        assertEquals(l2, pair1.getO2());
        Pair<Line> pair2 = pairs.get(1);
        assertEquals(l1, pair2.getO1());
        assertEquals(l3, pair2.getO2());
        Pair<Line> pair3 = pairs.get(2);
        assertEquals(l4, pair3.getO1());
        assertEquals(l5, pair3.getO2());
        Pair<Line> pair4 = pairs.get(3);
        assertEquals(l4, pair4.getO1());
        assertEquals(l6, pair4.getO2());
    }

    @Test
    public void testFindLineOverlapsOrContacts05() {
        List<Line> lines = new ArrayList<>();
        Line l1 = new Line(0L, 50L);
        lines.add(l1);
        Line l2 = new Line(0L, 50L);
        lines.add(l2);
        Line l3 = new Line(0L, 50L);
        lines.add(l3);

        List<Pair<Line>> pairs = findLineOverlapsOrContactsWrapper(lines);

        assertNotNull(pairs);
        assertEquals(3, pairs.size());
        Pair<Line> pair1 = pairs.get(0);
        assertEquals(l1, pair1.getO1());
        assertEquals(l2, pair1.getO2());
        Pair<Line> pair2 = pairs.get(1);
        assertEquals(l1, pair2.getO1());
        assertEquals(l3, pair2.getO2());
        Pair<Line> pair3 = pairs.get(2);
        assertEquals(l2, pair3.getO1());
        assertEquals(l3, pair3.getO2());
    }
}
