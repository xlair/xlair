package io.github.xlair;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class XlairCubeTest extends XlairTestBase {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // warming up
        Xlair.isOverlap(new Line(1, 2), new Line(2, 3));
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        showAverage("Cube");
    }

    @Test
    public void testIsOverlapCube01() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(100L).depth(50L).build();
        Cube c2 = new Cube.Builder(300L, 0, 0).width(200L).height(100L).depth(50L).build();

        assertFalse(isOverlapWrapper(c1, c2));
        assertFalse(isOverlapWrapper(c2, c1));
    }

    @Test
    public void testIsOverlapCube02() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(100L).depth(50L).build();
        Cube c2 = new Cube.Builder(200L, 0, 0).width(200L).height(100L).depth(50L).build();

        assertFalse(isOverlapWrapper(c1, c2));
        assertFalse(isOverlapWrapper(c2, c1));
    }

    @Test
    public void testIsOverlapCube03() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(100L).depth(50L).build();
        Cube c2 = new Cube.Builder(150L, 0, 0).width(200L).height(100L).depth(50L).build();

        assertTrue(isOverlapWrapper(c1, c2));
        assertTrue(isOverlapWrapper(c2, c1));
    }

    @Test
    public void testIsOverlapCube04() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(100L).depth(50L).build();
        Cube c2 = new Cube.Builder(150L, 0, 50L).width(200L).height(100L).depth(50L).build();

        assertFalse(isOverlapWrapper(c1, c2));
        assertFalse(isOverlapWrapper(c2, c1));
    }

    @Test
    public void testIsOverlapCube05() {
        Cube c1 = new Cube.Builder(100L, 100L, 100L).width(200L).height(200L).depth(200L).build();
        Cube c2 = new Cube.Builder(50L, 50L, 50L).width(350L).height(350L).depth(350L).build();

        assertTrue(isOverlapWrapper(c1, c2));
        assertTrue(isOverlapWrapper(c2, c1));
    }

    @Test
    public void testIsOverlapCube06() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(200L).depth(100L).build();
        Cube c2 = new Cube.Builder(0, 0, 50L).width(200L).height(200L).depth(100L).build();

        assertTrue(isOverlapWrapper(c1, c2));
        assertTrue(isOverlapWrapper(c2, c1));
    }

    @Test
    public void testIsOverlapCube07() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(200L).depth(100L).build();
        Cube c2 = new Cube.Builder(0, 0, 150L).width(200L).height(200L).depth(100L).build();

        assertFalse(isOverlapWrapper(c1, c2));
        assertFalse(isOverlapWrapper(c2, c1));
    }

    @Test
    public void testIsOverlapCube08() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(200L).depth(100L).build();
        Cube c2 = new Cube.Builder(0, 50L, 0).width(200L).height(200L).depth(100L).build();

        assertTrue(isOverlapWrapper(c1, c2));
        assertTrue(isOverlapWrapper(c2, c1));
    }

    @Test
    public void testIsOverlapCube09() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(200L).depth(100L).build();
        Cube c2 = new Cube.Builder(0, 300L, 0).width(200L).height(200L).depth(100L).build();

        assertFalse(isOverlapWrapper(c1, c2));
        assertFalse(isOverlapWrapper(c2, c1));
    }

    @Test
    public void testIsOverlapOrContactCube01() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(100L).depth(50L).build();
        Cube c2 = new Cube.Builder(300L, 0, 0).width(200L).height(100L).depth(50L).build();

        assertFalse(isOverlapOrContactWrapper(c1, c2));
        assertFalse(isOverlapOrContactWrapper(c2, c1));
    }

    @Test
    public void testIsOverlapOrContactCube02() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(100L).depth(50L).build();
        Cube c2 = new Cube.Builder(200L, 0, 0).width(200L).height(100L).depth(50L).build();

        assertTrue(isOverlapOrContactWrapper(c1, c2));
        assertTrue(isOverlapOrContactWrapper(c2, c1));
    }

    @Test
    public void testIsOverlapOrContactCube03() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(100L).depth(50L).build();
        Cube c2 = new Cube.Builder(150L, 0, 0).width(200L).height(100L).depth(50L).build();

        assertTrue(isOverlapOrContactWrapper(c1, c2));
        assertTrue(isOverlapOrContactWrapper(c2, c1));
    }

    @Test
    public void testIsOverlapOrContactCube04() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(100L).depth(50L).build();
        Cube c2 = new Cube.Builder(150L, 0, 50L).width(200L).height(100L).depth(50L).build();

        assertTrue(isOverlapOrContactWrapper(c1, c2));
        assertTrue(isOverlapOrContactWrapper(c2, c1));
    }

    @Test
    public void testIsOverlapOrContactCube05() {
        Cube c1 = new Cube.Builder(100L, 100L, 100L).width(200L).height(200L).depth(200L).build();
        Cube c2 = new Cube.Builder(50L, 50L, 50L).width(350L).height(350L).depth(350L).build();

        assertTrue(isOverlapOrContactWrapper(c1, c2));
        assertTrue(isOverlapOrContactWrapper(c2, c1));
    }

    @Test
    public void testIsOverlapOrContactCube06() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(200L).depth(100L).build();
        Cube c2 = new Cube.Builder(0, 0, 50L).width(200L).height(200L).depth(100L).build();

        assertTrue(isOverlapOrContactWrapper(c1, c2));
        assertTrue(isOverlapOrContactWrapper(c2, c1));
    }

    @Test
    public void testIsOverlapOrContactCube07() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(200L).depth(100L).build();
        Cube c2 = new Cube.Builder(0, 0, 150L).width(200L).height(200L).depth(100L).build();

        assertFalse(isOverlapOrContactWrapper(c1, c2));
        assertFalse(isOverlapOrContactWrapper(c2, c1));
    }

    @Test
    public void testIsOverlapOrContactCube08() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(200L).depth(100L).build();
        Cube c2 = new Cube.Builder(0, 50L, 0).width(200L).height(200L).depth(100L).build();

        assertTrue(isOverlapOrContactWrapper(c1, c2));
        assertTrue(isOverlapOrContactWrapper(c2, c1));
    }

    @Test
    public void testIsOverlapOrContactCube09() {
        Cube c1 = new Cube.Builder(0, 0, 0).width(200L).height(200L).depth(100L).build();
        Cube c2 = new Cube.Builder(0, 300L, 0).width(200L).height(200L).depth(100L).build();

        assertFalse(isOverlapOrContactWrapper(c1, c2));
        assertFalse(isOverlapOrContactWrapper(c2, c1));
    }


}
