package io.github.xlair;

import static org.junit.Assert.*;

import org.junit.Test;

public class CubeTest {

    @Test
    public void test01() {
        long x = 100L;
        long y = 100L;
        long z = 100L;
        long width = 200L;
        long height = 100L;
        long depth = 50L;
        Cube cube = new Cube(x, y, z, width, height, depth);
        
        assertEquals(x, cube.getX());
        assertEquals(y, cube.getY());
        assertEquals(z, cube.getZ());
        assertEquals(width, cube.getWidth());
        assertEquals(height, cube.getHeight());
        assertEquals(depth, cube.getDepth());
        Line xLine = cube.getXLine();
        assertEquals(x, xLine.getPoint1());
        assertEquals(x + width, xLine.getPoint2());
        assertEquals(width, xLine.getLength());
        Line yLine = cube.getYLine();
        assertEquals(y, yLine.getPoint1());
        assertEquals(y + height, yLine.getPoint2());
        assertEquals(height, yLine.getLength());
        Line zLine = cube.getZLine();
        assertEquals(z, zLine.getPoint1());
        assertEquals(z + depth, zLine.getPoint2());
        assertEquals(depth, zLine.getLength());
    }

    @Test
    public void test02() {
        long x = -100L;
        long y = -100L;
        long z = -100L;
        long width = 200L;
        long height = 100L;
        long depth = 50L;
        Cube cube = new Cube.Builder(x, y, z).width(width).height(height).depth(depth).build();
        
        assertEquals(x, cube.getX());
        assertEquals(y, cube.getY());
        assertEquals(z, cube.getZ());
        assertEquals(width, cube.getWidth());
        assertEquals(height, cube.getHeight());
        assertEquals(depth, cube.getDepth());
        Line xLine = cube.getXLine();
        assertEquals(x, xLine.getPoint1());
        assertEquals(x + width, xLine.getPoint2());
        assertEquals(width, xLine.getLength());
        Line yLine = cube.getYLine();
        assertEquals(y, yLine.getPoint1());
        assertEquals(y + height, yLine.getPoint2());
        assertEquals(height, yLine.getLength());
        Line zLine = cube.getZLine();
        assertEquals(z, zLine.getPoint1());
        assertEquals(z + depth, zLine.getPoint2());
        assertEquals(depth, zLine.getLength());
    }
    
}
