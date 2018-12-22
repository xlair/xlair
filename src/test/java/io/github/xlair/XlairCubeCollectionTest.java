package io.github.xlair;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class XlairCubeCollectionTest extends XlairTestBase {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // warming up
        Xlair.findCubeOverlaps(null);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        showAverage("findCubeOverlaps, findCubeOverlapsOrContacts");
    }

    @Test
    public void testFindCubeOverlaps01() {
        List<Pair<Cube>> pairs = findCubeOverlapsWrapper(null);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindCubeOverlaps02() {
        List<Cube> cubes = new ArrayList<>();

        List<Pair<Cube>> pairs = findCubeOverlapsWrapper(cubes);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindCubeOverlaps03() {
        List<Cube> cubes = new ArrayList<>();
        Cube c1 = new Cube(0L, 0L, 0L, 20L, 20L, 20L);
        cubes.add(c1);
        Cube c2 = new Cube(30L, 0L, 0L, 20L, 20L, 20L);
        cubes.add(c2);
        Cube c3 = new Cube(0L, 30L, 0L, 20L, 20L, 20L);
        cubes.add(c3);
        Cube c4 = new Cube(0L, 0L, 30L, 20L, 20L, 20L);
        cubes.add(c4);
        Cube c5 = new Cube(30L, 30L, 30L, 20L, 20L, 20L);
        cubes.add(c5);

        List<Pair<Cube>> pairs = findCubeOverlapsWrapper(cubes);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindCubeOverlaps04() {
        List<Cube> cubes = new ArrayList<>();
        Cube c1 = new Cube(0L, 0L, 0L, 20L, 20L, 20L);
        cubes.add(c1);
        Cube c2 = new Cube(30L, 0L, 0L, 20L, 20L, 20L);
        cubes.add(c2);
        Cube c3 = new Cube(0L, 30L, 0L, 20L, 20L, 20L);
        cubes.add(c3);
        Cube c4 = new Cube(0L, 0L, 30L, 20L, 20L, 20L);
        cubes.add(c4);
        Cube c5 = new Cube(15L, 15L, 15L, 30L, 30L, 30L);
        cubes.add(c5);

        List<Pair<Cube>> pairs = findCubeOverlapsWrapper(cubes);

        assertNotNull(pairs);
        assertEquals(4, pairs.size());
        Pair<Cube> pair1 = pairs.get(0);
        assertEquals(c1, pair1.getO1());
        assertEquals(c5, pair1.getO2());
        Pair<Cube> pair2 = pairs.get(1);
        assertEquals(c2, pair2.getO1());
        assertEquals(c5, pair2.getO2());
        Pair<Cube> pair3 = pairs.get(2);
        assertEquals(c3, pair3.getO1());
        assertEquals(c5, pair3.getO2());
        Pair<Cube> pair4 = pairs.get(3);
        assertEquals(c4, pair4.getO1());
        assertEquals(c5, pair4.getO2());
    }

    @Test
    public void testFindCubeOverlaps05() {
        List<Cube> cubes = new ArrayList<>();
        Cube c1 = new Cube(0L, 0L, 0L, 30L, 30L, 30L);
        cubes.add(c1);
        Cube c2 = new Cube(30L, 0L, 0L, 30L, 30L, 30L);
        cubes.add(c2);
        Cube c3 = new Cube(0L, 30L, 0L, 30L, 30L, 30L);
        cubes.add(c3);
        Cube c4 = new Cube(0L, 0L, 30L, 30L, 30L, 30L);
        cubes.add(c4);

        List<Pair<Cube>> pairs = findCubeOverlapsWrapper(cubes);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindCubeOverlaps06() {
        List<Cube> cubes = new ArrayList<>();
        Cube c1 = new Cube(0L, 0L, 0L, 30L, 30L, 30L);
        cubes.add(c1);
        Cube c2 = new Cube(0L, 0L, 0L, 30L, 30L, 30L);
        cubes.add(c2);
        Cube c3 = new Cube(0L, 00L, 0L, 30L, 30L, 30L);
        cubes.add(c3);

        List<Pair<Cube>> pairs = findCubeOverlapsWrapper(cubes);

        assertNotNull(pairs);
        assertEquals(3, pairs.size());
        Pair<Cube> pair1 = pairs.get(0);
        assertEquals(c1, pair1.getO1());
        assertEquals(c2, pair1.getO2());
        Pair<Cube> pair2 = pairs.get(1);
        assertEquals(c1, pair2.getO1());
        assertEquals(c3, pair2.getO2());
        Pair<Cube> pair3 = pairs.get(2);
        assertEquals(c2, pair3.getO1());
        assertEquals(c3, pair3.getO2());
    }

    @Test
    public void testFindCubeOverlapsOrContacts01() {
        List<Pair<Cube>> pairs = findCubeOverlapsOrContactsWrapper(null);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindCubeOverlapsOrContacts02() {
        List<Cube> cubes = new ArrayList<>();

        List<Pair<Cube>> pairs = findCubeOverlapsOrContactsWrapper(cubes);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindCubeOverlapsOrContacts03() {
        List<Cube> cubes = new ArrayList<>();
        Cube c1 = new Cube(0L, 0L, 0L, 20L, 20L, 20L);
        cubes.add(c1);
        Cube c2 = new Cube(30L, 0L, 0L, 20L, 20L, 20L);
        cubes.add(c2);
        Cube c3 = new Cube(0L, 30L, 0L, 20L, 20L, 20L);
        cubes.add(c3);
        Cube c4 = new Cube(0L, 0L, 30L, 20L, 20L, 20L);
        cubes.add(c4);
        Cube c5 = new Cube(30L, 30L, 30L, 20L, 20L, 20L);
        cubes.add(c5);

        List<Pair<Cube>> pairs = findCubeOverlapsOrContactsWrapper(cubes);

        assertNotNull(pairs);
        assertEquals(0, pairs.size());
    }

    @Test
    public void testFindCubeOverlapsOrContacts04() {
        List<Cube> cubes = new ArrayList<>();
        Cube c1 = new Cube(0L, 0L, 0L, 20L, 20L, 20L);
        cubes.add(c1);
        Cube c2 = new Cube(30L, 0L, 0L, 20L, 20L, 20L);
        cubes.add(c2);
        Cube c3 = new Cube(0L, 30L, 0L, 20L, 20L, 20L);
        cubes.add(c3);
        Cube c4 = new Cube(0L, 0L, 30L, 20L, 20L, 20L);
        cubes.add(c4);
        Cube c5 = new Cube(15L, 15L, 15L, 30L, 30L, 30L);
        cubes.add(c5);

        List<Pair<Cube>> pairs = findCubeOverlapsOrContactsWrapper(cubes);

        assertNotNull(pairs);
        assertEquals(4, pairs.size());
        Pair<Cube> pair1 = pairs.get(0);
        assertEquals(c1, pair1.getO1());
        assertEquals(c5, pair1.getO2());
        Pair<Cube> pair2 = pairs.get(1);
        assertEquals(c2, pair2.getO1());
        assertEquals(c5, pair2.getO2());
        Pair<Cube> pair3 = pairs.get(2);
        assertEquals(c3, pair3.getO1());
        assertEquals(c5, pair3.getO2());
        Pair<Cube> pair4 = pairs.get(3);
        assertEquals(c4, pair4.getO1());
        assertEquals(c5, pair4.getO2());
    }

    @Test
    public void testFindCubeOverlapsOrContacts05() {
        List<Cube> cubes = new ArrayList<>();
        Cube c1 = new Cube(0L, 0L, 0L, 30L, 30L, 30L);
        cubes.add(c1);
        Cube c2 = new Cube(30L, 0L, 0L, 30L, 30L, 30L);
        cubes.add(c2);
        Cube c3 = new Cube(0L, 30L, 0L, 30L, 30L, 30L);
        cubes.add(c3);
        Cube c4 = new Cube(0L, 0L, 30L, 30L, 30L, 30L);
        cubes.add(c4);

        List<Pair<Cube>> pairs = findCubeOverlapsOrContactsWrapper(cubes);

        assertNotNull(pairs);
        assertEquals(6, pairs.size());
        Pair<Cube> pair1 = pairs.get(0);
        assertEquals(c1, pair1.getO1());
        assertEquals(c2, pair1.getO2());
        Pair<Cube> pair2 = pairs.get(1);
        assertEquals(c1, pair2.getO1());
        assertEquals(c3, pair2.getO2());
        Pair<Cube> pair3 = pairs.get(2);
        assertEquals(c1, pair3.getO1());
        assertEquals(c4, pair3.getO2());
        Pair<Cube> pair4 = pairs.get(3);
        assertEquals(c2, pair4.getO1());
        assertEquals(c3, pair4.getO2());
        Pair<Cube> pair5 = pairs.get(4);
        assertEquals(c2, pair5.getO1());
        assertEquals(c4, pair5.getO2());
        Pair<Cube> pair6 = pairs.get(5);
        assertEquals(c3, pair6.getO1());
        assertEquals(c4, pair6.getO2());
    }

    @Test
    public void testFindCubeOverlapsOrContacts06() {
        List<Cube> cubes = new ArrayList<>();
        Cube c1 = new Cube(0L, 0L, 0L, 30L, 30L, 30L);
        cubes.add(c1);
        Cube c2 = new Cube(0L, 0L, 0L, 30L, 30L, 30L);
        cubes.add(c2);
        Cube c3 = new Cube(0L, 00L, 0L, 30L, 30L, 30L);
        cubes.add(c3);

        List<Pair<Cube>> pairs = findCubeOverlapsOrContactsWrapper(cubes);

        assertNotNull(pairs);
        assertEquals(3, pairs.size());
        Pair<Cube> pair1 = pairs.get(0);
        assertEquals(c1, pair1.getO1());
        assertEquals(c2, pair1.getO2());
        Pair<Cube> pair2 = pairs.get(1);
        assertEquals(c1, pair2.getO1());
        assertEquals(c3, pair2.getO2());
        Pair<Cube> pair3 = pairs.get(2);
        assertEquals(c2, pair3.getO1());
        assertEquals(c3, pair3.getO2());
    }
}
